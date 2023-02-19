package com.github.juliavasconceloscr161.estruturadados.listacircular;

public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular(){
        this.tamanhoLista = 0;
        this.cauda = null;
        this.cabeca = null;
    }

    public int size(){
        return this.tamanhoLista;
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0;
    }
    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void remove(int index){
        if(index >= this.tamanhoLista){
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista.");
        }
        No<T> noAuxiliar = this.cauda;
        if(index == 0){
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        }else if(index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        }else {
            for(int i = 0; i < index-1; i++){
               noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(this.cauda);
        }else {
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    @Override
    public String toString(){
        String str = "";
        No<T> noAuxiliar = this.cauda;
        for(int i = 0; i< this.size(); i++){
            str += "[No{conteudo=" + noAuxiliar.getConteudo() + "}] ----> ";
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        str += this.isEmpty() ? "[]" : "(Retorna ao início)";
        return str;
    }

    private No<T> getNo(int index){
        if(this.isEmpty()) {
            throw new IndexOutOfBoundsException("A lista está vazia");
        }
        if(index == 0){
            return this.cauda;
        }
         No<T> noAuxiliar = this.cauda;
        for(int i = 0; (i < index)&&(noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }

}
