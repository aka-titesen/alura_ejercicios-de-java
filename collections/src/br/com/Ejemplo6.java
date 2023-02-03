package br.com;

import br.com.modelo.Clase;
import br.com.modelo.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo6 {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", 30);
        curso1.addClase(new Clase("ArrayList"));
        curso1.addClase(new Clase("List"));
        curso1.addClase(new Clase("LinkedList"));

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        System.out.println(cursos.get(0).getClases());


    }
}