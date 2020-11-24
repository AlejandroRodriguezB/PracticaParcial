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
    private String[] partes;

    public String getTauler() {
        return tauler;
    }

    public String[] getPartes() {
        return partes;
    }

    public EstatTauler(String tauler) {
        this.tauler = tauler;
    }
    
    public void separa(){
        partes=tauler.split(" ");
        for(int i =0; partes[i]!=null;i++){
            
        }
    }
    
}
