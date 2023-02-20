package com.github.juliavasconceloscr161.estruturadados.arvorebinaria;

import com.github.juliavasconceloscr161.estruturadados.arvorebinaria.model.Obj;

public class Teste {
    public static void main(String[] args) {
//        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();
//
//        Obj obj = new Obj(25);
//        minhaArvore.inserir(new Obj(13));
//        minhaArvore.inserir(new Obj(10));
//        minhaArvore.inserir(obj);
//        minhaArvore.inserir(new Obj(2));
//        minhaArvore.inserir(new Obj(12));
//        minhaArvore.inserir(new Obj(20));
//        minhaArvore.inserir(new Obj(31));
//        minhaArvore.inserir(new Obj(29));

        ArvoreBinaria<Integer> minhaArvore = new ArvoreBinaria<>();

        Integer obj = 25;
        minhaArvore.inserir(13);
        minhaArvore.inserir(10);
        minhaArvore.inserir(obj);
        minhaArvore.inserir(2);
        minhaArvore.inserir(12);
        minhaArvore.inserir(20);
        minhaArvore.inserir(31);
        minhaArvore.inserir(29);

        minhaArvore.exibirInOrdem();

        minhaArvore.exibirPreOrdem();

        minhaArvore.exibirPosOrdem();

        minhaArvore.removerNo(10);

        minhaArvore.removerNo(2);

        System.out.println();
        minhaArvore.exibirInOrdem();

        minhaArvore.exibirPreOrdem();

        minhaArvore.exibirPosOrdem();

        minhaArvore.inserir(101);

        System.out.println();
        minhaArvore.exibirInOrdem();

        minhaArvore.exibirPreOrdem();

        minhaArvore.exibirPosOrdem();

        minhaArvore.removerNo(101);

        System.out.println();
        minhaArvore.exibirInOrdem();

        minhaArvore.exibirPreOrdem();

        minhaArvore.exibirPosOrdem();
    }
}
