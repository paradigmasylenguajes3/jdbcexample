package com.jdbcexample.controllers;

import java.util.List;
import java.util.Optional;

public interface ICrud<T> {
    public boolean insertObject(T entity);
    public boolean deleteObject(int id);
    public Optional<T> getObject(int id);
    public boolean modifiedObject(String sexo, String apellido, String nombre, int id);
    public List<T> getAllObjects();
}
