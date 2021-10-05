/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcexample;
import jdbcexample.controllers.AlumnoController;
import jdbcexample.objetos.Alumno;

import java.sql.*;

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
  

