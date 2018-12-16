/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp5;

import unt.herrera.prog2.tp4.*;

/**
 *
 * @author Gianpaolo
 */
public enum NotaAprobacion {
    APROBADO_SINOBS("Aprobado_so"),APROBADO_CONOBS("Aprobado_co"),DESAPROBADO("Desaprobado");
    
    String mensaje;

    private NotaAprobacion(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public String getMensaje() {
	return mensaje;
    }

    
    
    
    
}
