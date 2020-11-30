package model.game;

import model.chesspieces.Alfil;
import model.chesspieces.*;
import utils.PositionCode;
import view.CellDrawable;

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
    private CellDrawable[][] llistaPeces = new CellDrawable[9][9];

    
    public String getTauler() {
        return tauler;
    }

    public EstatTauler(String tauler) {
        this.tauler = tauler;       
    }
    
    public CellDrawable[][] generaLlistaPeces(){
        String aux = tauler;
        String pcList[] = aux.split(" ");
        for(int i = 0; i < pcList.length; i++){
            PositionCode pc = new PositionCode(pcList[i]);
            if(pcList[i].charAt(3) == 'b'){
                Alfil a = new Alfil();
                a.setColor((int)pcList[i].charAt(10));
                llistaPeces[pc.getColumn()][pc.getRow()] = a;
            }
            else if(pcList[i].charAt(3) == 'p'){
                Peon p = new Peon();
                p.setColor((int)pcList[i].charAt(9));
                llistaPeces[pc.getColumn()][pc.getRow()] = p;
            }
            else if(pcList[i].charAt(3) == 'q'){
                Dama d = new Dama();
                d.setColor((int)pcList[i].charAt(9));
                llistaPeces[pc.getColumn()][pc.getRow()] = d;
            }
            else if(pcList[i].charAt(3) == 'r'){
                Torre t = new Torre();
                t.setColor((int)pcList[i].charAt(8));
                llistaPeces[pc.getColumn()][pc.getRow()] = t;
            }
            else if(pcList[i].charAt(3) == 'k' && pcList[i].charAt(5) == 'n'){
                Rey r = new Rey();
                r.setColor((int)pcList[i].charAt(8));
                llistaPeces[pc.getColumn()][pc.getRow()] = r;
            }
            else{
                Caballo c = new Caballo();
                c.setColor((int)pcList[i].charAt(9));
                llistaPeces[pc.getColumn()][pc.getRow()] = c;
            }
            }
        return llistaPeces;

    }
    
    
}
