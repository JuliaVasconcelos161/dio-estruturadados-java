package com.github.juliavasconceloscr161.estruturadados.listaencadeada;

public class Teste {
    public static void main(String[] args) {
        ListaEncadeada<String> minhaLista = new ListaEncadeada<>();
        minhaLista.add("teste1");
        minhaLista.add("teste2");
        minhaLista.add("teste3");
        minhaLista.add("teste4");
        minhaLista.add("teste5");

        System.out.println(minhaLista.get(0));
        System.out.println(minhaLista.get(2));

        System.out.println(minhaLista);

        System.out.println("Removendo: " + minhaLista.remove(3));
        System.out.println(minhaLista);
    }
}
