package br.com;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Ejemplo12 {

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

        listaAlumnos.forEach(alumno -> System.out.println(alumno));

        boolean isExist = listaAlumnos.contains("Maria Kunnamen");

        String max = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();

        System.out.println("El alumno que tiene el nombre más largo es --> "+ max + " y la cantidad de letras es --> " +max.length());

        if (isExist){
            System.out.println("Si está");
        }else{
            System.out.println("No está");
        }
    }
}