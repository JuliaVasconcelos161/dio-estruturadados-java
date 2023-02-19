package com.github.juliavasconceloscr161.estruturadados.pilha;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha(No refNoEntradaPilha) {
        this.refNoEntradaPilha = null;
    }

    public Pilha(){}

    public No top(){
        return refNoEntradaPilha;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }
    public boolean isEmpty(){
//        if(refNoEntradaPilha == null){
//            return true;
//        }
//        return false;
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
       String stringRetorno = "-------------\n";
       stringRetorno += "  Pilha        \n";
       stringRetorno += "-------------\n";

       No noAuxiliar = refNoEntradaPilha;

       while(true){
           if(noAuxiliar != null){
               stringRetorno += "[NoDuplo{dado=" + noAuxiliar.getDado() + "}]\n";
               noAuxiliar = noAuxiliar.getRefNo();
           }else{
               break;
           }
       }

       stringRetorno += "-------------\n";
       return stringRetorno;
    }
}
