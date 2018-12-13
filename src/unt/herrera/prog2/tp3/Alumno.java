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
public class Alumno {
    private String cx;
    private String apellidos;
    private String nombres;
    private int dni;

    public String getCx() {
        return cx;
    }

    public void setCx(String cx) {
        this.cx = cx;
    }

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

    public Alumno(String cx, String apellidos, String nombres, int dni) {
        this.cx = cx;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.dni = dni;
    }
    
    
    public void mostrar(){
    System.out.println("El CX es: "+this.cx+" los apellidos son: "+this.apellidos+" los nombres son: "+this.nombres+" el dni es: "+this.dni);}

    @Override
    public String toString() {
        return "El CX es: "+this.cx+" los apellidos son: "+this.apellidos+" los nombres son: "+this.nombres+" el dni es: "+this.dni;}
    
}
