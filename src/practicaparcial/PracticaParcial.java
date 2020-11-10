package practicaparcial;

import java.util.ArrayList;
import java.util.List;
import model.game.Partida;
import model.users.User;
import repository.UsersRepository;
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
        }

        return partides;
    }

    private static UsersRepository loadUsers() throws Exception {
        List<User> users = new ArrayList<>();
        List<DataLoader.UserData> usersData = DataLoader.usersLoader();
        for (DataLoader.UserData userData : usersData) {
            // TODO: Codi per emplenar la llista d'usuaris
        }

        // TODO: Contruir i retornar l'objecte amb el repository
        return null;
    }

    public static void main(String[] args) throws Exception {
        PracticaParcial m = new PracticaParcial();
        m.run();
    }

}
