/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp3;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Gianpaolo
 */
public class RolEnTrabajo {
    
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private String razon;
    private Rol UnRol;
    private Profesor UnProfesor;

    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public Rol getUnRol() {
        return UnRol;
    }

    public void setUnRol(Rol UnRol) {
        this.UnRol = UnRol;
    }

    public Profesor getUnProfesor() {
        return UnProfesor;
    }

    public void setUnProfesor(Profesor UnProfesor) {
        this.UnProfesor = UnProfesor;
    }

    public RolEnTrabajo(LocalDate fechaDesde, LocalDate fechaHasta, String razon, Rol UnRol, Profesor UnProfesor) {
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.razon = razon;
        this.UnRol = UnRol;
        this.UnProfesor = UnProfesor;
    }
    
public void mostrar(){

    System.out.println("La fecha desde que empezo el trabajo es: "+fechaDesde+" la fecha hasta que realizo el trabajo es: "+fechaHasta+" la razon por la que abandono el trabajo es: "+razon+" el rol que realizaba es: "+UnRol+" el profesor que lo realizaba es: "+UnProfesor);
    
 //VER LO DE PROFESOR
    
}


}
