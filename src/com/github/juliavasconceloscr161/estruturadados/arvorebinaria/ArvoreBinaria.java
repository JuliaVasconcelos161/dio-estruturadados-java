package com.github.juliavasconceloscr161.estruturadados.arvorebinaria;

import javax.swing.tree.TreeNode;

public class ArvoreBinaria<T extends Comparable<T>> {
    private NoBin<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void inserir(T conteudo){
        NoBin<T> novoNo = new NoBin<>(conteudo);
        this.raiz = inserir(raiz, novoNo);
    }

    public void exibirInOrdem(){
        System.out.println("\nExibindo InOrdem:");
        exibirInOrdem(this.raiz);
    }
    public void exibirPosOrdem(){
        System.out.println("\nExibindo PosOrdem:");
        exibirPosOrdem(this.raiz);
    }
    public void exibirPreOrdem(){
        System.out.println("\nExibindo PreOrdem:");
        exibirPreOrdem(this.raiz);
    }
// O código de remover, que fiz acompanhando o professor não funcionou
//    public void remover(T conteudo){
//        NoBin<T> atual = this.raiz;
//        NoBin<T> pai = null;
//        NoBin<T> filho = null;
//        NoBin<T> temp = null;
//
//        while(atual != null && !atual.getConteudo().equals(conteudo)){
//            pai = atual;
//            if(conteudo.compareTo(atual.getConteudo()) < 0){
//                atual = atual.getNoEsq();
//            }else {
//                atual = atual.getNoDir();
//            }
//        }
//
//        if(atual == null){
//            System.out.println("Conteúdo não encontrado. Bloco try");
//        }
//
//        if(pai == null){
//            if(atual.getNoDir() == null){
//                this.raiz = atual.getNoEsq();
//            }else if(atual.getNoEsq() == null){
//                this.raiz = atual.getNoDir();
//            }else {
//                for(temp = atual, filho = atual.getNoEsq();
//                    filho.getNoDir() != null;
//                    temp = filho, filho = filho.getNoEsq()
//                ){
//                    if(filho != atual.getNoEsq()){
//                        temp.setNoDir(filho.getNoEsq());
//                        filho.setNoEsq(raiz.getNoEsq());
//                    }
//                }
//                filho.setNoDir(raiz.getNoDir());
//                this.raiz = filho;
//            }
//        }else if(atual.getNoDir() == null){
//            if(pai.getNoEsq() == atual){
//                pai.setNoEsq(atual.getNoEsq());
//            }else {
//                pai.setNoDir(atual.getNoEsq());
//            }
//        }else if(atual.getNoEsq() == null){
//            if(pai.getNoEsq() == atual){
//                pai.setNoEsq(atual.getNoDir());
//            }else {
//                pai.setNoDir(atual.getNoDir());
//            }
//        }else {
//            for(
//                    temp = atual, filho = atual.getNoEsq();
//                    filho.getNoDir() != null;
//                    temp = filho, filho = filho.getNoDir()
//            ){
//                if(filho != atual.getNoEsq()){
//                    temp.setNoDir(filho.getNoEsq());
//                    filho.setNoEsq(atual.getNoEsq());
//                }
//                filho.setNoDir(atual.getNoDir());
//                if(pai.getNoEsq() == atual){
//                    pai.setNoEsq(filho);
//                }else {
//                    pai.setNoDir(filho);
//                }
//            }
//        }
//    }

//Fiz outras funções de remover baseadas em códigos encontrados no site: https://www.digitalocean.com/community/tutorials/binary-search-tree-bst-search-insert-remove
//Agora está removendo, só não sei se está mantendo a ordem correta da árvore...
    public NoBin<T> removerNo(T conteudo){

        NoBin<T> pai = null;
        NoBin<T> atual = this.raiz;
        boolean hasLeft = false;

        if (raiz == null){
            return raiz;
        }

        while (atual != null) {
            if (atual.getConteudo() == conteudo) {
                break;
            }

            pai = atual;
            if (conteudo.compareTo(atual.getConteudo()) < 0) {
                hasLeft = true;
                atual = atual.getNoEsq();
            } else {
                hasLeft = false;
                atual = atual.getNoDir();
            }
        }


        if (pai == null) {
            return removerNo(atual);
        }

        if (hasLeft) {
            pai.setNoEsq(removerNo(atual));
        } else {
            pai.setNoDir(removerNo(atual));
        }
        return raiz;

    }
    private NoBin<T> inserir(NoBin<T> atual, NoBin<T> novoNo){
        if(atual == null){
            return novoNo;
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo())< 0){
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        }else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }
    private void exibirInOrdem(NoBin<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }
    private void exibirPosOrdem(NoBin<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    private void exibirPreOrdem(NoBin<T> atual){
        if(atual != null){
            System.out.print(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }

    private NoBin<T> removerNo(NoBin<T> no) {

        if (no != null) {
            if (no.getNoEsq() == null && no.getNoDir() == null) {
                return null;
            }

            if (no.getNoEsq() != null && no.getNoDir() != null) {
                NoBin<T> sucessorInOrdem = removerInOrdemSucessorDuplicado(no);
                no.setConteudo(sucessorInOrdem.getConteudo());
            } else if (no.getNoEsq() != null) {
                no = no.getNoEsq();
            } else {
                no = no.getNoDir();
            }
        }

        return no;
    }

    private NoBin<T> removerInOrdemSucessorDuplicado(NoBin<T> no) {
        NoBin<T> pai = no;
        no = no.getNoDir();
        boolean temFilhoDireita = no.getNoEsq() == null;

        while (no.getNoEsq() != null) {
            pai = no;
            no = no.getNoEsq();
        }

        if (temFilhoDireita) {
            pai.setNoDir(no.getNoDir());
        } else {
            pai.setNoEsq(no.getNoDir());
        }

        no.setNoDir(null);
        return no;
    }
}
