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
public class GestorRolEnTrabajo implements IGestorRolesEnTrabajos {
    
    
    // siempre para crear un solo gestor
    private static GestorRolEnTrabajo gestor;
    
    private GestorRolEnTrabajo(){}
    
    public static GestorRolEnTrabajo crear(){
        if(gestor==null){
            gestor = new GestorRolEnTrabajo();
        }
        return gestor;
    }
    
    @Override
   public RolEnTrabajo nuevoRolEnTrabajo(LocalDate fechaDesde, Profesor unProfesor,Rol unRol){
   
       if(fechaDesde!=null && unProfesor!=null && unRol!=null){  //Si los parametros recibidos son validos entonces crea un nuevo rol
           RolEnTrabajo nuevoRol= new RolEnTrabajo(fechaDesde, unProfesor, unRol);
           return nuevoRol; // retorna el rol creado
       }else System.out.println("Los parametros recibidos son incorrectos");
       
       
   return null; // de lo contrario retornara siempre null
   }
    
       
    
    
}
