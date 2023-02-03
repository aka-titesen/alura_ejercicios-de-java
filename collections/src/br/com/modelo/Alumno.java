package br.com.modelo;

public class Alumno implements Comparable<Alumno> {
    private String nombre;

    private String codigo;

    public Alumno(String nombre, String codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Clase{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Alumno alumno = (Alumno) obj;
        return this.nombre.equals(alumno.getNombre());
    }

    @Override
    public int hashCode() {
        return this.nombre.hashCode();
    }

    @Override
    public int compareTo(Alumno o) {
        return this.nombre.compareTo(o.getNombre());
    }
}
