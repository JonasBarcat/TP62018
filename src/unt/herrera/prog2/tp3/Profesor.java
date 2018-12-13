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
public class Profesor {
    private String apellidos;
    private String nombres;
    private int dni;
    private Cargo UnCargo;

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

    public Cargo getUnCargo() {
        return UnCargo;
    }

    public void setUnCargo(Cargo UnCargo) {
        this.UnCargo = UnCargo;
    }

    public Profesor(String apellidos, String nombres, int dni, Cargo UnCargo) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.dni = dni;
        this.UnCargo = UnCargo;
    }

    public void mostrar (){
        System.out.println("Los apellidos son: "+this.apellidos+" los nombres son: "+this.nombres+" el dni es: "+this.dni+" el cargo es: "+this.UnCargo);
    }
    
    @Override
    public String toString() {
        return this.apellidos+" "+this.nombres+" el dni es: "+this.dni+" el cargo es: "+this.UnCargo; 
    }
    
    
}
