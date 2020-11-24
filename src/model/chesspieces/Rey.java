/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.chesspieces;

import java.awt.Image;
import javax.swing.ImageIcon;
import view.CellDrawable;

/**
 *
 * @author Alejandro Rodriguez Bañón
 */
public class Rey extends Pieza {

    @Override
    public Image FiguraFBlanc() {
        Image imagen = new ImageIcon("resources/imatges/Fons_Blanc/Rei.gif").getImage();  
        return imagen;
    }

    @Override
    public Image FiguraFNegre() {
        Image imagen = new ImageIcon("resources/imatges/Fons_Negre/Rei.gif").getImage();  
        return imagen;
    }
    
}
