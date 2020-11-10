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
 * @author alumno
 */
public class Torre extends Pieza implements CellDrawable{

    @Override
    public Image FiguraFBlanc() {
        Image imagen = new ImageIcon("resources/imatges/Fons_Blanc/Torre.gif").getImage();  
        return imagen;    
    }

    @Override
    public Image FiguraFNegre() {
        Image imagen = new ImageIcon("resources/imatges/Fons_Negre/Torre.gif").getImage();  
        return imagen; 
    }
    
}
