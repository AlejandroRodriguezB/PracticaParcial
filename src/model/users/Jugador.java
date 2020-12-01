/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.users;

import java.util.ArrayList;
import java.util.List;
import model.game.Partida;

/**
 *
 * @author Alejandro Rodriguez Bañón
 */
public class Jugador extends User {

    private int partidasJugadas;
    private int partidasGanadas;
    private int partidasNoFinalizadas;
    private List<Partida> games = new ArrayList<Partida>();

    public Jugador(String nombre, String apellido, long id, long accesos, String correuElectronic) {
        super(nombre, apellido, id, accesos, correuElectronic);
    }

    public List<Partida> getGames() {
        return games;
    }

    public void setGames(List<Partida> games) {
        this.games = games;
    }
    
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
    
    public void addGame(Partida p){
        games.add(p);
    }
    
    
    @Override
    public String toString() {
        return "Jugador";
    }
    
}
