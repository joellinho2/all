/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.Listener;

import java.util.logging.Logger;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author portatil
 */
public class CicloListener implements PhaseListener{
    
    private final static Logger LOGGER=Logger.getLogger("");
    
    @Override
    public void afterPhase(PhaseEvent event) {
//       LOGGER.info("TERMINO LA FASE ".concat(event.getPhaseId().toString()));
        System.out.println("ejecutando la postfase"+event.getPhaseId().toString());
    }

    @Override
    public void beforePhase(PhaseEvent event) {
//       LOGGER.info("ANTES DE INICIAR LA FASE ".concat(event.getPhaseId().toString()));
        System.out.println("ejecutando la prefase"+event.getPhaseId().toString());
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
    
}
