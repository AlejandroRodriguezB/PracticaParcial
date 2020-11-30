/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.chesspieces;

import view.CellDrawable;

/**
 *
 * @author Alejandro Rodriguez Bañón
 */
public abstract class Pieza implements CellDrawable{
    private int columna;
    private int fila;
    private int color;

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    
}
