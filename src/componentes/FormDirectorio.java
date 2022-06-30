/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package componentes;

import java.io.File;
import java.sql.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.naming.spi.DirStateFactory;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.ConnectionDB;

/**
 *
 * @author Daniela
 */
public class FormDirectorio extends javax.swing.JFrame {
    ConnectionDB cn = new ConnectionDB();
    PreparedStatement ps;
    
    ButtonGroup btnGr;

    /**
     * Creates new form FormDirectorio
     */
    public FormDirectorio() {
        //  condicion para centrar interfaz  
        initComponents();
        // se crea los botones, para que me agrege con .add masculino , femenino 
        btnGr = new ButtonGroup();
        btnGr.add(rbmasculino);
        btnGr.add(rbfemenino);
        this.setLocationRelativeTo(null);
        llenarCampos();
    }
    
    private void llenarCampos(){
        FormContactos infoUsuarios = new FormContactos();
        txtid.setText(infoUsuarios.documento);
        txtnombre.setText(infoUsuarios.nombre);
        txtdireccionResidencia.setText(infoUsuarios.direccion);
        txtbarrio.setText(infoUsuarios.barrio);
        txtciudadResc.setText(infoUsuarios.ciudad);
        txtCodigoPais.setText(infoUsuarios.codigoPais);
        txtFechaNacimiento.setText(infoUsuarios.fechaNaci);
        txtciudadNacimiento.setText(infoUsuarios.ciudadNaci);
        txtPaisNacimiento.setText(infoUsuarios.paisNaci);
        txtTelefonoPrincipal.setText(infoUsuarios.telefono);
        txtTelefonoEmerg.setText(infoUsuarios.telefonoEmer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelNombres = new javax.swing.JLabel();
        LabelDirRes = new javax.swing.JLabel();
        LabelGenero = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtdireccionResidencia = new javax.swing.JTextField();
        rbmasculino = new javax.swing.JRadioButton();
        rbfemenino = new javax.swing.JRadioButton();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        LabelNumDoc = new javax.swing.JLabel();
        LabelBarrio = new javax.swing.JLabel();
        txtbarrio = new javax.swing.JTextField();
        LabelCiudadResc = new javax.swing.JLabel();
        txtciudadResc = new javax.swing.JTextField();
        LabelCodigo = new javax.swing.JLabel();
        txtCodigoPais = new javax.swing.JTextField();
        LabelFechaN = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        LabelCiudadN = new javax.swing.JLabel();
        txtciudadNacimiento = new javax.swing.JTextField();
        LabelPaisN = new javax.swing.JLabel();
        txtPaisNacimiento = new javax.swing.JTextField();
        LabelTelefonoP = new javax.swing.JLabel();
        txtTelefonoPrincipal = new javax.swing.JTextField();
        LabelTelefonoE = new javax.swing.JLabel();
        txtTelefonoEmerg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/directorio.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("CONTACTOS");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Agregar contacto");

        LabelNombres.setText("Nombres y apellidos:");

        LabelDirRes.setText("Direccion de Residencia:");

        LabelGenero.setText("Genero:");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        txtdireccionResidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionResidenciaActionPerformed(evt);
            }
        });

        rbmasculino.setText("Masculino");

        rbfemenino.setText("Femenino");

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        LabelNumDoc.setText("Numero de documento:");

        LabelBarrio.setText("Barrio de Residencia:");

        txtbarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbarrioActionPerformed(evt);
            }
        });

        LabelCiudadResc.setText("Ciudad de Residencia");

        txtciudadResc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtciudadRescActionPerformed(evt);
            }
        });

        LabelCodigo.setText("Codigo del pais:");

        txtCodigoPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoPaisActionPerformed(evt);
            }
        });

        LabelFechaN.setText("Fecha de Nacimiento:");

        LabelCiudadN.setText("Ciudad de nacimiento:");

        txtciudadNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtciudadNacimientoActionPerformed(evt);
            }
        });

        LabelPaisN.setText("Pais de nacimiento :");

        txtPaisNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisNacimientoActionPerformed(evt);
            }
        });

        LabelTelefonoP.setText("Telefono Principal:");

        txtTelefonoPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoPrincipalActionPerformed(evt);
            }
        });

        LabelTelefonoE.setText("Telefono de emergencia:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelDirRes)
                            .addComponent(LabelNombres)
                            .addComponent(LabelBarrio)
                            .addComponent(LabelCiudadResc)
                            .addComponent(LabelCodigo)
                            .addComponent(LabelNumDoc)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoPais, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtciudadResc, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(txtid)
                            .addComponent(txtnombre)
                            .addComponent(txtdireccionResidencia)
                            .addComponent(txtbarrio))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(LabelTelefonoE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefonoEmerg))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LabelPaisN, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(LabelCiudadN))
                                            .addComponent(LabelTelefonoP, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtciudadNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                            .addComponent(txtPaisNacimiento)
                                            .addComponent(txtTelefonoPrincipal)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabelFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(LabelGenero)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(rbmasculino)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rbfemenino))
                                            .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(btnguardar)
                        .addGap(31, 31, 31)
                        .addComponent(btnmodificar)
                        .addGap(33, 33, 33)
                        .addComponent(btnlimpiar)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(152, 152, 152)
                    .addComponent(jLabel4)
                    .addContainerGap(803, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNumDoc)
                    .addComponent(LabelGenero)
                    .addComponent(rbmasculino)
                    .addComponent(rbfemenino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNombres)
                    .addComponent(LabelFechaN)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdireccionResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelDirRes)
                    .addComponent(LabelCiudadN)
                    .addComponent(txtciudadNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBarrio)
                    .addComponent(txtbarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPaisN)
                    .addComponent(txtPaisNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtciudadResc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCiudadResc)
                    .addComponent(LabelTelefonoP)
                    .addComponent(txtTelefonoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCodigo)
                    .addComponent(txtCodigoPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTelefonoE)
                    .addComponent(txtTelefonoEmerg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnmodificar)
                    .addComponent(btnlimpiar))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(170, 170, 170)
                    .addComponent(jLabel4)
                    .addContainerGap(119, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoPaisActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_txtCodigoPaisActionPerformed

    private void txtciudadRescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtciudadRescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudadRescActionPerformed

    private void txtbarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbarrioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbarrioActionPerformed
    // se guarda el registro de todo los datos en la intefaz
    // y se agrega el metodo limpiar para borrar todo al precionarlo
    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void limpiar() {
        txtid.setText("");
        txtnombre.setText("");
        txtdireccionResidencia.setText("");
        txtbarrio.setText("");
        txtciudadResc.setText("");
        txtCodigoPais.setText("");
        txtFechaNacimiento.setText("");
        txtciudadNacimiento.setText("");
        txtPaisNacimiento.setText("");
        txtTelefonoPrincipal.setText("");
        txtTelefonoEmerg.setText("");
        // con el boton se limpiaran todos los datos btnGr
        btnGr.clearSelection();
    }
    
    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed

        // boton de guardar
        // Documento de Identidad, Nombres y apellidos, Direccion residencia, Barrio de residencia, 
        // Ciudad de residencia, Codigo del pais, Genero, Fecha de nacimiento, Ciudad de nacimiento 
        // Pais de nacimiento, Telefono Principal, Telefono de emergencia

        String id = txtid.getText();
        String nombre = txtnombre.getText();
        String DireccionResc = txtdireccionResidencia.getText();
        String BarrioResc = txtbarrio.getText();
        String CiudadResc = txtciudadResc.getText();
        String CodigoPais = txtCodigoPais.getText();
        String genero;
        String FechaNacimiento = txtFechaNacimiento.getText();
        String CiudadNacimiento = txtciudadNacimiento.getText();
        String PaisNacimiento = txtPaisNacimiento.getText();
        String TelefonoPrincipal = txtTelefonoPrincipal.getText();
        String TelefonoEmergencia = txtTelefonoEmerg.getText();


        // Se crea una ocndicion con el if else , en donde si se cumple masculino o feminno es verdadero
        if (rbmasculino.isSelected() == true) {
            genero = "M";

        } else if (rbfemenino.isSelected() == true) {

            genero = "F";

        } else {
            genero = "M";
        }
        // se crea un try catch para
        // se conecta a la tabla alumnos de la base de datos sql serverd
        //preparedstatment se insertan dichos datos a la base de datos
        try {
            Connection con = cn.cadena_conexion();
            PreparedStatement ps = con.prepareStatement("UPDATE datosPersonales SET nombre=?,DireccionResc=?,BarrioResc=?,CiudadResc=?,CodigoPais=?,genero=?,FechaNacimiento=?,CiudadNacimiento=?,PaisNacimiento=?,TelefonoPrincipal=?,TelefonoEmergencia=?,activo=? WHERE id=?");

            ps.setString(1, id);
            ps.setString(2, nombre);
            ps.setString(3, DireccionResc);
            ps.setString(4, BarrioResc);
            ps.setString(5, CiudadResc);
            ps.setString(6, CodigoPais);
            ps.setString(7, genero);
            ps.setString(8, FechaNacimiento);
            ps.setString(9, CiudadNacimiento);
            ps.setString(10, PaisNacimiento);
            ps.setString(11, TelefonoPrincipal);
            ps.setString(12, TelefonoEmergencia);
            
            // ps.execute udate // se guardan
            ps.executeUpdate();
            // se guarda el registro de todo los datos en la intefaz
            // y se agrega el metodo limpiar para borrar todo al precionarlo
            JOptionPane.showMessageDialog(null, "Registro modificado");
            limpiar();
            // se agrega el metodo para cargar la tabla
            //cargartabla();
        } catch (SQLException e) {
            // si no se cumplen todos los datos ingresados dara una excepcion con sqlException
            // y un mensaje por pantalla

            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // boton de guardar, guardara id, nombre, direccion, barrio, residencia, ciudad, codigopais, fechanac, ciudadnac, paidnacimiento, telefono prionicial.
        String id = txtid.getText();
        String nombre = txtnombre.getText();
        String DireccionResc = txtdireccionResidencia.getText();
        String BarrioResc = txtbarrio.getText();
        String CiudadResc = txtciudadResc.getText();
        String CodigoPais = txtCodigoPais.getText();
        String genero;
        String FechaNacimiento = txtFechaNacimiento.getText();
        String CiudadNacimiento = txtciudadNacimiento.getText();
        String PaisNacimiento = txtPaisNacimiento.getText();
        String TelefonoPrincipal = txtTelefonoPrincipal.getText();
        String TelefonoEmergencia = txtTelefonoEmerg.getText();

        // Se crea una ocndicion, en donde si se cumple masculino o feminno es verdadero
        if (rbmasculino.isSelected() == true) {
            genero = "M";

        } else if (rbfemenino.isSelected() == true) {

            genero = "F";

        } else {
            genero = "M";
        }

        // se conecta a la tabla directorio de la base de datos sql serverd, se insertan dichos datos a la base de datos
        try {
            Connection con = cn.cadena_conexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO datosPersonales(documento,nombreCompleto,direccion,barrio,ciudad, codPais,genero,fechaNacimiento,ciudadNacimiento,paisNacimiento,telefono,telefonoEmergencia,activo)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1, id);
            ps.setString(2, nombre);
            ps.setString(3, DireccionResc);
            ps.setString(4, BarrioResc);
            ps.setString(5, CiudadResc);
            ps.setString(6, CodigoPais);
            ps.setString(7, genero);
            ps.setString(8, FechaNacimiento);
            ps.setString(9, CiudadNacimiento);
            ps.setString(10, PaisNacimiento);
            ps.setString(11, TelefonoPrincipal);
            ps.setString(12, TelefonoEmergencia);
            ps.setInt(13, 1);
            
            
            // ps.execute udate // se guardan
            ps.executeUpdate();
            // se guarda el registro de todo los datos en la intefaz
            // y se agrega el metodo limpiar para borrar todo al precionarlo
            JOptionPane.showMessageDialog(null, "Registro guardado");
            limpiar();
            // se agrega el metodo para cargar la tabla
            //cargartabla();
            
        } catch (SQLException e) {
            // si no se cumplen todos los datos ingresados dara una excepcion con sqlException
            // y un mensaje por pantalla

            JOptionPane.showMessageDialog(null, e.toString());

        }
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtdireccionResidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionResidenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionResidenciaActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtciudadNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtciudadNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudadNacimientoActionPerformed

    private void txtPaisNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisNacimientoActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtTelefonoPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoPrincipalActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FormDirectorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDirectorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDirectorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDirectorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDirectorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBarrio;
    private javax.swing.JLabel LabelCiudadN;
    private javax.swing.JLabel LabelCiudadResc;
    private javax.swing.JLabel LabelCodigo;
    private javax.swing.JLabel LabelDirRes;
    private javax.swing.JLabel LabelFechaN;
    private javax.swing.JLabel LabelGenero;
    private javax.swing.JLabel LabelNombres;
    private javax.swing.JLabel LabelNumDoc;
    private javax.swing.JLabel LabelPaisN;
    private javax.swing.JLabel LabelTelefonoE;
    private javax.swing.JLabel LabelTelefonoP;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbfemenino;
    private javax.swing.JRadioButton rbmasculino;
    private javax.swing.JTextField txtCodigoPais;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtPaisNacimiento;
    private javax.swing.JTextField txtTelefonoEmerg;
    private javax.swing.JTextField txtTelefonoPrincipal;
    private javax.swing.JTextField txtbarrio;
    private javax.swing.JTextField txtciudadNacimiento;
    private javax.swing.JTextField txtciudadResc;
    private javax.swing.JTextField txtdireccionResidencia;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
