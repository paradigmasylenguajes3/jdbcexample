/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcexample;

import jdbcexample.controllers.AlumnosController;
import jdbcexample.objetos.Alumno;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hugo Chanampe
 */
public class JdbcExample {

   
   public static void main(String[] args) throws SQLException, ClassNotFoundException  {

       AlumnosController alumnosController = new AlumnosController();

       alumnosController.listarAlumnos();
       alumnosController.insertarAlumno(new Alumno("M", "Juarez", "Pedro"));
       alumnosController.mostrarAlumnoPorId(2);
       


   } 
}  
  

