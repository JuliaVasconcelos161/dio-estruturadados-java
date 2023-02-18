package com.github.juliavasconceloscr161.estruturadados.atribuicaoereferencia;

public class MeuObj {

    Integer num;

    public MeuObj(Integer num) {
        this.num = num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "MeuObj{" +
                "num=" + num +
                '}';
    }
}
