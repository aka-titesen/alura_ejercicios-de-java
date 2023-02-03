package br.com;

import br.com.modelo.Clase;
import br.com.modelo.Curso;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo7 {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", 30);
        curso1.addClase(new Clase("ArrayList"));
        curso1.addClase(new Clase("List"));
        curso1.addClase(new Clase("LinkedList"));
        curso1.addClase(new Clase("Inmutable"));

        List<Clase> clases = curso1.getClases();

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        System.out.println(clases);


    }
}