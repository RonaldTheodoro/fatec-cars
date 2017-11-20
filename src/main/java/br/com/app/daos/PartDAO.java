package br.com.app.daos;

import br.com.app.models.Part;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PartDAO {
    
    @PersistenceContext
    private EntityManager manager;
    
    public void save(Part part) {
        manager.persist(part);
    }
    
    public List<Part> listAll() {
        String jpql = "SELECT p FROM Part p";
        return manager.createQuery(jpql, Part.class).getResultList();
    }
    
}