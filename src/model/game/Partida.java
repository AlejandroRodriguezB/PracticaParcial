package model.game;

import model.users.User;


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
    private User jugador1;
    private User jugador2;
    private long arbitre;
    private EstatTauler tauler;

    public long getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(long idPartida) {
        this.idPartida = idPartida;
    }

    public User getJugador1() {
        return jugador1;
    }

    public void setJugador1(User jugador1) {
        this.jugador1 = jugador1;
    }

    public User getJugador2() {
        return jugador2;
    }

    public void setJugador2(User jugador2) {
        this.jugador2 = jugador2;
    }

    public long getArbitre() {
        return arbitre;
    }

    public void setArbitre(long arbitre) {
        this.arbitre = arbitre;
    }

    public EstatTauler getTauler() {
        return tauler;
    }

    public void setTauler(EstatTauler tauler) {
        this.tauler = tauler;
    }
    
    public Partida(long idPartida, User jugador1, User jugador2, long arbitre, EstatTauler tauler) {
        this.idPartida = idPartida;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.arbitre = arbitre;
        this.tauler = tauler;
    }
    
    

}
