/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iudigital.funcionario.data;


import com.iudigital.funcionario.domain.Funcionario;
import com.iudigital.funcionario.util.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eleven
 */
public class FuncionarioDao {
    
    private static final String GET_FUNCIONARIO = "select * from funcionarios";
    
    private static final String CREATE_FUNCIONARIO = "INSERT INTO funcionarios (tipo_identificacion, numero_identificacion, nombres, apellidos, estadocivil, sexo, direccion, telefono, fecha_nacimiento, correo_electronico)"
        + "VALUES (?,?,?,?,?,?,?,?,?,?)";
    
    private static final String GET_BY_FUNCIONARIO_ID = "select * from funcionarios where id_funcionario = ?";
    
    private static final String UPDATE_FUNCIONARIO = "update funcionarios set id_funcionario = ?, tipo_identificacion = ?, numero_identificacion = ?, nombres = ?, apellidos = ?, estadocivil = ?, sexo = ?, direccion = ?, telefono = ?, fecha_nacimiento = ?, correo_electronico = ? ";
    
    private static final String DELETE_FUNCIONARIO = "DELETE FROM funcionarios WHERE id_funcionario = ?";
    
    public List<Funcionario> obtenerFuncionario() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        List<Funcionario> funcionarios = new ArrayList<>();
        try{
        connection = ConnectionUtil.getConnection();
        preparedStatement = connection.prepareStatement(GET_FUNCIONARIO);
        resultSet = preparedStatement.executeQuery();
        
        while (resultSet.next()) {
            Funcionario funcionario = new Funcionario();
            funcionario.setId_funcionario(resultSet.getInt("id_funcionario"));
            funcionario.setTipo_identificacion(resultSet.getString("tipo_identificacion"));
            funcionario.setNumero_identificacion(resultSet.getString("numero_identificacion"));
            funcionario.setNombres(resultSet.getString("nombres"));
            funcionario.setApellidos(resultSet.getString("apellidos"));
            funcionario.setEstadocivil(resultSet.getString("estadocivil"));
            funcionario.setSexo(resultSet.getString("sexo"));
            funcionario.setDireccion(resultSet.getString("direccion"));
            funcionario.setTelefono(resultSet.getString("telefono"));
            funcionario.setFecha_nacimiento(resultSet.getDate("fecha_nacimiento"));
            funcionario.setCorreo_electronico(resultSet.getString("correo_electronico"));
            funcionarios.add(funcionario);
            
        }
        return funcionarios;
        
    } finally {
        if (connection != null){
            connection.close();
        }
        if (preparedStatement != null) {
            preparedStatement.close();
        }
        if (resultSet != null){
            resultSet.close();
        }
    }
}
    
    public void crear(Funcionario funcionario) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
                
        try {
          connection = ConnectionUtil.getConnection();
          preparedStatement = connection.prepareCall(CREATE_FUNCIONARIO);
          preparedStatement.setString(1,funcionario.getTipo_identificacion());
          preparedStatement.setString(2,funcionario.getNumero_identificacion());
          preparedStatement.setString(3,funcionario.getNombres());
          preparedStatement.setString(4,funcionario.getApellidos());
          preparedStatement.setString(5,funcionario.getEstadocivil());
          preparedStatement.setString(6,funcionario.getSexo());
          preparedStatement.setString(7,funcionario.getDireccion());
          preparedStatement.setString(8,funcionario.getTelefono());
          preparedStatement.setDate(9,funcionario.getFecha_nacimiento());
          preparedStatement.setString(10,funcionario.getCorreo_electronico());
          preparedStatement.executeUpdate();
       
        } finally {
            if (connection != null) {
                preparedStatement.close();
            }
        }       
}
    
    public Funcionario obtenerFuncionario(int id_funcionario) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null; 
        Funcionario funcionario = null;
        
        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_BY_FUNCIONARIO_ID);
            preparedStatement.setInt(1,id_funcionario);
            resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()){
                funcionario = new Funcionario();
                funcionario.setId_funcionario(resultSet.getInt("id_funcionario"));
                funcionario.setTipo_identificacion(resultSet.getString("tipo_identificacion"));
                funcionario.setNumero_identificacion(resultSet.getString("numero_identificacion"));
                funcionario.setNombres(resultSet.getString("nombres"));
                funcionario.setApellidos(resultSet.getString("apellidos"));
                funcionario.setEstadocivil(resultSet.getString("estadocivil"));
                funcionario.setSexo(resultSet.getString("sexo"));
                funcionario.setDireccion(resultSet.getString("direccion"));
                funcionario.setTelefono(resultSet.getString("telefono"));
                funcionario.setFecha_nacimiento(resultSet.getDate("fecha_nacimiento"));
                funcionario.setCorreo_electronico(resultSet.getString("correo_electronico"));
                
            }
            return funcionario;
        
        }finally {
            if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        }  
    }
    
    public void actualizarFuncionario (int id_funcionario, Funcionario funcionario) throws SQLException {
      Connection connection = null;
      PreparedStatement preparedStatement = null;
      
      try{
          connection = ConnectionUtil.getConnection();
          preparedStatement = connection.prepareCall(UPDATE_FUNCIONARIO);
          preparedStatement.setString(1,funcionario.getTipo_identificacion());
          preparedStatement.setString(2,funcionario.getNumero_identificacion());
          preparedStatement.setString(3,funcionario.getNombres());
          preparedStatement.setString(4,funcionario.getApellidos());
          preparedStatement.setString(5,funcionario.getEstadocivil());
          preparedStatement.setString(6,funcionario.getSexo());
          preparedStatement.setString(7,funcionario.getDireccion());
          preparedStatement.setString(8,funcionario.getTelefono());
          preparedStatement.setDate(9,funcionario.getFecha_nacimiento());
          preparedStatement.setString(10,funcionario.getCorreo_electronico());
          preparedStatement.setInt(11,funcionario.getId_funcionario());
          preparedStatement.executeUpdate();
      
      }finally{
          if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
 }
    
    public void eliminarFuncionario (int id_funcionario) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try{
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(DELETE_FUNCIONARIO);
            preparedStatement.setInt(1,id_funcionario);
            preparedStatement.executeUpdate();
        }finally {
        if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
       }
    }
}
