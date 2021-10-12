/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbcexample;
import com.jdbcexample.controllers.AlumnoController;
import com.jdbcexample.objetos.Alumno;

/**
 *
 * @author Hugo Chanampe
 */
public class JdbcExample {

   
   public static void main(String[] args) {
       Alumno alumno = new Alumno("masculilno", "perez", "juan");
       AlumnoController alumnoController= new AlumnoController();
   }
}  
  

