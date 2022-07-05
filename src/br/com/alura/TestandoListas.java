package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        aulas.remove(aulas.get(0)); //aulas.remove(0) || aulas.remove(aulas.get(0)) || aulas.remove("Trabalhando com Cursos e Sets")

        // lê-se: para cada string aula, dentro de aulas
        System.out.println("FOR EACH:");
        for (String aula : aulas) {
            System.out.println(aula);
        }
        System.out.println("");

        aulas.add(0, aula1);
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é: " + primeiraAula + "\n");

        System.out.println("FOR PADRÃO:");
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("aulas.get(" + i + "): " + aulas.get(i));
        }
        System.out.println("");

        System.out.println("MÉTODO forEach:");
        aulas.forEach(cada_aula -> {
            System.out.println("percorrendo: " + cada_aula);
        });
        System.out.println("");

        System.out.println("COLLECTIONS.SORT(AULAS):");
        String aula4 = "Aumentando nosso conhecimento";
        aulas.add(aula4);
        Collections.sort(aulas);
        aulas.forEach(cada_aula -> {
            System.out.println("aula: " + cada_aula);
        });
        System.out.println("");

        aulas.remove(aulas.size() - 1);
    }
}
