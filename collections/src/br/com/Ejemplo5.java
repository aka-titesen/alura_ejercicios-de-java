package br.com;

import br.com.modelo.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo5 {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Geometria", 30);
        Curso curso2= new Curso("Fisica", 10);
        Curso curso3 = new Curso("Quimica", 20);
        Curso curso4 = new Curso("Historia", 50);


        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        //La forma más clásica de ordenar lista de objetos p.d hace falta implementar Comparable
        Collections.sort(cursos);
        System.out.println();
        System.out.println("Ordenar por nombres ascendente");
        cursos.forEach(item -> System.out.println(item));
        Collections.sort(cursos, Collections.reverseOrder());
        System.out.println();
        System.out.println("Ordenar por nombres descendente");
        cursos.forEach(item -> System.out.println(item));

        //Comparator - no hace falta implementar Comparable
        System.out.println();
        System.out.println("Ordenar por nombre ascendete con comparing de Comparator");
        cursos.sort(Comparator.comparing(Curso::getNombre));
        cursos.forEach(item-> System.out.println(item));
        System.out.println();
        System.out.println("Ordenar por nombre descendente con comparing de Comparator");
        cursos.sort(Comparator.comparing(Curso::getNombre).reversed());
        cursos.forEach(item-> System.out.println(item));

        //Comparator - no hace falta implementar Comparable - Le especifico el tipo de dato a comparar (int - getTiempo)
        System.out.println();
        System.out.println("Ordenar por tiempo ascendente con comparing de Comparator");
        List<Curso> cursosOrdenados = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Fisica")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
        cursosOrdenados.forEach(item-> System.out.println(item));
    }
}