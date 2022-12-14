
package interfaces;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Juan Pablo Figueroa
 */
public class InicioDecision extends javax.swing.JFrame {

    public InicioDecision() {
        initComponents();
        setLocationRelativeTo(null);
        this.cerrar();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_IngresaUsuario1 = new javax.swing.JLabel();
        jButton_Si = new javax.swing.JButton();
        jButton_No = new javax.swing.JButton();
        jLabel_IngresaUsuario2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_IngresaUsuario1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_IngresaUsuario1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel_IngresaUsuario1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_IngresaUsuario1.setText("configuración?");
        jPanel1.add(jLabel_IngresaUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 240, -1));

        jButton_Si.setBackground(new java.awt.Color(204, 204, 255));
        jButton_Si.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_Si.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Si.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Si.png"))); // NOI18N
        jButton_Si.setText("Si");
        jButton_Si.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SiActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Si, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jButton_No.setBackground(new java.awt.Color(204, 204, 255));
        jButton_No.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_No.setForeground(new java.awt.Color(0, 0, 0));
        jButton_No.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_No.png"))); // NOI18N
        jButton_No.setText("No");
        jButton_No.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NoActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jLabel_IngresaUsuario2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_IngresaUsuario2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel_IngresaUsuario2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_IngresaUsuario2.setText("¿Deseas iniciar la");
        jPanel1.add(jLabel_IngresaUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cerrar() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    confirmarSalida();

                }
            });
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void confirmarSalida() {

        int valor = JOptionPane.showConfirmDialog(this, "¿Estás segur@ de cerrar el programa?", "Advertencia", JOptionPane.YES_NO_OPTION);

        if (valor == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa :)", "Gracias", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    private void jButton_SiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SiActionPerformed
        // boton si
        
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButton_SiActionPerformed

    private void jButton_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NoActionPerformed
        // boton no
   
        dispose();
        new Actividades().setVisible(true);

    }//GEN-LAST:event_jButton_NoActionPerformed

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
            java.util.logging.Logger.getLogger(InicioDecision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioDecision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioDecision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioDecision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioDecision().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_No;
    private javax.swing.JButton jButton_Si;
    private javax.swing.JLabel jLabel_IngresaUsuario1;
    private javax.swing.JLabel jLabel_IngresaUsuario2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
