package br.com.app.controllers.part;

import br.com.app.daos.PartDAO;
import br.com.app.models.Part;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class PartListController {
    
    private List<Part> parts = new ArrayList<>();
    
    @Inject
    private PartDAO dao;

    public List<Part> getParts() {
        parts = dao.listAll();
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }
    
}
