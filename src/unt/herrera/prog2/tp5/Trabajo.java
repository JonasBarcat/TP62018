/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp5;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author 
 */
public class Trabajo {
 
private String titulo;
private int duracion;
private LocalDate fechaPresentacion;
private LocalDate fechaAprobacion;
private LocalDate fechaExposicion;
private List <Area> Areas =new ArrayList<>();
private List <Seminario> Seminarios = new ArrayList <>();
private List <AlumnoEnTrabajo>aet  = new ArrayList <>();
private List <RolEnTrabajo>RolesEnTrabajo  = new ArrayList <>();

    
    
  
    
    
    
    
    
    
    
    

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

    public List <Area> getAreas() {
        return Areas;
    }

    public void setAreas(List <Area> Areas) {
        this.Areas = Areas;
    }

    public List <Seminario> getSeminarios() {
        return Seminarios;
    }

    public void setSeminarios(List <Seminario> Seminarios) {
        this.Seminarios = Seminarios;
    }

    public List <AlumnoEnTrabajo> getAlumnosTrabajando() {
        return aet;
    }

    public void setAlumnosTrabajando(List <AlumnoEnTrabajo> AlumnosTrabajando) {
        this.aet = AlumnosTrabajando;
    }

    public List <RolEnTrabajo> getRolesEnTrabajo() {
        return RolesEnTrabajo;
    }

    public void setRolesEnTrabajo(List <RolEnTrabajo> RolesEnTrabajo) {
        this.RolesEnTrabajo = RolesEnTrabajo;
    }
        
    
    
    
    
    

    public Trabajo(String titulo, int duracion, LocalDate fechaPresentacion, LocalDate fechaAprobacion, LocalDate fechaExposicion,List <Area>Areas,List<AlumnoEnTrabajo> AlumnosTrabajando,List <Seminario> Seminarios,List<RolEnTrabajo> RolesEnTrabajo) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.fechaPresentacion = fechaPresentacion;
        this.fechaAprobacion = fechaAprobacion;
        this.fechaExposicion = fechaExposicion;
        this.Areas=Areas;
        this.aet=AlumnosTrabajando;
        this.Seminarios=Seminarios;
        this.RolesEnTrabajo=RolesEnTrabajo;
        
    }
    
     public Trabajo(String titulo,List <Area>Areas, int duracion, LocalDate fechaAprobacion,List<AlumnoEnTrabajo> AlumnosTrabajando,List<RolEnTrabajo> RolesEnTrabajo) {
        this.titulo = titulo;
        this.Areas=Areas;
        this.duracion = duracion;
        this.fechaAprobacion = fechaAprobacion;
        this.aet=AlumnosTrabajando;
        this.RolesEnTrabajo=RolesEnTrabajo;
        
        
    }

    public Trabajo(String titulo, int duracion, LocalDate fechaPresentacion, LocalDate fechaAprobacion,List<Area> areas,List<RolEnTrabajo> profesores,List<AlumnoEnTrabajo> aet) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.fechaPresentacion = fechaPresentacion;
        this.fechaAprobacion = fechaAprobacion;
        this.Areas=areas;
        this.RolesEnTrabajo=profesores;
        this.aet=aet;

    }
     
    
     
    
    
    
    
    
    
    @Override
    public String toString() {
        return "El titulo es:"+this.titulo+" la duracion es: "+this.duracion+" la fecha de presentacion es :"+this.fechaPresentacion+" la fecha de aprobacion es: "+this.fechaAprobacion+" la fecha de exposicion es: "+this.fechaExposicion; //El ToString no muestra AlumnoEnTrabajo porque no puede, para poder deberia tener To String en sus otras clases)
    }
    
    
    
    
    /////////////////////////////////MOSTRAT ORIGINAL///////////////////////////////////////////////
    public void mostrar(){
    
    //System.out.println("El titulo es: "+this.titulo+" la duracion es: "+this.duracion+" la fecha de presentacion es :"+this.fechaPresentacion+" la fecha de aprobacion es: "+this.fechaAprobacion+" la fecha de exposicion es: "+this.fechaExposicion);
    System.out.println("Trabajo:"+this.titulo.toUpperCase());
    
    System.out.println("Duracion: "+this.duracion);
    
    
    
    if(this.fechaPresentacion!=null){
       /**
        * Codigo magico para cambiar el formato de la fecha
        */  
    Date fechaActual = java.sql.Date.valueOf(fechaPresentacion); // cambia de LocalDate a Date
    DateFormat fecha= new SimpleDateFormat("dd/MM/yyyy");  // java.util.Date nos cambia el formato de la fecha
    System.out.println("Fecha Presentacion en la CA: "+fecha.format(fechaActual));
    }else System.out.println("Fecha Presentacion en la CA: -");

    if(this.fechaAprobacion!=null){
    Date fechaActual = java.sql.Date.valueOf(fechaAprobacion); // cambia de LocalDate a Date
    DateFormat fecha= new SimpleDateFormat("dd/MM/yyyy");  // java.util.Date nos cambia el formato de la fecha
    System.out.println("Fecha de Aprobacion: "+fecha.format(fechaActual));
    }else System.out.println("Fecha de Aprobacion : -");
    
    if(this.fechaExposicion!=null){
     Date fechaActual = java.sql.Date.valueOf(fechaExposicion); // cambia de LocalDate a Date
    DateFormat fecha= new SimpleDateFormat("dd/MM/yyyy");  // java.util.Date nos cambia el formato de la fecha
    System.out.println("Fecha Exposicion en la CA: "+fecha.format(fechaActual));}
    else System.out.println("Fecha Exposicion: - \n");

    for(AlumnoEnTrabajo b:aet){
        b.mostrar();
    System.out.print("\n");}
    
    

    
}
    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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
    
    
    
    
    
    
    
    
    // nuevos metodos de la clase trabajo  creacion de nuevo seminario
    String mensaje1;
    public String nuevoSeminario(LocalDate fechaExposicion,NotaAprobacion notaAprobacion, String observaciones){
    
            // solicito al gestor seminario la validacion de datos
            GestorSeminario gs= GestorSeminario.crear(); // creo el gestor seminario para consultar si los datos son correctos
                mensaje1=gs.validarSeminario(fechaExposicion, notaAprobacion, observaciones);
                
       // si los datos ingresados son correctos y la fecha de exposicion ademas de no ser nula es posterior a la de aprobacion...    
                if(mensaje1.equalsIgnoreCase("exito") && fechaExposicion.isAfter(this.fechaAprobacion)){
                    
                    //creamos y luego agregaremos el seminario al array mientras este no se encuentre ya en el mismo
                        Seminario nuevoseminarios = new Seminario(fechaExposicion, notaAprobacion,observaciones);
                        if(!Seminarios.contains(nuevoseminarios)){
                            Seminarios.add(nuevoseminarios);
                            mensaje1="Nuevo seminario agregado al sistema";    
                        }else{
                            mensaje1="El seminario ingresado ya se encuntra en el sistema";
                            }
                }else mensaje1="Error. No se pudo crear el seminario";
            
                
             
                
            return mensaje1;
    }  

    
    
    
    
    ///// nuevos metodos de la clase trabajo metodo para modificar un seminario
/*    
deberá controlar que los valores de los parámetros recibidos sean correctos.  
deberá modificar los datos de un Seminario. 
deberá informar el resultado de la operación
*/
    String mensaje2;
    public String modificarSeminario(Seminario seminario,NotaAprobacion notaAprobacion, String observaciones){
              
        
// veamos que seminario,nota aprobacion y obs sean correctas 
                if(seminario.getFechaExposicion().isBefore(fechaAprobacion)){
                    mensaje2="Error. Fecha de exposicion incorrecta";
                    System.out.println("Error. Fecha de exposicion incorrecta");
                    return mensaje2;
                }
                if(notaAprobacion==notaAprobacion.APROBADO_CONOBS && observaciones==null){
                    mensaje2="Error. No se ingresaron observaciones";
                    System.out.println("Error. No se ingresaron observaciones"); 
                    return mensaje2;
                }
                if(notaAprobacion==notaAprobacion.DESAPROBADO && observaciones==null){
                    mensaje2="Error. No se ingresaron observaciones";
                    System.out.println("Error. No se ingresaron observaciones"); 
                    return mensaje2;
                }
        //si los datos ingresados estan bien entonces continua con el metodo y modifica el seminario    
                seminario.setFechaExposicion(fechaExposicion);
                seminario.setAprobacion(notaAprobacion);
                seminario.setObservaciones(observaciones);
                mensaje2="Seminario actualizado exitosamente";
        
        return mensaje2;
    }  

    
   
    /// metodo para ordenar los seminarios en forma descendente por fecha de exposicion
         public void ordenarSeminarios(){
           Comparator<Seminario> comparacionSeminario = (Seminario semi1,Seminario semi2)->{
              return semi1.getFechaExposicion().compareTo(semi2.getFechaExposicion());};
          Seminarios.sort(comparacionSeminario);
            }
            
    
    
    
    
    
    
    
    
    
    
    
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
