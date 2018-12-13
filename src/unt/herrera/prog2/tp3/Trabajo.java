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
public class Trabajo {
 
private String titulo;
private int duracion;
private LocalDate fechaPresentacion;
private LocalDate fechaAprobacion;
private LocalDate fechaExposicion;
private ArrayList <Area> Areas =new ArrayList <>();
private ArrayList <Seminario> Seminarios = new ArrayList <>();
private ArrayList <AlumnoEnTrabajo>AlumnosTrabajando  = new ArrayList <>();
private ArrayList <RolEnTrabajo>RolesEnTrabajo  = new ArrayList <>();

    
    
  
    
    
    
    
    
    
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public LocalDate getFechaPresentacion() {
        return fechaPresentacion;
    }

    public void setFechaPresentacion(LocalDate fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }

    public LocalDate getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(LocalDate fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public LocalDate getFechaExposicion() {
        return fechaExposicion;
    }

    public void setFechaExposicion(LocalDate fechaExposicion) {
        this.fechaExposicion = fechaExposicion;
    }

    public ArrayList <Area> getAreas() {
        return Areas;
    }

    public void setAreas(ArrayList <Area> Areas) {
        this.Areas = Areas;
    }

    public ArrayList <Seminario> getSeminarios() {
        return Seminarios;
    }

    public void setSeminarios(ArrayList <Seminario> Seminarios) {
        this.Seminarios = Seminarios;
    }

    public ArrayList <AlumnoEnTrabajo> getAlumnosTrabajando() {
        return AlumnosTrabajando;
    }

    public void setAlumnosTrabajando(ArrayList <AlumnoEnTrabajo> AlumnosTrabajando) {
        this.AlumnosTrabajando = AlumnosTrabajando;
    }

    public ArrayList <RolEnTrabajo> getRolesEnTrabajo() {
        return RolesEnTrabajo;
    }

    public void setRolesEnTrabajo(ArrayList <RolEnTrabajo> RolesEnTrabajo) {
        this.RolesEnTrabajo = RolesEnTrabajo;
    }
        
    

    public Trabajo(String titulo, int duracion, LocalDate fechaPresentacion, LocalDate fechaAprobacion, LocalDate fechaExposicion,ArrayList <Area>Areas,ArrayList<AlumnoEnTrabajo> AlumnosTrabajando,ArrayList <Seminario> Seminarios,ArrayList<RolEnTrabajo> RolesEnTrabajo) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.fechaPresentacion = fechaPresentacion;
        this.fechaAprobacion = fechaAprobacion;
        this.fechaExposicion = fechaExposicion;
        this.Areas=Areas;
        this.AlumnosTrabajando=AlumnosTrabajando;
        this.Seminarios=Seminarios;
        this.RolesEnTrabajo=RolesEnTrabajo;
        
    }
    
     public Trabajo(String titulo, int duracion, LocalDate fechaPresentacion, LocalDate fechaAprobacion, LocalDate fechaExposicion,ArrayList <Area>Areas,ArrayList<AlumnoEnTrabajo> AlumnosTrabajando) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.fechaPresentacion = fechaPresentacion;
        this.fechaAprobacion = fechaAprobacion;
        this.fechaExposicion = fechaExposicion;
        this.Areas=Areas;
        this.AlumnosTrabajando=AlumnosTrabajando;
        
        
    }
    
    
    
    
    
    
    @Override
    public String toString() {
        return "El titulo es:"+this.titulo+" la duracion es: "+this.duracion+" la fecha de presentacion es :"+this.fechaPresentacion+" la fecha de aprobacion es: "+this.fechaAprobacion+" la fecha de exposicion es: "+this.fechaExposicion; //El ToString no muestra AlumnoEnTrabajo porque no puede, para poder deberia tener To String en sus otras clases)
    }
    
    public void mostrar(){
    
    System.out.println("El titulo es: "+this.titulo+" la duracion es: "+this.duracion+" la fecha de presentacion es :"+this.fechaPresentacion+" la fecha de aprobacion es: "+this.fechaAprobacion+" la fecha de exposicion es: "+this.fechaExposicion);
    
    
    for(Area a:Areas){
    System.out.println(a);}
    
    for(AlumnoEnTrabajo b:AlumnosTrabajando){
        b.mostrar();}
    
    for(Seminario s:Seminarios){
    s.mostrar();                        
    }
    
    for(RolEnTrabajo r:RolesEnTrabajo){
    r.mostrar();
    }
    
    
    
    
}

    public void AgregarleUnProfesorEnUnRolEnTrabajo (Profesor ProfesorEjemplar){
    
    RolEnTrabajo Supervisor= new RolEnTrabajo(this.fechaPresentacion,this.fechaExposicion," enfermedad ",Rol.JURADO,ProfesorEjemplar);
    this.RolesEnTrabajo.add(Supervisor);
    }

    public void AgregarUnSeminarioAUnTrabajo(Seminario SeminarioEjemplar){
        
    this.Seminarios.add(SeminarioEjemplar);
    
    
    }
    
//    public void AgregarUnAlumnoAAlumnoEnTrabajo(LocalDate fechaDesde,Alumno AlumnoUNO){
//    
//    AlumnoEnTrabajo NUEVOALUMNOTRABAJANDO=new AlumnoEnTrabajo(fechaDesde,this.fechaAprobacion,"no tiene ganas de trabajar",AlumnoUNO);
//   this.AlumnosTrabajando.add(NUEVOALUMNOTRABAJANDO);}
//        
        
        
    
        
}
