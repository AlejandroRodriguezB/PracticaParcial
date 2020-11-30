/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.chesspieces;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Alejandro Rodriguez Bañón
 */
public class Peon extends Pieza{

    public Peon() {
    }
    
    @Override
    public Image FiguraFBlanc() {
        Image imagen = new ImageIcon("resources/imatges/Fons_Blanc/Gat.gif").getImage();  
        return imagen;
    }

    @Override
    public Image FiguraFNegre() {
        Image imagen = new ImageIcon("resources/imatges/Fons_Negre/Gat.gif").getImage();  
        return imagen;
    }
    
}
