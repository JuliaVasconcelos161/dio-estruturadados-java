package com.github.juliavasconceloscr161.estruturadados.listaencadeada;

public class ListaEncadeada<T>{
    private No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null? true : false;
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while (true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size()-1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }

    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        for(int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;

    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    public T remove(int index){
        No<T> noARemover = this.getNo(index);
        if(index == 0){
            referenciaEntrada = noARemover.getProximoNo();
            return noARemover.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noARemover.getProximoNo());
        return noARemover.getConteudo();
    }
    private void validaIndice(int index){
        if(index >= this.size()){
            int ultimoIndice = this.size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Ela só vai até o índice " + ultimoIndice + ".");
        }
    }

    @Override
    public String toString(){
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size(); i++){
            strRetorno += "[NoDuplo{conteudo=" + noAuxiliar.getConteudo() + "}] ----->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";

        return strRetorno;

    }
}
