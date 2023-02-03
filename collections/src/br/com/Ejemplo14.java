package br.com;

import br.com.modelo.Alumno;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Ejemplo14 {

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Luis Miguel", "001");
        Alumno alumno2 = new Alumno("Florian Miralles", "002");
        Alumno alumno3 = new Alumno("Elisa Mendez", "003");
        Alumno alumno4 = new Alumno("Anna Monardez", "004");
        Alumno alumno5 = new Alumno("Maria Kunnamen", "005");
        Alumno alumno6 = new Alumno("Mabel William", "006");
        Alumno alumno7 = new Alumno("Juan Carlos Esquivel", "007");

        Set<Alumno> listaAlumnos = new HashSet<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);

        Alumno alumnoNuevo = new Alumno("Luis Miguel", "001");

        /*
        Aunque tienen los mismo valores para java son objetos distintos, ésto podría estar bien
        pero podriamos tener una regla de negocio en el cual 2 entidades con los mismos valores no deberían persistir
         */

        boolean isEquals =  alumno1.equals(alumnoNuevo);

        if (isEquals){
            System.out.println("Si son iguales");
        }
    }
}
