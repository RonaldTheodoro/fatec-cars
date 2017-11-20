package br.com.app.daos;

import br.com.app.models.Part;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PartDAO implements DAO<Part>{
    
    @PersistenceContext
    private EntityManager manager;
    
    @Override
    public void save(Part part) {
        manager.persist(part);
    }
    
    @Override
    public List<Part> listAll() {
        String jpql = "SELECT p FROM part p";
        return manager.createQuery(jpql, Part.class).getResultList();
    }
    
}