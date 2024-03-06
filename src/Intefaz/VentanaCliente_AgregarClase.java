/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Intefaz;

import Aplicacion.Supertlon;
import Negocio.*;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author melidumanski
 */
public class VentanaCliente_AgregarClase extends javax.swing.JFrame {
    private Supertlon controller;
    private Socio socioSeleccionado;
    /**
     * Creates new form VentanaCliente_AgregarClase
     */
    public VentanaCliente_AgregarClase(Supertlon controller, Socio socioSeleccionado) {
        initComponents();
        this.controller = controller;
        this.socioSeleccionado = socioSeleccionado;
        
        List<Clase> Clases = Supertlon.mostrarClases();
        DefaultComboBoxModel<String> opciones1 = new DefaultComboBoxModel<>();
        // Llenar el modelo con representaciones de los objetos Articulo
        if (Clases.isEmpty()) {
            jComboBox1.addItem("NO EXISTEN CLASES");
        } else {
            for (Clase clase : Clases) {
                opciones1.addElement(clase.getId() + " - Actividad: " + clase.getActividad() + " - Profesor: " + clase.getProfesor().getNombre() + " " + clase.getProfesor().getApellido() + " - Horario de: " + clase.getHoraInicio() +" a "+ clase.getHoraFin());
            }
            jComboBox1.setModel(opciones1);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lantinghei TC", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESERVAR LUGAR");

        jLabel2.setFont(new java.awt.Font("Nanum Myeongjo", 0, 14)); // NOI18N
        jLabel2.setText("Seleccionar clase : ");

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton1.setText("Reservar lugar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
        if (!jComboBox1.getSelectedItem().equals("NO EXISTEN CLASES")) {
            String claseCargada = jComboBox1.getSelectedItem().toString();
            String[] partes1 = claseCargada.split("\\ - ");
            int id = Integer.parseInt(partes1[0]);
            Clase claseSeleccionada = Supertlon.buscarClase(id);
            CargaHorariaSocio cargaHoraria = Supertlon.buscarCargaHorariaSocio(socioSeleccionado);
            if (cargaHoraria.agregarClase(claseSeleccionada) && (claseSeleccionada.getConcurrencia() - 1 != 0)) { // si es true, quiere decir que se pudo cargar
                JOptionPane.showMessageDialog(null, "La clase se reservó correctamente.");
            } else if (claseSeleccionada.getConcurrencia() - 1 != 0) {
                JOptionPane.showMessageDialog(null, "La clase no tiene disponibilidad. Intente con otra clase.");
            } else { // si no se pudo cargar es porque ya esta ocupado el día
                JOptionPane.showMessageDialog(null, "El día se encuentra ocupado, intente con otra clase."); 
            }
        } else {
            JOptionPane.showMessageDialog(null, "No existen clases, intente nuevamente más tarde.");
        }
            
            
        
    }//GEN-LAST:event_jButton1ActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
