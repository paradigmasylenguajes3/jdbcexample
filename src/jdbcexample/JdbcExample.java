/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcexample;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hugo Chanampe
 */
public class JdbcExample {

     // JDBC driver name and database URL
    // This will load the MySQL driver, each DB has its own driver
            

   
   public static void listarAlumnos() throws SQLException, ClassNotFoundException{
       
      Connection conn = Conexion.obtenerConexion();
      Statement stmt = conn.createStatement();
      String sql;
      sql = "SELECT * FROM alumnos";
      ResultSet rs = stmt.executeQuery(sql);
        
      //STEP 5: Extract data from result set
      while(rs.next()){
         //Retrieve by column name
         int id  = rs.getInt("id_alumno");
         //int age = rs.getInt("cantidad");
         String firstName = rs.getString("nombre");
         String  lastName= rs.getString("apellido");

         //Display values
         System.out.print("\n ID: " + id);
         //System.out.print(", Age: " + age);
         System.out.print(", Nombre: " + firstName);
         System.out.println(", Apellido: " + lastName);
       
      }
  
       
   }
   
   public static void insertarAlumno(String nombre, String apellido,String sexo) throws SQLException, ClassNotFoundException{
   
       String sql2 = "INSERT INTO alumnos (nombre,apellido,sexo) VALUES (?,?,?)";
       Connection conn = Conexion.obtenerConexion();
       PreparedStatement ps = conn.prepareStatement(sql2);
                        ps.setString(1, nombre);
                        ps.setString(2, apellido);
                        ps.setString(3, sexo);
                        ps.executeUpdate(); 
       System.out.println("Alumnos Ingresado Exitosamente");
       
   
   }
   
   public static void mostrarAlumnoPorID(Integer id) throws SQLException, ClassNotFoundException{
   
        String sql3="SELECT * FROM alumnos WHERE id_alumno=?";
   
        Connection conn = Conexion.obtenerConexion();
   
        PreparedStatement seleccionaCodigo = conn.prepareStatement(sql3);
        seleccionaCodigo.setInt(1,12);
        ResultSet rs = seleccionaCodigo.executeQuery();
                System.out.println("\n ---------ALUMNO BUSCADO------------");

         while(rs.next()){

         String name =rs.getString("nombre");
         Integer id_alumno =rs.getInt("id_alumno");
         String lastName = rs.getString("apellido");
             System.out.println(id_alumno);
             System.out.println(name);
             System.out.println(lastName);
         }
         
   
   
   }
   
   
   
   public static void main(String[] args) throws SQLException, ClassNotFoundException  {
   
      listarAlumnos();
      insertarAlumno("Sara", "Juarez", "F");
      mostrarAlumnoPorID(12);
       


   } 
}  
  

