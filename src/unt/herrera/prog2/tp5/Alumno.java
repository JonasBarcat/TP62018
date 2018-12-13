/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp5;

import unt.herrera.prog2.tp4.*;
import java.util.Objects;


/**
 *
 * @author Gianpaolo
 */
public class Alumno extends Persona {
    private String cx;
    

    public String getCx() {
        return cx;
    }

    public void setCx(String cx) {
        this.cx = cx;
    }

    

    public Alumno(String apellidos, String nombres, int dni,String cx) {
        super(apellidos,nombres,dni);
        this.cx = cx;
        
    }
    
    
    public void mostrar(){
     System.out.print("CX: "+this.cx+" - ");
        super.mostrar();
    }

    
    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.cx)+super.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)){
            return true;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.cx, other.cx)) {
            return false;
        }
        return true;
    }

    
    
    
    
    
    
    
}
