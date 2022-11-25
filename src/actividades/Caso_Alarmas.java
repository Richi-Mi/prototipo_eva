/** CASO ALARMAS.
 * Funciones:
 * - Mostrar las alarmas que tiene el usuario actual.
 * - Agregar una nueva alarma.
 * - Eliminar una alarma de un usuario.
 */
package actividades;

import interfaces.Actividades;
import database.Database;
import helpers.Sonidos;
import app_alarmas.CrearAlarmas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Alarma;

/**
 * NOTA: Solucionar Errores.
 * @author Mendoza Castañeda José Ricardo
 */
public class Caso_Alarmas extends javax.swing.JFrame {
    private DefaultTableModel model;
    private int id = 1; // Cambiarlo por el nombre
    private CrearAlarmas crear;
    
    public Caso_Alarmas() {
        initComponents();
        model = (DefaultTableModel) table.getModel();
        crear = new CrearAlarmas();
        
        Sonidos objeto = new Sonidos();
        objeto.Caso_Alarmas();
        
        setLocationRelativeTo(null);
        
        crear.programarTodasLasAlarmas();
        
        this.llenarCombos();
        this.limpiarTabla();
        
        this.consultarAlarmas();
    }
    public void llenarCombos() {
        int i;
        for( i = 1; i <= 24; i++ ) {
            comboHoras.addItem( String.valueOf(i) );
        }
        for( i = 0; i <= 60; i++ ) {
            comboMinutos.addItem( String.valueOf(i) );
            comboSegundos.addItem( String.valueOf(i) );
            
        }
    }

    public void limpiarTabla() {
        model.getDataVector().removeAllElements();
    }

    public void consultarAlarmas() {
        ArrayList<String[]> alarmas = Database.selectAlarmas(id);
        for (int i = 0; i < alarmas.size(); i++)
        {
            String[] alarm = alarmas.get(i);
            model.addRow(alarm);
        }
        table.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Borrar1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbl_nombre = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        input_nombre = new javax.swing.JTextField();
        lbl_hora = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        comboHoras = new javax.swing.JComboBox<>();
        comboMinutos = new javax.swing.JComboBox<>();
        comboSegundos = new javax.swing.JComboBox<>();
        jButton_Volver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();

        jButton_Borrar1.setBackground(new java.awt.Color(204, 204, 255));
        jButton_Borrar1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_Borrar1.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Borrar1.setText("Volver");
        jButton_Borrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Borrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Borrar1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(0, 0, 0));
        lbl_nombre.setText("Nombre de la Alarma:");
        jPanel1.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 400, 10));

        input_nombre.setBackground(new java.awt.Color(255, 255, 255));
        input_nombre.setBorder(null);
        jPanel1.add(input_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 410, 20));

        lbl_hora.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_hora.setForeground(new java.awt.Color(0, 0, 0));
        lbl_hora.setText("Hora a sonar: ");
        jPanel1.add(lbl_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        btn_agregar.setBackground(new java.awt.Color(153, 153, 255));
        btn_agregar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(0, 0, 0));
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Alarma.png"))); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 200, -1));

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setForeground(new java.awt.Color(0, 0, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID: ", "Nombre", "Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 221, 610, 280));

        comboHoras.setBackground(new java.awt.Color(204, 204, 255));
        comboHoras.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        comboHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hour" }));
        jPanel1.add(comboHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        comboMinutos.setBackground(new java.awt.Color(204, 204, 255));
        comboMinutos.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        comboMinutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Min" }));
        jPanel1.add(comboMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        comboSegundos.setBackground(new java.awt.Color(204, 204, 255));
        comboSegundos.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        comboSegundos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seg" }));
        jPanel1.add(comboSegundos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        jButton_Volver.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Volver.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_Volver.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Actividades.png"))); // NOI18N
        jButton_Volver.setText("Volver");
        jButton_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VolverActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 200, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_title.setBackground(new java.awt.Color(255, 255, 255));
        lbl_title.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("Agregar Alarma");
        jPanel2.add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        String nombre = input_nombre.getText();
        String hora = comboHoras.getSelectedItem() + ":" + comboMinutos.getSelectedItem() + ":" + comboSegundos.getSelectedItem();
        
        Alarma alarm = new Alarma(nombre, "extra", id, hora);
        
        Database.insert( alarm );

        this.limpiarTabla();
        this.consultarAlarmas();
       
        JOptionPane.showMessageDialog(null, "Alarma Agregada :D");
        
        input_nombre.setText("");

        comboHoras.setSelectedItem("Hour");
        comboMinutos.setSelectedItem("Min");
        comboSegundos.setSelectedItem("Seg");
        
        
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        
    }//GEN-LAST:event_tableMouseClicked

    private void jButton_Borrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Borrar1ActionPerformed
        // boton volver

        dispose();
        new Actividades().setVisible(true);
        
    }//GEN-LAST:event_jButton_Borrar1ActionPerformed

    private void jButton_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VolverActionPerformed
        // boton volver
        
        dispose();
        new Actividades().setVisible(true);
        
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
            java.util.logging.Logger.getLogger(Caso_Alarmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Caso_Alarmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Caso_Alarmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Caso_Alarmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caso_Alarmas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JComboBox<String> comboHoras;
    private javax.swing.JComboBox<String> comboMinutos;
    private javax.swing.JComboBox<String> comboSegundos;
    private javax.swing.JTextField input_nombre;
    private javax.swing.JButton jButton_Borrar1;
    private javax.swing.JButton jButton_Volver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
