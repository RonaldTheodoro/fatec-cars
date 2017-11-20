package br.com.app.controllers.vehicle;

import br.com.app.daos.VehicleDAO;
import br.com.app.models.Vehicle;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;

@Model
public class VehicleController {
    
    private Vehicle vehicle = new Vehicle();

    @Inject
    private VehicleDAO dao;

    @Transactional
    public String save() {
        dao.save(vehicle);
        return "/vehicle/list_vehicle?faces-redirect=true";
    }
    
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
}