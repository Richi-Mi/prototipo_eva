package menuInterfaces;

import interfaces.Actividades;
import interfaces.Menu;
import helpers.Sonidos;
import database.Database;
import modelos.Alarma;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Juan Pablo Figueroa
 * @author Mendoza Castañeda José Ricardo
 */
public class Medicamentos extends javax.swing.JFrame {

    private String horas, minutos, segundos, year, mes, dia;
    private int xMouse, yMouse;

    private int id_user = 1;

    public Medicamentos() {
        initComponents();
        setLocationRelativeTo(null);

        this.cerrar();

        Sonidos objeto = new Sonidos();
        objeto.Caso_Seis();

    }

    public void getTime() {
        horas = (String) jComboBox_Hour.getSelectedItem();
        minutos = (String) jComboBox_Min.getSelectedItem();
        segundos = (String) jComboBox_Seg.getSelectedItem();

    }

    public void vacia() {
        jTextField_NameMedicina.setText("");
        jComboBox_Hour.setSelectedItem("Hour");
        jComboBox_Min.setSelectedItem("Min");
        jComboBox_Seg.setSelectedItem("Seg");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_NamePesona1 = new javax.swing.JLabel();
        jButton_SaveMedicinas = new javax.swing.JButton();
        jLabel_BirthdayPesona2 = new javax.swing.JLabel();
        jComboBox_Hour = new javax.swing.JComboBox<>();
        jComboBox_Min = new javax.swing.JComboBox<>();
        jComboBox_Seg = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField_NameMedicina = new javax.swing.JTextField();
        jPanel_Header = new javax.swing.JPanel();
        jLabel_Salir = new javax.swing.JLabel();
        jLabel_HeaderActividades = new javax.swing.JLabel();
        jButton_Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_NamePesona1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel_NamePesona1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_NamePesona1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Medicinas.png"))); // NOI18N
        jLabel_NamePesona1.setText("Nombre del medicamento:");
        jPanel1.add(jLabel_NamePesona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jButton_SaveMedicinas.setBackground(new java.awt.Color(204, 204, 255));
        jButton_SaveMedicinas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_SaveMedicinas.setForeground(new java.awt.Color(0, 0, 0));
        jButton_SaveMedicinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Guardar.png"))); // NOI18N
        jButton_SaveMedicinas.setText("Guardar");
        jButton_SaveMedicinas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_SaveMedicinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SaveMedicinasActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_SaveMedicinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel_BirthdayPesona2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel_BirthdayPesona2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_BirthdayPesona2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Alarma.png"))); // NOI18N
        jLabel_BirthdayPesona2.setText("Hora a recordar");
        jPanel1.add(jLabel_BirthdayPesona2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jComboBox_Hour.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox_Hour.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jComboBox_Hour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hour", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        jComboBox_Hour.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jComboBox_Hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jComboBox_Min.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox_Min.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jComboBox_Min.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Min", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jComboBox_Min.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jComboBox_Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jComboBox_Seg.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox_Seg.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jComboBox_Seg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seg", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jComboBox_Seg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jComboBox_Seg, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 310, -1));

        jTextField_NameMedicina.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_NameMedicina.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_NameMedicina.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_NameMedicina.setBorder(null);
        jTextField_NameMedicina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NameMedicinaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_NameMedicina, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 310, 30));

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
        jPanel_Header.add(jLabel_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 40, -1));

        jLabel_HeaderActividades.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel_HeaderActividades.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_HeaderActividades.setText("Medicamentos");
        jPanel_Header.add(jLabel_HeaderActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel_Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton_Volver.setBackground(new java.awt.Color(204, 204, 255));
        jButton_Volver.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_Volver.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Actividades.png"))); // NOI18N
        jButton_Volver.setText("Volver");
        jButton_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VolverActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
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

    private void jButton_SaveMedicinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SaveMedicinasActionPerformed

        Alarma alarm;

        getTime();
        try
        {

            if (!jTextField_NameMedicina.getText().equals(""))
            {
                String des = "Toma tu medicina. " + jTextField_NameMedicina.getText();
                String hora = horas + ":" + segundos + ":" + minutos;

                alarm = new Alarma(des, "medicina", id_user, hora);
                Database.insert(alarm);
            }

        } catch (Exception ex)
        {
            Logger.getLogger(Medicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }

        String respuesta = JOptionPane.showInputDialog(null, "Te gustaria configurar otra opcion?");
        if (respuesta.equalsIgnoreCase("Si"))
        {
            vacia();
        } else if (respuesta.equalsIgnoreCase("NO"))
        {
            dispose();
            new Actividades().setVisible(true);

        }

    }//GEN-LAST:event_jButton_SaveMedicinasActionPerformed

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

    private void jTextField_NameMedicinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NameMedicinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NameMedicinaActionPerformed

    private void jButton_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VolverActionPerformed
        // boton volver

        dispose();

        new Menu().setVisible(true);

    }//GEN-LAST:event_jButton_VolverActionPerformed

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
            java.util.logging.Logger.getLogger(Medicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Medicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Medicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Medicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Medicamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_SaveMedicinas;
    private javax.swing.JButton jButton_Volver;
    private javax.swing.JComboBox<String> jComboBox_Hour;
    private javax.swing.JComboBox<String> jComboBox_Min;
    private javax.swing.JComboBox<String> jComboBox_Seg;
    private javax.swing.JLabel jLabel_BirthdayPesona2;
    private javax.swing.JLabel jLabel_HeaderActividades;
    private javax.swing.JLabel jLabel_NamePesona1;
    private javax.swing.JLabel jLabel_Salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_NameMedicina;
    // End of variables declaration//GEN-END:variables
}
