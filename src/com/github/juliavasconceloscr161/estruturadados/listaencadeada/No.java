package com.github.juliavasconceloscr161.estruturadados.listaencadeada;

public class No<T> {
    private T conteudo;
    private No proximoNo;

    public No() {
        this.proximoNo = null;
    }

    public No(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public No(T conteudo, No proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }

    public String toStringEncadeado(){
        String str = "NoDuplo{" +
                "conteudo=" + conteudo +
                "}";
        if(proximoNo != null){
            str += "->" + proximoNo.toString();
        }else {
            str += "-> null";
        }
        return str;
    }
}
