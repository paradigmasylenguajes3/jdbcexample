package com.jdbcexample.controllers;

import com.jdbcexample.Conexion;
import com.jdbcexample.objetos.Alumno;
import com.jdbcexample.objetos.Curso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CursoController implements ICrud<Curso>{


    @Override
    public boolean insertObject(Curso entity) {
        String sql = "INSERT INTO public.cursos (nombre,duracion) VALUES (?,?)";

        try {
            Connection conn = Conexion.obtenerConexion();

            PreparedStatement prepareStatement = conn.prepareStatement(sql);
            prepareStatement.setString(1, entity.getNombre());
            prepareStatement.setInt(2, entity.getDuracion());
            prepareStatement.executeUpdate();
            conn.close();
        } catch (SQLException | ClassNotFoundException e){
            System.out.println("fallo al intentar escribir en la base de datos");
        }

        return true;
    }

    @Override
    public boolean deleteObject(int id) {
        String sql = "DELETE FROM public.cursos WHERE id_curso="+id+";";

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
    public Optional<Curso> getObject(int id) {
        String sql = "SELECT * FROM public.cursos WHERE id_curso="+id+";";
        try{
            Connection conn = Conexion.obtenerConexion();
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()){
                Curso curso = new Curso();
                curso.setNombre(rs.getString("nombre"));
                curso.setDuracion(rs.getInt("duracion"));
                curso.setIdCursos(rs.getInt("id_curso"));
                return Optional.of(curso);
            }

        }catch(SQLException | ClassNotFoundException e){
            System.out.println("Fallo al intentar obtener los objetos de la base de datos");
            System.out.println(e);
        }


        return null;
    }

    @Override
    public boolean modifiedObject(Curso entity) {
        String sql = "UPDATE public.cursos SET nombre='"+entity.getNombre()+"', duracion='"+entity.getDuracion()+"' WHERE id_curso="+entity.getIdCursos()+";";

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
    public List<Curso> getAllObjects() {
        String sql = "SELECT * FROM public.cursos;";
        try{
            Connection conn = Conexion.obtenerConexion();
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(sql);
            List<Curso> listadoCursos = new ArrayList<>();
            while(rs.next()){
                Curso curso = new Curso();
                curso.setNombre(rs.getString("nombre"));
                curso.setDuracion(rs.getInt("duracion"));
                curso.setIdCursos(rs.getInt("id_curso"));
                listadoCursos.add(curso);
            }
            return listadoCursos;

        }catch(SQLException | ClassNotFoundException e){
            System.out.println("Fallo al intentar obtener los objetos de la base de datos");
        }

        return null;
    }
}
