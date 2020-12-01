/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.users;

/**
 *
 * @author Alejandro Rodriguez Bañón
 */
public class Socio extends User {

    public Socio(String nombre, String apellido, long id, long accesos, String correuElectronic) {
        super(nombre, apellido, id, accesos, correuElectronic);
    }

    @Override
    public String toString() {
        return "Socio";
    }
    
}
