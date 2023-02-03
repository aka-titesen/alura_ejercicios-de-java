package br.com;

import br.com.modelo.Alumno;
import br.com.modelo.Curso;

import java.util.Iterator;

public class Ejemplo16 {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Programacion", 800);

        Alumno alumno1 = new Alumno("Luis Miguel", "001");
        Alumno alumno2 = new Alumno("Florian Miralles", "002");
        Alumno alumno3 = new Alumno("Elisa Mendez", "003");
        Alumno alumno4 = new Alumno("Anna Monardez", "004");
        Alumno alumno5 = new Alumno("Maria Kunnamen", "005");
        Alumno alumno6 = new Alumno("Mabel William", "006");
        Alumno alumno7 = new Alumno("Juan Carlos Esquivel", "007");

        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);

        //curso1.getAlumnos().forEach(alumno -> print(alumno));

        Iterator<Alumno> alumnoIterator = curso1.getAlumnos().iterator();

        while (alumnoIterator.hasNext()){
            Alumno alumno = alumnoIterator.next();
            print(alumno);
        }


    }

    public static void print(Object obj) {
        System.out.println(obj);
    }
}
