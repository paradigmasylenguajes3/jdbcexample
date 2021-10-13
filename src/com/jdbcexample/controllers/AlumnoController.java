package com.jdbcexample.controllers;

import com.jdbcexample.Conexion;
import com.jdbcexample.objetos.Alumno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class AlumnoController implements ICrud<Alumno> {

    @Override
    public boolean insertObject(Alumno entity){
        String sql = "INSERT INTO public.alumnos (nombre,apellido,sexo) VALUES (?,?,?)";
        
        try {
            Connection conn = Conexion.obtenerConexion();

            PreparedStatement prepareStatement = conn.prepareStatement(sql);
            prepareStatement.setString(1, entity.getNombre());
            prepareStatement.setString(2, entity.getApellido());
            prepareStatement.setString(3, entity.getSexo());
            prepareStatement.executeUpdate();
            conn.close();
        } catch (SQLException | ClassNotFoundException e){
            System.out.println("fallo al intentar escribir en la base de datos");
        }

        return true;
    }

    @Override
    public boolean deleteObject(int id) {
        String sql = "DELETE FROM public.alumnos WHERE id="+id+";";
        
        try{
            Connection conn = Conexion.obtenerConexion();
            Statement statement = conn.createStatement();            
            statement.executeQuery(sql);
            conn.close();
            
        }catch(SQLException | ClassNotFoundException e){
            System.out.println(e);
        }
        
        return false;
    }

    @Override
    public Optional<Alumno> getObject(int id) {
        String sql = "SELECT * FROM public.alumnos WHERE id="+id+";";
        try{
            Connection conn = Conexion.obtenerConexion();
            Statement statement = conn.createStatement();
            
            ResultSet rs = statement.executeQuery(sql);
            
            while(rs.next()){
                Alumno alumno = new Alumno();
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setSexo(rs.getString("sexo"));
                alumno.setIdAlumnos(rs.getInt("id"));
                return Optional.of(alumno);
            }

        }catch(SQLException | ClassNotFoundException e){
            System.out.println("Fallo al intentar obtener los objetos de la base de datos");
         }
        return null;
    }

    @Override
    public boolean modifiedObject(Alumno entity) {
        String sql = "UPDATE public.alumnos SET apellido='"+entity.getApellido()+"', nombre='"+entity.getNombre()+"', sexo='"+entity.getSexo()+"' WHERE id="+entity.getIdAlumnos()+";";

        try{
            Connection conn = Conexion.obtenerConexion();
            Statement statement = conn.createStatement();
            statement.execute(sql);
            conn.close();
            return true;

        }catch(SQLException | ClassNotFoundException e){
            System.out.println(e);
        }
        return false;
    }

    @Override
    public List<Alumno> getAllObjects() {
        String sql = "SELECT * FROM public.alumnos;";
        try{
            Connection conn = Conexion.obtenerConexion();
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(sql);
            List<Alumno> listadoAlumnos = new ArrayList<>();
            while(rs.next()){
                Alumno alumno = new Alumno();
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setSexo(rs.getString("sexo"));
                alumno.setIdAlumnos(rs.getInt("id"));
                listadoAlumnos.add(alumno);
            }
            return listadoAlumnos;

        }catch(SQLException | ClassNotFoundException e){
            System.out.println("Fallo al intentar obtener los objetos de la base de datos");
        }
        return null;
    }
    }

