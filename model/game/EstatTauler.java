package model.game;

import java.util.List;
import model.chesspieces.Alfil;
import model.chesspieces.*;
import utils.PositionCode;

/**
 * Representació de l'estat d'un tauler d'escacs en un instant donat.
 * 
 * Aquesta classe conté la posició de les peces sobre un tauler d'escacs
 * en un moment donat.
 * 
 * @author Bernat Galmés Rubert
 */
public class EstatTauler {
    private String tauler;
    private List<Pieza> llistaPeces;
    
    public String getTauler() {
        return tauler;
    }

    public EstatTauler(String tauler) {
        this.tauler = tauler;
    }
    
    public List<Pieza> generaLlistaPeces(){
        tauler += " ";
        String aux = tauler;
        int indexInici = 0;
        for(int i = 0; i < tauler.length(); i++){
            if(tauler.charAt(i) == ' '){
                aux.substring(indexInici, i-1);
                indexInici = i;
                PositionCode pc = new PositionCode(aux);
                if(aux.charAt(3) == 'b'){
                    Alfil a = new Alfil();
                    a.setColumna(pc.getColumn());
                    a.setFila(pc.getRow());
                    a.setColor((int)aux.charAt(10));
                    llistaPeces.add(a);
                }
                else if(aux.charAt(3) == 'p'){
                    Peon p = new Peon();
                    p.setColumna(pc.getColumn());
                    p.setFila(pc.getRow());
                    p.setColor((int)aux.charAt(9));
                    llistaPeces.add(p);
                }
                else if(aux.charAt(3) == 'q'){
                    Dama d = new Dama();
                    d.setColumna(pc.getColumn());
                    d.setFila(pc.getRow());
                    d.setColor((int)aux.charAt(9));
                    llistaPeces.add(d);
                }
                else if(aux.charAt(3) == 'r'){
                    Torre t = new Torre();
                    t.setColumna(pc.getColumn());
                    t.setFila(pc.getRow());
                    t.setColor((int)aux.charAt(9));
                    llistaPeces.add(t);
                }
                else if(aux.charAt(3) == 'k' && aux.charAt(4) == 'i'){
                    Rey r = new Rey();
                    r.setColumna(pc.getColumn());
                    r.setFila(pc.getRow());
                    r.setColor((int)aux.charAt(8));
                    llistaPeces.add(r);
                }
                else{
                    Caballo c = new Caballo();
                    c.setColumna(pc.getColumn());
                    c.setFila(pc.getRow());
                    c.setColor((int)aux.charAt(9));
                    llistaPeces.add(c);
                }
                aux = tauler;
            }
            
        }
        return llistaPeces;
             
    }
    
}
