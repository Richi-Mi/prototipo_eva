
package interfaces;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * @author José Ricardo Mendoza Castañeda
 */
public class LoginApp extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public LoginApp() {
        initComponents();
        this.setLocationRelativeTo( null );
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        jlbl_nombre_empresa = new javax.swing.JLabel();
        btnClose = new javax.swing.JPanel();
        btnCloseText = new javax.swing.JLabel();
        image_right = new javax.swing.JLabel();
        icono_usuario = new javax.swing.JLabel();
        texto_inicioSesion = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JLabel();
        input_usuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        header = new javax.swing.JPanel();
        loginBtn = new javax.swing.JPanel();
        loginBtnText = new javax.swing.JLabel();
        jLabel_Sexo = new javax.swing.JLabel();
        jLabel_Idioma = new javax.swing.JLabel();
        jComboBox_Sexos = new javax.swing.JComboBox<>();
        jComboBox_Idiomas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_nombre_empresa.setFont(new java.awt.Font("GothicE", 0, 48)); // NOI18N
        jlbl_nombre_empresa.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_nombre_empresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_nombre_empresa.setText("EVA");
        backgroundPanel.add(jlbl_nombre_empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 370, 90));

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
        });

        btnCloseText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCloseText.setForeground(new java.awt.Color(0, 0, 0));
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

        image_right.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/background.jpg"))); // NOI18N
        backgroundPanel.add(image_right, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 420, 550));

        icono_usuario.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        icono_usuario.setForeground(new java.awt.Color(0, 0, 0));
        icono_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/user_logo.png"))); // NOI18N
        backgroundPanel.add(icono_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 430, 120));

        texto_inicioSesion.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        texto_inicioSesion.setForeground(new java.awt.Color(0, 0, 0));
        texto_inicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto_inicioSesion.setText("Iniciar Sesion");
        backgroundPanel.add(texto_inicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 220, -1));

        txt_usuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(0, 102, 102));
        txt_usuario.setText("Usuario");
        backgroundPanel.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, -1));

        input_usuario.setBackground(new java.awt.Color(255, 255, 255));
        input_usuario.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        input_usuario.setForeground(new java.awt.Color(153, 153, 153));
        input_usuario.setText("Ingrese su nombre de Usuario");
        input_usuario.setBorder(null);
        input_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                input_usuarioMousePressed(evt);
            }
        });
        backgroundPanel.add(input_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 350, -1));
        backgroundPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 350, 20));

        header.setBackground(new java.awt.Color(255, 255, 255));
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

        loginBtn.setBackground(new java.awt.Color(0, 102, 102));
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
        });

        loginBtnText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loginBtnText.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnText.setLabelFor(loginBtn);
        loginBtnText.setText("Iniciar Sesion");
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
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(loginBtnText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(loginBtnText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        backgroundPanel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 200, 40));

        jLabel_Sexo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_Sexo.setForeground(new java.awt.Color(0, 102, 102));
        jLabel_Sexo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Sexos.png"))); // NOI18N
        jLabel_Sexo.setText("SEXO");
        backgroundPanel.add(jLabel_Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel_Idioma.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_Idioma.setForeground(new java.awt.Color(0, 102, 102));
        jLabel_Idioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono__Idioma.png"))); // NOI18N
        jLabel_Idioma.setText("IDIOMA");
        backgroundPanel.add(jLabel_Idioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jComboBox_Sexos.setBackground(new java.awt.Color(0, 102, 102));
        jComboBox_Sexos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox_Sexos.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox_Sexos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mujer", "Hombre", "Prefiero no decirlo" }));
        jComboBox_Sexos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backgroundPanel.add(jComboBox_Sexos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        jComboBox_Idiomas.setBackground(new java.awt.Color(0, 102, 102));
        jComboBox_Idiomas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox_Idiomas.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox_Idiomas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "Inglés" }));
        jComboBox_Idiomas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox_Idiomas.setMinimumSize(new java.awt.Dimension(100, 32));
        backgroundPanel.add(jComboBox_Idiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 541, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
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

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
        
    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTextMouseExited
        loginBtn.setBackground( new Color( 0, 102, 102) );
    }//GEN-LAST:event_loginBtnTextMouseExited

    private void loginBtnTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTextMouseEntered
        loginBtn.setBackground( new Color( 0, 153, 153) );
    }//GEN-LAST:event_loginBtnTextMouseEntered

    private void input_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_usuarioMousePressed
        
        if( input_usuario.getText().equals("Ingrese su nombre de Usuario") || input_usuario.getText().equals("") ) {
            input_usuario.setText("");    
            input_usuario.setForeground(Color.black);
        }
    }//GEN-LAST:event_input_usuarioMousePressed

    private void loginBtnTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTextMouseClicked
        // Terminar Login
        JOptionPane.showMessageDialog(null, "Hola " + input_usuario.getText(), "Hola Capo", JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_loginBtnTextMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(LoginApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel btnClose;
    private javax.swing.JLabel btnCloseText;
    private javax.swing.JPanel header;
    private javax.swing.JLabel icono_usuario;
    private javax.swing.JLabel image_right;
    private javax.swing.JTextField input_usuario;
    private javax.swing.JComboBox<String> jComboBox_Idiomas;
    private javax.swing.JComboBox<String> jComboBox_Sexos;
    private javax.swing.JLabel jLabel_Idioma;
    private javax.swing.JLabel jLabel_Sexo;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlbl_nombre_empresa;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginBtnText;
    private javax.swing.JLabel texto_inicioSesion;
    private javax.swing.JLabel txt_usuario;
    // End of variables declaration//GEN-END:variables
}
