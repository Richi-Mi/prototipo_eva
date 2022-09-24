/** Modulo Ayuda.
 * - Ver que contactos puede llamar el usuario en caso de emergencia
 */
package App_Actividades;

import App_Actividades_Clases.AccionesAyuda;
import App_Interfaces.Caso_Actividades;
import App_Interfaces.Caso_Menu;
import app_alarmas.CrearAlarmas;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JSeparator;

/**
 * @author Mendoza Castañeda José Ricardo
 */

public class Caso_Ayuda extends javax.swing.JFrame {
    
    private AccionesAyuda acciones = new AccionesAyuda();
    private int id = 1, i;
    
    private CrearAlarmas crear = new CrearAlarmas();
    
    public Caso_Ayuda() {
        initComponents();
        setLocationRelativeTo(null);
        this.mostrarContactos();
        
        crear.programarTodasLasAlarmas();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelPrincipal = new javax.swing.JPanel();
        jButton_Volver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Puedes llamar a estos contactos:");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new java.awt.GridLayout(0, 2, 4, 0));
        jScrollPane1.setViewportView(panelPrincipal);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 480, 340));

        jButton_Volver.setBackground(new java.awt.Color(204, 204, 255));
        jButton_Volver.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_Volver.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Actividades.png"))); // NOI18N
        jButton_Volver.setText("Volver");
        jButton_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VolverActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Numeros de Ayuda");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 432, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VolverActionPerformed
        // boton volver
        
        dispose();
        
        new Caso_Actividades().setVisible(true);
        
    }//GEN-LAST:event_jButton_VolverActionPerformed

    public void mostrarContactos() {
        
        Vector<Object[]> telefonos = acciones.getNumeros( id );
        
        for( i = 0; i < telefonos.size(); i++ ) {
            
            Object[] telefono = telefonos.elementAt( i );
            
            String mensajeInfo = telefono[3] + ". - " + telefono[1] + ": ";
            JLabel labelInfo = new JLabel( mensajeInfo ); 
            
            String mensajeNum = telefono[2] + "";
            JLabel labelNum = new JLabel( mensajeNum );       
            
            panelPrincipal.add( labelInfo );
            panelPrincipal.add( labelNum );   
            
            JSeparator separador1 = new JSeparator();
            JSeparator separador2 = new JSeparator();
            
            panelPrincipal.add( separador1 );
            panelPrincipal.add( separador2 );
        }
        
   
        panelPrincipal.updateUI();
    }
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
            java.util.logging.Logger.getLogger(Caso_Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caso_Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caso_Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caso_Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caso_Ayuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
