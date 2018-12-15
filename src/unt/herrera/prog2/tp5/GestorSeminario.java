/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp5;

import java.time.LocalDate;


/**
 *
 * @author jonas
 */
public class GestorSeminario {
        String mensaje="exito";
        
        
                      // siempre para crear un solo gestor
             private static GestorSeminario gestor;
    
                 private GestorSeminario(){}
    
                    public static GestorSeminario crear(){
                     if(gestor==null){
                        gestor = new GestorSeminario();
                        }
                        return gestor;
                       }
        
        
                
                    
            // con este metodo se ingresan los datos de un seminario y  se validaran los mismos datos
          // si todo esta en orden entonces se creara el seminario
            public String validarSeminario(LocalDate fechaExposicion,NotaAprobacion nota, String obs){
                    if(fechaExposicion==null){ 
                        mensaje="Error. Debe ingresar una fecha de exposicion";
                        System.out.println(mensaje);
                        return mensaje;
                    }
                    
                    
                    if(nota==nota.APROBADO_CONOBS && (obs.isEmpty() || obs==null)){ // si esta aprobado con observaciones entonces se deben ingresar observaciones
                        mensaje="Error. Debe ingresar una observacion";
                        System.out.println(mensaje);
                        return mensaje;
                    }
                    if(nota==nota.DESAPROBADO && (obs.isEmpty() || obs==null)){  // analogo al caso anterior
                        mensaje="Error. Debe ingresar una observacion";
                        System.out.println(mensaje);
                        return mensaje;
                    }
                    
            
            return mensaje;
            }    
}
