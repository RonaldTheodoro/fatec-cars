package br.com.app.controllers;

import javax.transaction.Transactional;

public interface Controller {

    @Transactional
    String save();
    
}
