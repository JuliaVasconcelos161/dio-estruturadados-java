package com.github.juliavasconceloscr161.estruturadados.principaisimplementacoes;

import java.util.*;

public class Teste {
    public static void main(String[] args) {

        System.out.println("equals e hashCode");
        List<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volkswagen"));
        System.out.println(listaCarros.contains(new Carro("Ford")));

        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Ford");
        System.out.println(carro1.equals(carro2));

        System.out.println("\nPilhas");
        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Volkswagen"));
        stackCarros.push(new Carro("Chevrolet"));

        System.out.println(stackCarros);

        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        //Mostra, mas não retira
        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        System.out.println(stackCarros.isEmpty());

        System.out.println("\nFilas");
        Queue<Carro> queueCarros = new LinkedList<>();
        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Volkswagen"));
        queueCarros.add(new Carro("Chevrolet"));

        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);

        //se não conseguisse adicionar apenas imprimiria false
        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);

        //Não remove o primeiro, apenas imprime
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        //Remove o primeiro
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println(queueCarros.size());

        System.out.println(queueCarros.isEmpty());

        System.out.println("\nLista");
        List<Carro> listCarros = new ArrayList<>();
        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Volkswagen"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Peugeot"));
        System.out.println(listCarros);
        System.out.println(listCarros.contains(new Carro("Ford")));
        System.out.println(listCarros.get(2));
        System.out.println(listCarros.indexOf(new Carro("Chevrolet")));
        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);

        System.out.println("\nSet");
        Set<Carro> hashSetCarros = new HashSet<>();
        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Chevrolet"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();
        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Chevrolet"));
        System.out.println(treeSetCarros);

        System.out.println("\nMap");
        Map<String, String> aluno = new HashMap<>();
        aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Média", "8.5");
        aluno.put("Turma", "3a");
        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();
        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();
        aluno2.put("Nome", "João");
        aluno2.put("Idade", "17");
        aluno2.put("Média", "8.5");
        aluno2.put("Turma", "3a");
        listaAlunos.add(aluno2);
        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("Nome"));


    }
}
