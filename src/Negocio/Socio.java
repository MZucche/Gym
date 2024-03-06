/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author melidumanski
 */
public class Socio {
    private static int contador;

    private int id;

    private String nombre;

    private String apellido;

    private TipoSocio tipoSocio;

    public Socio(String nombre, String apellido, TipoSocio tipoSocio) {
        contador++;
        this.id = contador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoSocio = tipoSocio;
    }

    public int getId() {
        return id;
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

    public TipoSocio getTipoSocio() {
        return tipoSocio;
    }

    public void setTipoSocio(TipoSocio tipoSocio) {
        this.tipoSocio = tipoSocio;
    }
}
