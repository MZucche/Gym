/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author melidumanski
 */
public class Accesorio extends Articulo{
    private String nombreAccesorio;

    public Accesorio(String nombre, int year, int month, int day, TipoVidaUtil tipoVidaUtil, int vidaUtil, String marca, String nombreAccesorio) {
        super(nombre, year, month, day, tipoVidaUtil, vidaUtil, marca);
        this.nombreAccesorio = nombreAccesorio;
    }
}
