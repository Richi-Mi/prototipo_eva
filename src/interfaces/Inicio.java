package interfaces;

import helpers.Sonidos;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import database.Database;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelos.Usuario;

/**
 * @author Juan Pablo figueroa
 * @author Mendoza Castañeda José Ricardo
 */
public class Inicio extends javax.swing.JFrame {

    private Sonidos objeto = new Sonidos();
    private int xMouse, yMouse;
    private String nombre, sexo, idioma;
    private Usuario usr;

    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);

        this.cerrar();
        objeto.Caso_Inicio1();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Idioma = new javax.swing.JLabel();
        jTextField_Usuario = new javax.swing.JTextField();
        jLabel_Usuario = new javax.swing.JLabel();
        jLabel_Sexo = new javax.swing.JLabel();
        jButton_Continuar = new javax.swing.JButton();
        jComboBox_Sexos = new javax.swing.JComboBox<>();
        jComboBox_Idiomas = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel_Header = new javax.swing.JPanel();
        jLabel_Salir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Idioma.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel_Idioma.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Idioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono__Idioma.png"))); // NOI18N
        jLabel_Idioma.setText("IDIOMA");
        jPanel1.add(jLabel_Idioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jTextField_Usuario.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Usuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_Usuario.setForeground(new java.awt.Color(204, 204, 204));
        jTextField_Usuario.setText("Ingrese su nombre");
        jTextField_Usuario.setBorder(null);
        jTextField_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_UsuarioMousePressed(evt);
            }
        });
        jTextField_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 420, -1));

        jLabel_Usuario.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel_Usuario.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Usuario.png"))); // NOI18N
        jLabel_Usuario.setText("USUARIO");
        jLabel_Usuario.setToolTipText("");
        jPanel1.add(jLabel_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 430, -1));

        jLabel_Sexo.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel_Sexo.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Sexo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Sexos.png"))); // NOI18N
        jLabel_Sexo.setText("SEXO");
        jPanel1.add(jLabel_Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jButton_Continuar.setBackground(new java.awt.Color(204, 204, 255));
        jButton_Continuar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton_Continuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Continuar.png"))); // NOI18N
        jButton_Continuar.setText("Continuar");
        jButton_Continuar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Continuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_ContinuarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_ContinuarMouseExited(evt);
            }
        });
        jButton_Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        jComboBox_Sexos.setBackground(new java.awt.Color(153, 153, 255));
        jComboBox_Sexos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox_Sexos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mujer", "Hombre", "Prefiero no decirlo" }));
        jComboBox_Sexos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jComboBox_Sexos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jComboBox_Idiomas.setBackground(new java.awt.Color(153, 153, 255));
        jComboBox_Idiomas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox_Idiomas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "Inglés" }));
        jComboBox_Idiomas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox_Idiomas.setMinimumSize(new java.awt.Dimension(100, 32));
        jPanel1.add(jComboBox_Idiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 180, -1));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 420, -1));

        jPanel_Header.setBackground(new java.awt.Color(204, 204, 204));
        jPanel_Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel_HeaderMouseDragged(evt);
            }
        });
        jPanel_Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_HeaderMousePressed(evt);
            }
        });
        jPanel_Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Salir.setBackground(java.awt.Color.blue);
        jLabel_Salir.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel_Salir.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Salir.setText("X");
        jLabel_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel_Salir.setOpaque(true);
        jLabel_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_SalirMouseExited(evt);
            }
        });
        jPanel_Header.add(jLabel_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 40, -1));

        jPanel1.add(jPanel_Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cerrar() {
        try
        {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    confirmarSalida();

                }
            });
            this.setVisible(true);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void confirmarSalida() {

        int valor = JOptionPane.showConfirmDialog(this, "¿Estás segur@ de cerrar el programa?", "Advertencia", JOptionPane.YES_NO_OPTION);

        if (valor == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa :)", "Gracias", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    private void jButton_ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ContinuarActionPerformed

        nombre = jTextField_Usuario.getText();
        sexo = jComboBox_Sexos.getSelectedItem().toString();
        idioma = jComboBox_Idiomas.getSelectedItem().toString();
        try {
            if (!jTextField_Usuario.getText().equals(""))
            {

                String nombre = jTextField_Usuario.getText();
                String sexo   = (String) jComboBox_Sexos.getSelectedItem();
                String idioma = (String) jComboBox_Idiomas.getSelectedItem();

                usr = new Usuario(nombre, sexo, idioma);
                Database.insert(usr);
            }

        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }

        dispose();

        new InicioDecision().setVisible(true);

        objeto.Caso_Inicio3();
    }//GEN-LAST:event_jButton_ContinuarActionPerformed


    private void jTextField_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsuarioActionPerformed

    private void jTextField_UsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_UsuarioMousePressed
        // TODO add your handling code here:
        jTextField_Usuario.setText("");
        jTextField_Usuario.setForeground(Color.black);
    }//GEN-LAST:event_jTextField_UsuarioMousePressed

    private void jLabel_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SalirMouseClicked
        // accion salir

        System.exit(0);
    }//GEN-LAST:event_jLabel_SalirMouseClicked

    private void jLabel_SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SalirMouseEntered
        // Colorear cuando pasa encima el cursor
        jLabel_Salir.setBackground(Color.red);
        jLabel_Salir.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_SalirMouseEntered

    private void jLabel_SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SalirMouseExited
        // colorear cuando sale el cursor
        jLabel_Salir.setBackground(Color.BLUE);
        jLabel_Salir.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_SalirMouseExited

    private void jPanel_HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_HeaderMouseDragged
        // Evento mouse arrastrado

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);

    }//GEN-LAST:event_jPanel_HeaderMouseDragged

    private void jPanel_HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_HeaderMousePressed
        // Almacenar posicion
        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_jPanel_HeaderMousePressed

    private void jButton_ContinuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ContinuarMouseEntered
        // TODO add your handling code here:

        jButton_Continuar.setBackground(new Color(102, 102, 255));
        jButton_Continuar.setForeground(Color.white);

    }//GEN-LAST:event_jButton_ContinuarMouseEntered

    private void jButton_ContinuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ContinuarMouseExited
        // TODO add your handling code here:
        jButton_Continuar.setBackground(new Color(204, 204, 255));
        jButton_Continuar.setForeground(Color.black);
    }//GEN-LAST:event_jButton_ContinuarMouseExited
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Continuar;
    private javax.swing.JComboBox<String> jComboBox_Idiomas;
    private javax.swing.JComboBox<String> jComboBox_Sexos;
    private javax.swing.JLabel jLabel_Idioma;
    private javax.swing.JLabel jLabel_Salir;
    private javax.swing.JLabel jLabel_Sexo;
    private javax.swing.JLabel jLabel_Usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_Usuario;
    // End of variables declaration//GEN-END:variables
}
