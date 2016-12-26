/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.curso.jpa.dao;

import com.algaworks.curso.jpa.modelo.Fabricante;
import com.algaworks.curso.jpa2.util.jpa.Transactional;
import java.io.Serializable;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author admin-joel
 */
public class FabricanteDAO implements Serializable {
    @Inject
    private EntityManager em;
    
    @Transactional
    public void salvar(Fabricante fabricante){ 
        em.persist(fabricante);
        
    
    }
}
