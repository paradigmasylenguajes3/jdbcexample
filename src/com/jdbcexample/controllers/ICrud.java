package com.jdbcexample.controllers;

import java.util.List;
import java.util.Optional;

public interface ICrud<T> {
    public boolean insertObject(T entity);
    public boolean deleteObject(T entity);
    public Optional<T> getObject(int id);
    public boolean modifiedObject(T entity);
    public List<T> getAllObjects();
}
