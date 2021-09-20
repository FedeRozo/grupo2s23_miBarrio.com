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
public class TOClientes extends ToUsuarios {
    public int idClientes;
    public int idUsuarioCliente;
    public String credito;
    public String estado;

    public TOClientes() {
    }

    public TOClientes(int idClientes, int idUsuarioCliente, String credito, String estado, String nombres, String apellidos, String tipoUsuario) {
        super(nombres, apellidos, tipoUsuario);
        this.idClientes = idClientes;
        this.idUsuarioCliente = idUsuarioCliente;
        this.credito = credito;
        this.estado = estado;
    }

    public TOClientes(int idUsuarioCliente, String credito, String estado, String nombres, String apellidos, String tipoUsuario, String tipoDocumento, String documento, String telefono, String direccion, String correo) {
        super(nombres, apellidos, tipoUsuario, tipoDocumento, documento, telefono, direccion, correo);
        this.idUsuarioCliente = idUsuarioCliente;
        this.credito = credito;
        this.estado = estado;
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

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
