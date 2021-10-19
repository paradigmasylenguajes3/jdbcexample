package com.jdbcexample.objetos;

public class Curso {
    private Integer idCursos;
    private String nombre;
    private Integer duracion;

    public Curso(Integer idCursos, String nombre, Integer duracion) {
        this.idCursos = idCursos;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public Curso(String nombre, Integer duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public Curso() {
    }

    public Integer getIdCursos() {
        return idCursos;
    }

    public void setIdCursos(Integer idCursos) {
        this.idCursos = idCursos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "idCursos=" + idCursos +
                ", nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                '}';
    }

}
