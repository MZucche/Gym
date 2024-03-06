/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author melidumanski
 */
public class Colchoneta extends Articulo {
    private double largo;
    private double ancho;

    public Colchoneta(String nombre, int year, int month, int day, TipoVidaUtil tipoVidaUtil, int vidaUtil, String marca, double largo, double ancho) {
        super(nombre, year, month, day, tipoVidaUtil, vidaUtil, marca);
        this.largo = largo;
        this.ancho = ancho;
    }
}