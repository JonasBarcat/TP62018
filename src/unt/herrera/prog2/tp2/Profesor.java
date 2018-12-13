/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp2;

/**
 *
 * @author Gianpaolo
 */
public class Profesor {
   private String nombre;
   private String apellido;
   private String dni;
   private String cargo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Profesor(String nombre, String apellido, String dni, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cargo = cargo;
    }
    public void mostrar(){
    System.out.println("El nombre del profesor es: "+this.nombre+" el apellido del profesor es: "+this.apellido+" el dni del profesor es: "+this.dni+" el cargo del profesor es: "+this.cargo);}
}
