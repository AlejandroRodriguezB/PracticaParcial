/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.List;
import model.users.Arbitro;
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
        int i=0 ;
        while (array.get(i).getId()!= id && array.get(i)!= null){
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
        float[] medias;
        long meanA=0;
        long meanS=0;
        long meanJ=0;
        for(int i =0; array.get(i)!= null;i++){
            if(array.get(i).getTipoUser().getClass()==Arbitro.class){
                meanA= meanA+ array.get(i).getAccesos();
            }
            if(array.get(i).getTipoUser().getClass()==Socio.class){
                meanS= meanS+ array.get(i).getAccesos();
            }
            else{
                meanJ= meanJ+ array.get(i).getAccesos();
            }
        }
            medias[0]=meanA/2;
        
            return medias;
        }

    @Override
    public String findUserWithMaxAccess() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> findUsersWithNoAccess() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String findUserWithMaxWins() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
