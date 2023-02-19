package com.github.juliavasconceloscr161.estruturadados.listacircular;

public class Teste {
    public static void main(String[] args) {
        ListaCircular<String> minhaLista = new ListaCircular<>();

        minhaLista.add("conteudo0");
        System.out.println(minhaLista);

        minhaLista.remove(0);
        System.out.println(minhaLista);

        minhaLista.add("conteudo0");
        minhaLista.add("conteudo1");
        minhaLista.add("conteudo2");
        minhaLista.add("conteudo3");
        System.out.println(minhaLista);

//        System.out.println(minhaLista.get(0));
//        System.out.println(minhaLista.get(1));
//        System.out.println(minhaLista.get(2));
//        System.out.println(minhaLista.get(3));
//        System.out.println(minhaLista.get(4));
//        System.out.println(minhaLista.get(5));

        for(int i = 0;i < 15; i++){
            System.out.println(minhaLista.get(i));
        }
    }
}
