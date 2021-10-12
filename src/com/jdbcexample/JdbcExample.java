/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbcexample;
import com.jdbcexample.controllers.AlumnoController;
import com.jdbcexample.objetos.Alumno;

import java.util.Optional;

/**
 *
 * @author Hugo Chanampe
 */
public class JdbcExample {

   
   public static void main(String[] args) {
//       Alumno alumno = new Alumno("masculilno", "varas", "enzo");
//       alumno.setIdAlumnos(3);

       AlumnoController alumnoController= new AlumnoController();
       Optional<Alumno> alumno = alumnoController.getObject(5);
       System.out.printf(String.valueOf(alumno));
   }
}  
  

