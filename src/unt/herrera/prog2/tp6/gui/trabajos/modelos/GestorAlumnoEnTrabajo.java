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
public class GestorAlumnoEnTrabajo implements IGestorAlumnosEnTrabajos {
    
    
    // siempre para crear un solo gestor
    private static GestorAlumnoEnTrabajo gestor;
    
    private GestorAlumnoEnTrabajo(){}
    
    public static GestorAlumnoEnTrabajo crear(){
        if(gestor==null){
            gestor = new GestorAlumnoEnTrabajo();
        }
        return gestor;
    }
    
    
    @Override
    public AlumnoEnTrabajo nuevoAlumnoEnTrabajo(LocalDate fechaDesde,Alumno unAlumno){
    
        if(fechaDesde!=null && unAlumno!=null){
            AlumnoEnTrabajo nuevoAlumno = new AlumnoEnTrabajo(fechaDesde, unAlumno);
            return nuevoAlumno;
        }else System.out.println("El alumno no pudo ser creado. Verifique los parametros ingresados.");
        
        
    return null;}
    
    
    
    
  
}
