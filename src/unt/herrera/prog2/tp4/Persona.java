/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp4;

/**
 *
 * @author Gianpaolo
 */
public abstract class Persona {
   private String apellidos;
   private String nombres;
   private int dni;

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Persona(String apellidos, String nombres, int dni) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.dni = dni;
    }
    
    
    public void mostrar(){
    System.out.println("["+this.dni+"]"+" "+this.apellidos+" "+this.nombres);
    
    }

    @Override
    public String toString() {
        return  this.apellidos+", "+this.nombres;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.dni;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass().getSuperclass() != obj.getClass().getSuperclass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }
    
    
    
    
}
