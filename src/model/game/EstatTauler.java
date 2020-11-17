package model.game;

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

    public String getTauler() {
        return tauler;
    }

    public void setTauler(String tauler) {
        this.tauler = tauler;
    }

    public EstatTauler(String tauler) {
        this.tauler = tauler;
    }
    
    
}
