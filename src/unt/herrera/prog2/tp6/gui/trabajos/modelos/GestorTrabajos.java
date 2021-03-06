/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author jonas
 */
public class GestorTrabajos implements IGestorTrabajos {
    List<Trabajo> listaTrabajos = new ArrayList<>(); // aqui se almacenaran los trabajos creados 
    
    
    // siempre para crear un solo gestor
    private static GestorTrabajos gestor;
    
    private GestorTrabajos(){}
    
    public static GestorTrabajos crear(){
        if(gestor==null){
            gestor = new GestorTrabajos();
        }
        return gestor;
    }
    
    
    
        
    //METODO QUE CREA LOS TRABAJOS SIEMPRE QUE SE CUMPLAN LAS CONDICIONES IMPLEMENTADAS
    @Override
    public String nuevoTrabajo(String titulo,int duracion,LocalDate fechaPresentacion, LocalDate fechaAprobacion,List<Area> areas,List<RolEnTrabajo> profesores, List<AlumnoEnTrabajo> aet){
    
        
    String mensaje; //utilizo para almacenar y returnar un mensaje si se creo o no el trabajo
    RolEnTrabajo aux=null;
    
//    // metodo para no crear trabajo si el alumno ya esta en otro trabajo
//        for(int m=0; m<aet.size();m++ ){
//            for(Trabajo i: listaTrabajos){
//                for(int n=0; n<i.getAlumnosTrabajando().size(); n++){
//                 
//                    if(aet.get(m).equals(i.getAlumnosTrabajando().get(n))){ // si hay alumnos iguales
//                        mensaje="No se pudo crear el trabajo. Hay un alumno que ya se encuentra en uno";
//                        return mensaje;
//                    }
//                           
//                 }
//            }
//        }
   
    // se agregara un filtro que no permite crear un trabajo si hay un alumno de otro trabajo existente
    
        for(Trabajo i: listaTrabajos){
            
            
        }
       
     
        if(titulo.isEmpty() || titulo==null || duracion<=0){ // colocaremos condiciones if por separado para identifica con un mensaje donde salte el primer error
            mensaje="No se pudo crear el trabajo. El titulo/duracion erronea";
            return mensaje;
        }
//     
        
        if(fechaPresentacion==null){ // no deja colocar fechas nulas y envia 
            mensaje="Error. Debe ingresar una fecha de presentacion";
            return mensaje;
        }        
        
        
        if( fechaAprobacion!=null && fechaPresentacion.compareTo(fechaAprobacion)==1){// fecha de aprobacion si o si mayor que la de presentacion
            mensaje="Error. Orden incorrecto de fechas";
            return mensaje;
        }
//        
        // deben primero deben existir profesores que supervisen el trabajo
        if(profesores.isEmpty()){
            mensaje="Error. No existen profesores que supervisen el trabajo";
            return mensaje;
        }
//        
//        
        // tambien veamos que no debe de haber peronas repetidas en el list
        for(RolEnTrabajo i: profesores){
            for(int m=profesores.indexOf(i)+1; m<profesores.size(); m++){
                if(i.equals(profesores.get(m))){
                    mensaje="Error. Existe un profesor con dos roles/roles repetidos";
                    return mensaje;
                }
            }
        }
//     
//     
        // una vez que no existan personas repetidas pedimos que exista 1 tutor
        int bandera=0;
        for(RolEnTrabajo i:profesores){
            if(i.getUnRol()==Rol.TUTOR){
            bandera=bandera+1;
            }
        }
        if(bandera!=1){
        mensaje="Error.Debe haber 1 tutor ";
        return mensaje;
        }
//        
//        
        // si el trabajo tiene fecha de aprobacion entonces debe de tener 3 jurados
        int bandera2=0;
        for(RolEnTrabajo i:profesores){
            if(i.getUnRol()==Rol.JURADO){
                bandera2=bandera2+1;
            }
        }
        if(fechaAprobacion!=null && bandera2!=3){
         mensaje="Error. Hay fecha de aprobacion pero no hay 3 jurados";
         return mensaje;
        }
        
//        
//        
//        
        // revision de que el list areas no este vacio
        if(areas.isEmpty()){
        mensaje="Error. El trabajo debe poseer areas";
        return mensaje;
        }
//        
//        
        // que haya por lo menos un alumno y si hay mas entonces no repetidos
        if(aet.isEmpty()){
            mensaje="Error. El trabajo debe poseer al menos 1 alumno";
            return mensaje;
        }
//        

        // veamos que no hayan alumnos repetidos
        
       List<AlumnoEnTrabajo> listadealumnosaux= new ArrayList<>();
       for(AlumnoEnTrabajo i: aet){
            if(!listadealumnosaux.contains(i)){
               listadealumnosaux.add(i);
            }else{
                mensaje="Error. Alumno/s repetido/s";
                return mensaje;
            }                
        }
       
      
        
        for(Trabajo i: listaTrabajos){
               if(titulo.equals(i.getTitulo())){
                   mensaje="Error. Ya se encuentra un trabajo con el mismo titulo";
                   return mensaje;
               }
        }
        
//     si se superan todos los controles entonces retornara el siguiente mensaje  
    
    Trabajo trabajo=new Trabajo(titulo, duracion, fechaPresentacion, fechaAprobacion, areas, profesores, aet);
    listaTrabajos.add(trabajo);
    mensaje="Trabajo creado exitosamente";    
        
    return mensaje;
    
    
    
    }

    
    
    
    
    
    
    
    
    
    // muestro los trabajos en el list
    @Override
    public void mostrarTrabajos(){
            System.out.println("Listado de Trabajos:\n");
            for(Trabajo i:listaTrabajos){
                i.mostrar();
            }
    }
    
    // nos muestra un trabajo segun el nombre enviado, si encuentra el mismo entonces lo muestra
    @Override
    public Trabajo dameTrabajo(String titulo){
    
        for(Trabajo i: listaTrabajos){
            if(i.getTitulo().equalsIgnoreCase(titulo)){
                return i;
            }
        }
    return null;    
    }
    
    
    // crear una lista con los resultados aproximados
    @Override
    public List<Trabajo> buscarTrabajos(String titulo){
    List<Trabajo> resultados = new ArrayList<>();// aqui se guardan los resultados de la busqueda
    int b=0;      
        for(Trabajo i: listaTrabajos){
            if(i.getTitulo().contains(titulo)){ // si el titulo coincide con el titulo enviado a comparar
                resultados.add(i); // entonces lo agrega al list de resultados
            b=1;
            }
        }     
       if(b==0){System.out.println("No se encontraron resultados de la busqueda");}
    return resultados;
    }

    @Override
    public void ordenarTrabajos() {
     Comparator<Trabajo> ComparadorTrabajos=(Trabajo1, Trabajo2)->{
         
         if(Trabajo1.getFechaPresentacion().compareTo(Trabajo2.getFechaPresentacion())==0){
             
             return Trabajo1.getTitulo().compareToIgnoreCase(Trabajo2.getTitulo());
             
         }
         
         
         return Trabajo2.getFechaPresentacion().compareTo(Trabajo1.getFechaPresentacion());
     };
      this.listaTrabajos.sort(ComparadorTrabajos);
    }
    public String finalizarAlumno(Trabajo trabajo, Alumno alumno, LocalDate fechaHasta,
String razon){
        for(AlumnoEnTrabajo e: listaTrabajos.get(listaTrabajos.indexOf(trabajo)).getAlumnosTrabajando()){if(e.getAlumno1().equals(alumno)){
            e.setFechaHasta(fechaHasta);
            
            return "La fecha de finalizacion del alumno en el trabajo es:"+fechaHasta;}}
        
    return "No se finalizo a ningun alumno";    
   }
    
    String finalizartrabajo;
   @Override
   public String finalizarTrabajo(Trabajo trabajo, LocalDate fechaExposicion){
       
        if(fechaExposicion.isBefore(trabajo.getFechaAprobacion())){
            finalizartrabajo="Error. Fecha de aprobacion invalida";
            System.out.println(finalizartrabajo);
            return finalizartrabajo;
        }
        
            trabajo.setFechaExposicion(fechaExposicion); // elimina los prof y alum del trabajo 
            trabajo.getAlumnosTrabajando().clear();  // tambien fija la fecha de exposicion final
            trabajo.getRolesEnTrabajo().clear(); 
        
       finalizartrabajo="Trabajo finalizado exitosamente";
       return finalizartrabajo;
   } 
   
   
   
   
   
  String borrartrabajo;
   @Override
   public String borrarTrabajo(Trabajo trabajo){
       
        for(Trabajo i: listaTrabajos){
            if(trabajo.equals(i) && trabajo.getSeminarios().isEmpty()){// es decir el trabajo no tiene asociado ningun seminario
                listaTrabajos.remove(i);// entonces remueve el trabajo que se paso por el parametro
                borrartrabajo="Trabajo borrado exitosamente";
                return borrartrabajo;
                                                                      }
                                        } 
        borrartrabajo="Error. No se puede eliminar un trabajo que tenga asociado un seminario";
        return borrartrabajo;      
                                                } 

    @Override
    public String reemplazarProfesor(Trabajo trabajo, Profesor profesorReemplazado, LocalDate fechaHasta, String razon, Profesor nuevoProfesor) {
        
       for(RolEnTrabajo a: listaTrabajos.get(listaTrabajos.indexOf(trabajo)).getRolesEnTrabajo() )
       {
           
           if(a.getUnProfesor().equals(profesorReemplazado)){
       a.setFechaHasta(fechaHasta);
       a.setRazon(razon);
       RolEnTrabajo nuevoRol= new RolEnTrabajo(fechaHasta,nuevoProfesor,a.getUnRol());
       if(listaTrabajos.get(listaTrabajos.indexOf(trabajo)).getRolesEnTrabajo()     .contains(nuevoRol)){
       return "No se reemplaza";}
       
       listaTrabajos.get(listaTrabajos.indexOf(trabajo)).getRolesEnTrabajo().add(nuevoRol);
       listaTrabajos.get(listaTrabajos.indexOf(trabajo)).getRolesEnTrabajo().remove(a);
       return "Se reemplazo correctamente";
       }
       } 
        
        
        
        
        
        return null;
    }
    
       
    
    
    
    @Override
    public String nuevoTrabajo(String titulo, ArrayList<Area> area, int duracion, LocalDate fechaPresentacion, LocalDate fechaAprobacion, ArrayList<AlumnoEnTrabajo> listaAlumnoEnT, ArrayList<RolEnTrabajo> listaRolEnT) {
       String Comprobacion;
        Comprobacion=this.nuevoTrabajo(titulo, duracion, fechaPresentacion, fechaAprobacion, area, listaRolEnT, listaAlumnoEnT);
        if(!Comprobacion.equals("Trabajo creado exitosamente")){
        return "No se creo el trabajo.";}
        for(Trabajo t: listaTrabajos){
       if(t.getAlumnosTrabajando().contains(listaAlumnoEnT)){ 
           return "No se puede crear el trabajo porque el o los alummnos estan en otro trabajo";}
       }
       
      return "Se creo el trabajo correctamente";
    }  

        }
