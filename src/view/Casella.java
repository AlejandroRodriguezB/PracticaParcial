package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 * Classe que defineix una casella del tauler
 *
 * @author Bernat
 */
public class Casella extends JPanel {

    private Rectangle2D.Float Rcasella;
    private Color colorFons;

    private Image img_pesa;

    public Casella(Rectangle2D.Float r, Color colorFons) {
        Rcasella = r;
        //inicialitzam les fitxes del mateix color que el fons perque no es veguin
        this.colorFons = colorFons;
    }

    /**
     * Mètode que dibuixa la Rcasella
     *
     * @param g Objecte per pintar la Rcasella
     */
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(colorFons);
        g2d.fill(Rcasella);
        g2d.setColor(Color.BLACK);
        g2d.draw(Rcasella);
    }

    public Rectangle2D.Float getCasella() {
        return Rcasella;
    }

    public Color getColorFons() {
        return colorFons;
    }

    public void setImage(Image img) {
        this.img_pesa = img;
    }

    public Image getImg_pesa() {
        return img_pesa;
    }

}
