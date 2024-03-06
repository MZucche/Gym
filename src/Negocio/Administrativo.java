/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import java.util.*;

/**
 *
 * @author melidumanski
 */
public class Administrativo {
    private static int contador;
    private int id;
    private List<Sede> sedesAsignadas = new ArrayList<>();
    
    public Administrativo(List<Sede> sedesAsignadas) {
        contador++;
        this.id = contador;
        this.sedesAsignadas = sedesAsignadas;
    }

    public int getId() {
        return id;
    }

    public List<Sede> getSedes() {
        return sedesAsignadas;
    }
    
    public void agregarSede(Sede sede) {
        sedesAsignadas.add(sede);
    }
}
