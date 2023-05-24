/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.iudigital.funcionario.test;

import com.iudigital.funcionario.controller.FuncionarioController;
import com.iudigital.funcionario.domain.Funcionario;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eleven
 */
public class Main2 extends javax.swing.JFrame {
    
    private final FuncionarioController funcionarioController;
    private final static String[] COLUMNS = {"Id Funcionario","Tipo identificación","Número Identificación","Nombres","Apellidos","Estado Civil","Sexo","Dirección","Teléfono","Fecha de Nacimiento","e-mail"};
    private final static String SELECCIONE = "SELECCIONE";
    /**
     * Creates new form Main2
     */
        public Main2() {
        initComponents();
        txtId_FuncionarioEdit.setEditable(false);
        funcionarioController = new FuncionarioController();
        listFuncionarios();
        
        
        
    }

private void listFuncionarios() {
    cbxFuncionario.removeAllItems();

    DefaultTableModel defaultTableModel = new DefaultTableModel(COLUMNS, 0);
    tblFuncionarios.setModel(defaultTableModel);

    try {
        List<Funcionario> funcionarios = funcionarioController.obtenerFuncionario();
        if (funcionarios.isEmpty()) {
            return;
        }

        for (Funcionario funcionario : funcionarios) {
            Object[] rowData = {
                funcionario.getId_funcionario(),
                funcionario.getTipo_identificacion(),
                funcionario.getNumero_identificacion(),
                funcionario.getNombres(),
                funcionario.getApellidos(),
                funcionario.getEstadocivil(),
                funcionario.getSexo(),
                funcionario.getDireccion(),
                funcionario.getTelefono(),
                funcionario.getFecha_nacimiento(),
                funcionario.getCorreo_electronico()
            };
            defaultTableModel.addRow(rowData);

            cbxFuncionario.addItem(funcionario);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Main2.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTPannels = new javax.swing.JTabbedPane();
        jPFuncionario = new javax.swing.JPanel();
        jPCampos = new javax.swing.JPanel();
        lblTipo_identificacion = new javax.swing.JLabel();
        lblNumero_identificacion = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblEstadocivil = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblFecha_Nacimiento = new javax.swing.JLabel();
        lblCorreo_electronico = new javax.swing.JLabel();
        txtTipo_Identificacion = new javax.swing.JTextField();
        txtNumero_identificacion = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtEstadocivil = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtFecha_nacimiento = new javax.swing.JTextField();
        txtCorreo_electronico = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionarios = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPEditar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbxFuncionario = new javax.swing.JComboBox<>();
        lblId_FuncionarioEdit = new javax.swing.JLabel();
        lblTipo_identificacionEdit = new javax.swing.JLabel();
        lblNumero_identificacionEdit = new javax.swing.JLabel();
        lblNombresEdit = new javax.swing.JLabel();
        lblApellidosEdit = new javax.swing.JLabel();
        lblEstadocivilEdit = new javax.swing.JLabel();
        lblSexoEdit = new javax.swing.JLabel();
        lblDireccionEdit = new javax.swing.JLabel();
        lblTelefonoEdit = new javax.swing.JLabel();
        lblFecha_nacimientoEdit = new javax.swing.JLabel();
        lblCorreo_electronicoEdit = new javax.swing.JLabel();
        txtId_FuncionarioEdit = new javax.swing.JTextField();
        txtTipo_identificacionEdit = new javax.swing.JTextField();
        txtNumero_identificacionEdit = new javax.swing.JTextField();
        txtNombresEdit = new javax.swing.JTextField();
        txtApellidosEdit = new javax.swing.JTextField();
        txtEstadocivilEdit = new javax.swing.JTextField();
        txtSexoEdit = new javax.swing.JTextField();
        txtDireccionEdit = new javax.swing.JTextField();
        txtTelefonoEdit = new javax.swing.JTextField();
        txtFecha_nacimientoEdit = new javax.swing.JTextField();
        txtCorreo_electronicoEdit = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("GESTIÓN FUNCIONARIOS IU DIGITAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 220, 40));

        jPCampos.setBorder(javax.swing.BorderFactory.createTitledBorder("Digite los siguientes Campos:"));

        lblTipo_identificacion.setText("Tipo identificación:");

        lblNumero_identificacion.setText("Número identificación:");

        lblNombres.setText("Nombres:");

        lblApellidos.setText("Apellidos:");

        lblEstadocivil.setText("Estado Civil:");

        lblSexo.setText("Sexo:");

        lblDireccion.setText("Dirección:");

        lblTelefono.setText("Teléfono:");

        lblFecha_Nacimiento.setText("Fecha de Nacimiento:");

        lblCorreo_electronico.setText("Correo electrónico:");

        txtTipo_Identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipo_IdentificacionActionPerformed(evt);
            }
        });

        txtEstadocivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadocivilActionPerformed(evt);
            }
        });

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        txtCorreo_electronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreo_electronicoActionPerformed(evt);
            }
        });

        btnCrear.setText("CREAR");

        javax.swing.GroupLayout jPCamposLayout = new javax.swing.GroupLayout(jPCampos);
        jPCampos.setLayout(jPCamposLayout);
        jPCamposLayout.setHorizontalGroup(
            jPCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCamposLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCorreo_electronico, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPCamposLayout.createSequentialGroup()
                        .addGroup(jPCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblApellidos)
                            .addComponent(lblTipo_identificacion)
                            .addComponent(lblDireccion)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(txtTipo_Identificacion)
                            .addComponent(txtDireccion)
                            .addComponent(txtCorreo_electronico))
                        .addGroup(jPCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCamposLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(jPCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumero_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblTelefono)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                                        .addComponent(txtEstadocivil)
                                        .addComponent(lblEstadocivil))
                                    .addComponent(lblNumero_identificacion))
                                .addGap(85, 85, 85)
                                .addGroup(jPCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSexo)
                                    .addComponent(txtFecha_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(txtNombres)
                                    .addComponent(lblFecha_Nacimiento)
                                    .addComponent(lblNombres)
                                    .addComponent(lblSexo)))
                            .addGroup(jPCamposLayout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(btnCrear)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPCamposLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtApellidos, txtCorreo_electronico, txtDireccion, txtEstadocivil, txtFecha_nacimiento, txtNombres, txtNumero_identificacion, txtSexo, txtTelefono, txtTipo_Identificacion});

        jPCamposLayout.setVerticalGroup(
            jPCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCamposLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombres)
                    .addComponent(lblNumero_identificacion)
                    .addComponent(lblTipo_identificacion))
                .addGap(3, 3, 3)
                .addGroup(jPCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipo_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos)
                    .addComponent(lblEstadocivil)
                    .addComponent(lblSexo))
                .addGap(3, 3, 3)
                .addGroup(jPCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEstadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(lblTelefono)
                    .addComponent(lblFecha_Nacimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFecha_nacimiento)
                    .addGroup(jPCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefono)
                        .addComponent(txtDireccion)))
                .addGap(18, 18, 18)
                .addComponent(lblCorreo_electronico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo_electronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrear))
                .addGap(17, 17, 17))
        );

        jPCamposLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtApellidos, txtCorreo_electronico, txtDireccion, txtEstadocivil, txtFecha_nacimiento, txtNombres, txtNumero_identificacion, txtSexo, txtTelefono, txtTipo_Identificacion});

        tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblFuncionarios);

        javax.swing.GroupLayout jPFuncionarioLayout = new javax.swing.GroupLayout(jPFuncionario);
        jPFuncionario.setLayout(jPFuncionarioLayout);
        jPFuncionarioLayout.setHorizontalGroup(
            jPFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPFuncionarioLayout.createSequentialGroup()
                .addComponent(jPCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPFuncionarioLayout.setVerticalGroup(
            jPFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        jTPannels.addTab("Crear Funcionario", jPFuncionario);

        jPEditar.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar Datos de Funcionario"));

        jLabel2.setText("Funcionarios");

        lblId_FuncionarioEdit.setText("ID Funcionario");

        lblTipo_identificacionEdit.setText("Tipo Identificación");

        lblNumero_identificacionEdit.setText("Numero identificación");

        lblNombresEdit.setText("Nombres");

        lblApellidosEdit.setText("Apelllidos");

        lblEstadocivilEdit.setText("Estado Civil");

        lblSexoEdit.setText("Sexo");

        lblDireccionEdit.setText("Direccion");

        lblTelefonoEdit.setText("Teléfono");

        lblFecha_nacimientoEdit.setText("Fecha de Nacimiento");

        lblCorreo_electronicoEdit.setText("e-mail");

        txtNombresEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresEditActionPerformed(evt);
            }
        });

        txtEstadocivilEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadocivilEditActionPerformed(evt);
            }
        });

        btnActualizar.setText("ACTUALIZAR");

        btnEliminar.setText("ELIMINAR");

        javax.swing.GroupLayout jPEditarLayout = new javax.swing.GroupLayout(jPEditar);
        jPEditar.setLayout(jPEditarLayout);
        jPEditarLayout.setHorizontalGroup(
            jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEditarLayout.createSequentialGroup()
                .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPEditarLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSexoEdit)
                            .addComponent(txtSexoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipo_identificacionEdit)
                            .addComponent(lblTipo_identificacionEdit)
                            .addComponent(jLabel2)
                            .addComponent(cbxFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPEditarLayout.createSequentialGroup()
                                .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPEditarLayout.createSequentialGroup()
                                        .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDireccionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDireccionEdit))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTelefonoEdit)
                                            .addComponent(txtTelefonoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPEditarLayout.createSequentialGroup()
                                        .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNumero_identificacionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNumero_identificacionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNombresEdit)
                                            .addComponent(txtNombresEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(31, 31, 31)
                                .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblApellidosEdit)
                                    .addComponent(lblFecha_nacimientoEdit)
                                    .addComponent(txtFecha_nacimientoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidosEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreo_electronicoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEstadocivilEdit)
                                    .addComponent(lblCorreo_electronicoEdit)
                                    .addComponent(txtEstadocivilEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtId_FuncionarioEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId_FuncionarioEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPEditarLayout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(btnActualizar)
                        .addGap(125, 125, 125)
                        .addComponent(btnEliminar)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPEditarLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtApellidosEdit, txtCorreo_electronicoEdit, txtDireccionEdit, txtEstadocivilEdit, txtFecha_nacimientoEdit, txtNombresEdit, txtNumero_identificacionEdit, txtSexoEdit, txtTelefonoEdit, txtTipo_identificacionEdit});

        jPEditarLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnActualizar, btnEliminar});

        jPEditarLayout.setVerticalGroup(
            jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblId_FuncionarioEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId_FuncionarioEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo_identificacionEdit)
                    .addComponent(lblNumero_identificacionEdit)
                    .addComponent(lblNombresEdit)
                    .addComponent(lblApellidosEdit)
                    .addComponent(lblEstadocivilEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNumero_identificacionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtApellidosEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEstadocivilEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombresEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTipo_identificacionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccionEdit)
                    .addComponent(lblSexoEdit)
                    .addComponent(lblTelefonoEdit)
                    .addComponent(lblFecha_nacimientoEdit)
                    .addComponent(lblCorreo_electronicoEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSexoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha_nacimientoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo_electronicoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 340, Short.MAX_VALUE))
        );

        jTPannels.addTab("Editar Funcionario", jPanel2);

        getContentPane().add(jTPannels, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1220, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEstadocivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadocivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadocivilActionPerformed

    private void txtCorreo_electronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreo_electronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreo_electronicoActionPerformed

    private void txtTipo_IdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipo_IdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipo_IdentificacionActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtNombresEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresEditActionPerformed

    private void txtEstadocivilEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadocivilEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadocivilEditActionPerformed

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
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<Funcionario> cbxFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPCampos;
    private javax.swing.JPanel jPEditar;
    private javax.swing.JPanel jPFuncionario;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTPannels;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblApellidosEdit;
    private javax.swing.JLabel lblCorreo_electronico;
    private javax.swing.JLabel lblCorreo_electronicoEdit;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDireccionEdit;
    private javax.swing.JLabel lblEstadocivil;
    private javax.swing.JLabel lblEstadocivilEdit;
    private javax.swing.JLabel lblFecha_Nacimiento;
    private javax.swing.JLabel lblFecha_nacimientoEdit;
    private javax.swing.JLabel lblId_FuncionarioEdit;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblNombresEdit;
    private javax.swing.JLabel lblNumero_identificacion;
    private javax.swing.JLabel lblNumero_identificacionEdit;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSexoEdit;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelefonoEdit;
    private javax.swing.JLabel lblTipo_identificacion;
    private javax.swing.JLabel lblTipo_identificacionEdit;
    private javax.swing.JTable tblFuncionarios;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtApellidosEdit;
    private javax.swing.JTextField txtCorreo_electronico;
    private javax.swing.JTextField txtCorreo_electronicoEdit;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccionEdit;
    private javax.swing.JTextField txtEstadocivil;
    private javax.swing.JTextField txtEstadocivilEdit;
    private javax.swing.JTextField txtFecha_nacimiento;
    private javax.swing.JTextField txtFecha_nacimientoEdit;
    private javax.swing.JTextField txtId_FuncionarioEdit;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNombresEdit;
    private javax.swing.JTextField txtNumero_identificacion;
    private javax.swing.JTextField txtNumero_identificacionEdit;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtSexoEdit;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoEdit;
    private javax.swing.JTextField txtTipo_Identificacion;
    private javax.swing.JTextField txtTipo_identificacionEdit;
    // End of variables declaration//GEN-END:variables
}
