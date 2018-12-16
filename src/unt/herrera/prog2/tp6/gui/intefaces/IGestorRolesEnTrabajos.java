/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp5;

import java.time.LocalDate;

/**
 *
 * @author jonas
 */
public interface IGestorRolesEnTrabajos {

    public RolEnTrabajo nuevoRolEnTrabajo(LocalDate fechaDesde,Profesor unProfesor,Rol unRol); 

}    

