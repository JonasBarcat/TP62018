/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp5;

import java.util.ArrayList;

/**
 *
 * @author jonas
 */
public interface IGestorPersonas {
    
    public String nuevoProfesor(String apellidos, String nombres, int dni, Cargo cargo); 
    public String nuevoAlumno(String apellidos, String nombres, int dni, String cx); 
    public ArrayList<Profesor> buscarProfesores(String apellidos); 
    public ArrayList<Alumno> buscarAlumnos(String apellidos);  
    public Profesor dameProfesor(int documento);  
    public Alumno dameAlumno(String cx);  
    public void mostrarPersonas(); 
    public void mostrarAlumnos(); 
    public void mostrarProfesores(); 

    
}
