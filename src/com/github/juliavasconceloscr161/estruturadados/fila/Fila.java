package com.github.juliavasconceloscr161.estruturadados.fila;

public class Fila<T> {
    private No<T> refNoEntradaFinalFila;

    public Fila(){
        this.refNoEntradaFinalFila = null;
    }

    public boolean isEmpty(){
       return refNoEntradaFinalFila == null ? true : false;
    }

    public void enqueue(T obj){
        No novoNo = new No(obj);
        novoNo.setRefNo(refNoEntradaFinalFila);
        refNoEntradaFinalFila = novoNo;
    }

    public T first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFinalFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }
                else{
                    break;
                }
            }
            return (T)primeiroNo.getObject();
        } return null;
    }

    public T dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFinalFila;
            No noAuxiliar = refNoEntradaFinalFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }
                else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T)primeiroNo.getObject();
        } return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFinalFila;

        if(refNoEntradaFinalFila != null){
            while(true){
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]----->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno+= "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
