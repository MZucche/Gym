/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import java.time.DayOfWeek;

/**
 *
 * @author melidumanski
 */
public class CargaHorariaSocio {
    private Socio socio;
    private Clase[] lunes;
    private Clase[] martes;
    private Clase[] miercoles;
    private Clase[] jueves;
    private Clase[] viernes;
    private Clase[] sabado;

    public CargaHorariaSocio(Socio socio) {
        this.socio = socio;
        this.lunes = new Clase[1];
        this.martes = new Clase[1];
        this.miercoles = new Clase[1];
        this.jueves = new Clase[1];
        this.viernes = new Clase[1];
        this.sabado = new Clase[1];
    }

    // toma una instancia de la clase Clase y determina el día de la semana correspondiente a través
    // del método getDayOfWeek() del objeto LocalDate. Luego, utiliza un bloque switch para dirigir la
    // clase al método agregarClaseDia que se encarga de agregar la clase al día de la semana correcto
    public boolean agregarClase(Clase clase) {
        DayOfWeek diaSemanaSocio = clase.getFecha().getDayOfWeek();
        switch (diaSemanaSocio) {
            case MONDAY:
                return agregarClaseDia(clase, lunes);
            case TUESDAY:
                return agregarClaseDia(clase, martes);
            case WEDNESDAY:
                return agregarClaseDia(clase, miercoles);
            case THURSDAY:
                return agregarClaseDia(clase, jueves);
            case FRIDAY:
                return agregarClaseDia(clase, viernes);
            case SATURDAY:
                return agregarClaseDia(clase, sabado);
            default:
                return false;
        }
    }

    public Clase[] getLunes() {
        return lunes;
    }

    public Clase[] getMartes() {
        return martes;
    }

    public Clase[] getMiercoles() {
        return miercoles;
    }

    public Clase[] getJueves() {
        return jueves;
    }

    public Clase[] getViernes() {
        return viernes;
    }

    public Clase[] getSabado() {
        return sabado;
    }
    
    public Socio getSocio() {
        return socio;
    }

    // verifica si hay espacio disponible en el array de clases y si no hay superposición de horarios con
    // las clases existentes. Si se cumplen ambas condiciones, agrega la nueva clase al array y devuelve true.
    // De lo contrario, devuelve false.
    public boolean agregarClaseDia(Clase clase, Clase[] clasesDia) {
        if (clasesDia[0] == null) {
            clase.setConcurrencia(clase.getConcurrencia() -1);
            clasesDia[0] = clase;
            
            return true;
        }
        return false;
    }

    //  Si se encuentra, la eliminamos y luego llamamos a un método adicional reorganizarClases para
    //  reorganizar el array y llenar los posibles espacios vacíos
    public void eliminarClaseDia(Clase claseEliminar, Clase[] clasesDia) {
        if (clasesDia[0] != null) {
            clasesDia[0] = null;
        }
    }
}
