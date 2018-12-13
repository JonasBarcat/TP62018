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
public enum Rol {
    TUTOR("Tutor"),
    COTUTOR("Cotutor"),
    JURADO("Jurado");
    
   private String mensaje; 
   
   private Rol(String mensaje){
   this.mensaje=mensaje;
   }

    public String getMensaje() {
        return mensaje;
    }


}
