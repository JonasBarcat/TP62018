/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author prog2
 */
public class Principal {
    public static void main (String Args[] ) { 
        
       //***************************Areas**********************************
       
       GestorAreas ga  = GestorAreas.crear();// creacion del gestor
       String mensaje;
       
       // USO DE METODOS
      //creacion de areas
        mensaje=ga.nuevaArea("Arsware");
        System.out.println(mensaje);
        mensaje=ga.nuevaArea("Basware");
        System.out.println(mensaje);
        mensaje=ga.nuevaArea("Hardware");
        System.out.println(mensaje);
        mensaje=ga.nuevaArea("Malware");
        System.out.println(mensaje);
        mensaje=ga.nuevaArea("Software");
        System.out.println(mensaje);
        mensaje=ga.nuevaArea("Redes");
        System.out.println(mensaje);
        mensaje=ga.nuevaArea("Inteligencia Artificial");
        System.out.println(mensaje);
        mensaje=ga.nuevaArea(null);
        System.out.println(mensaje);
        mensaje=ga.nuevaArea("");
        System.out.println(mensaje);
        mensaje=ga.nuevaArea("Software");
        System.out.println(mensaje);
       
        
        
      //metodo que muestra todas las areas 
        // modificacion: se agrga el metodo ordenar (ordena antes de mostrar)
        
      System.out.println("\n\n");
        ga.mostrarAreas();
        
        
        
      // me devuelve un area que coincida con nombre la cadena que envio en el argumento
      System.out.print("\n\n Resultado (coincidencias exactas) de la busqueda: ");  
        Area auxarea;
        auxarea=ga.dameArea("Softare");
        if(auxarea!=null){
        System.out.println("Coincidencia encontrada: "+auxarea.getNombre());
        }else System.out.println(" 0");
        
        
        
        
       // devuelve un list con las areas similares a la buscada
       System.out.print("\n\n Lista de resultados de la busqueda: \n");
        List<Area> resultadosareas;
        
        resultadosareas=ga.buscarAreas("ware");
            for(Area i: resultadosareas){
                System.out.println(i.getNombre());
            }
        
        
            
            
            
            
        //|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
        //***************************PERSONAS**********************************
        // ALUMNO Y PROFESOR
            
           GestorPersonas gp = GestorPersonas.crear(); // creacion del gestor de personas
          String mensaje1;
           
         System.out.println("\n\n Carga de profesores:");   // CARGA DE PROFESORES
         mensaje1=gp.nuevoProfesor("Diaz", "Olga", 16091180, Cargo.TITULAR); // se agrega
         System.out.println(mensaje1);
         mensaje1=gp.nuevoProfesor("Martinez", "Gil", 17091180, Cargo.TITULAR); // se agrega
         System.out.println(mensaje1);
         mensaje1=gp.nuevoProfesor("Diaz", "Olga", 16091180, Cargo.TITULAR); // no se agrega
         System.out.println(mensaje1);
         mensaje1=gp.nuevoProfesor("Barcat", "Jonas", 40237598, Cargo.ADJUNTO); // se agrega
         System.out.println(mensaje1);
         mensaje1=gp.nuevoProfesor("Barcat", "Jezabel", 39237598, Cargo.ADG); // se agrega
         System.out.println(mensaje1);
         mensaje1=gp.nuevoProfesor("Varela", "Sofia", 41152038, Cargo.JTP); // se agrega
         System.out.println(mensaje1);
         mensaje1=gp.nuevoProfesor("Barcat",null,40237598,null); // no se agrega
         System.out.println(mensaje1);
         
          System.out.println("\n\n Carga de Alumnos:");  //  CARGA DE ALUMNOS
         mensaje1=gp.nuevoAlumno("Barcat", "Jonas", 40237598, "1609234"); // no se agrega
         System.out.println(mensaje1);
         mensaje1=gp.nuevoAlumno("Toreto", "Juliana", 41234398, "1593234"); // se agrega
         System.out.println(mensaje1);
         mensaje1=gp.nuevoAlumno("Manuel", "Jose", 40534198, "1493004"); // se agrega
         System.out.println(mensaje1);
         mensaje1=gp.nuevoAlumno("Tevez", "Martin", 39534198, "1303004"); // se agrega
         System.out.println(mensaje1);
         mensaje1=gp.nuevoAlumno(null, "Jonas", 40237598, "1609234"); // no se agrega
         System.out.println(mensaje1);
         mensaje1=gp.nuevoAlumno("Ance", "Gaston", 40456598, "1619265"); // se agrega
         System.out.println(mensaje1);
//         mensaje1=gp.nuevoAlumno("Berarducci", "Gianpaolo", 40902553, "1500155"); // se agrega
//         System.out.println(mensaje1);
//         mensaje1=gp.nuevoAlumno("Bustos", "Miguel", 40302598, "1123265"); // se agrega
//         System.out.println(mensaje1);
//         mensaje1=gp.nuevoAlumno("Ruiz", "Ana", 41232598, "1123321"); // se agrega
//         System.out.println(mensaje1);
         
         
         
          System.out.println("\n\n Busqueda de profesores por similitud en apellido:");
          List<Profesor> resultadosprofesores; // FILTRO BUSQUEDA PROF POR APELLIDO (SIMILARES)
          resultadosprofesores=gp.buscarProfesores("Bar");
          if(resultadosprofesores.isEmpty()){System.out.println("No se encontraron resultados");}
               for(Profesor i: resultadosprofesores){
                System.out.println(i.getApellidos());
                }
         
               
               
           System.out.println("\n\n Busqueda de profesores por DNI:");    
            Profesor resultadoprofesor; //FILTRO BUSQUEDA PROFESOR POR NRO DOCUMENTO
            resultadoprofesor=gp.dameProfesor(16091180);
                if(resultadoprofesor!=null){
                     resultadoprofesor.mostrar();}
            resultadoprofesor=gp.dameProfesor(16);
                if(resultadoprofesor!=null){
                     resultadoprofesor.mostrar();}
            resultadoprofesor=gp.dameProfesor(39237598);
                  if(resultadoprofesor!=null){
                     resultadoprofesor.mostrar();}
         
                  
                  
                  
            System.out.println("\n\n Busqueda de alumnos por similitud en apellido:");      
             List<Alumno> resultadosalumnos; //FILTRO BUSQUEDA ALUMNO POR APELLIDO (SIMILARES)
             resultadosalumnos=gp.buscarAlumnos("Anc");
                if(resultadosalumnos.isEmpty()){System.out.println("No se encontraron resultados");}
                for(Alumno i: resultadosalumnos){
                 System.out.println(i.getApellidos());
                 }
             resultadosalumnos=gp.buscarAlumnos("Ba");
                if(resultadosalumnos.isEmpty()){System.out.println("No se encontraron resultados");}
                for(Alumno i: resultadosalumnos){
                 System.out.println(i.getApellidos());
                 }
             resultadosalumnos=gp.buscarAlumnos(" ");
                if(resultadosalumnos.isEmpty()){System.out.println("No se encontraron resultados");}
                for(Alumno i: resultadosalumnos){
                 System.out.println(i.getApellidos());
                 }
              
               
                
               System.out.println("\n\n Busqueda de un alumno por CX:");//BUSQUEDA DE ALUMNO POR CX 
               Alumno alumno;
               alumno=gp.dameAlumno("1593234");
                if(alumno!=null){
                    alumno.mostrar();
                }
               alumno=gp.dameAlumno(null);
                 if(alumno!=null){
                    alumno.mostrar();
                }
                alumno=gp.dameAlumno("");
                 if(alumno!=null){
                    alumno.mostrar();
                }
               
                 
                 
               //MOSTRAR LAS PERSONAS CARGADAS AL SISTEMA
               gp.ordenarPersonas(); // Ahora siempre ordenará las personas antes de mostrarlas por apellido y nombre 
              
               System.out.println("\n\nListado de las personas cargadas en el sistema(Profesores y Alumnos):");
               gp.mostrarPersonas();
               //MOSTRAR LOS PROFESORES
               System.out.println("\nListado de los profesores cargados en el sistema:");
               gp.mostrarProfesores();
               //MOSTRAR LOS ALUMNOS
               System.out.println("\nListado de los alumnos cargados en el sistema:");
               gp.mostrarAlumnos();
               
                
               
               
               
          //***********************GESTOR ROL EN ******************************
        
//        
   
            GestorRolEnTrabajo gret = GestorRolEnTrabajo.crear();
            RolEnTrabajo rolentrabajo;
            List<RolEnTrabajo> listarolentrabajo= new ArrayList<>();
            
            rolentrabajo=gret.nuevoRolEnTrabajo(LocalDate.of(2018,11,30),gp.dameProfesor(16091180), Rol.TUTOR);
               listarolentrabajo.add(rolentrabajo);
            rolentrabajo=gret.nuevoRolEnTrabajo(LocalDate.of(2018,11,30),gp.dameProfesor(40237598), Rol.JURADO);
                 listarolentrabajo.add(rolentrabajo);
            rolentrabajo=gret.nuevoRolEnTrabajo(LocalDate.of(2018,11,30),gp.dameProfesor(41152038), Rol.JURADO);
                 listarolentrabajo.add(rolentrabajo);
            rolentrabajo=gret.nuevoRolEnTrabajo(LocalDate.of(2018,11,30),gp.dameProfesor(17091180), Rol.JURADO);
                 listarolentrabajo.add(rolentrabajo);
            
            /////////////////////////////////////////////////////////////77
           
            
            GestorAlumnoEnTrabajo gaet =GestorAlumnoEnTrabajo.crear();
             List<AlumnoEnTrabajo>listaalumnoentrabajo=new ArrayList<>();
             AlumnoEnTrabajo alumnoentrabajo;
               
            alumnoentrabajo=gaet.nuevoAlumnoEnTrabajo(LocalDate.of(2018,12,2), gp.dameAlumno("1303004"));
                listaalumnoentrabajo.add(alumnoentrabajo);
            alumnoentrabajo=gaet.nuevoAlumnoEnTrabajo(LocalDate.of(2018,12,3), gp.dameAlumno("1593234"));
                listaalumnoentrabajo.add(alumnoentrabajo);
            alumnoentrabajo=gaet.nuevoAlumnoEnTrabajo(LocalDate.of(2018,12,5), gp.dameAlumno("1493004"));
                listaalumnoentrabajo.add(alumnoentrabajo);
            alumnoentrabajo=gaet.nuevoAlumnoEnTrabajo(LocalDate.of(2018,12,1), gp.dameAlumno("1619265"));
                listaalumnoentrabajo.add(alumnoentrabajo);
//            alumnoentrabajo=gaet.nuevoAlumnoEnTrabajo(LocalDate.of(2018,12,6), gp.dameAlumno("1500155"));
//                listaalumnoentrabajo.add(alumnoentrabajo);
//            alumnoentrabajo=gaet.nuevoAlumnoEnTrabajo(LocalDate.of(2018,12,9), gp.dameAlumno("1123265"));
//                listaalumnoentrabajo.add(alumnoentrabajo);
//            alumnoentrabajo=gaet.nuevoAlumnoEnTrabajo(LocalDate.of(2018,12,10), gp.dameAlumno("1123321"));
//                listaalumnoentrabajo.add(alumnoentrabajo);
            
            
        //|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||        
        //*****************************TRABAJOS***********************************
 
       
           GestorTrabajos gt = GestorTrabajos.crear(); 
          String mensaje2;
        
          System.out.println("\n\n"); //solo para que no salga todo amontonado
          
          // informacion para el trabajo 1
          
          List<Area> areastrabajo1 = new ArrayList<>();
          areastrabajo1.add(ga.dameArea("Software"));
          areastrabajo1.add(ga.dameArea("Hardware"));
          
   
          List<RolEnTrabajo> profesortrabajo1 = new ArrayList<>();
          profesortrabajo1.add(listarolentrabajo.get(0)); 
          profesortrabajo1.add(listarolentrabajo.get(3)); 
          profesortrabajo1.add(listarolentrabajo.get(2));
          profesortrabajo1.add(listarolentrabajo.get(1));
          
          List<AlumnoEnTrabajo> alumnoentrabajo1=new ArrayList<>();
          alumnoentrabajo1.add(listaalumnoentrabajo.get(0));
          alumnoentrabajo1.add(listaalumnoentrabajo.get(1));
          alumnoentrabajo1.add(listaalumnoentrabajo.get(2));
          alumnoentrabajo1.add(listaalumnoentrabajo.get(3));
          
          //informacion para el trabajo 2
          
//          List<Area> areastrabajo2 = new ArrayList<>();
//          areastrabajo2.add(ga.dameArea("Redes"));
//          areastrabajo2.add(ga.dameArea("Internet"));
//          
//   
//          List<RolEnTrabajo> profesortrabajo2 = new ArrayList<>();
//          profesortrabajo2.add(listarolentrabajo.get(0)); 
//          profesortrabajo2.add(listarolentrabajo.get(3)); 
//          profesortrabajo2.add(listarolentrabajo.get(2));
//          profesortrabajo2.add(listarolentrabajo.get(1));
//          
//          List<AlumnoEnTrabajo> alumnoentrabajo2=new ArrayList<>();
//          alumnoentrabajo2.add(listaalumnoentrabajo.get(4));
//          alumnoentrabajo2.add(listaalumnoentrabajo.get(5));
//          alumnoentrabajo2.add(listaalumnoentrabajo.get(6));
          


            // Cree nuevos trabajos para realizar los controles de fechas de ordenarTrabajos
            mensaje2=gt.nuevoTrabajo("Big data research", 6, LocalDate.of(2018,11,27), LocalDate.of(2018, 11, 27),areastrabajo1,profesortrabajo1,alumnoentrabajo1);
            System.out.println(mensaje2);
            mensaje2=gt.nuevoTrabajo("Global Wireless", 6, LocalDate.of(2018,11,27), LocalDate.of(2018, 11, 27),areastrabajo1,profesortrabajo1,alumnoentrabajo1);
            System.out.println(mensaje2);
            // el siguiente trabajo es un "trabajo con el mismo nombre", entonces no lo añade al list de trabajos
            mensaje2=gt.nuevoTrabajo("Big data research", 6, LocalDate.of(2018,10,26), LocalDate.of(2018, 11, 27),areastrabajo1,profesortrabajo1,alumnoentrabajo1);
            System.out.println(mensaje2);
            mensaje2=gt.nuevoTrabajo("Graduacion", 6, LocalDate.of(2018,9,25), LocalDate.of(2018, 11, 27),areastrabajo1,profesortrabajo1,alumnoentrabajo1);
            System.out.println(mensaje2);
            mensaje2=gt.nuevoTrabajo("Proyecto Final", 6, LocalDate.of(2018,8,24), LocalDate.of(2018, 11, 27),areastrabajo1,profesortrabajo1,alumnoentrabajo1);
            System.out.println(mensaje2);
            mensaje2=gt.nuevoTrabajo("Pasantia", 6, LocalDate.of(2018,7,23), LocalDate.of(2018, 11, 27),areastrabajo1,profesortrabajo1,alumnoentrabajo1);
            System.out.println(mensaje2);
            mensaje2=gt.nuevoTrabajo("Armado de Sistemas", 6, LocalDate.of(2018,11,27), LocalDate.of(2018, 11, 27),areastrabajo1,profesortrabajo1,alumnoentrabajo1);
            System.out.println(mensaje2);
            
            
//            Seminario seminarios2= new Seminario(gt.dameTrabajo("Redes").getFechaExposicion(), NotaAprobacion.DESAPROBADO, "hola");
//           List<Seminario> seminariosTrabajo2= new ArrayList<>();
//           seminariosTrabajo2.add(seminarios2);
//      
//            System.out.println(mensaje2);
            
            
            //////////////////////////////////////////////////////////////////////
             
            
            //muestra todos los trabajos cargados en el sistema
            System.out.println("\n\n\nLos trabajos registrados en el sistema son:");
            gt.ordenarTrabajos();
            gt.mostrarTrabajos();
            
            
            
            // Busqueda de trabajo por nombre exacto
            
            Trabajo busquedatrabajo;
            System.out.println("\n\n\n    Busqueda de Trabajo por nombre exacto:\n");
            busquedatrabajo=gt.dameTrabajo("Global Wireless"); //filtro especificado "Global Wireless"
            if(busquedatrabajo!=null)
            {busquedatrabajo.mostrar();}
            else {System.out.println("No se encontraron resultados");}
            
            
            
            //Busqueda de trabajo por coincidencias
            System.out.println("\n\n\n    Busqueda de Trabajos por coincidencias:\n");
            List<Trabajo> coincidencias;
            
            coincidencias=gt.buscarTrabajos("Wireless"); //filtro especificado
            for(Trabajo i: coincidencias){
                i.mostrar();
            }
            
//      
//       
            //ESTE ES EL NUEVO COMMIT
    
    } 
}