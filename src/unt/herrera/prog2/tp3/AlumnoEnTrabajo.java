    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp3;

import java.time.LocalDate;

/**
 *
 * @author Gianpaolo
 */
public class AlumnoEnTrabajo {
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private String razon;
    private Alumno UnAlumno;

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

    public Alumno getAlumno1() {
        return UnAlumno;
    }

    public void setAlumno1(Alumno alumno1) {
        this.UnAlumno = alumno1;
    }

    public AlumnoEnTrabajo(LocalDate fechaDesde, LocalDate fechaHasta, String razon, Alumno UnAlumno) {
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.razon = razon;
        this.UnAlumno = UnAlumno;
    }
    public void mostrar(){
    System.out.println("\n La fecha en la que se inicio el trabajo es: "+this.fechaDesde);
    System.out.println("\n La fecha hasta la que se trabajo es: "+this.fechaHasta);
    System.out.println("\n La razon es: "+this.razon);
    
    
//  System.out.println(alumno1); //Usando el TOString

    UnAlumno.mostrar();}          // Usando el metodo mostrar
}
