/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.curso.jpa.service;

import com.algaworks.curso.jpa.dao.FabricanteDAO;
import com.algaworks.curso.jpa.modelo.Fabricante;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author admin-joel
 */
public class CadastroFabricanteService implements Serializable{
    @Inject
    private FabricanteDAO fabricanteDAO;
    
    public void salvar(Fabricante fabricante)throws NegocioException{
    if(fabricante.getNome()==null||fabricante.getNome().trim().equals("")){
       throw new NegocioException("nombre o fabricante é obrigatório");
    }
    this.fabricanteDAO.salvar(fabricante);
    
    }
    
}
