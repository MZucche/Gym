/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author melidumanski
 */
import java.util.*;

public class Sede {
    private static int contador;
    private int id;
    private TipoSocio tipoSocio;
    private String localidad;
    private List<Articulo> articulosSede = new ArrayList<>();

    public Sede(TipoSocio tipoSocio, String localidad, List<Articulo> articulosSede) {
        contador++;
        this.id = contador;
        this.tipoSocio = tipoSocio; // depende el TipoSocio que se acepte va a poder ingresar
        this.localidad = localidad; // verificar en lista Localidades Supertlon
        this.articulosSede = articulosSede; // debo poder cargar Articulo, mostrar por pantalla y seleccionar hasta ingresar -1
    }

    public int getId() {
        return id;
    }

    public TipoSocio getTipoSocio() {
        return tipoSocio;
    }

    public void setTipoSocio(TipoSocio tipoSocio) {
        this.tipoSocio = tipoSocio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public List<Articulo> getArticulos() {
        return articulosSede;
    }
    
    public void eliminarArticulo(Articulo articulo) {
        articulosSede.remove(articulo);
    }

}
