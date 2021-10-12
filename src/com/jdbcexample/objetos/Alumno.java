/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbcexample.objetos;

/**
 *
 * @author Hugo Chanampe
 */
public class Alumno {


    private Integer idAlumnos;
    
    private String sexo;
    
    private String apellido;
    
    private String nombre;

    public Alumno(String sexo, String apellido, String nombre) {
        this.sexo = sexo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public Alumno(String sexo, String nombre, String apellido, Integer id) {
        this.sexo = sexo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.idAlumnos = id;

    }

    public Alumno() {

    }

    public Integer getIdAlumnos() {
        return idAlumnos;
    }

    public void setIdAlumnos(Integer idAlumnos) {
        this.idAlumnos = idAlumnos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "idAlumnos=" + idAlumnos +
                ", sexo='" + sexo + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
