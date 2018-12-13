    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp4;


import java.time.LocalDate;
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
    System.out.println("La fecha en la que se inicio el trabajo es: "+this.fechaDesde);
    if(this.fechaHasta!=null){
    System.out.println("La fecha hasta la que se trabajo es: "+this.fechaHasta);}
    else System.out.println("La fecha hasta la que se trabajo es: -");
    if(this.razon!=null){System.out.println("La razon es: "+this.razon);}
    else System.out.println("La razon es: -");
    
    
//  System.out.println(alumno1); //Usando el TOString

    UnAlumno.mostrar();}          // Usando el metodo mostrar

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
