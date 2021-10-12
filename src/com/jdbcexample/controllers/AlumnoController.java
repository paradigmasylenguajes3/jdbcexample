package com.jdbcexample.controllers;

import com.jdbcexample.Conexion;
import com.jdbcexample.objetos.Alumno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;


public class AlumnoController implements ICrud<Alumno> {

    @Override
    public boolean insertObject(Alumno entity){
        String sql2 = "INSERT INTO alumnos (nombre,apellido,sexo) VALUES (?,?,?)";
        try {
            Connection conn = Conexion.obtenerConexion();

            PreparedStatement prepareStatement = conn.prepareStatement(sql2);
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
    public boolean deleteObject(Alumno entity) {
        return false;
    }

    @Override
    public Optional<Alumno> getObject(int id) {
        return null;
    }

    @Override
    public boolean modifiedObject(Alumno entity) {
        return false;
    }

    @Override
    public List<Alumno> getAllObjects() {
        return null;
    }
}
