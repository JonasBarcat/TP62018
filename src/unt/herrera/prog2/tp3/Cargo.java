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
public enum Cargo {
    TITULAR("Titular"),ASOCIADO("Asociado"),ADJUNTO("Adjunto"),JTP("Jtp"),ADG("Adg");
    
    private String mensaje;
    
    private Cargo (String mensaje){
    this.mensaje=mensaje;}

    public String getMensaje() {
        return mensaje;
    }
    
}
