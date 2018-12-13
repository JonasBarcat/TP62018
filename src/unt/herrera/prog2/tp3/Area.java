/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp3;

/**
 *
 * @author Gianpaolo
 */
public class Area {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Area(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "el nombre del area es: "+this.nombre;
    }
    
    
    
    
}
