package br.com.app.controllers.vehicle;

import br.com.app.daos.VehicleDAO;
import br.com.app.models.Vehicle;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class VehicleListController {
    
    private List<Vehicle> vehicles = new ArrayList<>();
    
    @Inject
    private VehicleDAO dao;

    public List<Vehicle> getVehicles() {
        vehicles = dao.listAll();
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    
}
