package interfaces;

import menuInterfaces.Cumpleaños;
import menuInterfaces.Parientes;
import menuInterfaces.Medicamentos;
import menuInterfaces.Sueño;
import menuInterfaces.Personales;
import menuInterfaces.Pasatiempos;
import helpers.Sonidos;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Juan Pablo Figueroa
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setLocationRelativeTo(null);

        this.setResizable(false);

        cerrar();

        Sonidos objeto = new Sonidos();
        objeto.Caso_Menu2();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Header = new javax.swing.JPanel();
        jLabel_HeaderActividades = new javax.swing.JLabel();
        jLabel_Salir = new javax.swing.JLabel();
        jButton_HoraDormir = new javax.swing.JButton();
        jButton_Volver = new javax.swing.JButton();
        jButton_Contactos = new javax.swing.JButton();
        jButton_DatosPersonales = new javax.swing.JButton();
        jButton_Medicinas = new javax.swing.JButton();
        jButton_NombresImporantes = new javax.swing.JButton();
        jButton_Pasatiempos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Header.setBackground(new java.awt.Color(0, 153, 153));
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

        jLabel_HeaderActividades.setBackground(new java.awt.Color(0, 153, 102));
        jLabel_HeaderActividades.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel_HeaderActividades.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_HeaderActividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Contactos1.png"))); // NOI18N
        jLabel_HeaderActividades.setText("   Menu");
        jPanel_Header.add(jLabel_HeaderActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 30));

        jLabel_Salir.setBackground(new java.awt.Color(255, 102, 102));
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
        jPanel_Header.add(jLabel_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 70, 40));

        jPanel1.add(jPanel_Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 40));

        jButton_HoraDormir.setBackground(new java.awt.Color(204, 204, 255));
        jButton_HoraDormir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_HoraDormir.setForeground(new java.awt.Color(0, 0, 0));
        jButton_HoraDormir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Alarma.png"))); // NOI18N
        jButton_HoraDormir.setText("Ingresar hora de dormir y de despertar");
        jButton_HoraDormir.setBorder(null);
        jButton_HoraDormir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_HoraDormir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_HoraDormirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_HoraDormirMouseExited(evt);
            }
        });
        jButton_HoraDormir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HoraDormirActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_HoraDormir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 1180, 90));

        jButton_Volver.setBackground(new java.awt.Color(204, 204, 255));
        jButton_Volver.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Volver.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Actividades.png"))); // NOI18N
        jButton_Volver.setText("Volver");
        jButton_Volver.setBorder(null);
        jButton_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_VolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_VolverMouseExited(evt);
            }
        });
        jButton_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VolverActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 1180, 70));

        jButton_Contactos.setBackground(new java.awt.Color(204, 204, 255));
        jButton_Contactos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Contactos.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Contactos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Contactos.png"))); // NOI18N
        jButton_Contactos.setText("Ingresar números de telefono de personas importantes en caso de emergencia");
        jButton_Contactos.setBorder(null);
        jButton_Contactos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Contactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_ContactosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_ContactosMouseExited(evt);
            }
        });
        jButton_Contactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ContactosActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Contactos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 1180, 80));

        jButton_DatosPersonales.setBackground(new java.awt.Color(204, 204, 255));
        jButton_DatosPersonales.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_DatosPersonales.setForeground(new java.awt.Color(0, 0, 0));
        jButton_DatosPersonales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Usuario.png"))); // NOI18N
        jButton_DatosPersonales.setText("Ingresar mis datos personales (En caso de que olvides quien eres)");
        jButton_DatosPersonales.setBorder(null);
        jButton_DatosPersonales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_DatosPersonales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_DatosPersonalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_DatosPersonalesMouseExited(evt);
            }
        });
        jButton_DatosPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DatosPersonalesActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_DatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 1180, 70));

        jButton_Medicinas.setBackground(new java.awt.Color(204, 204, 255));
        jButton_Medicinas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Medicinas.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Medicinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Medicinas.png"))); // NOI18N
        jButton_Medicinas.setText("Añadir medicinas que debo tomar y cuándo las debo tomar");
        jButton_Medicinas.setBorder(null);
        jButton_Medicinas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Medicinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_MedicinasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_MedicinasMouseExited(evt);
            }
        });
        jButton_Medicinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MedicinasActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Medicinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 1180, 80));

        jButton_NombresImporantes.setBackground(new java.awt.Color(204, 204, 255));
        jButton_NombresImporantes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_NombresImporantes.setForeground(new java.awt.Color(0, 0, 0));
        jButton_NombresImporantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_PersonaImportante.png"))); // NOI18N
        jButton_NombresImporantes.setText("  Dime el nombre y cumpleaños depersonas importantes para ti");
        jButton_NombresImporantes.setAlignmentX(1.0F);
        jButton_NombresImporantes.setBorder(null);
        jButton_NombresImporantes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_NombresImporantes.setMargin(new java.awt.Insets(5, 14, 5, 14));
        jButton_NombresImporantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_NombresImporantesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_NombresImporantesMouseExited(evt);
            }
        });
        jButton_NombresImporantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NombresImporantesActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_NombresImporantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1180, 80));

        jButton_Pasatiempos.setBackground(new java.awt.Color(204, 204, 255));
        jButton_Pasatiempos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Pasatiempos.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Pasatiempos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Pasatiempo.png"))); // NOI18N
        jButton_Pasatiempos.setText("Que es lo que te gusta hacer a diario u ocacionalmente");
        jButton_Pasatiempos.setBorder(null);
        jButton_Pasatiempos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Pasatiempos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_PasatiemposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_PasatiemposMouseExited(evt);
            }
        });
        jButton_Pasatiempos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PasatiemposActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Pasatiempos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1180, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 260, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Confirmar cierre de programa">
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
    }// </editor-fold>

    private void jButton_NombresImporantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NombresImporantesActionPerformed
        // Caso uno

        dispose();

        new Cumpleaños().setVisible(true);
    }//GEN-LAST:event_jButton_NombresImporantesActionPerformed

    private void jButton_PasatiemposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PasatiemposActionPerformed
        // Caso dos

        dispose();

        new Pasatiempos().setVisible(true);
    }//GEN-LAST:event_jButton_PasatiemposActionPerformed

    private void jButton_HoraDormirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HoraDormirActionPerformed
        // Caso tres

        dispose();

        new Sueño().setVisible(true);
    }//GEN-LAST:event_jButton_HoraDormirActionPerformed

    private void jButton_ContactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ContactosActionPerformed
        // Caso cuatro

        dispose();

        new Parientes().setVisible(true);
    }//GEN-LAST:event_jButton_ContactosActionPerformed

    private void jButton_MedicinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MedicinasActionPerformed
        // Caso Seis

        dispose();

        new Medicamentos().setVisible(true);
    }//GEN-LAST:event_jButton_MedicinasActionPerformed

    private void jButton_DatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DatosPersonalesActionPerformed
        // Caso cinco

        dispose();

        new Personales().setVisible(true);
    }//GEN-LAST:event_jButton_DatosPersonalesActionPerformed

    private void jLabel_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SalirMouseClicked
        // accion salir

        System.exit(0);
    }//GEN-LAST:event_jLabel_SalirMouseClicked

    int xMouse, yMouse;

    private void jLabel_SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SalirMouseEntered
        // Colorear cuando pasa encima el cursor
        jLabel_Salir.setBackground(Color.red);
        jLabel_Salir.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_SalirMouseEntered

    private void jLabel_SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SalirMouseExited
        // colorear cuando sale el cursor
        jLabel_Salir.setBackground(new Color(255, 102, 102));
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

    private void jButton_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VolverActionPerformed
        // Boton volver

        dispose();

        new Actividades().setVisible(true);
    }//GEN-LAST:event_jButton_VolverActionPerformed

    // <editor-fold defaultstate="collapsed" desc="Clorear botones">                          

    private void jButton_NombresImporantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_NombresImporantesMouseEntered
        // Colorear boton nombres cuando mouse pasa encima

        jButton_NombresImporantes.setBackground(new Color(102, 102, 255));
        jButton_NombresImporantes.setForeground(Color.white);

    }//GEN-LAST:event_jButton_NombresImporantesMouseEntered

    private void jButton_NombresImporantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_NombresImporantesMouseExited
// Colorear boton nombres cuando sale el mouse

        jButton_NombresImporantes.setBackground(new Color(204, 204, 255));
        jButton_NombresImporantes.setForeground(Color.black);

    }//GEN-LAST:event_jButton_NombresImporantesMouseExited

    private void jButton_PasatiemposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_PasatiemposMouseEntered
// Colorear boton nombres cuando mouse pasa encima

        jButton_Pasatiempos.setBackground(new Color(102, 102, 255));
        jButton_Pasatiempos.setForeground(Color.white);

    }//GEN-LAST:event_jButton_PasatiemposMouseEntered

    private void jButton_PasatiemposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_PasatiemposMouseExited
// Colorear boton nombres cuando sale el mouse

        jButton_Pasatiempos.setBackground(new Color(204, 204, 255));
        jButton_Pasatiempos.setForeground(Color.black);

    }//GEN-LAST:event_jButton_PasatiemposMouseExited

    private void jButton_HoraDormirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_HoraDormirMouseExited
        // Closk sale

        jButton_HoraDormir.setBackground(new Color(204, 204, 255));
        jButton_HoraDormir.setForeground(Color.black);
    }//GEN-LAST:event_jButton_HoraDormirMouseExited

    private void jButton_HoraDormirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_HoraDormirMouseEntered
        // TODO add your handling code here:

        jButton_HoraDormir.setBackground(new Color(102, 102, 255));
        jButton_HoraDormir.setForeground(Color.white);
    }//GEN-LAST:event_jButton_HoraDormirMouseEntered

    private void jButton_ContactosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ContactosMouseEntered
        // TODO add your handling code here:

        jButton_Contactos.setBackground(new Color(102, 102, 255));
        jButton_Contactos.setForeground(Color.white);

    }//GEN-LAST:event_jButton_ContactosMouseEntered

    private void jButton_ContactosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ContactosMouseExited
        // TODO add your handling code here:
        jButton_Contactos.setBackground(new Color(204, 204, 255));
        jButton_Contactos.setForeground(Color.black);

    }//GEN-LAST:event_jButton_ContactosMouseExited

    private void jButton_MedicinasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_MedicinasMouseEntered
        // TODO add your handling code here:
        jButton_Medicinas.setBackground(new Color(102, 102, 255));
        jButton_Medicinas.setForeground(Color.white);
    }//GEN-LAST:event_jButton_MedicinasMouseEntered

    private void jButton_MedicinasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_MedicinasMouseExited
        // TODO add your handling code here:
        jButton_Medicinas.setBackground(new Color(204, 204, 255));
        jButton_Medicinas.setForeground(Color.black);
    }//GEN-LAST:event_jButton_MedicinasMouseExited

    private void jButton_DatosPersonalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_DatosPersonalesMouseEntered
        // TODO add your handling code here:
        jButton_DatosPersonales.setBackground(new Color(102, 102, 255));
        jButton_DatosPersonales.setForeground(Color.white);
    }//GEN-LAST:event_jButton_DatosPersonalesMouseEntered

    private void jButton_DatosPersonalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_DatosPersonalesMouseExited
        // TODO add your handling code here:
        jButton_DatosPersonales.setBackground(new Color(204, 204, 255));
        jButton_DatosPersonales.setForeground(Color.black);
    }//GEN-LAST:event_jButton_DatosPersonalesMouseExited

    private void jButton_VolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_VolverMouseEntered
        // TODO add your handling code here:
        jButton_Volver.setBackground(new Color(102, 102, 255));
        jButton_Volver.setForeground(Color.white);

    }//GEN-LAST:event_jButton_VolverMouseEntered

    private void jButton_VolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_VolverMouseExited
        // TODO add your handling code here:
        jButton_Volver.setBackground(new Color(204, 204, 255));
        jButton_Volver.setForeground(Color.black);
    }//GEN-LAST:event_jButton_VolverMouseExited

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Contactos;
    private javax.swing.JButton jButton_DatosPersonales;
    private javax.swing.JButton jButton_HoraDormir;
    private javax.swing.JButton jButton_Medicinas;
    private javax.swing.JButton jButton_NombresImporantes;
    private javax.swing.JButton jButton_Pasatiempos;
    private javax.swing.JButton jButton_Volver;
    private javax.swing.JLabel jLabel_HeaderActividades;
    private javax.swing.JLabel jLabel_Salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Header;
    // End of variables declaration//GEN-END:variables
}
