package com.jdbcexample.objetos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Alumno> listadoAlumnos = new ArrayList<>();

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public Curso() {

    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return this.nombre.toString();
    }

    public void addAlumno(Alumno alumno) {
        this.listadoAlumnos.add(alumno);
    }

    public List<Alumno> getListadoAlumnos() {
        return this.listadoAlumnos;
    }
}
