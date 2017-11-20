package br.com.app.daos;

import br.com.app.models.Vehicle;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class VehicleDAO implements DAO<Vehicle> {
    
    @PersistenceContext
    private EntityManager manager;
    
    @Override
    public void save(Vehicle vehicle) {
        manager.persist(vehicle);
    }
    
    @Override
    public List<Vehicle> listAll() {
        String jpql = "SELECT v FROM vehicle v";
        return manager.createQuery(jpql, Vehicle.class).getResultList();
    }
    
}