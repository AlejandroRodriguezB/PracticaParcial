/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.users.Arbitro;
import model.users.Jugador;
import model.users.Socio;
import model.users.User;

/**
 *
 * @author Alejandro Rodriguez Bañón
 */
public class UsersRepositoryImpl implements UsersRepository {

    private List<User> array;

    public UsersRepositoryImpl(List<User> array) {
        this.array = array;
    }

    @Override
    public User findOne(long id) {
        int i = 0;
        while (array.get(i).getId() != id && array.get(i) != null) {
            i++;
        }
        return array.get(i);
    }

    @Override
    public List<User> findAll() {
        return array;
    }

    @Override
    public float[] meanAccessByClass() {
        float[] medias = new float[4];
        
        //cantidad de accesos de por tipo de usuarios
        long totA = 0;
        long totS = 0;
        long totJ = 0;
        //cantidad de tipos de usuarios
        int a = 0;
        int s = 0;
        int j = 0;
        
        for (int i = 0; i<array.size(); i++) {
            if (array.get(i).getTipoUser().getClass() == Arbitro.class) {
                totA = totA + array.get(i).getAccesos();
                a++;
            }
            if (array.get(i).getTipoUser().getClass() == Socio.class) {
                totS = totS + array.get(i).getAccesos();
                s++;
            } else {
                totJ = totJ + array.get(i).getAccesos();
                j++;
            }
        }
        medias[0] = totA/a;
        medias[1] = totS/s;
        medias[2] = totJ/j;

        return medias;
    }

    @Override
    public String findUserWithMaxAccess() {

        long max = -1;
        String nomApellido = "nadie";
        for (int i = 0; i<array.size(); i++) {
            if (array.get(i).getAccesos() > max) {
                max = array.get(i).getAccesos();
                nomApellido = array.get(i).getNombre() + " " + array.get(i).getApellido();
            }
        }
        return nomApellido;

    }

    @Override
    public List<String> findUsersWithNoAccess() {
        List<String> noAccess = new ArrayList<String>();
        for (int i = 0; i<array.size(); i++) {
            if (array.get(i).getAccesos() == 0) {
                noAccess.add(array.get(i).getNombre());
            }
        }
        return noAccess;
    }

    @Override
    public String findUserWithMaxWins() {
        String name = "nadie";
        int max=-1;
        for (int i = 0; i<array.size(); i++) {
            if (array.get(i).getTipoUser().getClass() == Jugador.class) {
                if(array.get(i).getTipoUser().getPartidasGanadas()>max){
                    max=array.get(i).getTipoUser().getPartidasGanadas();
                    name=array.get(i).getNombre() + " " + array.get(i).getApellido();
                }
            }
        }
        return name;
    }

}
