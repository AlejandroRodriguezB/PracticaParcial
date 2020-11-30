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
    
    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public int getPartidasNoFinalizadas() {
        return partidasNoFinalizadas;
    }

    public void setPartidasNoFinalizadas(int partidasNoFinalizadas) {
        this.partidasNoFinalizadas = partidasNoFinalizadas;
    }
    
    
    @Override
    public String toString() {
        return "Jugador";
    }
    
}
