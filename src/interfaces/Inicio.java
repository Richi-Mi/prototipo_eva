
package interfaces;

import database.Database;
import helpers.Sonidos;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelos.Usuario;

/**
 * @author José Ricardo Mendoza Castañeda
 */

public class Inicio extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    private Sonidos objeto = new Sonidos();
    
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
        
        objeto.Caso_Inicio1();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        jlbl_nombre_empresa = new javax.swing.JLabel();
        btnClose = new javax.swing.JPanel();
        btnCloseText = new javax.swing.JLabel();
        image_right = new javax.swing.JLabel();
        texto_inicioSesion = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_usuario = new javax.swing.JLabel();
        input_correo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        header = new javax.swing.JPanel();
        loginBtn = new javax.swing.JPanel();
        loginBtnText = new javax.swing.JLabel();
        jComboBox_Sexos = new javax.swing.JComboBox<>();
        jLabel_Idioma = new javax.swing.JLabel();
        jComboBox_Idiomas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_nombre_empresa.setBackground(new java.awt.Color(102, 102, 255));
        jlbl_nombre_empresa.setFont(new java.awt.Font("Bookman Old Style", 0, 48)); // NOI18N
        jlbl_nombre_empresa.setForeground(new java.awt.Color(153, 153, 255));
        jlbl_nombre_empresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_nombre_empresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/eva.png"))); // NOI18N
        jlbl_nombre_empresa.setText("EVA");
        backgroundPanel.add(jlbl_nombre_empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 370, 180));

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
        });

        btnCloseText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCloseText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCloseText.setText("X");
        btnCloseText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseTextMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCloseLayout = new javax.swing.GroupLayout(btnClose);
        btnClose.setLayout(btnCloseLayout);
        btnCloseLayout.setHorizontalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCloseLayout.createSequentialGroup()
                    .addComponent(btnCloseText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCloseLayout.createSequentialGroup()
                    .addComponent(btnCloseText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        backgroundPanel.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, -1));

        image_right.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/fondo_starts.jpg"))); // NOI18N
        backgroundPanel.add(image_right, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 380, 500));

        texto_inicioSesion.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        texto_inicioSesion.setForeground(new java.awt.Color(153, 153, 255));
        texto_inicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto_inicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/perfil.png"))); // NOI18N
        texto_inicioSesion.setText("Usuario");
        backgroundPanel.add(texto_inicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 220, -1));

        txt_contraseña.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_contraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Sexos.png"))); // NOI18N
        txt_contraseña.setText("Sexo:");
        backgroundPanel.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 120, -1));
        backgroundPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 350, 20));

        txt_usuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Usuario.png"))); // NOI18N
        txt_usuario.setText("Nombre:");
        backgroundPanel.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 130, 30));

        input_correo.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        input_correo.setForeground(new java.awt.Color(153, 153, 153));
        input_correo.setText("Ingrese su nombre");
        input_correo.setBorder(null);
        input_correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                input_correoMousePressed(evt);
            }
        });
        backgroundPanel.add(input_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 350, 30));
        backgroundPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 350, 20));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        backgroundPanel.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 30));

        loginBtn.setBackground(new java.awt.Color(51, 51, 255));
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        loginBtnText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loginBtnText.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnText.setLabelFor(loginBtn);
        loginBtnText.setText("Continuar");
        loginBtnText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtnText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnText, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        backgroundPanel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 200, 40));

        jComboBox_Sexos.setBackground(new java.awt.Color(153, 153, 255));
        jComboBox_Sexos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox_Sexos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mujer", "Hombre", "Prefiero no decirlo" }));
        jComboBox_Sexos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backgroundPanel.add(jComboBox_Sexos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 350, -1));

        jLabel_Idioma.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_Idioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono__Idioma.png"))); // NOI18N
        jLabel_Idioma.setText("IDIOMA");
        backgroundPanel.add(jLabel_Idioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jComboBox_Idiomas.setBackground(new java.awt.Color(153, 153, 255));
        jComboBox_Idiomas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox_Idiomas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "Inglés" }));
        jComboBox_Idiomas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox_Idiomas.setMinimumSize(new java.awt.Dimension(100, 32));
        backgroundPanel.add(jComboBox_Idiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 350, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        // Mover la pantalla.
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation( x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void btnCloseTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseTextMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseTextMouseClicked

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        btnCloseText.setForeground(Color.red);
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseTextMouseExited
        btnCloseText.setForeground(Color.black);
    }//GEN-LAST:event_btnCloseTextMouseExited

    private void loginBtnTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTextMouseExited
        loginBtn.setBackground( new Color( 24, 101, 49) );
    }//GEN-LAST:event_loginBtnTextMouseExited

    private void loginBtnTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTextMouseEntered
        loginBtn.setBackground( new Color( 35, 120, 49) );
    }//GEN-LAST:event_loginBtnTextMouseEntered

    private void input_correoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_correoMousePressed
        
        if( input_correo.getText().equals("Ingrese su nombre") || input_correo.getText().equals("") ) {
            input_correo.setText("");    
            input_correo.setForeground(Color.black);
        }
    }//GEN-LAST:event_input_correoMousePressed

    private void loginBtnTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTextMouseClicked
        try {
            if (!input_correo.getText().equals(""))
            {

                String nombre = input_correo.getText();
                String sexo   = jComboBox_Sexos.getSelectedItem().toString();
                String idioma = (String) jComboBox_Idiomas.getSelectedItem();

                Usuario usr = new Usuario(nombre, sexo, idioma);
                Database.insert(usr);
            }

        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }

        dispose();

        new InicioDecision().setVisible(true);

        objeto.Caso_Inicio3();
    }//GEN-LAST:event_loginBtnTextMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel btnClose;
    private javax.swing.JLabel btnCloseText;
    private javax.swing.JPanel header;
    private javax.swing.JLabel image_right;
    private javax.swing.JTextField input_correo;
    private javax.swing.JComboBox<String> jComboBox_Idiomas;
    private javax.swing.JComboBox<String> jComboBox_Sexos;
    private javax.swing.JLabel jLabel_Idioma;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlbl_nombre_empresa;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginBtnText;
    private javax.swing.JLabel texto_inicioSesion;
    private javax.swing.JLabel txt_contraseña;
    private javax.swing.JLabel txt_usuario;
    // End of variables declaration//GEN-END:variables
}
