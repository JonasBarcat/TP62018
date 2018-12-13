/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp2;

import java.time.LocalDate;

/**
 *
 * @author Gianpaolo
 */
public class Trabajo {
    private String titulo;
    private String areatematica;
    private String duracion;
    private LocalDate fechaPresentacionAprobacion;
    private LocalDate fechaAprobadoCA;
    private LocalDate fechaPresentacionFinal;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAreatematica() {
        return areatematica;
    }

    public void setAreatematica(String areatematica) {
        this.areatematica = areatematica;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public LocalDate getFechaPresentacionAprobacion() {
        return fechaPresentacionAprobacion;
    }

    public void setFechaPresentacionAprobacion(LocalDate fechaPresentacionAprobacion) {
        this.fechaPresentacionAprobacion = fechaPresentacionAprobacion;
    }

    public LocalDate getFechaAproadoCA() {
        return fechaAprobadoCA;
    }

    public void setFechaAproadoCA(LocalDate fechaAproadoCA) {
        this.fechaAprobadoCA = fechaAproadoCA;
    }

    public LocalDate getFechaPresentacionFinal() {
        return fechaPresentacionFinal;
    }

    public void setFechaPresentacionFinal(LocalDate fechaPresentacionFinal) {
        this.fechaPresentacionFinal = fechaPresentacionFinal;
    }

    public Trabajo(String titulo, String areatematica, String duracion, LocalDate fechaPresentacionAprobacion, LocalDate fechaAprobadoCA, LocalDate fechaPresentacionFinal) {
        this.titulo = titulo;
        this.areatematica = areatematica;
        this.duracion = duracion;
        this.fechaPresentacionAprobacion = fechaPresentacionAprobacion;
        this.fechaAprobadoCA = fechaAprobadoCA;
        this.fechaPresentacionFinal = fechaPresentacionFinal;
    }

   
    
 
    public void mostrar(){
    System.out.println("El titulo es: "+titulo+" el area tematica es: "+areatematica+" la duracion es: "+duracion+"meses, la fecha de presentacion de aprobacion es: "+fechaPresentacionAprobacion+" la fecha de aprobacion de la Comision Academica es: "+fechaAprobadoCA+" la fecha de realizacion de la presentacion final es: "+fechaPresentacionFinal);}
}
