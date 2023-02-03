package br.com;

import br.com.modelo.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class Ejemplo10 {

    public static  void main(String[] args) {
        Curso curso1 = new Curso("Geometria", 30);
        Curso curso2= new Curso("Fisica", 10);
        Curso curso3 = new Curso("Quimica", 20);
        Curso curso4 = new Curso("Algebra", 80);
        Curso curso5 = new Curso("Aritmetica", 70);
        Curso curso6 = new Curso("Geografia", 30);
        Curso curso7 = new Curso("Educacion fisica", 40);
        Curso curso8 = new Curso("Algoritmos", 90);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        cursos.add(curso5);
        cursos.add(curso6);
        cursos.add(curso7);
        cursos.add(curso8);
        int tiempoTotalCursos = cursos.stream().mapToInt(Curso::getTiempo).sum();
        int tiempoMaxCursos = cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt();
        int tiempoTotalCursosMenosHistoria = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia")).mapToInt(Curso::getTiempo).sum();
        List<Curso> listaCursosMenosFisica = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Fisica")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());

        System.out.println("El tiempo total de los cursos con Stream es -> " + tiempoTotalCursos);
        System.out.println("Devuelve el tiempo más grande de un curso es -> " + tiempoMaxCursos);
        System.out.println("La suma de todos los cursos menos historia es -> " + tiempoTotalCursosMenosHistoria);

        double promedio = cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble();
        int tiempoMinCursos = cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt();

        System.out.println("El tiempo promedio de los cursos es -> " + promedio);
        System.out.println("Devuelve el tiempo más pequeño de un curso es -> " + tiempoMinCursos);

        Map<String, List<Curso>> groupCurso = cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));

        groupCurso.forEach((key, value)-> System.out.println(key + " - " + value.size()));

        System.out.println(cursos.parallelStream().mapToInt(Curso::getTiempo).sum());
    }
}