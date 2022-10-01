
package menuInterfaces;

import interfaces.Actividades;
import interfaces.Menu;
import helpers.Sonidos;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelos.Contacto;
import database.Database;

/**
 * @author Juan Pablo Figueroa
 * @author Mendoza Castañeda José Ricardo
 * 
 * TODO: Agregar el sexo de el pariente
 */
public class Parientes extends javax.swing.JFrame {

    private int xMouse, yMouse;
    private int id_usuario = 1;
    
    public Parientes() {
        initComponents();
        setLocationRelativeTo(null);
        
        this.cerrar();
        
        Sonidos objeto = new Sonidos();
        objeto.Caso_Cuatro();
       
    }
    
    public void vacia() {
        
        jTextField_NamePersona1.setText("");
        jTextField_KinshipPersona1.setText("");
        jTextField_NumberPersona1.setText("");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_NumeroPersona1 = new javax.swing.JLabel();
        jTextField_NumberPersona1 = new javax.swing.JTextField();
        jLabel_NamePesona1 = new javax.swing.JLabel();
        jLabel_KinshipPesona1 = new javax.swing.JLabel();
        jLabel_BirthdayPesona1 = new javax.swing.JLabel();
        jTextField_NamePersona1 = new javax.swing.JTextField();
        jTextField_KinshipPersona1 = new javax.swing.JTextField();
        jButton_SaveNumber = new javax.swing.JButton();
        jButton_Borrar1 = new javax.swing.JButton();
        jPanel_Header = new javax.swing.JPanel();
        jLabel_Salir = new javax.swing.JLabel();
        jLabel_HeaderActividades = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 360, 10));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 360, 10));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 360, 10));

        jLabel_NumeroPersona1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel_NumeroPersona1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_NumeroPersona1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_NumeroPersona1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Contactos1.png"))); // NOI18N
        jLabel_NumeroPersona1.setText("DATOS DE LA PERSONA");
        jPanel1.add(jLabel_NumeroPersona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 500, -1));

        jTextField_NumberPersona1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_NumberPersona1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_NumberPersona1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_NumberPersona1.setBorder(null);
        jPanel1.add(jTextField_NumberPersona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 330, 30));

        jLabel_NamePesona1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel_NamePesona1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_NamePesona1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_IngresaDato.png"))); // NOI18N
        jLabel_NamePesona1.setText("Nombre");
        jPanel1.add(jLabel_NamePesona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel_KinshipPesona1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel_KinshipPesona1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_KinshipPesona1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_PersonaImportante.png"))); // NOI18N
        jLabel_KinshipPesona1.setText("Parentesco");
        jPanel1.add(jLabel_KinshipPesona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel_BirthdayPesona1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel_BirthdayPesona1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_BirthdayPesona1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Contactos.png"))); // NOI18N
        jLabel_BirthdayPesona1.setText("Numero");
        jPanel1.add(jLabel_BirthdayPesona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jTextField_NamePersona1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_NamePersona1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_NamePersona1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_NamePersona1.setBorder(null);
        jPanel1.add(jTextField_NamePersona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 330, 30));

        jTextField_KinshipPersona1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_KinshipPersona1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_KinshipPersona1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_KinshipPersona1.setBorder(null);
        jPanel1.add(jTextField_KinshipPersona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 330, 30));

        jButton_SaveNumber.setBackground(new java.awt.Color(204, 204, 255));
        jButton_SaveNumber.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_SaveNumber.setForeground(new java.awt.Color(0, 0, 0));
        jButton_SaveNumber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Guardar.png"))); // NOI18N
        jButton_SaveNumber.setText("Guardar");
        jButton_SaveNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_SaveNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SaveNumberActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_SaveNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jButton_Borrar1.setBackground(new java.awt.Color(204, 204, 255));
        jButton_Borrar1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_Borrar1.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Borrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Actividades.png"))); // NOI18N
        jButton_Borrar1.setText("Volver");
        jButton_Borrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Borrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Borrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Borrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

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
        jPanel_Header.add(jLabel_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 40, -1));

        jLabel_HeaderActividades.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel_HeaderActividades.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_HeaderActividades.setText("Contactos importantes");
        jPanel_Header.add(jLabel_HeaderActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel_Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Confirmar cierre de programa">
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
    
    public void confirmarSalida(){
        
    int valor = JOptionPane.showConfirmDialog(this, "¿Estás segur@ de cerrar el programa?","Advertencia",JOptionPane.YES_NO_OPTION);
    
    if(valor==JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa :)","Gracias",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}// </editor-fold>
    
    private void jButton_SaveNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SaveNumberActionPerformed
        
        try{
          
            if(!jTextField_NamePersona1.getText().equals("")){
                String nombre = jTextField_NamePersona1.getText().trim();
                String parentesco = jTextField_KinshipPersona1.getText().trim();
                String numero = jTextField_NumberPersona1.getText().trim();
                
                Contacto contact = new Contacto(nombre, "null", "Español", id_usuario );
                contact.setNumero(numero);
                contact.setParentesco(parentesco);
                
                Database.insert( contact );
                
            }
              
        } catch(Exception ex) {
            Logger.getLogger(Parientes.class.getName()).log(Level.SEVERE, null,ex);
        }
        
        String respuesta = JOptionPane.showInputDialog(null, "Te gustaria configurar otra opcion?");
        
        if (respuesta.equalsIgnoreCase("Si")) {
            vacia();
        } else if (respuesta.equalsIgnoreCase("no")) {
            dispose();
            new Actividades().setVisible(true);
        }
    }//GEN-LAST:event_jButton_SaveNumberActionPerformed

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

    private void jButton_Borrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Borrar1ActionPerformed
        // boton volver

        dispose();

        new Menu().setVisible(true);
    }//GEN-LAST:event_jButton_Borrar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Parientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Borrar1;
    private javax.swing.JButton jButton_SaveNumber;
    private javax.swing.JLabel jLabel_BirthdayPesona1;
    private javax.swing.JLabel jLabel_HeaderActividades;
    private javax.swing.JLabel jLabel_KinshipPesona1;
    private javax.swing.JLabel jLabel_NamePesona1;
    private javax.swing.JLabel jLabel_NumeroPersona1;
    private javax.swing.JLabel jLabel_Salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField_KinshipPersona1;
    public javax.swing.JTextField jTextField_NamePersona1;
    private javax.swing.JTextField jTextField_NumberPersona1;
    // End of variables declaration//GEN-END:variables
}
