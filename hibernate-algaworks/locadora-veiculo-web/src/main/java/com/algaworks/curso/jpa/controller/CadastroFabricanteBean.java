/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.curso.jpa.controller;

import com.algaworks.curso.jpa.modelo.Fabricante;
import com.algaworks.curso.jpa.service.CadastroFabricanteService;
import com.algaworks.curso.jpa.service.NegocioException;
import com.algaworks.curso.jpa2.util.jsf.FacesUtil;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class CadastroFabricanteBean implements Serializable{
    @Inject
    private CadastroFabricanteService cadastroFabricanteService;
    
    private Fabricante fabricante;
    
    public void salvar(){
        try {
            this.cadastroFabricanteService.salvar(fabricante);
            FacesUtil.addSuccessMessage("Fabrucante salvo Com successol");
        } catch (NegocioException e) {
              FacesUtil.addErrorMessage(e.getMessage());
        }
    }
    
    @PostConstruct
    public void init(){
        this.fabricante = new Fabricante();
    }

    public CadastroFabricanteBean() {
    }

    public CadastroFabricanteService getCadastroFabricanteService() {
        return cadastroFabricanteService;
    }

    public void setCadastroFabricanteService(CadastroFabricanteService cadastroFabricanteService) {
        this.cadastroFabricanteService = cadastroFabricanteService;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    
    
}
