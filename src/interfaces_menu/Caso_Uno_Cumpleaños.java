package interfaces_menu;

import App_Interfaces.*;
import helpers.Sonidos;
import database.Database;
import modelos.Alarma;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 * @author Juan Pablo Figueroa
 * @author Mendoza Castañeda José Ricardo.
 *
 */
public class Caso_Uno_Cumpleaños extends javax.swing.JFrame {

    private int xMouse, yMouse;
    private String horas, minutos, segundos, year, mes, dia;
    private int id_user = 1;

    public Caso_Uno_Cumpleaños() {
        initComponents();
        setLocationRelativeTo(null);

        this.cerrar();

        // Sonidos
        Sonidos objeto = new Sonidos();
        objeto.Caso_Uno();
    }

    public void vaciaCombos() {
        jTextField_NamePersona1.setText("");
        jTextField_KinshipPersona1.setText("");
        jComboBox_Year.setSelectedItem("Año");
        jComboBox_Mes.setSelectedItem("Mes");
        jComboBox_Dia.setSelectedItem("Dia");
        jComboBox_Hour.setSelectedItem("Hour");
        jComboBox_Min.setSelectedItem("Min");
        jComboBox_Seg.setSelectedItem("Seg");
    }

    public void getTime() {

        horas = (String) jComboBox_Hour.getSelectedItem();
        minutos = (String) jComboBox_Min.getSelectedItem();
        segundos = (String) jComboBox_Seg.getSelectedItem();
        year = (String) jComboBox_Year.getSelectedItem();
        mes = (String) jComboBox_Mes.getSelectedItem();
        dia = (String) jComboBox_Dia.getSelectedItem();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Fondo = new javax.swing.JPanel();
        JLabel_Titulo = new javax.swing.JLabel();
        jLabel_NamePesona1 = new javax.swing.JLabel();
        jLabel_KinshipPesona1 = new javax.swing.JLabel();
        jLabel_BirthdayPesona1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField_NamePersona1 = new javax.swing.JTextField();
        jTextField_KinshipPersona1 = new javax.swing.JTextField();
        jButton_Save = new javax.swing.JButton();
        jLabel_BirthdayPesona2 = new javax.swing.JLabel();
        jComboBox_Hour = new javax.swing.JComboBox<>();
        jComboBox_Min = new javax.swing.JComboBox<>();
        jComboBox_Seg = new javax.swing.JComboBox<>();
        jComboBox_Year = new javax.swing.JComboBox<>();
        jComboBox_Mes = new javax.swing.JComboBox<>();
        jComboBox_Dia = new javax.swing.JComboBox<>();
        JLabel_Titulo1 = new javax.swing.JLabel();
        jButton_Borrar1 = new javax.swing.JButton();
        jPanel_Header = new javax.swing.JPanel();
        jLabel_Salir = new javax.swing.JLabel();
        jLabel_HeaderActividades = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel_Fondo.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Fondo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabel_Titulo.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        JLabel_Titulo.setForeground(new java.awt.Color(0, 0, 0));
        JLabel_Titulo.setText("importantes para ti!!!");
        jPanel_Fondo.add(JLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 320, -1));

        jLabel_NamePesona1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel_NamePesona1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_NamePesona1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_IngresaDato.png"))); // NOI18N
        jLabel_NamePesona1.setText("NOMBRE:");
        jPanel_Fondo.add(jLabel_NamePesona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        jLabel_KinshipPesona1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel_KinshipPesona1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_KinshipPesona1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_PersonaImportante.png"))); // NOI18N
        jLabel_KinshipPesona1.setText("Parentesco:");
        jPanel_Fondo.add(jLabel_KinshipPesona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 30));

        jLabel_BirthdayPesona1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel_BirthdayPesona1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_BirthdayPesona1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Cum.png"))); // NOI18N
        jLabel_BirthdayPesona1.setText("Cumpleaños:");
        jPanel_Fondo.add(jLabel_BirthdayPesona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 30));
        jPanel_Fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 310, 10));
        jPanel_Fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 310, 10));

        jTextField_NamePersona1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_NamePersona1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_NamePersona1.setBorder(null);
        jPanel_Fondo.add(jTextField_NamePersona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 310, 30));

        jTextField_KinshipPersona1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_KinshipPersona1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_KinshipPersona1.setBorder(null);
        jPanel_Fondo.add(jTextField_KinshipPersona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 310, 30));

        jButton_Save.setBackground(new java.awt.Color(204, 204, 255));
        jButton_Save.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_Save.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Guardar.png"))); // NOI18N
        jButton_Save.setText("Guadar");
        jButton_Save.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SaveActionPerformed(evt);
            }
        });
        jPanel_Fondo.add(jButton_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel_BirthdayPesona2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel_BirthdayPesona2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_BirthdayPesona2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Alarma.png"))); // NOI18N
        jLabel_BirthdayPesona2.setText("Hora de recordar:");
        jPanel_Fondo.add(jLabel_BirthdayPesona2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 30));

        jComboBox_Hour.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox_Hour.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jComboBox_Hour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hour", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "00" }));
        jComboBox_Hour.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_Fondo.add(jComboBox_Hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        jComboBox_Min.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox_Min.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jComboBox_Min.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Min", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jComboBox_Min.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_Fondo.add(jComboBox_Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        jComboBox_Seg.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox_Seg.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jComboBox_Seg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seg", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jComboBox_Seg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_Fondo.add(jComboBox_Seg, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));

        jComboBox_Year.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox_Year.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jComboBox_Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", " " }));
        jComboBox_Year.setBorder(null);
        jComboBox_Year.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_Fondo.add(jComboBox_Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        jComboBox_Mes.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox_Mes.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jComboBox_Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jComboBox_Mes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_Fondo.add(jComboBox_Mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        jComboBox_Dia.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox_Dia.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jComboBox_Dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox_Dia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_Fondo.add(jComboBox_Dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        JLabel_Titulo1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        JLabel_Titulo1.setForeground(new java.awt.Color(0, 0, 0));
        JLabel_Titulo1.setText("Ingresa el cumpleaños de personas ");
        jPanel_Fondo.add(JLabel_Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 490, -1));

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
        jPanel_Fondo.add(jButton_Borrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, -1));

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
        jPanel_Header.add(jLabel_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 40, -1));

        jLabel_HeaderActividades.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel_HeaderActividades.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_HeaderActividades.setText("Cumpleaños");
        jPanel_Header.add(jLabel_HeaderActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel_Fondo.add(jPanel_Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
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

    private void jButton_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SaveActionPerformed
        
        Alarma alarm;
        getTime();
        try
        {

            if (!jTextField_NamePersona1.getText().equals(""))
            {
                
                String hora = horas + ":" + minutos + ":" + segundos;
                String desc = "Es hora de recordar que " + jTextField_NamePersona1.getText() + " es tu " + jTextField_KinshipPersona1.getText() + "y su cumpleaños es el: " + year + "-" + mes + "-" + dia;
                
                alarm = new Alarma(desc, "cumpleaños", id_user, hora);
                
                Database.insert( alarm );

            }

        } catch (Exception ex)
        {
            Logger.getLogger(Caso_Uno_Cumpleaños.class.getName()).log(Level.SEVERE, null, ex);
        }

        String respuesta = JOptionPane.showInputDialog(null, "Te gustaria configurar otra opcion?");

        if (respuesta.equalsIgnoreCase("Si"))
        {
            vaciaCombos();
        } else if (respuesta.equalsIgnoreCase("no"))
        {
            dispose();
            new Caso_Actividades().setVisible(true);
        }

    }//GEN-LAST:event_jButton_SaveActionPerformed

    private void jButton_Borrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Borrar1ActionPerformed
        // Boton de Regreso.
        dispose();

        new Caso_Menu().setVisible(true);
    }//GEN-LAST:event_jButton_Borrar1ActionPerformed

    private void jLabel_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SalirMouseClicked
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
            java.util.logging.Logger.getLogger(Caso_Uno_Cumpleaños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Caso_Uno_Cumpleaños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Caso_Uno_Cumpleaños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Caso_Uno_Cumpleaños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caso_Uno_Cumpleaños().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel_Titulo;
    private javax.swing.JLabel JLabel_Titulo1;
    private javax.swing.JButton jButton_Borrar1;
    private javax.swing.JButton jButton_Save;
    private javax.swing.JComboBox<String> jComboBox_Dia;
    private javax.swing.JComboBox<String> jComboBox_Hour;
    private javax.swing.JComboBox<String> jComboBox_Mes;
    private javax.swing.JComboBox<String> jComboBox_Min;
    private javax.swing.JComboBox<String> jComboBox_Seg;
    private javax.swing.JComboBox<String> jComboBox_Year;
    private javax.swing.JLabel jLabel_BirthdayPesona1;
    private javax.swing.JLabel jLabel_BirthdayPesona2;
    private javax.swing.JLabel jLabel_HeaderActividades;
    private javax.swing.JLabel jLabel_KinshipPesona1;
    private javax.swing.JLabel jLabel_NamePesona1;
    private javax.swing.JLabel jLabel_Salir;
    private javax.swing.JPanel jPanel_Fondo;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField_KinshipPersona1;
    public javax.swing.JTextField jTextField_NamePersona1;
    // End of variables declaration//GEN-END:variables
}
