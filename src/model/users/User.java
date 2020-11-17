package model.users;

import java.util.UUID;

/**
 * Classe que representa un usuari de l'aplicació.
 * 
 * @author Bernat Galmés Rubert
 */
public class User {
    
    private String nombre;
    private String apellido;
    private String tipoUser;
    private String correuElectronic;
    private long id;
    private long accesos;
    
    
    public User(String nombre, String apellido, long id, long accesos,String correuElectronic,String tipoUser) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.accesos = accesos;
        this.correuElectronic=correuElectronic;
        this.tipoUser=tipoUser;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(String tipoUser) {
        this.tipoUser = tipoUser;
    }

    public String getCorreuElectronic() {
        return correuElectronic;
    }

    public void setCorreuElectronic(String correuElectronic) {
        this.correuElectronic = correuElectronic;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAccesos() {
        return accesos;
    }

    public void setAccesos(long accesos) {
        this.accesos = accesos;
    }
    
    
}
