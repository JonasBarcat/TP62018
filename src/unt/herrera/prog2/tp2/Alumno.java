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
public class Alumno {
   private String nombre;
   private String apellido;
   private String dni;
   private String CX;

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

    public String getCX() {
        return CX;
    }

    public void setCX(String CX) {
        this.CX = CX;
    }

    public Alumno(String nombre, String apellido, String dni, String CX) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.CX = CX;
    }
   public void mostrar(){
    System.out.println("El nombre del alumno es: "+nombre+" el apellido del alumno es: "+apellido+" el dni del alumno es: "+dni+" el CX del alumno es: "+CX);}
   
}