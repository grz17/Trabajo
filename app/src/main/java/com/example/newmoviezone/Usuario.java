package com.example.newmoviezone;

import java.io.Serializable;

public class Usuario  implements Serializable {

    private  String nombre ;
    private   String contraseña;
    private  String correo;
    private  String confirmar;

    public  Usuario()
    {

    }

    public Usuario(String nombre, String contraseña, String correo, String confirmar) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.correo = correo;
        this.confirmar = confirmar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getConfirmar() {
        return confirmar;
    }

    public void setConfirmar(String confirmar) {
        this.confirmar = confirmar;
    }
}
