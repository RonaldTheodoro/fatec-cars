package br.com.app.controllers;

import br.com.app.daos.ClientDAO;
import br.com.app.models.Client;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;

@Model
public class ClientController {
    
    private Client client = new Client();
    
    @Inject
    private ClientDAO dao;

    @Transactional
    public String save() {
        dao.save(client);
        return "client/list_client.xhtml?face-redirect=true";
    }
    
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}