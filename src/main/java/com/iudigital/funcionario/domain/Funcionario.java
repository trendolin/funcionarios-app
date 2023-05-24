package com.iudigital.funcionario.domain;

import java.sql.Date;

/**
 *
 * @author Eleven
 */

        
public class Funcionario {
    private int Id_funcionario;
    private String Tipo_identificacion;
    private String Numero_identificacion;
    private String Nombres;
    private String Apellidos;
    private String Estadocivil;
    private String Sexo;
    private String Direccion;
    private String Telefono;
    private Date Fecha_nacimiento;
    private String Correo_electronico;

    public int getId_funcionario() {
        return Id_funcionario;
    }

    public void setId_funcionario(int Id_funcionario) {
        this.Id_funcionario = Id_funcionario;
    }

    public String getTipo_identificacion() {
        return Tipo_identificacion;
    }

    public void setTipo_identificacion(String Tipo_identificacion) {
        this.Tipo_identificacion = Tipo_identificacion;
    }

    public String getNumero_identificacion() {
        return Numero_identificacion;
    }

    public void setNumero_identificacion(String Numero_identificacion) {
        this.Numero_identificacion = Numero_identificacion;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEstadocivil() {
        return Estadocivil;
    }

    public void setEstadocivil(String Estadocivil) {
        this.Estadocivil = Estadocivil;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public Date getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    public String getCorreo_electronico() {
        return Correo_electronico;
    }

    public void setCorreo_electronico(String Correo_electronico) {
        this.Correo_electronico = Correo_electronico;
    }

    @Override
    public String toString() {
        return Nombres + " " + Apellidos;
    }
    
    
    
}


