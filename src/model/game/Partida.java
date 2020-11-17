package model.game;


/**
 * Classe que representa una partida del joc.
 * 
 * Aquesta classe conté els jugadors que estan jugant la partida i l'estat del
 * tauler en aquest instant de la partida.
 * 
 * @author Bernat Galmés Rubert
 */
public class Partida {

    private long idPartida;
    private long jugador1;
    private long jugador2;
    private long arbitre;
    private EstatTauler tauler;
    
    public Partida(long idPartida, long jugador1, long jugador2, long arbitre, EstatTauler tauler) {
        this.idPartida = idPartida;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.arbitre = arbitre;
        this.tauler = tauler;
    }
    
    

}
