package br.com.app.controllers.part;

import br.com.app.controllers.Controller;
import br.com.app.daos.PartDAO;
import br.com.app.models.Part;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;

@Model
public class PartController implements Controller {
    
    private Part part = new Part();
    
    @Inject
    private PartDAO dao;
    
    @Transactional
    @Override
    public String save() {
        dao.save(part);
        return "/part/list_part?faces-redirect=true";
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }
    
}