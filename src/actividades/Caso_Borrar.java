/** CASO_BORRAR.
 * Mostrara la información de todos los casos y podra eliminarlos cuando se requiera
 */

package actividades;

import actividades_classes.PanelTitle;
import interfaces.Actividades;
import helpers.Sonidos;
import java.awt.BorderLayout;
import modelos.Alarma;

/**
 * @author Juan Pablo Figueroa.
 * @author Mendoza Castañeda José Ricardo.
 */

public class Caso_Borrar extends javax.swing.JFrame {

    private int id = 1;
    
    public Caso_Borrar() {
        initComponents();
        
        // Sonido.
        Sonidos objeto = new Sonidos();
        objeto.Caso_Borrar();
        
        setLocationRelativeTo(null);
    }

    public void mostrarData( String tipo ) {
        panel_principal.removeAll();

        PanelTitle panel = new PanelTitle( this.id, tipo, true );
    
        panel_principal.add(panel, BorderLayout.CENTER);
        
        panel_principal.revalidate();
        panel_principal.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_titulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_actions = new javax.swing.JPanel();
        btnFam = new javax.swing.JButton();
        btnPasatiempos = new javax.swing.JButton();
        btnMedicinas = new javax.swing.JButton();
        btnAlarmas = new javax.swing.JButton();
        jButton_Volver = new javax.swing.JButton();
        panel_info = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel_principal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_titulo.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Borrar");

        javax.swing.GroupLayout panel_tituloLayout = new javax.swing.GroupLayout(panel_titulo);
        panel_titulo.setLayout(panel_tituloLayout);
        panel_tituloLayout.setHorizontalGroup(
            panel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tituloLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 733, Short.MAX_VALUE))
        );
        panel_tituloLayout.setVerticalGroup(
            panel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(panel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        panel_actions.setBackground(new java.awt.Color(255, 255, 255));

        btnFam.setBackground(new java.awt.Color(204, 204, 255));
        btnFam.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnFam.setForeground(new java.awt.Color(0, 0, 0));
        btnFam.setText("Familiares");
        btnFam.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFamActionPerformed(evt);
            }
        });

        btnPasatiempos.setBackground(new java.awt.Color(204, 204, 255));
        btnPasatiempos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnPasatiempos.setForeground(new java.awt.Color(0, 0, 0));
        btnPasatiempos.setText("Pasatiempos");
        btnPasatiempos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPasatiempos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasatiemposActionPerformed(evt);
            }
        });

        btnMedicinas.setBackground(new java.awt.Color(204, 204, 255));
        btnMedicinas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnMedicinas.setForeground(new java.awt.Color(0, 0, 0));
        btnMedicinas.setText("Medicinas");
        btnMedicinas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMedicinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicinasActionPerformed(evt);
            }
        });

        btnAlarmas.setBackground(new java.awt.Color(204, 204, 255));
        btnAlarmas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAlarmas.setForeground(new java.awt.Color(0, 0, 0));
        btnAlarmas.setText("Alarmas");
        btnAlarmas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAlarmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlarmasActionPerformed(evt);
            }
        });

        jButton_Volver.setBackground(new java.awt.Color(204, 204, 255));
        jButton_Volver.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_Volver.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Actividades.png"))); // NOI18N
        jButton_Volver.setText("Volver");
        jButton_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_actionsLayout = new javax.swing.GroupLayout(panel_actions);
        panel_actions.setLayout(panel_actionsLayout);
        panel_actionsLayout.setHorizontalGroup(
            panel_actionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_actionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_actionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPasatiempos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(jButton_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMedicinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlarmas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_actionsLayout.setVerticalGroup(
            panel_actionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_actionsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnFam)
                .addGap(18, 18, 18)
                .addComponent(btnPasatiempos)
                .addGap(18, 18, 18)
                .addComponent(btnMedicinas)
                .addGap(18, 18, 18)
                .addComponent(btnAlarmas)
                .addGap(18, 18, 18)
                .addComponent(jButton_Volver)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        getContentPane().add(panel_actions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 260, 350));

        panel_info.setBackground(new java.awt.Color(255, 255, 255));
        panel_info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel_principal.setBackground(new java.awt.Color(204, 204, 204));
        panel_principal.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(panel_principal);

        panel_info.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 330));

        getContentPane().add(panel_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 540, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFamActionPerformed
 
        this.mostrarData( Alarma.getCumpleaños() );
    }//GEN-LAST:event_btnFamActionPerformed

    private void btnPasatiemposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasatiemposActionPerformed
        this.mostrarData( Alarma.getPasatiempos() );
    }//GEN-LAST:event_btnPasatiemposActionPerformed

    private void btnMedicinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicinasActionPerformed
        this.mostrarData( Alarma.getMedicina() );
    }//GEN-LAST:event_btnMedicinasActionPerformed

    private void btnAlarmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlarmasActionPerformed
        this.mostrarData( Alarma.getExtra() );
    }//GEN-LAST:event_btnAlarmasActionPerformed

    private void jButton_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VolverActionPerformed
        // Boton volver
        
        dispose();
        
        new Actividades().setVisible(true);
        
    }//GEN-LAST:event_jButton_VolverActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Caso_Borrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caso_Borrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caso_Borrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caso_Borrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caso_Borrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlarmas;
    private javax.swing.JButton btnFam;
    private javax.swing.JButton btnMedicinas;
    private javax.swing.JButton btnPasatiempos;
    private javax.swing.JButton jButton_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_actions;
    private javax.swing.JPanel panel_info;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JPanel panel_titulo;
    // End of variables declaration//GEN-END:variables
}
