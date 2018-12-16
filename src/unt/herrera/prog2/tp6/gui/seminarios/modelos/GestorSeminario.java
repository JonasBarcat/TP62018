/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonas
 */
public class GestorSeminario {
        String mensaje;
        List<Seminario> listaSeminarios = new ArrayList<>();
        
        
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
                        mensaje="Error. Fecha de exposicion incorrecta";
                        return mensaje;
                    }
                    
                    
                    if(nota==nota.APROBADO_CONOBS && (obs.isEmpty() || obs==null)){ // si esta aprobado con observaciones entonces se deben ingresar observaciones
                        mensaje="Error. Debe ingresar una observacion";
                        return mensaje;
                    }
                    if(nota==nota.DESAPROBADO && (obs.isEmpty() || obs==null)){  // analogo al caso anterior
                        mensaje="Error. Debe ingresar una observacion";
                        return mensaje;
                    }
                    
              // si supera los controles entonces crea el seminario y lo agrega a una lista con todos los seminarios
              Seminario nuevoseminario= new Seminario(fechaExposicion, nota,obs);
                    listaSeminarios.add(nuevoseminario);
                    mensaje="Seminario creado exitosamente";
                    
            return mensaje;
            }
}
