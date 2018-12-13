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
public interface IGestorAreas {
    
    public String nuevaArea(String nombre); 
    public void mostrarAreas(); 
    public Area dameArea(String nombre); 
    public ArrayList<Area> buscarAreas(String nombre); 

    
}
