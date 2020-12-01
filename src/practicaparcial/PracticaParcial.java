package practicaparcial;

import java.util.ArrayList;
import java.util.List;
import model.game.EstatTauler;
import model.game.Partida;
import model.users.Arbitro;
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
            users.findOne(gameData.jugador1).getTipoUser().addGame(u);
            users.findOne(gameData.jugador2).getTipoUser().addGame(u);
            users.findOne(gameData.arbitre).getTipoUser().agregaPartidaEvaluada();
            partides.add(u);
           
        }

        return partides;
    }

    private static UsersRepository loadUsers() throws Exception {
        List<User> users = new ArrayList<>();
        List<DataLoader.UserData> usersData = DataLoader.usersLoader();
        for (DataLoader.UserData userData : usersData) {
            // TODO: Codi per emplenar la llista d'usuaris
            User u = new User(userData.nom,userData.llinatges,userData.id,userData.numAccessos,userData.correuElectronic,userData.tipus);
            users.add(u);
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
