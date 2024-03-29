/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Intefaz;

import Aplicacion.Supertlon;
import Negocio.*;
import java.util.*;
import javax.swing.DefaultListModel;

/**
 *
 * @author melidumanski
 */
public class VentanaAdministrativo_ClasesStreaming extends javax.swing.JFrame {
    private Supertlon controller;
    private Sede sedeSeleccionada;
    /**
     * Creates new form VentanaAdministrativo_ClasesStreaming
     */
    public VentanaAdministrativo_ClasesStreaming(Supertlon controller, Sede sedeSeleccionada) {
        initComponents();
        this.controller = controller;
        this.sedeSeleccionada = sedeSeleccionada;
        
        Set<String> Actividades = Supertlon.mostrarActividadesOnline();
        DefaultListModel<String> opciones1 = new DefaultListModel<>();

        if (Actividades.isEmpty()) {
            opciones1.addElement("NO EXISTEN CLASES EN STREAMING");
        } else {
            for (String actividad : Actividades) {
                ClaseOnLine claseOnLine = Supertlon.buscarClaseOnline(actividad);
                List<Clase> Clases = claseOnLine.getClases();
                if (!Clases.isEmpty()) {
                    for (Clase clase : Clases) {
                        opciones1.addElement("Actividad: " + actividad + " - ID clase: " + clase.getId() + " - Profesor: " + clase.getProfesor().getNombre() + " " + clase.getProfesor().getApellido());
                    }
                }
            }
        }
        jList1.setModel(opciones1);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lantinghei TC", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLASES STREAMING ALMACENADAS");

        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
