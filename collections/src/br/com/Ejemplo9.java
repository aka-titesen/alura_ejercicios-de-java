package br.com;

import br.com.modelo.Clase;
import br.com.modelo.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class Ejemplo9 {

    public static  void main(String[] args) {
        Curso curso1 = new Curso("Geometria", 30);
        Curso curso2= new Curso("Fisica", 10);
        Curso curso3 = new Curso("Quimica", 20);
        Curso curso4 = new Curso("Historia", 50);


        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        cursos.forEach(curso -> System.out.println(curso));

        Collections.sort(cursos,Comparator.comparing(Curso::getNombre).reversed());
        int tiempo = 0;
        for (Curso curso: cursos){
            tiempo += curso.getTiempo();
        }
        System.out.println("El tiempo total de los cursos -> " + tiempo);
        System.out.println("El tiempo total de los cursos con Stream es -> " + cursos.stream().mapToInt(Curso::getTiempo).sum());
        System.out.println("Devuelve el tiempo más grande de un curso es -> " + cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
        System.out.println("La suma de todos los cursos menos historia es -> " +
                cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia")).mapToInt(Curso::getTiempo).sum());

        cursos.forEach(curso -> System.out.println(curso));

        List<Curso> cursolist = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Fisica")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());

    }
}