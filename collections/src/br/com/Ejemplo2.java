package br.com;

import java.util.ArrayList;

public class Ejemplo2 {
    public static void main(String[] args) {
        String variable1 = "br.com.Ejemplo1";
        String variable2 = "Ejemplo2";
        String varianle3 = "Ejemplo3";
        String varianle4 = "Ejemplo4";

        ArrayList<String> lista = new ArrayList<>();
        lista.add(variable1);
        lista.add(variable1);
        lista.add(variable1);
        lista.add(variable1);
        System.out.println(lista);


        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for (String clase : lista) {
            System.out.println(clase);
        }

        lista.forEach(clase -> System.out.println(clase));
    }
}