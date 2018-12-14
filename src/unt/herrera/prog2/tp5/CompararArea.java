/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp5;
import java.util.Comparator;

/**
 *
 * @author Gianpaolo
 */
public class CompararArea implements Comparator <Area> {
    
    public int compare(Area a1, Area a2){
    
    return a1.getNombre().compareTo(a2.getNombre());
    }    
    
    
    
}
