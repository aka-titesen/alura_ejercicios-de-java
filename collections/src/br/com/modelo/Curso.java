package br.com.modelo;

import java.util.*;

public class Curso implements Comparable<Curso> {
    private String nombre;
    private int tiempo;
    private List<Clase> clases = new ArrayList<>();
    private Collection<Alumno> alumnos = new HashSet<>();
    private Map<String, Alumno> alumnosMap = new HashMap<>();

    public Curso(String nombre, int tiempo, List<Clase> clase) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.clases = clases;
    }

    public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Clase> getClases() {
        return Collections.unmodifiableList(clases); //No podremos modificar la lista luego de obtenerla
    }

    public void setClases(List<Clase> clases) {
        this.clases = clases;
    }

    public Collection<Alumno> getAlumnos() {
        return alumnos;
    }

    public Map<String, Alumno> getAlumnosMap() {
        return alumnosMap;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", tiempo=" + tiempo +
                ", clases=" + clases +
                '}';
    }

    public void addClase(Clase clase) {
        this.clases.add(clase);
    }

    public void addAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
        this.alumnosMap.put(alumno.getCodigo(), alumno);
    }

    public boolean siExisteAlumno(Alumno alumno) {
        return this.alumnos.contains(alumno);
    }


    @Override
    public int compareTo(Curso o) {
        return this.nombre.compareTo(o.getNombre());
    }
}
