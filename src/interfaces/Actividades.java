package interfaces;

import actividades.Caso_Ayuda;
import actividades.Caso_Alarmas;
import actividades.Caso_Buscar;
import actividades.Caso_Borrar;
import helpers.Sonidos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author Juan Pablo Figueroa.
 * 
 * TODO: configurar Alarmas
 */
public class Actividades extends javax.swing.JFrame {

    private int xMouse, yMouse;
    Dimension screenSize;
    
    public Actividades() {
                
        screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
        
        initComponents();
        setLocationRelativeTo(null);
        
        this.setResizable( false );
        
        // Sonido
        Sonidos objeto = new Sonidos();
        objeto.Caso_Actividades();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel_fondo = new javax.swing.JPanel();
        jPanel_Header = new javax.swing.JPanel();
        jLabel_HeaderActividades = new javax.swing.JLabel();
        jLabel_Salir = new javax.swing.JLabel();
        jButton_AcercaEva = new javax.swing.JButton();
        jButton_Borrar = new javax.swing.JButton();
        jButton_Alarmas = new javax.swing.JButton();
        jButton_Buscar = new javax.swing.JButton();
        jButton_Menu = new javax.swing.JButton();
        jButton_Ayuda = new javax.swing.JButton();
        jLabel_Invisible = new javax.swing.JLabel();
        rSLabelHora = new rojeru_san.RSLabelHora();
        rSLabelFecha = new rojeru_san.RSLabelFecha();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel_fondo.setBackground(new java.awt.Color(0, 0, 51));
        jPanel_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Header.setBackground(new java.awt.Color(0, 153, 153));
        jPanel_Header.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_Header.setMinimumSize(new Dimension((int) screenSize.getWidth(), 30));
        jPanel_Header.setPreferredSize(getMinimumSize());
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

        jLabel_HeaderActividades.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel_HeaderActividades.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_HeaderActividades.setText("  Actividades");
        jPanel_Header.add(jLabel_HeaderActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 600, 30));

        jLabel_Salir.setBackground(new java.awt.Color(255, 102, 102));
        jLabel_Salir.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
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
        jPanel_Header.add(jLabel_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 70, 50));

        jPanel_fondo.add(jPanel_Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 50));
        jPanel_Header.getAccessibleContext().setAccessibleDescription("");

        jButton_AcercaEva.setBackground(new java.awt.Color(153, 153, 255));
        jButton_AcercaEva.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton_AcercaEva.setForeground(new java.awt.Color(0, 0, 0));
        jButton_AcercaEva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Pregunta.png"))); // NOI18N
        jButton_AcercaEva.setText("Acerca de eva");
        jButton_AcercaEva.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_AcercaEva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_AcercaEvaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_AcercaEvaMouseExited(evt);
            }
        });
        jButton_AcercaEva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AcercaEvaActionPerformed(evt);
            }
        });
        jPanel_fondo.add(jButton_AcercaEva, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 660, 60));

        jButton_Borrar.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Borrar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton_Borrar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Borrar.png"))); // NOI18N
        jButton_Borrar.setText("Borrar");
        jButton_Borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_BorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_BorrarMouseExited(evt);
            }
        });
        jButton_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BorrarActionPerformed(evt);
            }
        });
        jPanel_fondo.add(jButton_Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 660, 60));

        jButton_Alarmas.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Alarmas.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton_Alarmas.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Alarmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Alarma.png"))); // NOI18N
        jButton_Alarmas.setText("Programar Alarmas");
        jButton_Alarmas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Alarmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_AlarmasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_AlarmasMouseExited(evt);
            }
        });
        jButton_Alarmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AlarmasActionPerformed(evt);
            }
        });
        jPanel_fondo.add(jButton_Alarmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 660, 60));

        jButton_Buscar.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Buscar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton_Buscar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Buscar.png"))); // NOI18N
        jButton_Buscar.setText("Buscar (Informacion ingresada en el menu)");
        jButton_Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_BuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_BuscarMouseExited(evt);
            }
        });
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });
        jPanel_fondo.add(jButton_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 660, 60));

        jButton_Menu.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Menu.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton_Menu.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Actividades.png"))); // NOI18N
        jButton_Menu.setText(" Menu");
        jButton_Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_MenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_MenuMouseExited(evt);
            }
        });
        jButton_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MenuActionPerformed(evt);
            }
        });
        jPanel_fondo.add(jButton_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 660, 60));

        jButton_Ayuda.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Ayuda.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton_Ayuda.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Ayuda.png"))); // NOI18N
        jButton_Ayuda.setText("Ayuda (En casos de emergencia)");
        jButton_Ayuda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_AyudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_AyudaMouseExited(evt);
            }
        });
        jButton_Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AyudaActionPerformed(evt);
            }
        });
        jPanel_fondo.add(jButton_Ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 660, 60));
        jPanel_fondo.add(jLabel_Invisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 420, 40, 20));

        rSLabelHora.setBackground(new java.awt.Color(102, 102, 255));
        rSLabelHora.setForeground(new java.awt.Color(0, 255, 204));
        rSLabelHora.setFont(new java.awt.Font("Roboto Bold", 1, 36)); // NOI18N
        jPanel_fondo.add(rSLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 290, 100));

        rSLabelFecha.setBackground(new java.awt.Color(204, 204, 204));
        rSLabelFecha.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelFecha.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        rSLabelFecha.setFormato("EEEEEEE/dd/MMMM/yyyy");
        jPanel_fondo.add(rSLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 390, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Espacio de alarmas");
        jPanel_fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 420, 230, 240));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/imagen_fondo.jpg"))); // NOI18N
        jPanel_fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 520, 650));

        getContentPane().add(jPanel_fondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_HeaderMousePressed
        // Almacenar posicion
        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_jPanel_HeaderMousePressed

    private void jPanel_HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_HeaderMouseDragged
        // Evento mouse arrastrado

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);

    }//GEN-LAST:event_jPanel_HeaderMouseDragged

    private void jLabel_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SalirMouseClicked
        // accion salir

        System.exit(0);
    }//GEN-LAST:event_jLabel_SalirMouseClicked

    private void jLabel_SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SalirMouseEntered
        // Colorear cuando pasa encima el cursor
        jLabel_Salir.setBackground(Color.red);
        jLabel_Salir.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel_SalirMouseEntered

    private void jLabel_SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SalirMouseExited
        // colorear cuando sale el cursor
        jLabel_Salir.setBackground( new Color( 255,102,102 ) );
        jLabel_Salir.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_SalirMouseExited


    private void jButton_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BorrarActionPerformed
        // Borrar

        dispose();

        new Caso_Borrar().setVisible(true);

    }//GEN-LAST:event_jButton_BorrarActionPerformed

    private void jButton_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MenuActionPerformed
        // Boton menu

        dispose();
        new Menu().setVisible(true);

    }//GEN-LAST:event_jButton_MenuActionPerformed

    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
        // muestra el caso buscar 

        dispose();

        new Caso_Buscar().setVisible(true);

    }//GEN-LAST:event_jButton_BuscarActionPerformed

    private void jButton_AlarmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AlarmasActionPerformed
        // muestra el caso alarmas

        dispose();

        new Caso_Alarmas().setVisible(true);
    }//GEN-LAST:event_jButton_AlarmasActionPerformed

    private void jButton_AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AyudaActionPerformed
        // Boton ayuda

        dispose();

        new Caso_Ayuda().setVisible(true);

    }//GEN-LAST:event_jButton_AyudaActionPerformed

    private void jButton_AcercaEvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AcercaEvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_AcercaEvaActionPerformed
                        
    private void jButton_MenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_MenuMouseEntered
        // boton menu

        jButton_Menu.setBackground(new Color(153,153,255));
        jButton_Menu.setForeground(Color.white);
    }//GEN-LAST:event_jButton_MenuMouseEntered

    private void jButton_MenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_MenuMouseExited
        // TODO add your handling code here:
        jButton_Menu.setBackground(new Color(153,153,255));
        jButton_Menu.setForeground(Color.black);
    }//GEN-LAST:event_jButton_MenuMouseExited

    private void jButton_AyudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AyudaMouseEntered
        // TODO add your handling code here:
        jButton_Ayuda.setBackground(new Color(153,153,255));
        jButton_Ayuda.setForeground(Color.white);
    }//GEN-LAST:event_jButton_AyudaMouseEntered

    private void jButton_AyudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AyudaMouseExited
        // TODO add your handling code here:
        jButton_Ayuda.setBackground(new Color(153,153,255));
        jButton_Ayuda.setForeground(Color.black);
    }//GEN-LAST:event_jButton_AyudaMouseExited

    private void jButton_AlarmasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AlarmasMouseEntered
        // TODO add your handling code here:
        jButton_Alarmas.setBackground(new Color(153,153,255));
        jButton_Alarmas.setForeground(Color.white);
    }//GEN-LAST:event_jButton_AlarmasMouseEntered

    private void jButton_AlarmasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AlarmasMouseExited
        // TODO add your handling code here:
        jButton_Alarmas.setBackground(new Color(153,153,255));
        jButton_Alarmas.setForeground(Color.black);
    }//GEN-LAST:event_jButton_AlarmasMouseExited

    private void jButton_BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_BuscarMouseEntered
        // TODO add your handling code here:
        jButton_Buscar.setBackground(new Color(153,153,255));
        jButton_Buscar.setForeground(Color.white);
    }//GEN-LAST:event_jButton_BuscarMouseEntered

    private void jButton_BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_BuscarMouseExited
        // TODO add your handling code here:
        jButton_Buscar.setBackground(new Color(153,153,255));
        jButton_Buscar.setForeground(Color.black);
    }//GEN-LAST:event_jButton_BuscarMouseExited

    private void jButton_BorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_BorrarMouseEntered
        // TODO add your handling code here:
        jButton_Borrar.setBackground(new Color(153,153,255));
        jButton_Borrar.setForeground(Color.white);
    }//GEN-LAST:event_jButton_BorrarMouseEntered

    private void jButton_BorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_BorrarMouseExited
        // TODO add your handling code here:
        jButton_Borrar.setBackground(new Color(153,153,255));
        jButton_Borrar.setForeground(Color.black);
    }//GEN-LAST:event_jButton_BorrarMouseExited

    private void jButton_AcercaEvaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AcercaEvaMouseEntered
        // TODO add your handling code here:
        jButton_AcercaEva.setBackground(new Color(153,153,255));
        jButton_AcercaEva.setForeground(Color.white);
    }//GEN-LAST:event_jButton_AcercaEvaMouseEntered

    private void jButton_AcercaEvaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AcercaEvaMouseExited
        // TODO add your handling code here:
        jButton_AcercaEva.setBackground(new Color(153,153,255));
        jButton_AcercaEva.setForeground(Color.black);
    }//GEN-LAST:event_jButton_AcercaEvaMouseExited

    
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
            java.util.logging.Logger.getLogger(Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actividades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_AcercaEva;
    private javax.swing.JButton jButton_Alarmas;
    private javax.swing.JButton jButton_Ayuda;
    private javax.swing.JButton jButton_Borrar;
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_HeaderActividades;
    private javax.swing.JLabel jLabel_Invisible;
    private javax.swing.JLabel jLabel_Salir;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JPanel jPanel_fondo;
    private rojeru_san.RSLabelFecha rSLabelFecha;
    private rojeru_san.RSLabelHora rSLabelHora;
    // End of variables declaration//GEN-END:variables
}
