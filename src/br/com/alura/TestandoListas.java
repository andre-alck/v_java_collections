package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println("add:");
        System.out.println(aulas); //java chama o método toString...

        aulas.remove("Conhecendo mais de listas");
        aulas.remove(aulas.get(0));
        aulas.remove(0);

        System.out.println("\nremove:");
        System.out.println(aulas);

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println("\n\"foreach\":");
        for (String cada_aula : aulas) {
            System.out.println(cada_aula);
        }

        System.out.println("\nfor:");
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println(aulas.get(i));
        }

        System.out.println("\naulas.forEach:");
        aulas.forEach(cada_aula -> {
            System.out.println(cada_aula);
        });
        
        System.out.println("\nCollections.sort:");
        aulas.add("Aumentando nosso conhecimento");
        Collections.sort(aulas);
        System.out.println(aulas);
    }
}
