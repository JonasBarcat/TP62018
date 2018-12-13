/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp4;


import java.time.LocalDate;

/**
 *
 * @author Gianpaolo
 */
public class Seminario {
    private LocalDate fechaExposicion;
    private String observaciones;
    private NotaAprobacion aprobacion;

    public LocalDate getFechaExposicion() {
        return fechaExposicion;
    }

    public void setFechaExposicion(LocalDate fechaExposicion) {
        this.fechaExposicion = fechaExposicion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public NotaAprobacion getAprobacion() {
        return aprobacion;
    }

    public void setAprobacion(NotaAprobacion aprobacion) {
        this.aprobacion = aprobacion;
    }

   
    public Seminario(LocalDate fechaExposicion, NotaAprobacion aprobacion) //Sobrecargando al metodo con el this()
    {
        this.fechaExposicion = fechaExposicion;
        this.aprobacion = aprobacion;
    }
    
    public Seminario(LocalDate fechaExposicion, NotaAprobacion aprobacion,String observaciones) 
    {
        this(fechaExposicion,aprobacion); 
        this.observaciones = observaciones;
        
    }
    
   
    
    
    
   
    @Override
    public String toString() {
        return "la fecha de exposicion es: "+this.fechaExposicion+" y las observaciones son: "+this.observaciones+"Aprobado/Desaprobado:"+this.aprobacion;
              
    }
    
    
    public void mostrar (){
        if(this.observaciones!=null){
    System.out.println("la fecha de exposicion es: "+this.fechaExposicion+" y las observaciones son: "+this.observaciones+"Aprobado/Desaprobado: "+this.aprobacion);
        }
        else{System.out.println("la fecha de exposicion es: "+this.fechaExposicion+" Aprobado/Desaprobado: "+this.aprobacion);}
        



}
    
    
    
    
    
    
}