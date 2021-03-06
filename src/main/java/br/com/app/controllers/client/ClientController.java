package br.com.app.controllers.client;

import br.com.app.controllers.Controller;
import br.com.app.daos.ClientDAO;
import br.com.app.models.Client;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;

@Model
public class ClientController implements Controller {
    
    private Client client = new Client();
    
    @Inject
    private ClientDAO dao;

    @Transactional
    @Override
    public String save() {
        dao.save(client);
        return "/client/list_client?face-redirect=true";
    }
    
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}