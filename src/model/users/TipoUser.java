/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.users;

import java.util.List;
import model.game.Partida;

/**
 *
 * @author Alejandro Rodriguez Bañón
 */
public abstract class TipoUser {
    
    private int partidasGanadas;
    private List<Partida> games;

    public List<Partida> getGames() {
        return games;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }
    
    public void addGame(Partida p){
        games.add(p);
    }

}
