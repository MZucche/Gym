/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplicacion;

/**
 *
 * @author melidumanski
 */
import Negocio.*;
import java.util.*;

public class  Supertlon {
    private static List<Administrativo> administrativos = new ArrayList<>();
    private static Set<String> actividades = new HashSet<>();
    private static Set<String> actividadesOnline = new HashSet<>();
    private static List<ClaseOnLine> clasesOnLine = new ArrayList<>();
    private static List<Profesor> profesores = new ArrayList<>();
    private static List<CargaHorariaProfesor> cargaProfesor = new ArrayList<>();
    private static List<Socio> socios = new ArrayList<>();
    private static List<CargaHorariaSocio> cargaSocio = new ArrayList<>();
    private static List<Sede> sedes = new ArrayList<>();
    private static List<Sede> sedesAdministrativos = new ArrayList<>();
    private static List<Emplazamiento> emplazamientos = new ArrayList<>();
    private static List<Clase> clases = new ArrayList<>();
    private static Set<String> localidades = new HashSet<>();
    private static List<Articulo> articulos = new ArrayList<>();

    // CREACION LISTAS
    
    public static void crearAdministrativo(List<Sede> sedesAsignadas) {
        Administrativo administrativo = new Administrativo(sedesAsignadas);
        administrativos.add(administrativo);
    }

    public void crearLocalidad(String valor) {
        localidades.add(valor);
    }

    public static void crearActividad(String valor) {
        actividades.add(valor);
        
    }

    public void crearActividadOnLine(String valor) {
        actividadesOnline.add(valor);
    }
    
    public int crearClaseOnLine(String actividad, int cantidadClases) {
        ClaseOnLine claseOnLine = new ClaseOnLine(actividad, cantidadClases);
        clasesOnLine.add(claseOnLine);
        crearActividadOnLine(actividad);
        return claseOnLine.getId();
    }

    public void crearProfesor(String nombre, String apellido) {
        Profesor profesor = new Profesor(nombre, apellido);
        profesores.add(profesor);
        CargaHorariaProfesor cargaHorariaProfesor = new CargaHorariaProfesor(profesor);
        cargaProfesor.add(cargaHorariaProfesor);
    }

    public void crearSocio(String nombre, String apellido, TipoSocio tipoSocio) {
        Socio socio = new Socio(nombre, apellido, tipoSocio);
        socios.add(socio);
        CargaHorariaSocio cargaHorariaSocio = new CargaHorariaSocio(socio);
        cargaSocio.add(cargaHorariaSocio);
    }

    public int crearSede(TipoSocio tipoSocio, String localidad, List<Articulo> articulosSede) {
        Sede sede =  new Sede(tipoSocio, localidad, articulosSede);
        sedes.add(sede);
        sedesAdministrativos.add(sede);
        eliminarLocalidad(localidad); // "No se permite mas de una sede en una localidad" 
        return sede.getId();
    }

    public void crearEmplazaminto(int capacidad, Sede sede, TipoEmplazamiento tipoEmplazamiento){
        Emplazamiento emplazamiento = new Emplazamiento(capacidad, sede, tipoEmplazamiento);
        emplazamientos.add(emplazamiento);
    }

    public int crearClase(int year, int month, int day, int horaInicio, int horaFin, Profesor profesor, Sede sede, Emplazamiento emplazamiento, int concurrencia, String actividad, List<Articulo> listaArticulos){
        Clase clase = new Clase(year, month, day, horaInicio, horaFin, profesor, sede, emplazamiento, concurrencia, actividad, listaArticulos);
        clases.add(clase);
        
        return clase.getId();
    }

    public void crearArticulo(String nombre, int year, int month, int day, TipoVidaUtil tipoVidaUtil, int vidaUtil, String marca) {
        Articulo articulo = new Articulo(nombre, year, month, day, tipoVidaUtil, vidaUtil, marca);
        articulos.add(articulo);
    }

    // VERIFICAR EXISTENCIA

    public static boolean existeLocalidad(String x) {
        for (String localidad : localidades) {
            if (localidad.equals(x)) { // existe localidad en la lista localidades
                return true;
            }
        }
        return false;
    }

    public boolean existeActividad(String x) {
        for (String actividad : actividades) {
            if (actividad.equals(x)) { // existe actividad en la lista actividades
                return true;
            }
        }
        return false;
    }

    public boolean existeActividadOnline(String x) {
        for (String actividadOnline : actividadesOnline) {
            if (actividadOnline.equals(x)) { // existe actividadO en la lista actividadesO
                return true;
            }
        }
        return false;
    }


    public boolean existeProfesor(Profesor x) {
        for (Profesor profesor : profesores) {
            if (profesor.equals(x)) { // existe profesor en la lista profesores
                return true;
            }
        }
        return false;
    }

    public boolean existeSocio(Socio x) {
        for (Socio socio : socios) {
            if (socio.equals(x)) { // existe socio en la lista socios
                return true;
            }
        }
        return false;
    }

    public boolean existeSede(Sede x) {
        for (Sede sede : sedes) {
            if (sede.equals(x)) { // existe sede en la lista sedes
                return true;
            }
        }
        return false;
    }

    public boolean existeEmplazamientoEnSede(Emplazamiento e, Sede s) {
        for (Emplazamiento emplazamiento : emplazamientos) {
            if (emplazamiento.getSede().equals(s) && emplazamiento.equals(e)) { // existe emplazamiento en la la sede seleccionada
                return true;
            }
        }
        return false;
    }

    public boolean existeClase(Clase x) {
        for (Clase clase : clases) {
            if (clase.equals(x)) { // existe clase en la lista clases
                return true;
            }
        }
        return false;
    }

    public boolean validarSiExisteArticulo(Articulo x) {
        for (Articulo articulo : articulos) {
            if (articulo.equals(x)) { // existe actividad en la lista actividades
                return true;
            }
        }
        return false;
    }

    // ELIMINACION
    // Todos los datos ingresados por parametro deben de ser correctos. Verificarlos en la interfaz.
    public void eliminarLocalidad(String x) {
         localidades.remove(x);
    }

    public boolean eliminarActividad(String x) { // tividad ingresada por parametro es CORRECTA
        for (String actividad : actividades) {
            if (actividad.equals(x)) {
                actividades.remove(x);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarActividadOnline(String x) { // actividad ingresada por parametro es CORRECTA
        for (String actividadOnline : actividadesOnline) {
            if (actividadOnline.equals(x)) {
                actividadesOnline.remove(x);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarProfesor(Profesor x) {
        for (Profesor profesor : profesores) {
            if (profesor.equals(x)) {
                profesores.remove(x);
                return true;
            }
        }
        return false;
    }

    public static boolean eliminarSocio(Socio x) {
        for (Socio socio : socios) {
            if (socio.equals(x)) {
                socios.remove(x);
                return true;
            }
        }
        return false;
    }

    public static boolean eliminarSede(Sede x) {
        for (Sede sede : sedes) {
            if (sede.equals(x)) {
                sedes.remove(x);
                return true;
            }
        }
        return false;
    }
    
    public static boolean eliminarSedeAdministrativo(Sede x) {
        for (Sede sede : sedesAdministrativos) {
            if (sede.equals(x)) {
                sedesAdministrativos.remove(x);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarEmplazamiento(Emplazamiento x) {
        for (Emplazamiento emplazamiento : emplazamientos) {
            if (emplazamiento.equals(x)) {
                emplazamientos.remove(x);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarClase(Clase x) {
        for (Clase clase : clases) {
            if (clase.equals(x)) {
                clases.remove(x);
                return true;
            }
        }
        return false;
    }
    
    public static boolean eliminarArticulo(Articulo x) {
        for (Articulo articulo : articulos) {
            if (articulo.equals(x)) {
                articulos.remove(x);
                return true;
            }
        }
        return false;
    }
    
    public static boolean eliminarArticuloEnSede(Articulo x, Sede sede) {
        for (Articulo articulo : sede.getArticulos()) {
            if (articulo.equals(x)) {
                sede.eliminarArticulo(articulo);
                return true;
            }
        }
        return false;
    }

    public boolean puedeIngresar(Socio socio, Sede sede) {
        if (sede.getTipoSocio() == TipoSocio.BLACK) { // si la sede acepta BLACK, todos pueden entrar
            return true;
        } else if (sede.getTipoSocio() == TipoSocio.ORO) { // si la sede acepta ORO, oro y platinum pueden entrar
            if (socio.getTipoSocio() == TipoSocio.ORO || socio.getTipoSocio() == TipoSocio.PLATINUM) {
                return true;
            } else {
                return false;
            }
        } else {
            if (socio.getTipoSocio() == TipoSocio.PLATINUM) { // si la sede acepta PLATINUM, solo este puede entrar
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean decrementarArticuloSeleccionado(Articulo articulo) {
        if (articulo.decrementarArticulo()) { // si es true
            return true;
        } else { // si es falso
            this.eliminarArticulo(articulo);
            return false;
        }
    }
    
    public void cambiarEstadoClase(Clase clase, TipoEstado tipoEstado) {
        clase.setTipoEstado(tipoEstado);
    }
    
    public boolean tieneAccesoAdministrativo(Administrativo administrativo, Sede x) {
        for (Sede sede : administrativo.getSedes()) {
            if (sede.equals(x)) {
                return true;
            }
        }
        return false;
    }
    
    public List<Articulo> cuantosArticulosTieneLaSede(Sede sede) {
        return sede.getArticulos();
    }
    
    public TipoVidaUtil tipoDesgasteArticulo(Articulo articulo) {
        return articulo.getTipoVidaUtil();
    }
    
    public int estadoDesgasteArticulo(Articulo articulo) {
        return articulo.getVidaUtil();
    }
    
    public void quitarArticuloSede(Articulo articulo, Sede sede) {
        sede.eliminarArticulo(articulo);
    }
    
    public List<ClaseOnLine> verClasesOnLine() {
        return clasesOnLine;
    }
    
    public static Set<String> mostrarLocalidades() {
        return localidades;
    }
    
    public static List<Articulo> mostrarArticulos() {
        return articulos;
    }
    
    public static List<Sede> mostrarSedes() {
        return sedes;
    }
    
    public static List<Sede> mostrarSedesAdministrativos() {
        return sedesAdministrativos;
    }
    
    public static List<Sede> mostrarSedesDeAdministrativo(Administrativo a) {
        return a.getSedes();
    }
    
    public static List<Administrativo> mostrarAdministrativos() {
        return administrativos;
    }
    
    public static List<Socio> mostrarSocios() {
        return socios;
    }
    
    public static List<Profesor> mostrarProfesores() {
        return profesores;
    }
    
    public static List<Articulo> mostrarArticulosDeSede(Sede sede) {
        return sede.getArticulos();
    }
    
    public static List<Emplazamiento> mostrarEmplazamientosSegunSede(Sede sede) {
        List<Emplazamiento> lista = new ArrayList<>();
        for (Emplazamiento emplazamiento : emplazamientos) {
            if (emplazamiento.getSede().equals(sede)) {
                lista.add(emplazamiento);
            }
        }
        return lista;
    }
    
    public static List<Clase> mostrarClases(){
        return clases;
    }
    
    public static List<Clase> mostrarClasesSegunSede(Sede sede) {
        List<Clase> lista = new ArrayList<>();
        for (Clase clase : clases) {
            if (clase.getSede().equals(sede)) {
                lista.add(clase);
            }
        }
        return lista;
    }
    
    public static Set<String> mostrarActividades() {
        return actividades;
    }
    
    public static Set<String> mostrarActividadesOnline() {
        return actividadesOnline;
    }
    
    public static List<Clase> mostrarClasesOnlineDeActividad(String actividad) {
        List<Clase> lista = new ArrayList<>();
        for (ClaseOnLine claseOnLine : clasesOnLine) {
            if (claseOnLine.getActividad().equals(actividad)) {
                lista = claseOnLine.getClases();
            }
        }
        return lista;
    }
    
    public static Articulo buscarArticulo (int id) {
        Articulo articuloEncontrado = null;
        for (Articulo articulo : articulos) {
            if (articulo.getId() == id) {
                articuloEncontrado = articulo;
                break;
            }
        }
        return articuloEncontrado;
    }
    
    public static Clase buscarClase (int id) {
        Clase claseEncontrada = null;
        for (Clase clase : clases) {
            if (clase.getId() == id) {
                claseEncontrada = clase;
                break;
            }
        }
        return claseEncontrada;
    }
    
    public static ClaseOnLine buscarClaseOnline(String actividad) {
        ClaseOnLine claseEncontrada = null;
        for (ClaseOnLine clase : clasesOnLine) {
            if (clase.getActividad().equals(actividad)) {
                claseEncontrada = clase;
                break;
            }
        }
        return claseEncontrada;
    } 
    
    public static Articulo buscarArticuloEnSede (int id, Sede sede) {
        Articulo articuloEncontrado = null;
        for (Articulo articulo : sede.getArticulos()) {
            if (articulo.getId() == id) {
                articuloEncontrado = articulo;
                break;
            }
        }
        return articuloEncontrado;
    }
    
    public static Socio buscarSocio (int id) {
        Socio socioEncontrado = null;
        for (Socio socio : socios) {
            if (socio.getId() == id) {
                socioEncontrado = socio;
                break;
            }
        }
        return socioEncontrado;
    }
    
    public static CargaHorariaProfesor buscarCargaHorariaProfesor(Profesor profesor) {
        CargaHorariaProfesor cargaHoraria = null;
        for (CargaHorariaProfesor cargaHorariaProfesor : cargaProfesor) {
            if (cargaHorariaProfesor.getProfesor().equals(profesor)) {
                cargaHoraria = cargaHorariaProfesor;
            }
        }
        return cargaHoraria;
    }
    
    public static CargaHorariaSocio buscarCargaHorariaSocio(Socio socio) {
        CargaHorariaSocio cargaHoraria = null;
        for (CargaHorariaSocio cargaHorariaSocio : cargaSocio) {
            if (cargaHorariaSocio.getSocio().equals(socio)) {
                cargaHoraria = cargaHorariaSocio;
            }
        }
        return cargaHoraria;
    }
        
    public static Emplazamiento buscarEmplazamiento (int id) {
        Emplazamiento emplazamientoEncontrado = null;
        for (Emplazamiento emplazamiento : emplazamientos) {
            if (emplazamiento.getId() == id) {
                emplazamientoEncontrado = emplazamiento;
                break;
            }
        }
        return emplazamientoEncontrado;
    }
    
    public static Sede buscarSede (int id) {
        Sede sedeEncontrada = null;
        for (Sede sede : sedes) {
            if (sede.getId() == id) {
                sedeEncontrada = sede;
                break;
            }
        }
        return sedeEncontrada;
    }
    
    public static Profesor buscarProfesor (int id) {
        Profesor profesorEncontrado = null;
        for (Profesor profesor : profesores) {
            if (profesor.getId() == id) {
                profesorEncontrado = profesor;
                break;
            }
        }
        return profesorEncontrado;
    }
    
    public static Administrativo buscarAdministrativo (int id) {
        Administrativo AdministrativoEncontrado = null;
        for (Administrativo administrativo : administrativos) {
            if (administrativo.getId() == id) {
                AdministrativoEncontrado = administrativo;
                break;
            }
        }
        return AdministrativoEncontrado;
    }
        
    public static TipoVidaUtil buscarTipoVidaUtilDeArticulo(Articulo articulo) {
       return articulo.getTipoVidaUtil();
    }
    
    public static void agregarArticuloAClase(Clase clase, Articulo articulo) {
        clase.agregarArticulo(articulo);
    }
    
    public static int calcularDesgaste(Articulo articulo) {
        return articulo.desgaste();
    }
    
    public static void cambiarTipoSocioDelSocio(Socio socio, TipoSocio tipo) {
        socio.setTipoSocio(tipo);
    }
    
    public static void cambiarNombreDelSocio(Socio socio, String nombre) {
        socio.setNombre(nombre);
    }
    
    public static void cambiarApellidoDelSocio(Socio socio, String apellido) {
        socio.setApellido(apellido);
    }
    
}
