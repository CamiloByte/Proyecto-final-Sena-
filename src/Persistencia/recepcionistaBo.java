package Persistencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADSI
 */
public class recepcionistaBo {
    
    String id_recepcionista;
    String nombre;
    String apellido;

    public String getId_recepcionista() {
        return id_recepcionista;
    }

    public void setId_recepcionista(String id_recepcionista) {
        this.id_recepcionista = id_recepcionista;
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
    
}

