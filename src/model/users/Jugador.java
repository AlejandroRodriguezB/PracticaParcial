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
public class Jugador extends TipoUser {
    private int partidasJugadas;
    private int partidasGanadas;
    private int partidasNoFinalizadas;
    
    @Override
    public String toString() {
        return "Jugador";
    }
    
}
