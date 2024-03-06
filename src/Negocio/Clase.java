/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author melidumanski
 */
public class Clase {
    private static int contador;
    private int id;
    private LocalDate fecha; // analizarlo que el tema de la amortización del articulo.
    private int horaInicio; // de 7 am a 22 pm.
    private int horaFin;
    private Profesor profesor; // verificar que exista. verificar que este disponible --> LocalDate y getDayOfWeek()
    private Sede sede; // verificar que exista
    private Emplazamiento emplazamiento; // verificar que exista en la sede
    private int concurrencia; // no sea mayor a 30 ni a la cantidad respectiva del emplazamiento.
    private String actividad; // verificar que exista.
    private TipoEstado tipoEstado; // estado de la clase, se crea con un estado AGENDADA.
    private List<Articulo> listaArticulos = new ArrayList<>(); // lista general de articulos. Debo quitarlos de la lista general
    // de supertlon ya que serán utilizados aquí.
    // antes de cargarlos debo verificar que tengan vida util.

    public Clase(int year, int month, int day, int horaInicio, int horaFin, Profesor profesor, Sede sede, Emplazamiento emplazamiento, int concurrencia, String actividad, List<Articulo> listaArticulos) {
        contador++;
        this.id = contador;
        this.fecha =  LocalDate.of(year, month, day);
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.profesor = profesor;
        this.sede = sede;
        this.emplazamiento = emplazamiento;
        this.concurrencia = concurrencia;
        this.actividad = actividad;
        this.tipoEstado = TipoEstado.AGENDADA;
        this.listaArticulos = listaArticulos;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public Emplazamiento getEmplazamiento() {
        return emplazamiento;
    }

    public void setEmplazamiento(Emplazamiento emplazamiento) {
        this.emplazamiento = emplazamiento;
    }

    public int getConcurrencia() {
        return concurrencia;
    }

    public void setConcurrencia(int concurrencia) {
        this.concurrencia = concurrencia;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public TipoEstado getTipoEstado() {
        return tipoEstado;
    }

    public void setTipoEstado(TipoEstado tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    public List<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public void agregarArticulo(Articulo articulo) {
        listaArticulos.add(articulo);
    }
}
