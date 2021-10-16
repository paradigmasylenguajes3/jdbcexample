
package com.jdbcexample.objetos;


public class Curso {
    private int idCurso;
    private String nombre;
    private int duracion;

    public Curso(int idCurso, String nombre, int duracion) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public Curso(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Curso{" + "idCurso=" + idCurso + ", nombre=" + nombre + ", duracion=" + duracion + '}';
    }
    
    
    
}
