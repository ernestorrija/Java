/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Datos.Diccionario;
import Datos.LibroDeLectura;
import Datos.LibroDeTexto;
import Logica.Kioskero;
import Logica.Kiosko;
import Logica.KioskoException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ernesto
 */
public class PantallaAñadirLibro extends javax.swing.JFrame {

    private JFrame principal;
    Kiosko tienda;

    /**
     * Creates new form PantallaLectorDeLibro
     */
    public PantallaAñadirLibro(JFrame ventana, Kiosko tienda) {
        initComponents();
        principal = ventana;
        principal.setVisible(true);
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(860, 600);
        getContentPane().setBackground(new java.awt.Color(200, 220, 240));
        jTextFieldISBN.setEnabled(false);
        jTextFieldTitulo.setEnabled(false);
        jTextFieldAutor.setEnabled(false);
        jTextFieldEditorial.setEnabled(false);
        jTextFieldPrecio.setEnabled(false);
        jTextFieldPrecioConsulta.setEnabled(false);
        jListNivelTexto.setEnabled(false);
        jTextFieldMateria.setEnabled(false);
        jTextFieldCurso.setEnabled(false);
        jSpinnerFecha.setEnabled(false);

        jTextFieldIdioma.setEnabled(false);
        jTextFieldCursos.setEnabled(false);
        jTextFieldGenero.setEnabled(false);
        jTextArea1.setEnabled(false);
        jButtonLibroDeTexto.setEnabled(false);
        jButtonLibroDeLectura.setEnabled(false);
        jButtonDiccionario.setEnabled(false);

        Kioskero igor = Kioskero.getInstance();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldISBN = new javax.swing.JTextField();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldAutor = new javax.swing.JTextField();
        jTextFieldEditorial = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jTextFieldPrecioConsulta = new javax.swing.JTextField();
        jTextFieldMateria = new javax.swing.JTextField();
        jTextFieldCurso = new javax.swing.JTextField();
        jTextFieldIdioma = new javax.swing.JTextField();
        jTextFieldCursos = new javax.swing.JTextField();
        jTextFieldGenero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonAtras = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButtonLibroDeTexto = new javax.swing.JButton();
        jButtonLibroDeLectura = new javax.swing.JButton();
        jButtonDiccionario = new javax.swing.JButton();
        jSpinnerFecha = new javax.swing.JSpinner();
        jToggleButtonLibroDeTexto = new javax.swing.JToggleButton();
        jToggleButtonLibrodeLectura = new javax.swing.JToggleButton();
        jToggleButtonDiccionario = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListNivelTexto = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ISBN");

        jLabel2.setText("TITULO");

        jLabel3.setText("AUTOR");

        jLabel4.setText("EDITORIAL");

        jLabel5.setText("FECHA DE PUBLICACION");

        jLabel6.setText("PRECIO");

        jLabel7.setText("PRECIO CONSULTA ONLINE");

        jLabel8.setText("NIVEL");

        jLabel9.setText("MATERIA");

        jLabel10.setText("CURSO");

        jLabel11.setText("IDIOMA");

        jLabel12.setText("CURSOS RECOMENDADOS");

        jLabel13.setText("GENERO");

        jLabel14.setText("RESUMEN");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButtonAtras.setText("Atras");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jButtonLibroDeTexto.setText("Generar");
        jButtonLibroDeTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLibroDeTextoActionPerformed(evt);
            }
        });

        jButtonLibroDeLectura.setText("Generar");
        jButtonLibroDeLectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLibroDeLecturaActionPerformed(evt);
            }
        });

        jButtonDiccionario.setText("Generar");
        jButtonDiccionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDiccionarioActionPerformed(evt);
            }
        });

        jSpinnerFecha.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(-3600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinnerFecha.setEditor(new javax.swing.JSpinner.DateEditor(jSpinnerFecha, "dd/MM/yyyy"));

        buttonGroup1.add(jToggleButtonLibroDeTexto);
        jToggleButtonLibroDeTexto.setText("Libro de texto");
        jToggleButtonLibroDeTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonLibroDeTextoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jToggleButtonLibrodeLectura);
        jToggleButtonLibrodeLectura.setText("Libro de lectura");
        jToggleButtonLibrodeLectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonLibrodeLecturaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jToggleButtonDiccionario);
        jToggleButtonDiccionario.setText("Diccionario");
        jToggleButtonDiccionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonDiccionarioActionPerformed(evt);
            }
        });

        jListNivelTexto.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Primaria", "Secundaria", "Bachillerato" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListNivelTexto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(99, 99, 99)))
                            .addComponent(jLabel12))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldIdioma, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                    .addComponent(jTextFieldCurso)
                    .addComponent(jTextFieldMateria)
                    .addComponent(jTextFieldPrecioConsulta)
                    .addComponent(jTextFieldPrecio)
                    .addComponent(jTextFieldEditorial)
                    .addComponent(jTextFieldAutor)
                    .addComponent(jTextFieldTitulo)
                    .addComponent(jTextFieldISBN)
                    .addComponent(jTextFieldCursos)
                    .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 124, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                        .addComponent(jButtonAtras))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextFieldGenero)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jToggleButtonLibroDeTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButtonDiccionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButtonLibrodeLectura, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonDiccionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonLibroDeLectura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonLibroDeTexto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLibroDeTexto)
                            .addComponent(jToggleButtonLibroDeTexto))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLibroDeLectura)
                            .addComponent(jToggleButtonLibrodeLectura))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jButtonDiccionario)
                            .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButtonDiccionario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButtonAtras)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldPrecioConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel8))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextFieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextFieldIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextFieldCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        principal.setVisible(true);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonLibroDeTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLibroDeTextoActionPerformed
        // TODO add your handling code here:

        if (jTextFieldISBN.getText().isEmpty() || jTextFieldTitulo.getText().isEmpty() || jTextFieldAutor.getText().isEmpty() || jTextFieldEditorial.getText().isEmpty()
                || jTextFieldPrecio.getText().isEmpty() || jTextFieldPrecioConsulta.getText().isEmpty()
                || jTextFieldMateria.getText().isEmpty() || jTextFieldCurso.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Compruebe que ha rellenado todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            LibroDeTexto auxlibrodetexto = new LibroDeTexto(
                    Long.valueOf(jTextFieldISBN.getText()),
                    jTextFieldTitulo.getText(),
                    jTextFieldAutor.getText(),
                    jTextFieldEditorial.getText(),
                    getjSpinnerFecha(),
                    Double.parseDouble(jTextFieldPrecio.getText()),
                    Double.parseDouble(jTextFieldPrecioConsulta.getText()),
                    (String) jListNivelTexto.getToolTipText(),
                    jTextFieldMateria.getText(),
                    Integer.parseInt(jTextFieldCurso.getText())
            );

            Kioskero igor = Kioskero.getInstance();

            try {
                igor.registrarProducto(auxlibrodetexto, Kiosko.getProductosDisponibles());
                jTextFieldISBN.setText("");
                jTextFieldTitulo.setText("");
                jTextFieldAutor.setText("");
                jTextFieldEditorial.setText("");
                jTextFieldPrecio.setText("");
                jTextFieldPrecioConsulta.setText("");
                jTextFieldMateria.setText("");
                jTextFieldCurso.setText("");
                JOptionPane.showMessageDialog(this, auxlibrodetexto.getTitulo(), "Libro de texto registrado", JOptionPane.INFORMATION_MESSAGE);
            } catch (KioskoException ex) {
                Logger.getLogger(PantallaAñadirLibro.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_jButtonLibroDeTextoActionPerformed

    private void jButtonLibroDeLecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLibroDeLecturaActionPerformed
        // TODO add your handling code here:

        if (jTextFieldISBN.getText().isEmpty() || jTextFieldTitulo.getText().isEmpty() || jTextFieldAutor.getText().isEmpty() || jTextFieldEditorial.getText().isEmpty()
                || jTextFieldPrecio.getText().isEmpty() || jTextFieldPrecioConsulta.getText().isEmpty()
                || jTextFieldGenero.getText().isEmpty() || jTextArea1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Compruebe que ha rellenado todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            LibroDeLectura auxlibrodelectura = new LibroDeLectura(
                    Long.valueOf(jTextFieldISBN.getText()),
                    jTextFieldTitulo.getText(),
                    jTextFieldAutor.getText(),
                    jTextFieldEditorial.getText(),
                    getjSpinnerFecha(),
                    Double.parseDouble(jTextFieldPrecio.getText()),
                    Double.parseDouble(jTextFieldPrecioConsulta.getText()),
                    (String) jListNivelTexto.getToolTipText(),
                    jTextFieldGenero.getText(),
                    jTextArea1.getText());

            Kioskero igor = Kioskero.getInstance();

            try {
                igor.registrarProducto(auxlibrodelectura, Kiosko.getProductosDisponibles());
                jTextFieldISBN.setText("");
                jTextFieldTitulo.setText("");
                jTextFieldAutor.setText("");
                jTextFieldEditorial.setText("");
                jTextFieldPrecio.setText("");
                jTextFieldPrecioConsulta.setText("");
                jTextFieldGenero.setText("");
                jTextArea1.setText("");
                JOptionPane.showMessageDialog(this, auxlibrodelectura.getTitulo(), "Libro registrado de lectura", JOptionPane.INFORMATION_MESSAGE);
            } catch (KioskoException ex) {
                Logger.getLogger(PantallaAñadirLibro.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButtonLibroDeLecturaActionPerformed


    private void jButtonDiccionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDiccionarioActionPerformed
        // TODO add your handling code here:

        if (jTextFieldISBN.getText().isEmpty() || jTextFieldTitulo.getText().isEmpty() || jTextFieldAutor.getText().isEmpty() || jTextFieldEditorial.getText().isEmpty()
                || jTextFieldPrecio.getText().isEmpty() || jTextFieldPrecioConsulta.getText().isEmpty()
                || jTextFieldIdioma.getText().isEmpty() || jTextFieldCursos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Compruebe que ha rellenado todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            Diccionario auxDiccionario = new Diccionario(
                    Long.valueOf(jTextFieldISBN.getText()),
                    jTextFieldTitulo.getText(),
                    jTextFieldAutor.getText(),
                    jTextFieldEditorial.getText(),
                    getjSpinnerFecha(),
                    Double.parseDouble(jTextFieldPrecio.getText()),
                    Double.parseDouble(jTextFieldPrecioConsulta.getText()),
                    jTextFieldIdioma.getText(),
                    jTextFieldCursos.getText()
            );

            Kioskero igor = Kioskero.getInstance();

            try {
                igor.registrarProducto(auxDiccionario, Kiosko.getProductosDisponibles());
                jTextFieldISBN.setText("");
                jTextFieldTitulo.setText("");
                jTextFieldAutor.setText("");
                jTextFieldEditorial.setText("");
                jTextFieldPrecio.setText("");
                jTextFieldPrecioConsulta.setText("");
                jTextFieldIdioma.setText("");
                jTextFieldCursos.setText("");
                JOptionPane.showMessageDialog(this, auxDiccionario.getTitulo(), "Diccionario registrado", JOptionPane.INFORMATION_MESSAGE);
            } catch (KioskoException ex) {
                Logger.getLogger(PantallaAñadirLibro.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_jButtonDiccionarioActionPerformed

    private void jToggleButtonLibroDeTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonLibroDeTextoActionPerformed

      // TODO add your handling code here:
        jButtonLibroDeTexto.setEnabled(true);
        jButtonLibroDeLectura.setEnabled(false);
        jButtonDiccionario.setEnabled(false);

        jTextFieldISBN.setEnabled(true);
        jTextFieldTitulo.setEnabled(true);
        jTextFieldAutor.setEnabled(true);
        jTextFieldEditorial.setEnabled(true);
        jTextFieldPrecio.setEnabled(true);
        jTextFieldPrecioConsulta.setEnabled(true);
        jSpinnerFecha.setEnabled(true);

        jListNivelTexto.setEnabled(true);
        jListNivelTexto.setEnabled(true);
        jTextFieldMateria.setEnabled(true);
        jTextFieldCurso.setEnabled(true);

        jTextFieldIdioma.setEnabled(false);
        jTextFieldCursos.setEnabled(false);
        jTextFieldGenero.setEnabled(false);
        jTextArea1.setEnabled(false);


    }//GEN-LAST:event_jToggleButtonLibroDeTextoActionPerformed

    private void jToggleButtonLibrodeLecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonLibrodeLecturaActionPerformed
        // TODO add your handling code here:

        jButtonLibroDeTexto.setEnabled(false);
        jButtonLibroDeLectura.setEnabled(true);
        jButtonDiccionario.setEnabled(false);

        jTextFieldISBN.setEnabled(true);
        jTextFieldTitulo.setEnabled(true);
        jTextFieldAutor.setEnabled(true);
        jTextFieldEditorial.setEnabled(true);
        jTextFieldPrecio.setEnabled(true);
        jTextFieldPrecioConsulta.setEnabled(true);
        jSpinnerFecha.setEnabled(true);

        jListNivelTexto.setEnabled(true);
        jTextFieldMateria.setEnabled(false);
        jTextFieldCurso.setEnabled(false);

        jTextFieldIdioma.setEnabled(false);
        jTextFieldCursos.setEnabled(false);
        jTextFieldGenero.setEnabled(true);
        jTextArea1.setEnabled(true);
    }//GEN-LAST:event_jToggleButtonLibrodeLecturaActionPerformed

    private void jToggleButtonDiccionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonDiccionarioActionPerformed
        // TODO add your handling code here:

        jButtonLibroDeTexto.setEnabled(false);
        jButtonLibroDeLectura.setEnabled(false);
        jButtonDiccionario.setEnabled(true);

        jTextFieldISBN.setEnabled(true);
        jTextFieldTitulo.setEnabled(true);
        jTextFieldAutor.setEnabled(true);
        jTextFieldEditorial.setEnabled(true);
        jTextFieldPrecio.setEnabled(true);
        jTextFieldPrecioConsulta.setEnabled(true);
        jSpinnerFecha.setEnabled(true);

        jListNivelTexto.setEnabled(false);
        jTextFieldMateria.setEnabled(false);
        jTextFieldCurso.setEnabled(false);

        jTextFieldIdioma.setEnabled(true);
        jTextFieldCursos.setEnabled(true);
        jTextFieldGenero.setEnabled(false);
        jTextArea1.setEnabled(false);
    }//GEN-LAST:event_jToggleButtonDiccionarioActionPerformed

    public GregorianCalendar getjSpinnerFecha() {
        Date dia = (Date) jSpinnerFecha.getValue();
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(dia);
        return gc;
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonDiccionario;
    private javax.swing.JButton jButtonLibroDeLectura;
    private javax.swing.JButton jButtonLibroDeTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jListNivelTexto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerFecha;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldCurso;
    private javax.swing.JTextField jTextFieldCursos;
    private javax.swing.JTextField jTextFieldEditorial;
    private javax.swing.JTextField jTextFieldGenero;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldIdioma;
    private javax.swing.JTextField jTextFieldMateria;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldPrecioConsulta;
    private javax.swing.JTextField jTextFieldTitulo;
    private javax.swing.JToggleButton jToggleButtonDiccionario;
    private javax.swing.JToggleButton jToggleButtonLibroDeTexto;
    private javax.swing.JToggleButton jToggleButtonLibrodeLectura;
    // End of variables declaration//GEN-END:variables
}
