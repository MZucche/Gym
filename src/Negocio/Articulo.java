/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import java.time.*;

/**
 *
 * @author melidumanski
 */
public class Articulo {
    private static int contador;
    private int id;
    private String nombre;
    private LocalDate fechaFabricacion;
    private TipoVidaUtil tipoVidaUtil;
    private int vidaUtil; // DIAS o USOS
    private String marca;

    public Articulo(String nombre, int year, int month, int day, TipoVidaUtil tipoVidaUtil, int vidaUtil, String marca) {
        contador++;
        this.id = contador;
        this.nombre = nombre;
        this.fechaFabricacion = LocalDate.of(year, month, day);
        this.tipoVidaUtil = tipoVidaUtil;
        this.vidaUtil = vidaUtil;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public TipoVidaUtil getTipoVidaUtil() {
        return tipoVidaUtil;
    }

    public void setTipoVidaUtil(TipoVidaUtil tipoVidaUtil) {
        this.tipoVidaUtil = tipoVidaUtil;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int[] dividirFecha() {
        int[] arregloFecha = new int[3];
        arregloFecha[0] = this.fechaFabricacion.getYear();
        arregloFecha[1] = this.fechaFabricacion.getMonthValue();
        arregloFecha[2] = this.fechaFabricacion.getDayOfMonth();
        return arregloFecha;
    }

    public boolean decrementarArticulo() {
        boolean estado;
        if (getTipoVidaUtil() == TipoVidaUtil.FECHA_FABRICACION) {
            int[] arreglo = dividirFecha();
            LocalDate fecha1 = LocalDate.of(arreglo[0], arreglo[1], arreglo[2]); // Primera fecha
            LocalDate fecha2 = LocalDate.now(); // Segunda fecha (fecha actual)

            // Calcular la diferencia de días entre las dos fechas
            Period periodo = Period.between(fecha1, fecha2);
            int diferenciaEnDias = periodo.getDays();
            if (diferenciaEnDias > getVidaUtil()) {
                estado = false; // se quedo sin vida util, debemos eliminarlo
                // Supertlon.eliminarArticulo();
            } else {
                estado = true; // tiene vida util aún, debemos disminuirle la cantidad de días de vida util
                this.vidaUtil = vidaUtil - diferenciaEnDias;
            }
        } else { // si es TipoVidaUtil.USO
            this.vidaUtil = vidaUtil - 1;
            if (vidaUtil == -1) {
                estado = false;
                // Supertlon.eliminarArticulo();
            } else {
                estado = true;
            }
        }
        return estado;
    }
    
    public int desgaste() {
        int resultado = 0;
        if (getTipoVidaUtil() == TipoVidaUtil.FECHA_FABRICACION) {
            int[] arreglo = dividirFecha();
            LocalDate fecha1 = LocalDate.of(arreglo[0], arreglo[1], arreglo[2]); // Primera fecha
            LocalDate fecha2 = LocalDate.now(); // Segunda fecha (fecha actual)

            // Calcular la diferencia de días entre las dos fechas
            Period periodo = Period.between(fecha1, fecha2);
            resultado = periodo.getDays();
        } else {
            resultado = vidaUtil;
            }
        return resultado;
    }
}
