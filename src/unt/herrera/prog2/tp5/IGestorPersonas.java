/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp5;

import java.util.List;

/**
 *
 * @author jonas
 */
public interface IGestorPersonas {
    
    public String nuevoProfesor(String apellidos, String nombres, int dni, Cargo cargo); 
    public String nuevoAlumno(String apellidos, String nombres, int dni, String cx); 
    public List<Profesor> buscarProfesores(String apellidos); 
    public List<Alumno> buscarAlumnos(String apellidos);  
    public Profesor dameProfesor(int documento);  
    public Alumno dameAlumno(String cx);  
    public void mostrarPersonas(); 
    public void mostrarAlumnos(); 
    public void mostrarProfesores(); 

    public void ordenarPersonas();
    public String modificarProfesor(Profesor profesor, String apellidos, String nombres, Cargo cargo);
    public String modificarAlumno(Alumno alumno, String apellidos, String nombres, String cx);
    public String borrarProfesor(Profesor profesor);
    public String borrarAlumno(Alumno alumno);
}
    
