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
public class VentanaAdministrativo extends javax.swing.JFrame {
    private Supertlon controller;
    private int id;
    private Socio socioSeleccionado;
    private Sede sedeSeleccionada;
    private Administrativo administrativo;
    /**
     * Creates new form VentanaAdministracion
     */
    public VentanaAdministrativo(Supertlon controller, int idAdministrativo) {
        initComponents();
        this.controller = controller;
        this.id = idAdministrativo;
        this.administrativo = Supertlon.buscarAdministrativo(idAdministrativo);

        List<Sede> Sedes = Supertlon.mostrarSedesDeAdministrativo(administrativo);
        DefaultComboBoxModel<String> opciones1 = new DefaultComboBoxModel<>();
        // Llenar el modelo con representaciones de los objetos Articulo
        
        if (Sedes.isEmpty()) {
            jComboBox1.addItem("NO EXISTEN SEDES");
        } else {
            for (Sede sede : Sedes) {
                opciones1.addElement(sede.getId() + " - " + sede.getLocalidad());
            }
            jComboBox1.setModel(opciones1);
        }
        
        List<Socio> socios = Supertlon.mostrarSocios();
        DefaultComboBoxModel<String> opciones2 = new DefaultComboBoxModel<>();
        // Llenar el modelo con representaciones de los objetos Articulo
        if (socios.isEmpty()) {
            jComboBox2.addItem("NO EXISTEN SOCIOS");
        } else {
            for (Socio socio : socios) {
                opciones2.addElement(socio.getId() + " - " + socio.getNombre() + " " + socio.getApellido());
            }
            jComboBox2.setModel(opciones2);
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

        titulo = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Lantinghei TC", 0, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("ADMINISTRATIVO");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton1.setText("Opciones Clases");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton2.setText("Alta Nuevo Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton3.setText("Opciones Artículo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton4.setText("Clases Streaming");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Nanum Myeongjo", 0, 14)); // NOI18N
        jLabel1.setText("Seleccione la Sede la cual desea consultar :");

        jLabel2.setFont(new java.awt.Font("Nanum Myeongjo", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione Cliente :");

        jButton5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton5.setText("Baja Cliente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton6.setText("Modificar Cliente ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jComboBox2, 0, 196, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addComponent(jLabel1))))
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VentanaSoporteTecnico_CargarUsuario_Cliente ventanaSoporteTecnico_CargarUsuario_Cliente = new VentanaSoporteTecnico_CargarUsuario_Cliente(controller);
        ventanaSoporteTecnico_CargarUsuario_Cliente.setLocationRelativeTo(null);
        ventanaSoporteTecnico_CargarUsuario_Cliente.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int num = jComboBox2.getSelectedIndex();
        
        if (jComboBox2.getSelectedItem().equals("NO EXISTEN SOCIOS")) {
            JOptionPane.showMessageDialog(null, "No existen socios. Intente nuevamente más tarde.");
        } else {
            String seleccionado = jComboBox2.getSelectedItem().toString();
            String[] partes = seleccionado.split("\\ - ");
            int idSocio = Integer.parseInt(partes[0]);
            socioSeleccionado = Supertlon.buscarSocio(idSocio);
            Supertlon.eliminarSocio(socioSeleccionado);
            jComboBox2.removeItemAt(num);
        }
        
        if (jComboBox2.getItemCount() == 0) {
            jComboBox2.addItem("NO EXISTEN SOCIOS");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sedeCargada = jComboBox1.getSelectedItem().toString();
        String[] partes = sedeCargada.split("\\ - ");
        int idSede = Integer.parseInt(partes[0]);
        sedeSeleccionada = Supertlon.buscarSede(idSede);
        VentanaAdministrativo_OpcionesClases ventanaAdministrativo_Clases = new VentanaAdministrativo_OpcionesClases(controller, sedeSeleccionada, administrativo);
        ventanaAdministrativo_Clases.setLocationRelativeTo(null);
        ventanaAdministrativo_Clases.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String sedeCargada = jComboBox1.getSelectedItem().toString();
        String[] partes = sedeCargada.split("\\ - ");
        int idSede = Integer.parseInt(partes[0]);
        sedeSeleccionada = Supertlon.buscarSede(idSede);
        VentanaAdministrativo_Articulos ventanaAdministrativo_Articulos = new VentanaAdministrativo_Articulos(controller, sedeSeleccionada);
        ventanaAdministrativo_Articulos.setLocationRelativeTo(null);
        ventanaAdministrativo_Articulos.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        VentanaAdministrativo_ClasesStreaming ventanaAdministrativo_ClasesStreaming = new VentanaAdministrativo_ClasesStreaming(controller, sedeSeleccionada);
        ventanaAdministrativo_ClasesStreaming.setLocationRelativeTo(null);
        ventanaAdministrativo_ClasesStreaming.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String socioCargado = jComboBox2.getSelectedItem().toString();
        if (socioCargado.equals("NO EXISTEN SOCIOS")) {
            JOptionPane.showMessageDialog(null, "No existen socios. Intente nuevamente más tarde.");
        } else {
        String[] partes = socioCargado.split("\\ - ");
        int idSocio = Integer.parseInt(partes[0]);
        socioSeleccionado = Supertlon.buscarSocio(idSocio);
        VentanaAdministrativo_ModificarCliente ventanaAdministrativo_ModificarCliente = new VentanaAdministrativo_ModificarCliente(controller, socioSeleccionado);
        ventanaAdministrativo_ModificarCliente.setLocationRelativeTo(null);
        ventanaAdministrativo_ModificarCliente.setVisible(true);
        }
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
