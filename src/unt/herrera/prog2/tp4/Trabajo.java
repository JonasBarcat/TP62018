/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp4;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

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
        
    

//    public Trabajo(String titulo, int duracion, LocalDate fechaPresentacion, LocalDate fechaAprobacion, LocalDate fechaExposicion,ArrayList <Area>Areas,ArrayList<AlumnoEnTrabajo> AlumnosTrabajando,ArrayList <Seminario> Seminarios,ArrayList<RolEnTrabajo> RolesEnTrabajo) {
//        this.titulo = titulo;
//        this.duracion = duracion;
//        this.fechaPresentacion = fechaPresentacion;
//        this.fechaAprobacion = fechaAprobacion;
//        this.fechaExposicion = fechaExposicion;
//        this.Areas=Areas;
//        this.AlumnosTrabajando=AlumnosTrabajando;
//        this.Seminarios=Seminarios;
//        this.RolesEnTrabajo=RolesEnTrabajo;
//        
//    }
    
     public Trabajo(String titulo,ArrayList <Area>Areas, int duracion, LocalDate fechaAprobacion,ArrayList<AlumnoEnTrabajo> AlumnosTrabajando,ArrayList<RolEnTrabajo> RolesEnTrabajo) {
        this.titulo = titulo;
        this.Areas=Areas;
        this.duracion = duracion;
        this.fechaAprobacion = fechaAprobacion;
        this.AlumnosTrabajando=AlumnosTrabajando;
        this.RolesEnTrabajo=RolesEnTrabajo;
        
        
    }
    
    
    
    
    
    
    @Override
    public String toString() {
        return "El titulo es:"+this.titulo+" la duracion es: "+this.duracion+" la fecha de presentacion es :"+this.fechaPresentacion+" la fecha de aprobacion es: "+this.fechaAprobacion+" la fecha de exposicion es: "+this.fechaExposicion; //El ToString no muestra AlumnoEnTrabajo porque no puede, para poder deberia tener To String en sus otras clases)
    }
    
    public void mostrar(){
    
    //System.out.println("El titulo es: "+this.titulo+" la duracion es: "+this.duracion+" la fecha de presentacion es :"+this.fechaPresentacion+" la fecha de aprobacion es: "+this.fechaAprobacion+" la fecha de exposicion es: "+this.fechaExposicion);
    System.out.println("Trabajo:"+this.titulo);
    System.out.println("Duracion: "+this.duracion);
    if(this.fechaPresentacion!=null){
    System.out.println("Fecha Presentacion en la CA: "+this.fechaPresentacion);}
    else System.out.println("Fecha Presentacion en la CA: -");
    System.out.println("Fecha Aprobacion: "+this.fechaAprobacion);
    if(this.fechaExposicion!=null){
    System.out.println("Fecha Exposicion: "+this.fechaExposicion);}
    else System.out.println("Fecha Exposicion: -");

    for(AlumnoEnTrabajo b:AlumnosTrabajando){
        b.mostrar();
    System.out.print("\n");}
    System.out.println("\nTutor\n----------------");
    for(RolEnTrabajo r:RolesEnTrabajo){
    if(r.getUnRol()==Rol.TUTOR){
    r.toString();
    }   
    }
    System.out.println("\nCotutor\n----------------");
    for(RolEnTrabajo r:RolesEnTrabajo){
     if(r.getUnRol()==Rol.COTUTOR){
    r.toString();
    }
    }
    System.out.println("\nJurado\n----------------");
    for(RolEnTrabajo r:RolesEnTrabajo){
    if(r.getUnRol()==Rol.JURADO){
     r.toString();   
    }}
    
    
    
    
//    for(Area a:Areas){
//    System.out.println(a);}
//    
//    
//    
//    for(Seminario s:Seminarios){
//    s.mostrar();                        
//    }
    
    
    
    
    
    
}

    public String agregarProfesor (RolEnTrabajo NuevoROL){
   if(!RolesEnTrabajo.contains(NuevoROL))
   {
   RolesEnTrabajo.add(NuevoROL);
   return "Se guardo con exito; ";
   }
   else    
   return "No se guardo";
   }

    public void agregarSeminario(Seminario SeminarioEjemplar){
    if(!Seminarios.contains(SeminarioEjemplar)){
    Seminarios.add(SeminarioEjemplar);
    }      
    }
    
    
    
    
    
//    public void AgregarUnAlumnoAAlumnoEnTrabajo(LocalDate fechaDesde,Alumno AlumnoUNO){
//    
//    AlumnoEnTrabajo NUEVOALUMNOTRABAJANDO=new AlumnoEnTrabajo(fechaDesde,this.fechaAprobacion,"no tiene ganas de trabajar",AlumnoUNO);
//   this.AlumnosTrabajando.add(NUEVOALUMNOTRABAJANDO);}
//        

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.titulo);
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
        final Trabajo other = (Trabajo) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }
        
        
    
        
}
