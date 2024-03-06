/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author melidumanski
 */
public class Pesa extends Articulo {
    private double peso;
    private TipoUsoPesa tipoUsoPesa;

    public Pesa(String nombre, int year, int month, int day, TipoVidaUtil tipoVidaUtil, int vidaUtil, String marca, double peso, TipoUsoPesa tipoUsoPesa) {
        super(nombre, year, month, day, tipoVidaUtil, vidaUtil, marca);
        this.peso = peso;
        this.tipoUsoPesa = tipoUsoPesa;

    }
}
