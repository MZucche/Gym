/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author melidumanski
 */
public class Emplazamiento {
    private static int contador;
    private int id;
    private int capacidad;
    private Sede sede;
    private TipoEmplazamiento tipoEmplazamiento;

    public Emplazamiento(int capacidad, Sede sede, TipoEmplazamiento tipoEmplazamiento) {
        contador++;
        this.id = contador;
        this.capacidad = capacidad; // no debe superar los 30
        this.sede = sede; // verificar que exista
        this.tipoEmplazamiento = tipoEmplazamiento;
    }

    public int getId() {
        return id;
    }
    
    public int getCapacidad() {
        return capacidad;
    }

    public Sede getSede() {
        return sede;
    }

    public TipoEmplazamiento getTipoEmplazamiento() {
        return tipoEmplazamiento;
    }
}
