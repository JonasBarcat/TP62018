/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp2;

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
        
        Trabajo InvestigacionUNO=new Trabajo("Proyecto1","Computacion","Cuatrimestre",LocalDate.of(2018, 10, 6),LocalDate.of(2018, 11, 1),LocalDate.of(2018, 12, 1));
        Trabajo InvestigacionDOS=new Trabajo("Proyecto2","Electronica","Bimestre",LocalDate.of(2018, 1, 1),LocalDate.of(2018, 2, 1),LocalDate.of(2018, 3, 1));
        Trabajo InvestigacionTRES=new Trabajo("Proyecto3","Electrica","Trimestre",LocalDate.of(2018, 2, 1),LocalDate.of(2018, 3, 1),LocalDate.of(2018, 5, 1));
        Trabajo InvestigacionCUATRO=new Trabajo("Proyecto4","Quimica","Mes",LocalDate.of(2018, 3, 1),LocalDate.of(2018, 4, 1),LocalDate.of(2018, 6, 1));
        Trabajo InvestigacionCINCO=new Trabajo("Proyecto5","Mecanica","Año",LocalDate.of(2018, 4, 1),LocalDate.of(2018, 5, 1),LocalDate.of(2018, 7, 1));
//        Trabajo InvestigacionSEIS=new Trabajo(); //NO SE PUEDE CREAR UN OBJETO CON TODOS SUS PARAMETROS VACIOS YA QUE NO EXISTE UN CONSTRUCTOR SIN PARAMETROS.
        


        ArrayList <Trabajo> TRABAJOS= new ArrayList<>();
        TRABAJOS.add(InvestigacionUNO);
        TRABAJOS.add(InvestigacionDOS);
        TRABAJOS.add(InvestigacionTRES);
        TRABAJOS.add(InvestigacionCUATRO);
        TRABAJOS.add(InvestigacionCINCO);
        
        
        for(Trabajo t: TRABAJOS){
        t.mostrar();}
//        InvestigacionUNO.mostrar();
//        InvestigacionDOS.mostrar();
//        InvestigacionTRES.mostrar();
//        InvestigacionCUATRO.mostrar();
//        InvestigacionCINCO.mostrar();


//InvestigacionDOS.setTitulo("PROYECTO X");  //SI SE PUEDE MODIFICAR LOS ATRIBUTOS DE ALGUNOS OBJETOS ACCEDIENDO DEIRECTAMENTE A ELLOS POR LOS METODOS GET AND SET
//        
//
//        for(Trabajo t: TRABAJOS){
//        t.mostrar();}

        Alumno alumnoUNO=new Alumno("Gianpaolo","Berarducci","40902553","1600150");
        Alumno alumnoDOS=new Alumno("Gianluca","Berarducci","39762884","1578854");
        Alumno alumnoTRES=new Alumno("Miguel","Bustos","45858554","1547896");
        Alumno alumnoCUATRO=new Alumno("Jonas","Barcat","4598755","4789562");
        Alumno alumnoCINCO=new Alumno("Fausto","Pereyra","4257895","7894561");
        
        
        
        Profesor profesorUNO=new Profesor("Mariana","Sanchez","7895462","Asociado");
        Profesor profesorDOS=new Profesor("Fernanda","Guzman","1234567","Adjunto");
        Profesor profesorTRES=new Profesor("Luis","Nieto","7894561","Titular");
        Profesor profesorCUATRO=new Profesor("Teresa","Cardoso","5246561","JTP");
        Profesor profesorCINCO=new Profesor("Fernando","Tuquina","7899861","ADG");
        
        
        ArrayList <Profesor> PROFESORES=new ArrayList <>();
        PROFESORES.add(profesorUNO);
        PROFESORES.add(profesorDOS);
        PROFESORES.add(profesorTRES);
        PROFESORES.add(profesorCUATRO);
        PROFESORES.add(profesorCINCO);
        
        for(Profesor p: PROFESORES){
        p.mostrar();
        }
        
        ArrayList <Alumno> ALUMNOS=new ArrayList<>();
        ALUMNOS.add(alumnoUNO);
        ALUMNOS.add(alumnoDOS);
        ALUMNOS.add(alumnoTRES);
        ALUMNOS.add(alumnoCUATRO);
        ALUMNOS.add(alumnoCINCO);
        
        for(Alumno a: ALUMNOS){
        a.mostrar();}
        
        
        
        
        
    }
    
}
