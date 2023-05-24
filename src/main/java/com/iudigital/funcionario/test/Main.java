/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iudigital.funcionario.test;

import com.iudigital.funcionario.controller.FuncionarioController;
import com.iudigital.funcionario.domain.Funcionario;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;





/**
 *
 * @author Eleven
 */
public class Main{
    public static void obtenerFuncionario(FuncionarioController funcionarioController) {
    try{
        List<Funcionario> funcionarios = funcionarioController.obtenerFuncionario();
        if (funcionarios.isEmpty()){
            System.out.println("No hay Datos");
        }else{
            funcionarios.forEach(funcionario->{
                System.out.println("ID funcionario: "+funcionario.getId_funcionario());
                System.out.println("Tipo Identificacion: "+funcionario.getTipo_identificacion());
                System.out.println("Número identificación: "+funcionario.getNumero_identificacion());
                System.out.println("Nombres: "+funcionario.getNombres());
                System.out.println("Apellidos: "+funcionario.getApellidos());
                System.out.println("Estado Civil: "+funcionario.getEstadocivil());
                System.out.println("Sexo"+funcionario.getSexo());
                System.out.println("Dirección: "+funcionario.getDireccion());
                System.out.println("Teléfono: "+funcionario.getTelefono());
                System.out.println("Fecha Nacimiento: "+funcionario.getFecha_nacimiento());
                System.out.println("e-mail: "+funcionario.getCorreo_electronico());
            
        });
        }        
    }catch (SQLException ex){
        ex.printStackTrace();
    }
  }
    public static void crear(FuncionarioController funcionariocontroller){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite el Tipo de ID 'CC, CE, PS, TI': ");
            String tipo_identificacion = sc.nextLine();
            System.out.println("El tipo de identificación es: "+tipo_identificacion);
            System.out.println("-----------------------");
            System.out.println("Digite el número de ID");
            String numero_identificacion = sc.nextLine();
            System.out.println("El número de identificación es: "+numero_identificacion);
            System.out.println("-----------------------");
            System.out.println("Nombres: ");
            String nombres = sc.nextLine();
            System.out.println("Nombres ingresados: "+nombres);
            System.out.println("-----------------------");
            System.out.println("Apellidos: ");
            System.out.println("-----------------------");
            String apellidos = sc.nextLine();
            System.out.println("Apellidos ingresados: "+apellidos);
            System.out.println("-----------------------");
            System.out.println("Estado Civil: ");
            String estadocivil = sc.nextLine();
            System.out.println("Su estado civil: "+estadocivil);
            System.out.println("-----------------------");
            System.out.println("Indique su Sexo - Femenino/Masculino: ");
            String sexo = sc.nextLine();
            System.out.println("El sexo ingresado es: "+sexo);
            System.out.println("-----------------------");
            System.out.println("Dirección: ");
            String direccion = sc.nextLine();
            System.out.println("Dirección ingresada: "+direccion);
            System.out.println("-----------------------");
            System.out.println("Teléfono: ");
            String telefono = sc.nextLine();
            System.out.println("Teléfono ingresado: "+telefono);
            System.out.println("-----------------------");
            System.out.println("Fecha de Nacimiento AAAA/MM/DD: ");
            String fecha_nacimiento = sc.nextLine();
            java.sql.Date fechaNacimiento = java.sql.Date.valueOf(fecha_nacimiento);
            System.out.println("Fecha de nacimiento ingresada: "+fecha_nacimiento);
            System.out.println("-----------------------");
            System.out.println("e-mail: ");
            String correo_electronico = sc.nextLine();
            System.out.println("e-mail ingresado: "+correo_electronico);
            System.out.println("-----------------------");
            
            Funcionario funcionario = new Funcionario();
            funcionario.setTipo_identificacion(tipo_identificacion);
            funcionario.setNumero_identificacion(numero_identificacion);
            funcionario.setNombres(nombres);
            funcionario.setApellidos(apellidos);
            funcionario.setEstadocivil(estadocivil);
            funcionario.setSexo(sexo);
            funcionario.setDireccion(direccion);
            funcionario.setTelefono(telefono);
            funcionario.setFecha_nacimiento(fechaNacimiento);
            funcionario.setCorreo_electronico(correo_electronico);
            funcionariocontroller.crear(funcionario);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Usuario creado satisfactoriamente");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
            obtenerFuncionario(funcionariocontroller);
            
        } catch (SQLException ex) {
           ex.printStackTrace();
    }
    }      
     
    public static void eliminarFuncionario(FuncionarioController funcionarioController){
      try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el Id del funcionario: ");
        int id_funcionario = sc.nextInt();
        System.out.println("El Id del funcionario es: "+id_funcionario);
        
        Funcionario funcionarioExist = funcionarioController.obtenerFuncionario(id_funcionario);
        if(funcionarioExist == null) {
            System.out.println("No existe el Funcionario");
            return;
        }
        
        funcionarioController.eliminarFuncionario(id_funcionario);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Funcionario eliminado satisfactoriamente");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        obtenerFuncionario(funcionarioController);
        
        
      }catch (SQLException ex){
          ex.printStackTrace();
      
      }
    }
        

    
    public static void main(String[] args){
        
        var opcion = -1;
        var scanner = new Scanner(System.in);
        FuncionarioController funcionarioController = new FuncionarioController();
        while (opcion != 0){
        
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Por favor elija una opción:");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("1. Listar Usuarios");
            System.out.println("2. Crear Usuario");
            System.out.println("3. Eliminar Usuario");
            //System.out.println("4. Listar Usuario por ID");
            //System.out.println("4. Actualizar Usuario");
            
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
            
            opcion = Integer.parseInt(scanner.nextLine());
            switch(opcion){
                case 0:
                    System.out.println("---La aplicación se ha cerrado---");
                    break;
                    
                case 1:
                    obtenerFuncionario(funcionarioController);
                    break;
                    
                case 2:
                    crear(funcionarioController);
                    break;
                    
                case 3:
                    eliminarFuncionario(funcionarioController);
                    break;
                    
                default:
                    System.out.println("Opción inválida");
                    
            }                       
        }              
    }
}
