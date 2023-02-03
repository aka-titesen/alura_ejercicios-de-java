package br.com;

import java.util.ArrayList;

public class Ejemplo1 {
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

    lista.remove(0);
    lista.set(2, "Ejemplo alterado");
    //lista.addAll(); Permite agregar una lista dentro de la misma
    System.out.println(lista);
    }
}