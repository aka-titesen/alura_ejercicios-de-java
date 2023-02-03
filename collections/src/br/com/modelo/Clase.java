package br.com.modelo;

public class Clase implements Comparable<Clase> {
    private String nombre;

    public Clase(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Clase{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Clase o) {
        return this.nombre.compareTo(o.getNombre());
    }
}
