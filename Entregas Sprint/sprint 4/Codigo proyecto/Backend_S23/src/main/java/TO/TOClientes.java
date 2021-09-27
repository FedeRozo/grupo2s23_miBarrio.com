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
public class TOClientes extends TOUsuarios {
    public int idClientes;
    public int idUsuarioCliente;
    public double credito;
    public String estadoCliente;

    public TOClientes() {
    }

    public TOClientes(int idUsuarioCliente, double credito, String estadoCliente, String nombres, String apellidos, String tipoUsuario) {
        super(nombres, apellidos, tipoUsuario);
        this.idUsuarioCliente = idUsuarioCliente;
        this.credito = credito;
        this.estadoCliente = estadoCliente;
    }

    public TOClientes(int idUsuarioCliente, double credito, String estadoCliente, String nombres, String apellidos, String tipoUsuario, String tipoDocumento, String documento, String telefono, String direccion, String correo) {
        super(nombres, apellidos, tipoUsuario, tipoDocumento, documento, telefono, direccion, correo);
        this.idUsuarioCliente = idUsuarioCliente;
        this.credito = credito;
        this.estadoCliente = estadoCliente;
    }

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    public int getIdUsuarioCliente() {
        return idUsuarioCliente;
    }

    public void setIdUsuarioCliente(int idUsuarioCliente) {
        this.idUsuarioCliente = idUsuarioCliente;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

     
}
