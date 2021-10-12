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

   
   public static void main(String[] args) throws SQLException, ClassNotFoundException {
       Alumno alumno = new Alumno("Masculino", "Ruiz", "Carlos");
       AlumnoController alumnoController= new AlumnoController();
       
       //alumnoController.insertObject(alumno);
       //alumnoController.getObject(2);
       //alumnoController.deleteObject(2);
       //alumnoController.modifiedObject("Femenino", "Cortez", "Maria", 1);

   }
}  
  

