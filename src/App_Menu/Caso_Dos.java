
package App_Menu;

import App_Interfaces.Caso_Actividades;
import App_Interfaces.Caso_Menu;
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
 * @author Mendoza Castañeda José Ricardo.
 * 
 * TODO: configurar las alarmas
 */
public class Caso_Dos extends javax.swing.JFrame {
    
    private String horas, minutos, segundos;
    private int xMouse, yMouse;
    
    public Caso_Dos() {
        initComponents();
        setLocationRelativeTo(null);
        
        this.cerrar();
        Sonidos sounds = new Sonidos();
        sounds.Caso_Dos();
    }
    public void vaciaFormulario() {
        
        jTextField_Pasatiempo.setText("");
        jComboBox_Hour.setSelectedItem("Hour");
        jComboBox_Min.setSelectedItem("Min");
        jComboBox_Seg.setSelectedItem("Seg");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Fondo = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField_Pasatiempo = new javax.swing.JTextField();
        jButton_SavePasatiempo = new javax.swing.JButton();
        jComboBox_Hour = new javax.swing.JComboBox<>();
        jComboBox_Seg = new javax.swing.JComboBox<>();
        jComboBox_Min = new javax.swing.JComboBox<>();
        JLabel_Titulo1 = new javax.swing.JLabel();
        jLabel_Pasatiempo = new javax.swing.JLabel();
        jLabel_HoraDeRecordar = new javax.swing.JLabel();
        jButton_Borrar1 = new javax.swing.JButton();
        jPanel_Header = new javax.swing.JPanel();
        jLabel_Salir = new javax.swing.JLabel();
        jLabel_HeaderActividades = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(866, 591));

        jPanel_Fondo.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel_Fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 350, 10));

        jTextField_Pasatiempo.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pasatiempo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_Pasatiempo.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_Pasatiempo.setBorder(null);
        jPanel_Fondo.add(jTextField_Pasatiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 350, 30));

        jButton_SavePasatiempo.setBackground(new java.awt.Color(204, 204, 255));
        jButton_SavePasatiempo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_SavePasatiempo.setForeground(new java.awt.Color(0, 0, 0));
        jButton_SavePasatiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Guardar.png"))); // NOI18N
        jButton_SavePasatiempo.setText("Guardar");
        jButton_SavePasatiempo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_SavePasatiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SavePasatiempoActionPerformed(evt);
            }
        });
        jPanel_Fondo.add(jButton_SavePasatiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        jComboBox_Hour.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox_Hour.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jComboBox_Hour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hour", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        jComboBox_Hour.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_Fondo.add(jComboBox_Hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        jComboBox_Seg.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox_Seg.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jComboBox_Seg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seg", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jComboBox_Seg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_Fondo.add(jComboBox_Seg, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jComboBox_Min.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox_Min.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jComboBox_Min.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Min", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jComboBox_Min.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_Fondo.add(jComboBox_Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        JLabel_Titulo1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        JLabel_Titulo1.setForeground(new java.awt.Color(0, 0, 0));
        JLabel_Titulo1.setText("Escribe tus pasatiempos favoritos");
        jPanel_Fondo.add(JLabel_Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel_Pasatiempo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel_Pasatiempo.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_Pasatiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Pasatiempo.png"))); // NOI18N
        jLabel_Pasatiempo.setText("Pasatiempo:");
        jPanel_Fondo.add(jLabel_Pasatiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 30));

        jLabel_HoraDeRecordar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel_HoraDeRecordar.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_HoraDeRecordar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Alarma.png"))); // NOI18N
        jLabel_HoraDeRecordar.setText("Hora de recordar");
        jPanel_Fondo.add(jLabel_HoraDeRecordar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 30));

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
        jPanel_Fondo.add(jButton_Borrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 130, -1));

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
        jLabel_HeaderActividades.setText("Pasatiempos");
        jPanel_Header.add(jLabel_HeaderActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel_Fondo.add(jPanel_Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Confirmar cierre de programa">
    public void cerrar() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                @Override
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

    private void jButton_SavePasatiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SavePasatiempoActionPerformed

        Alarma alarm;
        
        horas = (String) jComboBox_Hour.getSelectedItem();
        minutos = (String) jComboBox_Min.getSelectedItem();
        segundos = (String) jComboBox_Seg.getSelectedItem();
        
        if ( !jTextField_Pasatiempo.getText().equals("") ) {
            String nombre_alarma = jTextField_Pasatiempo.getText();
            String tiempo_alarma = horas + ":" + minutos + ":" + segundos;
            String tipo          = "pasatiempos";
            int id_user          = 1;
            
            alarm = new Alarma( nombre_alarma, tipo, id_user, tiempo_alarma);
            Database.insert(alarm);
        }
        
        
        String respuesta = JOptionPane.showInputDialog(null, "Te gustaria configurar otra opcion?");
        
        if (respuesta.equalsIgnoreCase("SI")) 
            vaciaFormulario();
        else if (respuesta.equalsIgnoreCase("no")) {
            dispose();
            new Caso_Actividades().setVisible(true);
        }


    }//GEN-LAST:event_jButton_SavePasatiempoActionPerformed

    private void jLabel_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_SalirMouseClicked

    private void jLabel_SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SalirMouseEntered
        // Colorear cuando pasa encima el cursor
        jLabel_Salir.setBackground(Color.red);
        jLabel_Salir.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_SalirMouseEntered

    private void jLabel_SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SalirMouseExited
        // Colorear cuando sale el cursor
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

        dispose();

        new Caso_Menu().setVisible(true);
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
            java.util.logging.Logger.getLogger(Caso_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caso_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caso_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caso_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caso_Dos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel_Titulo1;
    private javax.swing.JButton jButton_Borrar1;
    private javax.swing.JButton jButton_SavePasatiempo;
    private javax.swing.JComboBox<String> jComboBox_Hour;
    private javax.swing.JComboBox<String> jComboBox_Min;
    private javax.swing.JComboBox<String> jComboBox_Seg;
    private javax.swing.JLabel jLabel_HeaderActividades;
    private javax.swing.JLabel jLabel_HoraDeRecordar;
    private javax.swing.JLabel jLabel_Pasatiempo;
    private javax.swing.JLabel jLabel_Salir;
    private javax.swing.JPanel jPanel_Fondo;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_Pasatiempo;
    // End of variables declaration//GEN-END:variables

}
