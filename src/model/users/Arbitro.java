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
public class Arbitro extends TipoUser{
    private int partidasEvaluadas=0;

    public void agregaPartidaEvaluada() {
        partidasEvaluadas++;
    }

    public int getPartidasEvaluadas() {
        return partidasEvaluadas;
    }
    
    
    public void setPartidasEvaluadas(int partidasEvaluadas) {
        this.partidasEvaluadas = partidasEvaluadas;
    }
    @Override
    public String toString() {
        return "Arbitro";
    }
}
