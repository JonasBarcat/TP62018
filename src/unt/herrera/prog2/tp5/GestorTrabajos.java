/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp5;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author jonas
 */
public class GestorTrabajos implements IGestorTrabajos {
    ArrayList<Trabajo> listaTrabajos = new ArrayList<>(); // aqui se almacenaran los trabajos creados 
    
    
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
    public String nuevoTrabajo(String titulo,int duracion,LocalDate fechaPresentacion, LocalDate fechaAprobacion,ArrayList<Area> areas,ArrayList<RolEnTrabajo> profesores, ArrayList<AlumnoEnTrabajo> aet){
    
        
    String mensaje; //utilizo para almacenar y returnar un mensaje si se creo o no el trabajo
    RolEnTrabajo aux=null;
    
   
    
       
     
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
        // tambien veamos que no debe de haber peronas repetidas en el array
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
        // revision de que el array areas no este vacio
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
        
       ArrayList<AlumnoEnTrabajo> listadealumnosaux= new ArrayList<>();
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
    
    
    
    
    
    
    
    
    
    
    // muestro los trabajos en el array
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
    public ArrayList<Trabajo> buscarTrabajos(String titulo){
    ArrayList<Trabajo> resultados = new ArrayList<>();// aqui se guardan los resultados de la busqueda
    int b=0;      
        for(Trabajo i: listaTrabajos){
            if(i.getTitulo().contains(titulo)){ // si el titulo coincide con el titulo enviado a comparar
                resultados.add(i); // entonces lo agrega al array de resultados
            b=1;
            }
        }     
       if(b==0){System.out.println("No se encontraron resultados de la busqueda");}
    return resultados;
    }

    
    
        
}
