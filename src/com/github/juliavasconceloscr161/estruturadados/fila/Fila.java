package com.github.juliavasconceloscr161.estruturadados.fila;

public class Fila {
    private No refNoEntradaFinalFila;

    public Fila(){
        this.refNoEntradaFinalFila = null;
    }

    public boolean isEmpty(){
       return refNoEntradaFinalFila == null ? true : false;
    }

    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaFinalFila);
        refNoEntradaFinalFila = novoNo;
    }

    public No first(){
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
            return primeiroNo;
        } return null;
    }

    public No dequeue(){
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
            return primeiroNo;
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
