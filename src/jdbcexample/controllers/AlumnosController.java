package jdbcexample.controllers;

import jdbcexample.Conexion;
import jdbcexample.objetos.Alumno;

import java.sql.*;

public class AlumnosController {

    public void insertarAlumno(Alumno alumno) throws SQLException, ClassNotFoundException {

        String sql2 = "INSERT INTO alumnos (nombre,apellido,sexo) VALUES (?,?,?)";
        Connection conn = Conexion.obtenerConexion();
        PreparedStatement ps = conn.prepareStatement( sql2 );
        ps.setString(1, alumno.getNombre());
        ps.setString(2, alumno.getApellido());
        ps.setString(3, alumno.getSexo());
        ps.executeUpdate();
        System.out.println("Alumnos Ingresado Exitosamente");
        conn.close();

    }

    public void mostrarAlumnoPorId(Integer id) throws SQLException, ClassNotFoundException {

        String sql3 = "SELECT * FROM alumnos WHERE id=?";

        Connection conn = Conexion.obtenerConexion();

        PreparedStatement seleccionaCodigo = conn.prepareStatement(sql3);
        seleccionaCodigo.setInt(1, id);
        ResultSet rs = seleccionaCodigo.executeQuery();
        System.out.println("\n ---------ALUMNO BUSCADO------------");

        while (rs.next()) {

            int idAlumno  = rs.getInt("id");
            String firstName   = rs.getString("nombre");
            String lastName    = rs.getString("apellido");
            String sexo        = rs.getString("sexo");

            Alumno alumno = new Alumno(sexo, firstName, lastName, idAlumno);
            //Display values
            System.out.println( alumno );
        }


    }

    public  void listarAlumnos() throws SQLException, ClassNotFoundException{

        Connection conn = Conexion.obtenerConexion();
        Statement stmt = conn.createStatement();
        String sql;
        sql = "SELECT * FROM alumnos";
        ResultSet rs = stmt.executeQuery(sql);

        //STEP 5: Extract data from result set
        while(rs.next()){
            //Retrieve by column name
            int id  = rs.getInt("id");
            String firstName   = rs.getString("nombre");
            String lastName    = rs.getString("apellido");
            String sexo        = rs.getString("sexo");

            Alumno alumno = new Alumno(sexo, firstName, lastName, id);
            //Display values
            System.out.println( alumno );
        }


    }

}
