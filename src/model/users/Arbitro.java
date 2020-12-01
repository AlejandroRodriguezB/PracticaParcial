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
public class Arbitro extends User{
    private int partidasEvaluadas=0;

    public Arbitro(String nombre, String apellido, long id, long accesos, String correuElectronic) {
        super(nombre, apellido, id, accesos, correuElectronic);
    }

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
