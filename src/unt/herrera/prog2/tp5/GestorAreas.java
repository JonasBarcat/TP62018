/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp5;

import java.util.ArrayList;

/**
 *
 * @author jonas
 */
public class GestorAreas implements IGestorAreas{
    
    private ArrayList<Area>listaAreas = new ArrayList<>();
    
    
    
    // siempre para crear un solo gestor
    private static GestorAreas gestor;
    
    private GestorAreas(){}
    
    public static GestorAreas crear(){
        if(gestor==null){
            gestor = new GestorAreas();
        }
        return gestor;
    }
    
    
    
    @Override //OK
    public String nuevaArea(String nombre){  // AGREGA UN AREA NUEVA ENVIADA DESDE EL MAIN
             
     Area area= new Area(nombre);  // crea el area con el nombre enviado desde el main
     String mensaje;  
     
     
            if(listaAreas.contains(area) || area.getNombre()==null || area.getNombre().isEmpty()){ // agrega el area a la lista siempre y cuando no se encuentre contenida y nombre no null
               // System.out.println("No se agregó el area "+area.getNombre()+" pues no tiene nombre o ya se encuntra en la lista");
                mensaje="No se agregó el area :" +area.getNombre()+", pues no tiene nombre o ya se encuntra en la lista"; 
                return mensaje;
             }
             else {
                         this.listaAreas.add(area);
                       //  System.out.println("El area "+area.getNombre()+" se agregó correctamente");
                         mensaje="El area :"+area.getNombre()+", se agregó correctamente";
                        return mensaje;
                }       
    }
     
    
        
    
    @Override //OK
    public void mostrarAreas(){  // MUESTRAS LAS AREAS REGISTRADAS EN EL LISTADO
       System.out.println(" Las areas registradas son: ");
        for(Area i: listaAreas){
            System.out.println(i);
        }
    }
    
    
    
    
    @Override  // OK 
    public Area dameArea(String nombre){ //  ME MUESTRA LAS AREAS QUE YO SOLICITO
        Area aux = null;
        int bandera=0;
        
                for(Area i: listaAreas){
                        if(i.getNombre().equalsIgnoreCase(nombre)){
                     bandera=1;  // la bandera nunca sera 1 si no coincide el nombre con al menos un elemento del array
                     aux = i;
                        break; //solo sirve para que termine el bucle cuando encontro el area buscada
                        }
                }
         
        if(listaAreas.isEmpty() || bandera==0){ // USO EQUALS PORQUE TIENE QUE SER SI O SI IGUAL A LO REQUERIDO
                return null;  
        }else {
            return listaAreas.get(listaAreas.indexOf(aux));}
                     // devuelve el elemento de la lista ubicado en la posicion que se encuentra entre parentesis   
    }    
    
   
    
    
    
    
    @Override //OK
    public ArrayList<Area> buscarAreas(String nombre){ // BUSCA LAS AREAS QUE CONTENGAN LAS PALABRAS INTRODUCIDAS
        ArrayList<Area> resultados = new ArrayList();
        int bandera=0;
        
            for(Area i: listaAreas){
                        if(i.getNombre().contains(nombre)){
                            bandera=1;
                        resultados.add(i);    
                        }
            }
        
            if(nombre==null){ // para cuando se envia un nombre null
                System.out.println("Se ha ingresado un nombre nulo");
                for(Area i: listaAreas){
                    System.out.println(i);
                }
            }
            
            if(listaAreas.isEmpty() || bandera==0){// si es que la lista se encuentra vacia
                System.out.println("La lista se encuentra vacia o no se encontraron coincidencias");
                return resultados;
            }
     return resultados;   
    }
     
    

    
}


