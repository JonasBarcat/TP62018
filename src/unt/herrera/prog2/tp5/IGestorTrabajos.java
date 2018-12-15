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
    public void ordenarTrabajos();
    
    
    
    public String finalizarAlumno(Trabajo trabajo, Alumno alumno, LocalDate fechaHasta,String razon);
    public String finalizarTrabajo(Trabajo trabajo, LocalDate fechaExposicion);
    public String borrarTrabajo(Trabajo trabajo);
    public String reemplazarProfesor(Trabajo trabajo, Profesor profesorReemplazado, LocalDate fechaHasta, String razon, Profesor nuevoProfesor);
    public String nuevoTrabajo(String titulo, ArrayList<Area> area,int duracion, LocalDate fechaPresentacion,LocalDate fechaAprobacion, ArrayList<AlumnoEnTrabajo> listaAlumnoEnT, ArrayList<RolEnTrabajo> listaRolEnT);
    
    
}
