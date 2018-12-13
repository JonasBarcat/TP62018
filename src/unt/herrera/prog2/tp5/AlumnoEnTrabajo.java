    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp5;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import unt.herrera.prog2.tp4.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

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

    public AlumnoEnTrabajo(LocalDate fechaDesde, Alumno UnAlumno) {
        this.fechaDesde = fechaDesde;
        this.UnAlumno = UnAlumno;
    }
    
    
    
    
    
    public void mostrar(){
        
    Date fechaDesd = java.sql.Date.valueOf(fechaDesde); // cambia de LocalDate a Date
    DateFormat fechadesd= new SimpleDateFormat("dd/MM/yyyy");  // java.util.Date nos cambia el formato de la fecha
    System.out.println("Fecha desde que se inicio en el trabajo: "+fechadesd.format(fechaDesd));
    
    if(this.fechaHasta!=null){
    Date fechaHast = java.sql.Date.valueOf(fechaHasta); // cambia de LocalDate a Date
    DateFormat fechahast= new SimpleDateFormat("dd/MM/yyyy");  // java.util.Date nos cambia el formato de la fecha
    System.out.println("Fecha hasta la que participo en el trabajo: "+fechahast.format(fechaHast));
    }
    else System.out.println("La fecha hasta la que se trabajo es: -");
//   
    if(this.razon!=null){System.out.println("La razon es: "+this.razon);}
    else System.out.println("La razon es: -");

      UnAlumno.mostrar(); // Usando el metodo mostrar
    
//      System.out.println(UnAlumno); //Usando el TOString
    }         

    
    
    
    
    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.UnAlumno);
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
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AlumnoEnTrabajo other = (AlumnoEnTrabajo) obj;
        if (!Objects.equals(this.UnAlumno, other.UnAlumno)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
}
