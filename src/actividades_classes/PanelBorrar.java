/** CASO BORRAR.
 * Mostrara la Información de lo que se le mande 
 */
package actividades_classes;

import java.awt.Color;
import javax.swing.JOptionPane;
import modelos.Alarma;

/**
 * @author Mendoza Castañeda José Ricardo
 */

public class PanelBorrar extends javax.swing.JPanel {
    
    private String nombre, hora, caso;
    private Alarma alarm;
    private int id_usuario = 1;
    
    public PanelBorrar( String nombre, String hora, String tipo ) {
        initComponents();
        
        this.nombre = nombre;
        this.hora = hora;
        this.caso = tipo;
        
        alarm = new Alarma(this.nombre, this.caso, id_usuario, hora);
        
        this.mostrarInfo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_key = new javax.swing.JLabel();
        lbl_value = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lbl_key.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbl_key.setForeground(new java.awt.Color(0, 0, 0));
        lbl_key.setText("(Texto Negritas)");

        lbl_value.setFont(new java.awt.Font("Liberation Sans", 2, 18)); // NOI18N
        lbl_value.setForeground(new java.awt.Color(0, 0, 0));
        lbl_value.setText("(Valor)");

        btnEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Diseños/Icono_Basura.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_key)
                    .addComponent(lbl_value)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(342, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_key)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_value)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
        database.Database.delete(alarm);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        // TODO add your handling code here:
        
        btnEliminar.setBackground(new Color(249, 223, 223));
        btnEliminar.setForeground(Color.black);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        // TODO add your handling code here:
        btnEliminar.setBackground(new Color(204, 0, 0));
        btnEliminar.setForeground(Color.white);
        
    }//GEN-LAST:event_btnEliminarMouseExited

    public void mostrarInfo() {
        lbl_key.setText("Nombre de la alarma: " + this.nombre);
        lbl_value.setText("Hora de Sonar: " + this.hora );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel lbl_key;
    private javax.swing.JLabel lbl_value;
    // End of variables declaration//GEN-END:variables
}
