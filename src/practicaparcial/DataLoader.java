package practicaparcial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utils.CSVReader;


/**
 * Classe que carrega les dades dels fitxers del projecte.
 * 
 * @author Bernat Galmés Rubert
 */
public class DataLoader {
    
    public static List<UserData> usersLoader() throws FileNotFoundException{
        String filename = "resources/usuaris.csv";
        Scanner scanner = new Scanner(new File(filename));
        List<UserData> users = new ArrayList<>();
        List<String> header = CSVReader.parseLine(scanner.nextLine());
        while (scanner.hasNext()) {
            List<String> line = CSVReader.parseLine(scanner.nextLine());
            users.add(new UserData(
                    Long.parseLong(line.get(0)),
                    line.get(1),
                    line.get(2),
                    line.get(3),
                    line.get(4),
                   Long.parseLong(line.get(5))
            ));
        }
        scanner.close();
        return users;
    }
    
    public static List<GameData> gamesLoader() throws FileNotFoundException{
        String filename = "resources/partides.csv";
        Scanner scanner = new Scanner(new File(filename));
        List<GameData> games = new ArrayList<>();
        List<String> header = CSVReader.parseLine(scanner.nextLine());
        while (scanner.hasNext()) {
            List<String> line = CSVReader.parseLine(scanner.nextLine());
            games.add(new GameData(
                    Long.parseLong(line.get(0)),
                    Long.parseLong(line.get(1)),
                    Long.parseLong(line.get(2)),
                    Long.parseLong(line.get(3)),
                    line.get(4)
            ));
        }
        scanner.close();
        return games;
    }
    
    public static class UserData{
        public String nom;
        public String llinatges;
        public String correuElectronic;
        public String tipus;
        public long id;
        public long numAccessos;
        
        public UserData(long id, String nom, String llinatges, String correuElectronic, String tipus, long numAccessos) {
            this.nom = nom;
            this.llinatges = llinatges;
            this.correuElectronic = correuElectronic;
            this.tipus = tipus;
            this.id = id;
            this.numAccessos = numAccessos;
        }   
    }
    
    public static class GameData {
        public long idPartida;
        public long jugador1;
        public long jugador2;
        public long arbitre;
        public String tauler;

        public GameData(long idPartida, long jugador1, long jugador2, long arbitre, String tauler) {
            this.idPartida = idPartida;
            this.jugador1 = jugador1;
            this.jugador2 = jugador2;
            this.arbitre = arbitre;
            this.tauler = tauler;
        }   
    }
}
