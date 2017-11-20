package br.com.app.daos;

import java.util.List;

public interface DAO<T> {

    List<T> listAll();

    void save(T obj);
    
}
