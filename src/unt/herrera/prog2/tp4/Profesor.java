/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp4;



/**
 *
 * @author Gianpaolo
 */
public class Profesor extends Persona {
    
    private Cargo UnCargo;

    
    

    public Cargo getUnCargo() {
        return UnCargo;
    }

    public void setUnCargo(Cargo UnCargo) {
        this.UnCargo = UnCargo;
    }

    public Profesor(String apellidos, String nombres, int dni, Cargo UnCargo) {
        super(apellidos,nombres,dni);
        this.UnCargo = UnCargo;
    }

    public void mostrar (){
//        System.out.println(" "+this.UnCargo+"\n -----------------");
        super.mostrar();
    }
    
    
    
  
    
    
}
