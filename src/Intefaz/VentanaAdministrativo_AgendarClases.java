/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Intefaz;

import Aplicacion.Supertlon;
import static Intefaz.VentanaSoporteTecnico_CargarArticulo.getDaysInMonth;
import Negocio.*;
import java.time.LocalDate;
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author melidumanski
 */
public class VentanaAdministrativo_AgendarClases extends javax.swing.JFrame {
    private Supertlon controller;
    private Sede sedeSeleccionada;
    private List<Articulo> listaArticulos = new ArrayList<>();
    private Administrativo administrativo;
    /**
     * Creates new form VentanaAdministrativo_AgendarClases
     */
    public VentanaAdministrativo_AgendarClases(Supertlon controller, Sede sedeSeleccionada, Administrativo administrativo) {
        initComponents();
        this.controller = controller;
        this.sedeSeleccionada = sedeSeleccionada;
        this.administrativo = administrativo;
        
        ((AbstractDocument) day.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (string.matches("\\d*")) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (text.matches("\\d*")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
        
        ((AbstractDocument) month.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (string.matches("\\d*")) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (text.matches("\\d*")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
        
        ((AbstractDocument) year.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (string.matches("\\d*")) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (text.matches("\\d*")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
        
        List<Profesor> Profesores = Supertlon.mostrarProfesores();
        DefaultComboBoxModel<String> opciones1 = new DefaultComboBoxModel<>();
        // Llenar el modelo con representaciones de los objetos Articulo
        if (Profesores.isEmpty()) {
                jComboBox1.addItem("NO EXISTEN PROFESORES");
        } else {
            for (Profesor profesor : Profesores) {
                String idP = String.valueOf(profesor.getId());
                opciones1.addElement(idP + " - " + profesor.getNombre() + " " + profesor.getApellido());
            }
            jComboBox1.setModel(opciones1); 
        }
        
        List<Emplazamiento> Emplazamientos = Supertlon.mostrarEmplazamientosSegunSede(this.sedeSeleccionada);
        DefaultComboBoxModel<String> opciones2 = new DefaultComboBoxModel<>();
        // Llenar el modelo con representaciones de los objetos Articulo
        if (Emplazamientos.isEmpty()) {
                jComboBox2.addItem("NO EXISTEN EMPLAZAMIENTOS");
        } else {
            for (Emplazamiento emplazamiento : Emplazamientos) {
                String idE = String.valueOf(emplazamiento.getId());
                opciones2.addElement(idE + " - " + emplazamiento.getTipoEmplazamiento());
            }
            jComboBox2.setModel(opciones2); 
        }
        
        Set<String> Actividades = Supertlon.mostrarActividades();
        DefaultComboBoxModel<String> opciones4 = new DefaultComboBoxModel<>();
        // Llenar el modelo con representaciones de los objetos Articulo
        if (Actividades.isEmpty()) {
                jComboBox4.addItem("NO EXISTEN ACTIVIDADES");
        } else {
            for (String actividad : Actividades) {
                opciones4.addElement(actividad);
            }
            jComboBox4.setModel(opciones4); 
        }
        
        List<Articulo> Articulos = Supertlon.mostrarArticulosDeSede(sedeSeleccionada);
        DefaultComboBoxModel<String> opciones5 = new DefaultComboBoxModel<>();
        // Llenar el modelo con representaciones de los objetos Articulo
        if (Articulos.isEmpty()) {
                jComboBox5.addItem("NO EXISTEN ARTICULOS");
        } else {
            for (Articulo articulo : Articulos) {
                String idA = String.valueOf(articulo.getId());
                opciones5.addElement(idA + " - " + "Nombre: " + articulo.getNombre() + " - Marca: " + articulo.getMarca());
            }
            jComboBox5.setModel(opciones5); 
        }       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        month = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        horaInicio = new javax.swing.JComboBox<>();
        horaFin = new javax.swing.JComboBox<>();
        minutosInicio = new javax.swing.JComboBox<>();
        minutosFin = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lantinghei TC", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGENDAR CLASE");

        jLabel2.setFont(new java.awt.Font("Nanum Myeongjo", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese fecha :");

        jLabel3.setFont(new java.awt.Font("Nanum Myeongjo", 0, 14)); // NOI18N
        jLabel3.setText("Hora Inicio :");

        jLabel4.setFont(new java.awt.Font("Nanum Myeongjo", 0, 14)); // NOI18N
        jLabel4.setText("Hora Fin :");

        jComboBox1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Nanum Myeongjo", 0, 14)); // NOI18N
        jLabel5.setText("Seleccione Profesor :");

        day.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        day.setText("DD");

        month.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        month.setText("MM");

        year.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        year.setText("AAAA");

        jLabel6.setFont(new java.awt.Font("Nanum Myeongjo", 0, 14)); // NOI18N
        jLabel6.setText("Seleccione Emplazamiento :");

        jComboBox2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        jComboBox3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        jLabel7.setFont(new java.awt.Font("Nanum Myeongjo", 0, 14)); // NOI18N
        jLabel7.setText("Seleccione Concurrencia : ");

        jLabel8.setFont(new java.awt.Font("Nanum Myeongjo", 0, 14)); // NOI18N
        jLabel8.setText("Seleccione Actividad :");

        jComboBox4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Nanum Myeongjo", 0, 14)); // NOI18N
        jLabel9.setText("Seleccione Artículos :");

        jComboBox5.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jButton1.setText("Agregar Artículo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton2.setText("Agendar Clase");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        horaInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22" }));

        horaFin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22" }));

        minutosInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));
        minutosInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minutosInicioActionPerformed(evt);
            }
        });

        minutosFin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(horaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minutosInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(jLabel4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(horaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minutosFin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(horaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minutosInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minutosFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minutosInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minutosInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minutosInicioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String dayCargado = day.getText();
        String monthCargado = month.getText();
        String yearCargado = year.getText();
        
        int HI = Integer.valueOf(horaInicio.getSelectedItem().toString());
        int HF = Integer.valueOf(horaFin.getSelectedItem().toString());
 
        int dayINT = Integer.valueOf(dayCargado);
        int monthINT = Integer.valueOf(monthCargado);
        int yearINT = Integer.valueOf(yearCargado);
        
        LocalDate currentDate = LocalDate.now();
        int yearLimite = currentDate.getYear();
        int monthLimite = currentDate.getMonthValue();
        int dayLimite = currentDate.getDayOfMonth();
        
        if (!isNumeric(dayCargado) || !isNumeric(monthCargado) || !isNumeric(yearCargado)) { // isNumeric debido al DD MM AAAA
            JOptionPane.showMessageDialog(null, "Los valores de la fecha no pueden ser nulos. No se pudo cargar Clase.");
        } else if ((monthINT > 12 || monthINT < 1) || (yearLimite == yearINT && monthLimite > monthINT) ) {
            JOptionPane.showMessageDialog(null, "Valor de mes cargado incorrecto. No se pudo cargar Clase.");
        } else if (yearINT != yearLimite) {
            JOptionPane.showMessageDialog(null, "Los año válido es el actual. No se pudo cargar Clase.");
        } else if ((yearLimite == yearINT && monthLimite == monthINT && dayLimite > dayINT) || (dayINT > getDaysInMonth(yearINT, monthINT))) {
            JOptionPane.showMessageDialog(null, "El día ingresado no es válido. No se pudo cargar Clase.");
        } else {
            LocalDate fecha = LocalDate.of(yearINT, monthINT, dayINT);
            
            if ((HF - HI) <= 0) {
                JOptionPane.showMessageDialog(null, "La hora inicio y la hora fin debe ser válida. No se pudo cargar Clase.");
            } else {
                String profesorCargado = jComboBox1.getSelectedItem().toString();
                if (profesorCargado.equals("NO EXISTEN PROFESORES")) {
                    JOptionPane.showMessageDialog(null, "No existen profesores, intente nuevamente más tarde. No se pudo cargar Clase.");
                } else {
                    String[] partes = profesorCargado.split("\\ - "); // separo string de JComboBox para tener ID
                    int idProfesor = Integer.parseInt(partes[0]);
                    Profesor profesor = Supertlon.buscarProfesor(idProfesor);
                    CargaHorariaProfesor cargaHoraria = Supertlon.buscarCargaHorariaProfesor(profesor);
                    if (!cargaHoraria.verificarSiSePuedeAgregarClaseDia(fecha, HI, HF)) { // si no es true es que no tiene espacio
                        JOptionPane.showMessageDialog(null, "El profesor no esta disponible. No se pudo cargar Clase.");                        
                    } else {
                        String emplazamientoCargado = jComboBox2.getSelectedItem().toString();
                        if (emplazamientoCargado.equals("NO EXISTEN EMPLAZAMIENTOS")) {
                            JOptionPane.showMessageDialog(null, "No existen emplazamientos, intente nuevamente más tarde. No se pudo cargar Clase.");
                        } else {
                            String[] partesEmplazamiento = emplazamientoCargado.split("\\ - "); // separo string de JComboBox para tener ID
                            int idEmplazamiento = Integer.parseInt(partesEmplazamiento[0]);
                            Emplazamiento emplazamiento = Supertlon.buscarEmplazamiento(idEmplazamiento);
                            int concurrencia = Integer.parseInt(jComboBox3.getSelectedItem().toString());
                            if (emplazamiento.getCapacidad() < concurrencia) {
                                JOptionPane.showMessageDialog(null, "La concurrencia máxima del emplazamiento cargado es: " + emplazamiento.getCapacidad() +  ". No se pudo cargar Clase.");
                            } else {
                                String actividad = jComboBox4.getSelectedItem().toString();
                                if (actividad.equals("NO EXISTEN ACTIVIDADES")) {
                                    JOptionPane.showMessageDialog(null, "No existen actividades, intente nuevamente más tarde. No se pudo cargar Clase.");
                                } else {
                                    int idClase = controller.crearClase(yearINT, monthINT, dayINT, HI, HF, profesor, sedeSeleccionada, emplazamiento, concurrencia, actividad, listaArticulos);
                                    Clase clase = Supertlon.buscarClase(idClase);
                                    if (controller.existeActividadOnline(clase.getActividad())) {
                                        ClaseOnLine claseOnline = Supertlon.buscarClaseOnline(actividad);
                                        claseOnline.agregarClase(clase);
                                    }
                                    cargaHoraria.cargarClaseDia(clase); 
                                    JOptionPane.showMessageDialog(null, "La Clase se agendó con éxito!");
                                    if (listaArticulos.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "La Clase se agendó sin Artículos.");
                                    }
                                    listaArticulos = new ArrayList<>();
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int num = jComboBox5.getSelectedIndex();
        if (jComboBox5.getSelectedItem().equals("NO EXISTEN ARTICULOS")) {
            JOptionPane.showMessageDialog(null, "No existen articulos, intente más tarde.");       
        } else { 
            String seleccionado = jComboBox5.getSelectedItem().toString(); // agarro la opcion seleccionada
            String[] partes = seleccionado.split("\\ - "); // separo string de JComboBox para tener ID
            int id = Integer.parseInt(partes[0]); // guardo el ID para buscarlo en la lista de Sedes
            Articulo articulo = Supertlon.buscarArticuloEnSede(id, sedeSeleccionada);
            this.listaArticulos.add(articulo);
            Supertlon.eliminarArticuloEnSede(articulo, sedeSeleccionada);
            jComboBox5.removeItemAt(num);
        }
        if (jComboBox5.getItemCount() == 0) {
            jComboBox5.addItem("NO EXISTEN ARTICULOS");
        }
     
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField day;
    private javax.swing.JComboBox<String> horaFin;
    private javax.swing.JComboBox<String> horaInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> minutosFin;
    private javax.swing.JComboBox<String> minutosInicio;
    private javax.swing.JTextField month;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
private static boolean isNumeric(String str) {
    // Verifica si la cadena es nula o vacía antes de aplicar la expresión regular
    return str != null && str.matches("\\d+");
    } // false si cadena vacia "" y false si la cadena no tiene solo valores numericos

}
