/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author melidumanski
 */
public class ClaseOnLine {
    private static int contador;
    private int id;
    private String actividad;
    private int cantidadClases; // cantidad clases a guardar
    private Clase[] clases;

    public ClaseOnLine(String actividad, int cantidadClases) {
        contador++;
        this.id = contador;
        this.actividad = actividad; // debe ser chequeada que exista
        this.cantidadClases = cantidadClases;
        this.clases = new Clase[cantidadClases];
    }

    public int getId() {
        return id;
    }

    public String getActividad() {
        return actividad;
    }

    public int getCantidadClases() {
        return cantidadClases;
    }

    public List<Clase> getClases() {
        int i = 0;
        List<Clase> lista = new ArrayList<>();
        while (i < cantidadClases ) {
            if (clases[i] != null) {
                lista.add(clases[i]);
            }
            i++;
        }
        return lista;
    }
    
    public void agregarClase(Clase clase) {
        boolean estado = false;
        
        for (int i = 0; i < clases.length; i++) {
            if (clases[i] == null) {
                clases[i] = clase;
                estado = true;
                break;
            }  
        }
        if (estado == false) { 
        // quiere decir que esta lleno el arreglo.
        // Hay que eliminar el primero agregado, correrlos una posición y agregar el nuevo al ultimo lugar
            clases[0] = null;
            for (int i = 0; i < clases.length; i++) { // realizar el corrimiento
                if (i < (clases.length -1)) {
                    clases[i] = clases[i+1];
                } else {
                    clases[i] = clase;
                }
            }
        }
    }
}
