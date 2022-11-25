
package menuInterfaces;

import interfaces.Actividades;
import interfaces.Menu;
import helpers.Sonidos;
import database.Database;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelos.Alarma;

/**
 * @author Juan Pablo Figueroa
 * @author Mendoza Castañeda José Ricardo
 */

public class Sueño extends javax.swing.JFrame {
    
    private int xMouse, yMouse;
    private String horas_desp, minutos_desp, segundos_desp, horas_dor, minutos_dor, segundos_dor;
    
    public Sueño() {
        initComponents();
        setLocationRelativeTo(null);
        
        this.cerrar();
        
        Sonidos sounds = new Sonidos();
        sounds.Caso_Tres();
    }
    
    public void vaciaFormulario() {
        jComboBox_HourDespierta.setSelectedItem("Hour");
        jComboBox_MinDespierta.setSelectedItem("Min");
        jComboBox_SegDespierta.setSelectedItem("Seg");
        jComboBox_HourDuerme.setSelectedItem("Hour");
        jComboBox_MinDuerme.setSelectedItem("Min");
        jComboBox_SegDuerme.setSelectedItem("Seg");
    }
    public void agregarInformacion() {
        
        Alarma despertar, dormir;
        
        horas_desp    = (String) jComboBox_HourDespierta.getSelectedItem();
        minutos_desp  = (String) jComboBox_MinDespierta.getSelectedItem();
        segundos_desp = (String) jComboBox_SegDespierta.getSelectedItem();
        horas_dor     = (String) jComboBox_HourDuerme.getSelectedItem();
        minutos_dor   = (String) jComboBox_MinDuerme.getSelectedItem();
        segundos_dor  = (String) jComboBox_SegDuerme.getSelectedItem();
        
        if (!jComboBox_HourDespierta.getSelectedItem().equals("Hour")) {
            String nombre_desp = "Hora de Despertar";
            String nombre_dor  = "Hora de Dormir";
            String tipo        = "sueño";
            int id_usuario  = 1;
            String hora_desp   = horas_desp + ":" + minutos_desp + ":" + segundos_desp;
            String hora_dor    = horas_dor + ":" + minutos_dor + ":" + segundos_dor;
            
            despertar = new Alarma(nombre_desp, tipo, id_usuario, hora_desp);
            dormir = new Alarma(nombre_dor, tipo, id_usuario, hora_dor);
            
            Database.insert(dormir);
            Database.insert(despertar);
        }
        
        
        
        String respuesta = JOptionPane.showInputDialog(null, "Te gustaria configurar otra opcion?");
        
        if (respuesta.equalsIgnoreCase("Si")) 
            vaciaFormulario();
         else if (respuesta.equalsIgnoreCase("no")) {
            dispose();
            new Actividades().setVisible(true);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_PreguntaDespierta = new javax.swing.JLabel();
        jLabel_PreguntaDuerme = new javax.swing.JLabel();
        jButton_SaveAlarmas = new javax.swing.JButton();
        jComboBox_HourDespierta = new javax.swing.JComboBox<>();
        jComboBox_MinDespierta = new javax.swing.JComboBox<>();
        jComboBox_SegDespierta = new javax.swing.JComboBox<>();
        jComboBox_HourDuerme = new javax.swing.JComboBox<>();
        jComboBox_MinDuerme = new javax.swing.JComboBox<>();
        jComboBox_SegDuerme = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jButton_Borrar1 = new javax.swing.JButton();
        jPanel_Header = new javax.swing.JPanel();
        jLabel_HeaderActividades = new javax.swing.JLabel();
        jLabel_Salir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 138, 350, -1));

        jLabel_PreguntaDespierta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel_PreguntaDespierta.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_PreguntaDespierta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_PreguntaDespierta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Alarma.png"))); // NOI18N
        jLabel_PreguntaDespierta.setText("¿A que hora te gusta despertar ?");
        jPanel1.add(jLabel_PreguntaDespierta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 350, -1));

        jLabel_PreguntaDuerme.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel_PreguntaDuerme.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_PreguntaDuerme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_PreguntaDuerme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_dormir.png"))); // NOI18N
        jLabel_PreguntaDuerme.setText("¿A que hora te gusta dormir?");
        jPanel1.add(jLabel_PreguntaDuerme, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 350, -1));

        jButton_SaveAlarmas.setBackground(new java.awt.Color(102, 102, 255));
        jButton_SaveAlarmas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_SaveAlarmas.setForeground(new java.awt.Color(0, 0, 0));
        jButton_SaveAlarmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Guardar.png"))); // NOI18N
        jButton_SaveAlarmas.setText("Guardar");
        jButton_SaveAlarmas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_SaveAlarmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SaveAlarmasActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_SaveAlarmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jComboBox_HourDespierta.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox_HourDespierta.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jComboBox_HourDespierta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hour", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        jComboBox_HourDespierta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jComboBox_HourDespierta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jComboBox_MinDespierta.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox_MinDespierta.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jComboBox_MinDespierta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Min", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jComboBox_MinDespierta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jComboBox_MinDespierta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jComboBox_SegDespierta.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox_SegDespierta.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jComboBox_SegDespierta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seg", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jComboBox_SegDespierta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jComboBox_SegDespierta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jComboBox_HourDuerme.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox_HourDuerme.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jComboBox_HourDuerme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hour", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        jComboBox_HourDuerme.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jComboBox_HourDuerme, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jComboBox_MinDuerme.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox_MinDuerme.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jComboBox_MinDuerme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Min", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jComboBox_MinDuerme.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jComboBox_MinDuerme, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jComboBox_SegDuerme.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox_SegDuerme.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jComboBox_SegDuerme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seg", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jComboBox_SegDuerme.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jComboBox_SegDuerme, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 350, 30));

        jButton_Borrar1.setBackground(new java.awt.Color(102, 102, 255));
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
        jPanel1.add(jButton_Borrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        jPanel_Header.setBackground(new java.awt.Color(102, 102, 255));
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
        jPanel_Header.setLayout(new java.awt.GridLayout());

        jLabel_HeaderActividades.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel_HeaderActividades.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_HeaderActividades.setText("Hora de dormir");
        jPanel_Header.add(jLabel_HeaderActividades);

        jLabel_Salir.setBackground(new java.awt.Color(255, 51, 51));
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
        jPanel_Header.add(jLabel_Salir);

        jPanel1.add(jPanel_Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    public void confirmarSalida() {

        int valor = JOptionPane.showConfirmDialog(this, "¿Estás segur@ de cerrar el programa?", "Advertencia", JOptionPane.YES_NO_OPTION);

        if (valor == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa :)", "Gracias", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }// </editor-fold>

    private void jButton_SaveAlarmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SaveAlarmasActionPerformed
        agregarInformacion();
    }//GEN-LAST:event_jButton_SaveAlarmasActionPerformed

    private void jLabel_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SalirMouseClicked
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
            java.util.logging.Logger.getLogger(Sueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Sueño().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Borrar1;
    private javax.swing.JButton jButton_SaveAlarmas;
    private javax.swing.JComboBox<String> jComboBox_HourDespierta;
    private javax.swing.JComboBox<String> jComboBox_HourDuerme;
    private javax.swing.JComboBox<String> jComboBox_MinDespierta;
    private javax.swing.JComboBox<String> jComboBox_MinDuerme;
    private javax.swing.JComboBox<String> jComboBox_SegDespierta;
    private javax.swing.JComboBox<String> jComboBox_SegDuerme;
    private javax.swing.JLabel jLabel_HeaderActividades;
    private javax.swing.JLabel jLabel_PreguntaDespierta;
    private javax.swing.JLabel jLabel_PreguntaDuerme;
    private javax.swing.JLabel jLabel_Salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
