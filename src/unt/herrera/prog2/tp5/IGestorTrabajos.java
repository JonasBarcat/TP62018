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
public interface IGestorTrabajos {
    
    public String nuevoTrabajo(String titulo,int duracion,LocalDate fechaPresentacion, LocalDate fechaAprobacion,List<Area> areas,List<RolEnTrabajo> profesores, List<AlumnoEnTrabajo> aet); 
    public Trabajo dameTrabajo(String titulo); 
    public List<Trabajo> buscarTrabajos(String titulo); 
    public void mostrarTrabajos(); 
    


}
