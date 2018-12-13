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
public class GestorPersonas implements IGestorPersonas{
    
    ArrayList<Persona> listaPersona= new ArrayList<>();
   
    
    // siempre para crear un solo gestor
    private static GestorPersonas gestor;
    
    private GestorPersonas(){}
    
    public static GestorPersonas crear(){
        if(gestor==null){
            gestor = new GestorPersonas();
        }
        return gestor;
    }
    
    
    @Override //OK 
//METODO PARA CREACION Y CARGA DE UN NUEVO PROFESOR--------------------
    public String nuevoProfesor(String apellidos,String nombres,int dni,Cargo cargo){
    String mensaje;   
    
        if(apellidos==null || apellidos.isEmpty()){
            mensaje="Ultimo APELLIDO ingresado incorrecto";
            return mensaje;
        } 
        if(nombres==null || nombres.isEmpty()){
            mensaje="Ultimo NOMBRE ingresado incorrecto";
            return mensaje;
        }
         if(dni<=0){
            mensaje="Ultimo DNI ingresado incorrecto";
            return mensaje;
        }
         if(cargo==null){
            mensaje="Ultimo CARGO ingresado es incorrecto";
            return mensaje;
         }
         
         
         
         
        // SI LOS DATOS HAN SIDO INGRESADOS CORRECTAMENTE ENTONCES CREO UN PROFESOR
         Persona profesor = new Profesor(apellidos, nombres, dni, cargo);  
         
         
                    if(listaPersona.isEmpty()){ // si el array esta vacio entonces agrega al profesor sin problemas
                     listaPersona.add(profesor);
                      mensaje="Se agrego el profesor: "+profesor.getApellidos()+" con exito";
                      return mensaje;
                    }else{ // cuando el array no esta vacio entonces hace control para que no se repitan los profes
         
                    int  b=0; // el bucle for me avisa si el profe esta repetido o no;
                    for(Persona i: listaPersona){
                                  if(i.equals(profesor)){
                                      b=1;
                                  } 
                        }//cierra for
                  
                    if(b==1){
                        mensaje="No se agrego el profesor: "+profesor.getApellidos()+". Ya se encuentra registrado";
                        return mensaje; // b=1 signigica que el profe esta repetido, entonces no agrega nada
                    }else {
                            listaPersona.add(profesor);
                             mensaje="Se agrego el profesor: "+profesor.getApellidos()+" con exito";
                            return mensaje;}

                    }// cierra else  
                    
                    
         } //cierra if principal
         
         
     
       
    
    
    
    
    @Override //OK
    /**
     * esto es para un nuevo alumno en un arraylist listapersonas, pide String apellido, String nombre,int dni, String cx
    */
    public String nuevoAlumno(String apellidos, String nombres, int dni,String cx){
        String mensaje;
        
         if(apellidos==null || apellidos.isEmpty()){
            mensaje="Ultimo APELLIDO ingresado incorrecto";
            return mensaje;
        } 
        if(nombres==null || nombres.isEmpty()){
            mensaje="Ultimo NOMBRE ingresado incorrecto";
            return mensaje;
        }
         if(dni<=0){
            mensaje="Ultimo DNI ingresado incorrecto";
            return mensaje;
        }
         if(cx==null || cx.contains("-") || cx.isEmpty()){
             mensaje="Ultimo CX ingresado invalido";
             return mensaje;
         }
         
          
              // SI LOS DATOS INGRESADOS ESTAN BIEN ENTONCES CREA EL ALUMNO
             Persona alumno = new Alumno(apellidos, nombres, dni, cx);
             int c=0;//sirve como bandera   
                    for(Persona i: listaPersona){
                        if(i.equals(alumno)){  
                           c=1;// c vale 1 cuando encuentra una persona identica a la ingresada
                        }
                    }// cierra for
           if(c==0){// si ya se encuentra una persona con los mismos datos entonces no la agrega al array
               listaPersona.add(alumno);
               mensaje="EL alumno: "+alumno.getApellidos()+". Ha sido cargado con exito";
               return mensaje;
           }else{
               mensaje="No se agregó el alumno: "+alumno.getApellidos()+". Ya se encuentra en la lista";
               return mensaje;
           }
    
    }   
    
    
    @Override //OK
    // BUSCA LOS PROFESORES INGRESADOS AL FILTRO
    public ArrayList<Profesor> buscarProfesores(String apellido){
    ArrayList<Profesor> resultadoProfesores  = new ArrayList<>(); // aqui se guardan los resultados de las busquedas
    
        if(apellido!=null){
            for(Persona i: listaPersona){
                   if(i instanceof Profesor && i.getApellidos().contains(apellido)){ // filtro para que busque: 1° QUE SEA PROFESOR y 2° QUE TENGA EL APELLIDO DEL FILTRO
                        resultadoProfesores.add((Profesor) i); // con un operador CAST puedo agregar una persona a un array de profesores
                     }                                          // pues CAST convierte los tipos de datos                    
            }
        }else{System.out.println("Apellido ingresado incorrecto/null");}
    
    
    System.out.println("Resultados de la busqueda para:  "+apellido);
    return resultadoProfesores;
    }
      
    
 
    
    
    @Override // ENVIA UN PROFESOR SEGUN DNI QUE INGRESEMOS
    public Profesor dameProfesor(int documento){
    Profesor aux = null; // objeto de tipo profesor el cual copiara y mostrara en caso de que coincida la busqueda     
    int x=0;
    if(documento>0){
           
            for(Persona i:listaPersona){
                if(i instanceof Profesor && i.getDni()==documento){ // no es necesario hacer instanceof pues el dni es unico(alumnos y profesores tienen dni diferentes)
                         aux=(Profesor)i; //utilizo CASE paso de persona a profesor
                         x=1;
                   }// si coincide entonces x=1 entonces anota que hay un profesor con ese dni
                
            }  
    }else  System.out.println("Documento ingresado Incorrecto");
      
        if(x==0){
            System.out.println("N° DNI ingresado en esta linea no encontrado");
        }
       
    return aux;
    }
    
    
    
    
    @Override // MUESTRA LOS ALUMNOS QUE TIENEN COINCIDENCIA DE APELLIDO CON EL FILTRO
    public ArrayList<Alumno> buscarAlumnos(String apellido){
     ArrayList<Alumno> resultadoAlumnos  = new ArrayList<>(); // aqui se guardan los resultados de las busquedas
    
        if(apellido!=null || !apellido.isEmpty()){
            for(Persona i: listaPersona){
                   if(i instanceof Alumno && i.getApellidos().contains(apellido)){ // filtro para que busque: 1° QUE SEA Alumno y 2° QUE TENGA EL APELLIDO DEL FILTRO
                        resultadoAlumnos.add((Alumno) i); // con un operador CAST puedo agregar una persona a un array de alumnos
                     }                                          // pues CAST convierte los tipos de datos                    
            }
        }else{System.out.println("Apellido ingresado incorrecto/null");}
    
    
    System.out.println("Resultados de la busqueda para: "+apellido);
    return resultadoAlumnos;
    }
        
    
    

    
    @Override
    public Alumno dameAlumno(String cx){
    Alumno aux ; // utilizo para pasar el objeto i (persona) a aux(Alumno)
    Alumno aux2=null; //luego si el objeto aux(de tipo alumno) contiene un cx requerido lo copia a aux2 y muestra aux2
        if(cx!=null && !cx.isEmpty()){
            for(Persona i:listaPersona){
                if(i instanceof Alumno){ // primero pregunta si i es una instancia de alumno, si es asi entonces a ese alumno lo manda al objeto auxiliar (aux), luego trabajo el resto con aux
                    aux=(Alumno)i;
                    if(aux.getCx().equals(cx)){
                        aux2=aux;
                    }
                }
            }
         }else System.out.println("CX ingresado en esta linea incorrecto");
        
        
    return aux2;
    }

    
    

    @Override
    public void mostrarPersonas(){  //  muestra las personas
        for(Persona i:listaPersona){
            i.mostrar();
        }
    }
    
    
    @Override
    public void mostrarProfesores(){ // muestra solamente los profesores
        for(Persona i: listaPersona){
            if(i instanceof Profesor){
                i.mostrar();
            }
        }
    }
    
    
    @Override
    public void mostrarAlumnos(){  // muestra solamente los alumnos
        for(Persona i: listaPersona){
            if(i instanceof Alumno){
                i.mostrar();
            }
        }
    }
    
    
    
}   
    