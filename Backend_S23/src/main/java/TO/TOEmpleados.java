/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TO;

/**
 *
 * @author federicorozomurcia
 */
public class TOEmpleados extends TOUsuarios {
    private int idEmpleado;
    private int idUsuariEmpleado;
    private double  salario;
    private String fechaIngreso;
    private String estadoEmpleado;
    private String cargo;
    private String usuario;
    private String clave;
    private String fechaEgreso;

    public TOEmpleados() {
    }

    public TOEmpleados(int idUsuariEmpleado, double salario, String estadoEmpleado, String cargo, String usuario, String clave, String nombres, String apellidos, String tipoUsuario) {
        super(nombres, apellidos, tipoUsuario);
        this.idUsuariEmpleado = idUsuariEmpleado;
        this.salario = salario;
        this.estadoEmpleado = estadoEmpleado;
        this.cargo = cargo;
        this.usuario = usuario;
        this.clave = clave;
    }

    public TOEmpleados(int idUsuariEmpleado, double salario, String estadoEmpleado, String cargo, String usuario, String clave, String nombres, String apellidos, String tipoUsuario, String tipoDocumento, String documento, String telefono, String direccion, String correo) {
        super(nombres, apellidos, tipoUsuario, tipoDocumento, documento, telefono, direccion, correo);
        this.idUsuariEmpleado = idUsuariEmpleado;
        this.salario = salario;
        this.estadoEmpleado = estadoEmpleado;
        this.cargo = cargo;
        this.usuario = usuario;
        this.clave = clave;
    }

    public TOEmpleados(int idUsuariEmpleado, double salario, String fechaIngreso, String estadoEmpleado, String cargo, String usuario, String clave, String fechaEgreso, String nombres, String apellidos, String tipoUsuario) {
        super(nombres, apellidos, tipoUsuario);
        this.idUsuariEmpleado = idUsuariEmpleado;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
        this.estadoEmpleado = estadoEmpleado;
        this.cargo = cargo;
        this.usuario = usuario;
        this.clave = clave;
        this.fechaEgreso = fechaEgreso;
    }

    public TOEmpleados(int idUsuariEmpleado, double salario, String fechaIngreso, String estadoEmpleado, String cargo, String usuario, String clave, String fechaEgreso, String nombres, String apellidos, String tipoUsuario, String tipoDocumento, String documento, String telefono, String direccion, String correo) {
        super(nombres, apellidos, tipoUsuario, tipoDocumento, documento, telefono, direccion, correo);
        this.idUsuariEmpleado = idUsuariEmpleado;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
        this.estadoEmpleado = estadoEmpleado;
        this.cargo = cargo;
        this.usuario = usuario;
        this.clave = clave;
        this.fechaEgreso = fechaEgreso;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdUsuariEmpleado() {
        return idUsuariEmpleado;
    }

    public void setIdUsuariEmpleado(int idUsuariEmpleado) {
        this.idUsuariEmpleado = idUsuariEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(String estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(String fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }
    
}


    