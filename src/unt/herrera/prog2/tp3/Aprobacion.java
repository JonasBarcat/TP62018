/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp3;

/**
 *
 * @author Gianpaolo
 */
public enum Aprobacion {
    APROBADO_SO("Aprobado_so"),APROBADO_CO("Aprobado_co"),DESAPROBADO("Desaprobado");
    
    String mensaje;

    private Aprobacion(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public String getMensaje() {
	return mensaje;
    }

    
    
    
    
}
