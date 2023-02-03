package br.com;

import java.util.*;
import java.util.stream.Collectors;

public class Ejemplo11 {

    public static  void main(String[] args) {
        String alumno1 = "Luis Miguel";
        String alumno2 = "Florian Miralles";
        String alumno3 = "Elisa Mendez";
        String alumno4 = "Anna Monardez";
        String alumno5 = "Maria Kunnamen";
        String alumno6 = "Mabel William";
        String alumno7 = "Juan Carlos Esquivel";

        Set<String> listaAlumnos = new HashSet<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
    }
}