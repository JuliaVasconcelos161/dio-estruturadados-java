package com.github.juliavasconceloscr161.estruturadados.listaduplamenteencadeada;

public class Teste {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();
        minhaLista.add("conteudo1");
        minhaLista.add("conteudo2");
        minhaLista.add("conteudo3");
        minhaLista.add("conteudo4");
        minhaLista.add("conteudo5");
        minhaLista.add("conteudo6");
        minhaLista.add("conteudo7");

        System.out.println(minhaLista);

        minhaLista.remove(6);

        System.out.println(minhaLista);

        minhaLista.add("Ultimo");

        System.out.println(minhaLista);

        minhaLista.add(2, "Novo Conteudo 3");

        System.out.println(minhaLista);

        System.out.println(minhaLista.get(2));
    }
}
