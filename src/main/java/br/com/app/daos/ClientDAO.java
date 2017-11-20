package br.com.app.daos;

import br.com.app.models.Client;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ClientDAO implements DAO<Client> {
    
    @PersistenceContext
    private EntityManager manager;
    
    @Override
    public void save(Client client) {
        manager.persist(client);
    }
    
    @Override
    public List<Client> listAll() {
        String jpql = "SELECT c FROM client c";
        return manager.createQuery(jpql, Client.class).getResultList();
    }
}