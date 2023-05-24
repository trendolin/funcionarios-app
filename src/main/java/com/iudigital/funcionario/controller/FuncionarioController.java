/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.iudigital.funcionario.controller;

import com.iudigital.funcionario.data.FuncionarioDao;
import com.iudigital.funcionario.domain.Funcionario;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Eleven
 */
public class FuncionarioController {
    private FuncionarioDao funcionarioDao;
    
    public FuncionarioController(){
        funcionarioDao = new FuncionarioDao();
    }
    
    public List<Funcionario> obtenerFuncionario() throws SQLException{
        
        return funcionarioDao.obtenerFuncionario();
    }
    
    public void crear(Funcionario funcionario) throws SQLException {
        funcionarioDao.crear(funcionario);
    }
    
    public Funcionario obtenerFuncionario(int id_funcionario) throws SQLException {
        return funcionarioDao.obtenerFuncionario(id_funcionario);
    }
    
    public void actualizarFuncionario(int id_funcionario, Funcionario func) throws SQLException {
        funcionarioDao.actualizarFuncionario(id_funcionario, func);
    }
    
    public void eliminarFuncionario(int id_funcionario) throws SQLException {
        funcionarioDao.eliminarFuncionario(id_funcionario);
    }
}    
