package br.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo3 {
    public static void main(String[] args) {
        String variable1 = "Ejemplo 1";
        String variable2 = "Ejemplo 2";
        String varianle3 = "Ejemplo 3";
        String varianle4 = "Ejemplo 4";

        ArrayList<String> lista = new ArrayList<>();
        lista.add(variable1);
        lista.add(variable1);
        lista.add(variable1);
        lista.add(variable1);
        System.out.println("Sin ordenar");
        System.out.println(lista);
        System.out.println("Ordenar ascendente");
        Collections.sort(lista);
        lista.forEach(item -> System.out.println(item));
        System.out.println("Ordenar descendente");
        Collections.sort(lista,Collections.reverseOrder());
        lista.forEach(item-> System.out.println(item));

        lista.sort(Comparator.reverseOrder());

        lista.sort(Comparator.naturalOrder());

        List<String> listaList = lista.stream().sorted().collect(Collectors.toList());
    }
}