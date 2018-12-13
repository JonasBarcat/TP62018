/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp1;

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
        
     
    Nivel nivelUNO= new Nivel();
    nivelUNO.nombre="PRIMERO";
    nivelUNO.codigo="1";
    Nivel nivelDOS= new Nivel();
    nivelDOS.nombre="SEGUNDO";
    nivelDOS.codigo="2";
    Nivel nivelTRES= new Nivel();
    nivelTRES.nombre="TERCERO";
    nivelTRES.codigo="3";
    Nivel nivelCUATRO= new Nivel();
    nivelCUATRO.nombre="CUARTO";
    nivelCUATRO.codigo="4";
    Nivel nivelCINCO= new Nivel();
    nivelCINCO.nombre="QUINTO";
    nivelCINCO.codigo="5";
    
    Nivel VECTORDENIVELES[]={nivelUNO,nivelDOS,nivelTRES,nivelCUATRO,nivelCINCO};
    
    for(Nivel a:VECTORDENIVELES){
    
    
    System.out.println(a.nombre+" "+a.codigo);}
    
    nivelUNO.nombre="HOLA";
    nivelDOS.codigo="12345";
    nivelTRES.nombre="COMO";
    nivelCUATRO.codigo="Estas";
    nivelCINCO.nombre="?";
    
    
    for(Nivel a:VECTORDENIVELES){
    
    
    System.out.println(a.nombre+" "+a.codigo);}
    
    
    
    
    PlanEstudio alfa=new PlanEstudio();
    alfa.nombre="A";
    alfa.fechaDesde=LocalDate.of(2018, 1, 1);
    PlanEstudio beta=new PlanEstudio();
    beta.nombre="B";
    beta.fechaDesde=LocalDate.of(2018, 2, 2);
    
    
    PlanEstudio gama=new PlanEstudio();
    gama.nombre="C";
    gama.fechaDesde=LocalDate.of(2018, 3, 3);
    
    PlanEstudio epsilon= new PlanEstudio();
    epsilon.nombre="D";
    epsilon.fechaDesde=LocalDate.of(2018, 4, 4);
    PlanEstudio delta= new PlanEstudio();
    delta.nombre="E";
    delta.fechaDesde=LocalDate.of(2018, 5, 5);
    
    
    ArrayList<PlanEstudio> PLANES=new ArrayList <>();
    PLANES.add(alfa);
    PLANES.add(beta);
    PLANES.add(gama);
    PLANES.add(epsilon);
    PLANES.add(delta);
    
    
    for(PlanEstudio x: PLANES){
    System.out.println(x.nombre+" "+x.fechaDesde);}
    
    
    
    
        // TODO code application logic here
    }
    
}
