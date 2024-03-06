/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import java.time.*;
import java.util.*;

/**
 *
 * @author melidumanski
 */
public class CargaHorariaProfesor {
    private Profesor profesor;
    private Clase[] lunes;
    private Clase[] martes;
    private Clase[] miercoles;
    private Clase[] jueves;
    private Clase[] viernes;
    private Clase[] sabado;
    private Clase[] domingo;

    public CargaHorariaProfesor(Profesor profesor) {
        this.profesor = profesor;
        this.lunes = new Clase[3];
        this.martes = new Clase[3];
        this.miercoles = new Clase[3];
        this.jueves = new Clase[3];
        this.viernes = new Clase[3];
        this.sabado = new Clase[3];
        this.domingo = new Clase[0];
    }
    
    public Profesor getProfesor() {
        return profesor;
    }

    public Clase[] verificarDia(LocalDate fecha) {
        DayOfWeek diaSemana = fecha.getDayOfWeek();
        switch (diaSemana) {
            case MONDAY:
                return lunes;
            case TUESDAY:
                return martes;
            case WEDNESDAY:
                return miercoles;
            case THURSDAY:
                return jueves;
            case FRIDAY:
                return viernes;
            case SATURDAY:
                return sabado;
            default:
                return domingo;
        }
    }
    
    public boolean cargarClaseDia(Clase clase) {
        Clase[] clasesDia = verificarDia(clase.getFecha());
        int cargado = 0;
        boolean estado = false;
        for (int i = 0; i < clasesDia.length; i++) {
            if (clasesDia[i] == null && cargado != 1) {
                clasesDia[i] = clase; 
                cargado++;
                estado = true; // se cargo la clase
            }
        }
        return estado; // no habia lugar
    }
    
    public boolean eliminarClaseDia(Clase claseEliminar, Clase[] clasesDia) {
        for (int i = 0; i < clasesDia.length; i++) {
            if (clasesDia[i] != null && clasesDia[i].equals(claseEliminar)) {
                clasesDia[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public boolean verificarSiSePuedeAgregarClaseDia(LocalDate fecha, int horaInicio, int horaFin) {
        Clase[] clasesDia = verificarDia(fecha);
        return (clasesDia != domingo && verificarEspacio(clasesDia) && verificarHora(fecha, horaInicio, horaFin, clasesDia)); 
    } // true si puede aceptar la clase (espacio y 3 hs de direfencia)
    
    private boolean verificarEspacio(Clase[] clases) {
        boolean estado = false;
        int i = 0;
        while (i < 3) {
            if (clases[i] == null) {
                estado = true;
            }
            i++;
        }
        return estado;
    }

    private boolean verificarHora(LocalDate fecha, int horaInicio, int horaFin, Clase[] clasesDia) {
        boolean estado = false;
        int contador = 0;
        for (Clase clase : clasesDia) {
            int resultado = 0;
            if (clase != null) {
                if (clase.getHoraInicio() >= horaInicio) {
                    resultado += clase.getHoraInicio() - horaFin;
                    if (resultado >= 3) {
                        estado = true;
                    } // si cumple, true
                } else {
                    resultado += horaInicio - clase.getHoraFin();
                    if (resultado >= 3) {
                        estado = true;
                    } // si cumple, true
                }
            } 
            
            if (clase == null) {
                contador++;
            }       
        }
        if (contador == 3) {
            estado = true;
        }
        
        return estado;
    }

}
