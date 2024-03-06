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
public class VentanaAdministrativo_OpcionesClases extends javax.swing.JFrame {
    private Supertlon controller;
    private Sede sedeSeleccionada;
    private Administrativo administrativo;
    private TipoEstado tipoEstado;
    
    /**
     * Creates new form VentanaAdministrativo_Clases
     */
    public VentanaAdministrativo_OpcionesClases(Supertlon controller, Sede sedeSeleccionada, Administrativo administrativo) {
        initComponents();
        this.controller = controller;
        this.sedeSeleccionada = sedeSeleccionada;
        this.administrativo = administrativo;
                
        List<Clase> Clases = Supertlon.mostrarClasesSegunSede(this.sedeSeleccionada);
        DefaultComboBoxModel<String> opciones1 = new DefaultComboBoxModel<>();
        // Llenar el modelo con representaciones de los objetos Articulo
        if (Clases.isEmpty()) {
                jComboBox1.addItem("NO EXISTEN CLASES");
                jComboBox3.addItem("NO EXISTEN CLASES");
        } else {
            for (Clase clase : Clases) {
                String idC = String.valueOf(clase.getId());
                opciones1.addElement(idC + " - " + clase.getActividad());
            }
            jComboBox1.setModel(opciones1); 
            jComboBox3.setModel(opciones1); 
        }
        
        List<Articulo> Articulos = Supertlon.mostrarArticulosDeSede(sedeSeleccionada);
        DefaultComboBoxModel<String> opciones4 = new DefaultComboBoxModel<>();
        // Llenar el modelo con representaciones de los objetos Articulo
        if (Articulos.isEmpty()) {
                jComboBox4.addItem("NO EXISTEN ARTICULOS");
        } else {
            for (Articulo articulo : Articulos) {
                String idA = String.valueOf(articulo.getId());
                opciones4.addElement(idA + " - " + "Nombre: " + articulo.getNombre() + " - Marca: " + articulo.getMarca());
            }
            jComboBox4.setModel(opciones4); 
        }   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lantinghei TC", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("OPCIONES CLASES");

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jButton1.setText("Agendar Clase");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jButton2.setText("Transicionar Estado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jButton3.setText("Incorporar Artículos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nanum Myeongjo", 0, 14)); // NOI18N
        jLabel2.setText("Seleccionar clase :");

        jLabel3.setFont(new java.awt.Font("Nanum Myeongjo", 0, 14)); // NOI18N
        jLabel3.setText("2) Transicionar Estado de clase seleccionada");

        jLabel4.setFont(new java.awt.Font("Nanum Myeongjo", 0, 14)); // NOI18N
        jLabel4.setText("Seleccionar estado :");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agendada", "Confirmada", "Finalizada" }));

        jLabel5.setFont(new java.awt.Font("Nanum Myeongjo", 0, 14)); // NOI18N
        jLabel5.setText("1) Agendar nueva clase");

        jLabel6.setFont(new java.awt.Font("Nanum Myeongjo", 0, 14)); // NOI18N
        jLabel6.setText("3) Incorporar artículo a clase");

        jLabel7.setFont(new java.awt.Font("Nanum Myeongjo", 0, 14)); // NOI18N
        jLabel7.setText("Seleccionar clase :");

        jLabel8.setFont(new java.awt.Font("Nanum Myeongjo", 0, 14)); // NOI18N
        jLabel8.setText("Seleccionar Artículo :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(9, 9, 9)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VentanaAdministrativo_AgendarClases ventanaAdministrativo_AgendarClases = new VentanaAdministrativo_AgendarClases(controller, sedeSeleccionada, administrativo);
        ventanaAdministrativo_AgendarClases.setLocationRelativeTo(null);
        ventanaAdministrativo_AgendarClases.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        if (!jComboBox1.getSelectedItem().equals("NO EXISTEN CLASES")) {
            String estado = jComboBox2.getSelectedItem().toString();
            String claseCargada = jComboBox1.getSelectedItem().toString();
            String[] partes = claseCargada.split("\\ - ");
            int id = Integer.parseInt(partes[0]);
            Clase claseSeleccionada = Supertlon.buscarClase(id);

            if (estado.equals("Agendada")) { // selecciono opcion TipoSocio correcta
                tipoEstado = TipoEstado.AGENDADA;
            } else if (estado.equals("Finalizada")) {
                tipoEstado = TipoEstado.FINALIZADA;
            } else {
                tipoEstado = TipoEstado.CONFIRMADA;
            }
            
            controller.cambiarEstadoClase(claseSeleccionada, tipoEstado);
            JOptionPane.showMessageDialog(null, "Se transicionó estado correctamente!");
        } else {
            JOptionPane.showMessageDialog(null, "No existen clases. Intente más tarde.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (!jComboBox3.getSelectedItem().equals("NO EXISTEN CLASES") && !jComboBox4.getSelectedItem().equals("NO EXISTEN ARTICULOS")) {
            String claseCargada = jComboBox3.getSelectedItem().toString();
            String[] partes1 = claseCargada.split("\\ - ");
            int id1 = Integer.parseInt(partes1[0]);
            Clase claseSeleccionada = Supertlon.buscarClase(id1);
            
            int num = jComboBox4.getSelectedIndex();
            String articuloCargado = jComboBox4.getSelectedItem().toString();
            String[] partes2 = articuloCargado.split("\\ - ");
            int id2 = Integer.parseInt(partes2[0]);
            Articulo articuloSeleccionado = Supertlon.buscarArticuloEnSede(id2, sedeSeleccionada);
            Supertlon.eliminarArticuloEnSede(articuloSeleccionado, sedeSeleccionada);
            jComboBox4.removeItemAt(num);
            
            Supertlon.agregarArticuloAClase(claseSeleccionada, articuloSeleccionado);
            JOptionPane.showMessageDialog(null, "Se agregó articulo correctamente!.");
        } else if (jComboBox3.getSelectedItem().equals("NO EXISTEN CLASES")) {
            JOptionPane.showMessageDialog(null, "No existen clases. Intente más tarde.");
        } else {
            JOptionPane.showMessageDialog(null, "No existen articulos. Intente más tarde.");
        }
        if (jComboBox4.getItemCount() == 0) {
            jComboBox4.addItem("NO EXISTEN ARTICULOS");
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
