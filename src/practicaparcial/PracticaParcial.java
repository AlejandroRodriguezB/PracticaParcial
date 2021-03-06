package practicaparcial;

import java.util.ArrayList;
import java.util.List;
import model.game.EstatTauler;
import model.game.Partida;
import model.users.Arbitro;
import model.users.Jugador;
import model.users.Socio;
import model.users.User;
import repository.UsersRepository;
import repository.UsersRepositoryImpl;
import view.UsersWindow;

/**
 *
 * @author Bernat Galmés Rubert
 */
public class PracticaParcial {

    UsersRepository users;
    List<Partida> partides;

    public PracticaParcial() throws Exception {
        this.users = loadUsers();
        this.partides = loadGames();
    }

    public void run() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UsersWindow(users).setVisible(true);
            }
        });
    }

    private List<Partida> loadGames() throws Exception {
        List<Partida> partides = new ArrayList<>();
        List<DataLoader.GameData> gamesData = DataLoader.gamesLoader();
        for (DataLoader.GameData gameData : gamesData) {
            // TODO: Codi per emplenar la llista de partides
            EstatTauler et= new EstatTauler(gameData.tauler);
            Partida u = new Partida(gameData.idPartida,users.findOne(gameData.jugador1),users.findOne(gameData.jugador2),gameData.arbitre,et);
            Jugador j = (Jugador)users.findOne(gameData.jugador1);
            j.addGame(u);
            j = (Jugador)users.findOne(gameData.jugador2);
            j.addGame(u);
            Arbitro a = (Arbitro)users.findOne(gameData.arbitre);
            a.agregaPartidaEvaluada();
            partides.add(u);
           
        }

        return partides;
    }

    private static UsersRepository loadUsers() throws Exception {
        List<User> users = new ArrayList<>();
        List<DataLoader.UserData> usersData = DataLoader.usersLoader();
        for (DataLoader.UserData userData : usersData) {
            // TODO: Codi per emplenar la llista d'usuaris
            switch(userData.tipus){
            case "0":
                Jugador u = new Jugador(userData.nom,userData.llinatges,userData.id,userData.numAccessos,userData.correuElectronic);
                users.add(u);
                break;

            case "1":
                Socio s = new Socio(userData.nom,userData.llinatges,userData.id,userData.numAccessos,userData.correuElectronic);
                users.add(s);
                break;

            case "2":
                Arbitro a = new Arbitro(userData.nom,userData.llinatges,userData.id,userData.numAccessos,userData.correuElectronic);
                users.add(a);
                break;
        }
            
        }
        // TODO: Contruir i retornar l'objecte amb el repository
        UsersRepositoryImpl impl = new UsersRepositoryImpl(users);
        return impl;
    }

    public static void main(String[] args) throws Exception {
        PracticaParcial m = new PracticaParcial();  
        m.run();
    }

}
