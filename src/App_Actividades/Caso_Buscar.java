/** CASO BUSCAR.
 * Su objetivo es buscar la información que desee ver el usuario de la base de datos.
 * Hay 5 casos en los cuales el usuario podra ver la información.
 */
package App_Actividades;

import App_Actividades_Clases.PanelAlarmas;
import App_Actividades_Clases.PanelFamiliares;
import App_Actividades_Clases.PanelMedicinas;
import App_Actividades_Clases.PanelPasatiempos;
import interfaces.Actividades;
import interfaces.Menu;
import helpers.Sonidos;
import app_alarmas.CrearAlarmas;
import java.awt.BorderLayout;

/**
 * @author Mendoza Castañeda José Ricardo
 */
public class Caso_Buscar extends javax.swing.JFrame {

    public int id = 1;
    private CrearAlarmas crear = new CrearAlarmas();

    public Caso_Buscar() {
        initComponents();
        Sonidos objeto = new Sonidos();
        objeto.Caso_Buscar();
        
        setLocationRelativeTo(null);

        lblTitle.setText(" Buscar Información: ");
        crear.programarTodasLasAlarmas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneltitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        panelBtns = new javax.swing.JPanel();
        btnFam = new javax.swing.JButton();
        btnPasatiempos = new javax.swing.JButton();
        btnMedicinas = new javax.swing.JButton();
        btnAlarmas = new javax.swing.JButton();
        jButton_Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneltitle.setBackground(new java.awt.Color(204, 204, 204));

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setText("Buscar Información");

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelBtns.setBackground(new java.awt.Color(255, 255, 255));

        btnFam.setBackground(new java.awt.Color(204, 204, 255));
        btnFam.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnFam.setForeground(new java.awt.Color(0, 0, 0));
        btnFam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Familiares.png"))); // NOI18N
        btnFam.setText("Familiares");
        btnFam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFamActionPerformed(evt);
            }
        });

        btnPasatiempos.setBackground(new java.awt.Color(204, 204, 255));
        btnPasatiempos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnPasatiempos.setForeground(new java.awt.Color(0, 0, 0));
        btnPasatiempos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Pasatiempo.png"))); // NOI18N
        btnPasatiempos.setText("Pasatiempos");
        btnPasatiempos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPasatiempos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasatiemposActionPerformed(evt);
            }
        });

        btnMedicinas.setBackground(new java.awt.Color(204, 204, 255));
        btnMedicinas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnMedicinas.setForeground(new java.awt.Color(0, 0, 0));
        btnMedicinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Medicinas.png"))); // NOI18N
        btnMedicinas.setText("Medicinas");
        btnMedicinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMedicinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicinasActionPerformed(evt);
            }
        });

        btnAlarmas.setBackground(new java.awt.Color(204, 204, 255));
        btnAlarmas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAlarmas.setForeground(new java.awt.Color(0, 0, 0));
        btnAlarmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Alarma.png"))); // NOI18N
        btnAlarmas.setText("Alarmas");
        btnAlarmas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButton_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBtnsLayout = new javax.swing.GroupLayout(panelBtns);
        panelBtns.setLayout(panelBtnsLayout);
        panelBtnsLayout.setHorizontalGroup(
            panelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPasatiempos, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(btnMedicinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlarmas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBtnsLayout.setVerticalGroup(
            panelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtnsLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(btnFam)
                .addGap(18, 18, 18)
                .addComponent(btnPasatiempos)
                .addGap(18, 18, 18)
                .addComponent(btnMedicinas)
                .addGap(18, 18, 18)
                .addComponent(btnAlarmas)
                .addGap(18, 18, 18)
                .addComponent(jButton_Volver)
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout paneltitleLayout = new javax.swing.GroupLayout(paneltitle);
        paneltitle.setLayout(paneltitleLayout);
        paneltitleLayout.setHorizontalGroup(
            paneltitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltitleLayout.createSequentialGroup()
                .addGroup(paneltitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addGroup(paneltitleLayout.createSequentialGroup()
                        .addComponent(panelBtns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        paneltitleLayout.setVerticalGroup(
            paneltitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltitleLayout.createSequentialGroup()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneltitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBtns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFamActionPerformed
        PanelFamiliares panel = new PanelFamiliares(id);
        panel.setSize(545, 441);
        panel.setLocation(1, 1);

        panelPrincipal.removeAll();
        panelPrincipal.add(panel, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_btnFamActionPerformed

    private void btnPasatiemposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasatiemposActionPerformed
        PanelPasatiempos panel = new PanelPasatiempos(id);
        panel.setSize(545, 441);
        panel.setLocation(1, 1);

        panelPrincipal.removeAll();
        panelPrincipal.add(panel, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_btnPasatiemposActionPerformed

    private void btnMedicinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicinasActionPerformed
        PanelMedicinas panel = new PanelMedicinas(id);
        panel.setSize(545, 441);
        panel.setLocation(1, 1);

        panelPrincipal.removeAll();
        panelPrincipal.add(panel, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_btnMedicinasActionPerformed

    private void btnAlarmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlarmasActionPerformed
        PanelAlarmas panel = new PanelAlarmas(id);
        panel.setSize(545, 441);
        panel.setLocation(1, 1);

        panelPrincipal.removeAll();
        panelPrincipal.add(panel, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
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
            java.util.logging.Logger.getLogger(Caso_Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caso_Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caso_Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caso_Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caso_Buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlarmas;
    private javax.swing.JButton btnFam;
    private javax.swing.JButton btnMedicinas;
    private javax.swing.JButton btnPasatiempos;
    private javax.swing.JButton jButton_Volver;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelBtns;
    public static javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel paneltitle;
    // End of variables declaration//GEN-END:variables
}
