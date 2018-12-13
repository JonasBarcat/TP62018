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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Alumno AlumnoGianpaolo= new Alumno("1601500","Berarducci","Gianpaolo",40902553);
      Alumno AlumnoGianluca = new Alumno("1234567","Berarducci","Gianluca",3994051); 
      // AlumnoGianpaolo.mostrar();
      // System.out.println(AlumnoGianpaolo);
      AlumnoEnTrabajo AlumnoTrabajando1=new AlumnoEnTrabajo(LocalDate.of(2018, 10, 6),LocalDate.of(2018, 12, 6),"termino de trabajar",AlumnoGianpaolo );
      AlumnoEnTrabajo AlumnoTrabajando2=new AlumnoEnTrabajo (LocalDate.of(2018, 10,11),LocalDate.of(2018, 12, 11),"termino de trabajar",AlumnoGianluca );
      
      ArrayList <AlumnoEnTrabajo>ALUMNOSENTRABAJO=new ArrayList <>();
      ALUMNOSENTRABAJO.add(AlumnoTrabajando1);
      ALUMNOSENTRABAJO.add(AlumnoTrabajando2);
      //AlumnoTrabajando1.mostrar();
      
      Area AreaUNO=new Area("Investigacion Biologia");
      Area AreaDOS=new Area("Investigacion Fisica");
      
      ArrayList <Area>Areas=new ArrayList <>();
      Areas.add(AreaUNO);
      Areas.add(AreaDOS);
      
      Seminario SeminarioUNO= new Seminario(LocalDate.of(2018, 12, 6),Aprobacion.APROBADO_SO);
      Seminario SeminarioDOS= new Seminario(LocalDate.of(2018, 10, 11),"Buen desempeño",Aprobacion.APROBADO_CO);
      Seminario SeminarioTRES= new Seminario(LocalDate.of(2018, 11, 8),Aprobacion.DESAPROBADO);
      
      ArrayList <Seminario>Seminarios=new ArrayList <>();
      Seminarios.add(SeminarioUNO);
      Seminarios.add(SeminarioDOS);
      Seminarios.add(SeminarioTRES);
     
      Profesor ProfesorUNO=new Profesor("Guzman","Fernanda",12345678,Cargo.TITULAR);
      Profesor ProfesorDOS=new Profesor ("Sanchez","Mariana",87654321,Cargo.JTP);
      Profesor ProfesorTRES=new Profesor("Nieto","Luis",12348765,Cargo.ASOCIADO);
      Profesor ProfesorCUATRO=new Profesor("Tuquina","Fernando",56781234,Cargo.ADG);
      Profesor ProfesorCINCO=new Profesor("Musa","Ezequiel",43215678,Cargo.ADJUNTO);
      
      RolEnTrabajo RolUNO=new RolEnTrabajo(LocalDate.of(2018, 6, 6),LocalDate.of(2018, 12, 6),"",Rol.TUTOR,ProfesorUNO);
      RolEnTrabajo RolDOS=new RolEnTrabajo(LocalDate.of(2018, 5, 5),LocalDate.of(2018, 11, 5),"",Rol.COTUTOR,ProfesorDOS);
      RolEnTrabajo RolTRES=new RolEnTrabajo(LocalDate.of(2018, 4, 4),LocalDate.of(2018, 10, 4),"",Rol.JURADO,ProfesorTRES);
      RolEnTrabajo RolCUATRO=new RolEnTrabajo(LocalDate.of(2018, 3, 3),LocalDate.of(2018, 9, 3),"",Rol.COTUTOR,ProfesorCUATRO);
      RolEnTrabajo RolCINCO=new RolEnTrabajo(LocalDate.of(2018, 2, 2),LocalDate.of(2018, 8, 2),"",Rol.COTUTOR,ProfesorCINCO);
      
      ArrayList <RolEnTrabajo>RolesEnTrabajo=new ArrayList <>();
      RolesEnTrabajo.add(RolUNO);
      RolesEnTrabajo.add(RolDOS);
      RolesEnTrabajo.add(RolTRES);
      RolesEnTrabajo.add(RolCUATRO);
      RolesEnTrabajo.add(RolCINCO);
      
      Trabajo UnTrabajo=new Trabajo("Proyecto de Programacion",2,LocalDate.of(2018, 10, 6),LocalDate.of(2018, 11,6 ),LocalDate.of(2018, 12, 6),Areas,ALUMNOSENTRABAJO,Seminarios,RolesEnTrabajo);
      Trabajo ElTrabajo=new Trabajo("Cambio de Carrera",0,LocalDate.of(2018, 5, 1),LocalDate.of(2018, 10, 6),LocalDate.of(2018, 11, 6),Areas,ALUMNOSENTRABAJO);
     
     ElTrabajo.AgregarleUnProfesorEnUnRolEnTrabajo(ProfesorDOS);
     ElTrabajo.AgregarleUnProfesorEnUnRolEnTrabajo(ProfesorTRES);
     
     
     ElTrabajo.AgregarUnSeminarioAUnTrabajo(SeminarioUNO);
      //UnTrabajo.mostrar();
      ElTrabajo.mostrar();
      
      
      
      
      
      
      
//     for(AlumnoEnTrabajo a: ALUMNOSENTRABAJO){
//     a.mostrar();}
     
//     ArrayList <Area> Areas =new ArrayList <Area>();
   


       
}
}
  

