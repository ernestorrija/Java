

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import Logica.Kioskero;
import Logica.Kiosko;
import Logica.KioskoException;
import Logica.Secretario;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Ernesto
 */
public class PantallaAdministracion extends javax.swing.JFrame {

    private JFrame principal;
    Kiosko tienda;
    int productoBusqueda;
    
    /**
     * Creates new form PantallaRegistro
     */
    public PantallaAdministracion(JFrame ventana,Kiosko tienda) {
        initComponents();
        principal = ventana;
        principal.setVisible(true);
        setSize(400, 400);
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new java.awt.Color(200, 200, 240));
        int productoBusqueda = 0;
        jButtonAñadirLibro.setEnabled(false);
        jButtonBorrar.setEnabled(false);
        jButtonBusqueda.setEnabled(false);
        jButtonSiguienteCoincidencia.setEnabled(false);
        jButtonAñadirLector.setEnabled(false);
        jButtonEliminar.setEnabled(false);        
    
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonAñadirLibro = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jTextFieldResultado = new javax.swing.JTextField();
        jButtonBusqueda = new javax.swing.JButton();
        jButtonSiguienteCoincidencia = new javax.swing.JButton();
        jTextFieldUsuario = new javax.swing.JTextField();
        jTextFieldContraseña = new javax.swing.JTextField();
        jButtonIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonAñadirLector = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonBuscarUsuario = new javax.swing.JButton();
        jTextFieldBuscarUsuario = new javax.swing.JTextField();
        jTextFieldResultadoBuscaquedaUsuario = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAñadirLibro.setText("Añadir Libro");
        jButtonAñadirLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirLibroActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonBorrar.setText("Borrar Seleccionado");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jTextFieldBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBusquedaActionPerformed(evt);
            }
        });

        jButtonBusqueda.setText("Buscar");
        jButtonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaActionPerformed(evt);
            }
        });

        jButtonSiguienteCoincidencia.setText("Siguiente Coincidencia");
        jButtonSiguienteCoincidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteCoincidenciaActionPerformed(evt);
            }
        });

        jTextFieldContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContraseñaActionPerformed(evt);
            }
        });

        jButtonIniciar.setText("Iniciar");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        jButtonAñadirLector.setText("Añadir Lector");
        jButtonAñadirLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirLectorActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonBuscarUsuario.setText("Usuario");
        jButtonBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2)))
                .addContainerGap(171, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldBuscarUsuario)
                            .addComponent(jButtonBuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldResultadoBuscaquedaUsuario))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonAñadirLibro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAñadirLector, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBusqueda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldResultado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSiguienteCoincidencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCancelar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIniciar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAñadirLibro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAñadirLector)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBusqueda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSiguienteCoincidencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldResultadoBuscaquedaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscarUsuario)
                    .addComponent(jButtonEliminar))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAñadirLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirLibroActionPerformed
        // TODO add your handling code here:
       PantallaAñadirLibro a = new PantallaAñadirLibro(this, tienda);     
                
        
    }//GEN-LAST:event_jButtonAñadirLibroActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        // TODO add your handling code here:
        Kioskero igor = Kioskero.getInstance();
        if(!jTextFieldBusqueda.getText().isEmpty()){
             try {
            igor.borrarProducto(Kiosko.getLosResultados().get(productoBusqueda), Kiosko.getProductosDisponibles());
        } catch (KioskoException ex) {
            Logger.getLogger(PantallaAdministracion.class.getName()).log(Level.SEVERE, null, ex);
        }
       } else{
            jButtonBorrar.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Será mejor que busques algo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
       
    
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("");
        String comando =  jTextFieldBusqueda.getText();
        Kioskero igor = Kioskero.getInstance();
        Secretario alfred = Secretario.getInstance();
        ArrayList<String> busqueda;
        
        busqueda = alfred.separaLaCadena(comando);

        try {
            igor.busquedaAvanzada(busqueda, Kiosko.getProductosDisponibles(), Kiosko.getLosResultados());
            
            jTextFieldResultado.setText(Kiosko.getLosResultados().get((Kiosko.getLosResultados().size())-1).toString());
            productoBusqueda = (Kiosko.getLosResultados().size())-1;
        } catch (KioskoException ex) {
            Logger.getLogger(PantallaInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonBusquedaActionPerformed

    private void jButtonSiguienteCoincidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteCoincidenciaActionPerformed
        // TODO add your handling code here:
        
         if (productoBusqueda == Kiosko.getLosResultados().size()-1){
        productoBusqueda = 0;
        jTextFieldResultado.setText(Kiosko.getLosResultados().get(productoBusqueda).toString());
          
        }else{
           productoBusqueda = productoBusqueda + 1 ; 
           jTextFieldResultado.setText(Kiosko.getLosResultados().get(productoBusqueda).toString());
        }
        
    }//GEN-LAST:event_jButtonSiguienteCoincidenciaActionPerformed

    private void jTextFieldBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBusquedaActionPerformed

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        // TODO add your handling code here:
        
        if(jTextFieldUsuario.getText().contentEquals("admin") && jTextFieldContraseña.getText().contentEquals("admin")){
            jButtonAñadirLibro.setEnabled(true);
        jButtonBorrar.setEnabled(true);
        jButtonBusqueda.setEnabled(true);
        jButtonSiguienteCoincidencia.setEnabled(true);
        jButtonAñadirLector.setEnabled(true);
        }
          
    }//GEN-LAST:event_jButtonIniciarActionPerformed

    private void jTextFieldContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContraseñaActionPerformed

    private void jButtonAñadirLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirLectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAñadirLectorActionPerformed

    private void jButtonBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarUsuarioActionPerformed
        // TODO add your handling code here:
        
        Secretario alfred = Secretario.getInstance();
        
        if (alfred.existeUsuario(jTextFieldUsuario.getText(), Kiosko.getUsuariosRegistrados())){
            jTextFieldResultadoBuscaquedaUsuario.setText("El usuario existe");
            jButtonEliminar.setEnabled(true);
        }else{
            jTextFieldResultadoBuscaquedaUsuario.setText("El usuario no existe");
        }
        
        
    }//GEN-LAST:event_jButtonBuscarUsuarioActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed

        // TODO add your handling code here:
        Secretario alfred = Secretario.getInstance();
        
        try {
            alfred.borraUsuario(jTextFieldUsuario.getText(), Kiosko.getUsuariosRegistrados());
            } catch (KioskoException ex) {
            Logger.getLogger(PantallaAdministracion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAñadirLector;
    private javax.swing.JButton jButtonAñadirLibro;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonBuscarUsuario;
    private javax.swing.JButton jButtonBusqueda;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JButton jButtonSiguienteCoincidencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldBuscarUsuario;
    private javax.swing.JTextField jTextFieldBusqueda;
    private javax.swing.JTextField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldResultado;
    private javax.swing.JTextField jTextFieldResultadoBuscaquedaUsuario;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
