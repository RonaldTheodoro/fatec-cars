package br.com.app.controllers;

import br.com.app.daos.ClientDAO;
import br.com.app.models.Client;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class ClientListController {
    
    private List<Client> clients = new ArrayList<>();
    
    @Inject
    private ClientDAO dao;
    
    public List<Client> getClients() {
        clients = dao.listAll();
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
    
}
