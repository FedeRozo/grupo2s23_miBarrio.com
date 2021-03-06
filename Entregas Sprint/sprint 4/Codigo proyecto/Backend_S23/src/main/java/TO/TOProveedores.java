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
public class TOProveedores extends TOUsuarios {
    public int idProveedor;
    public int idUsuarioProveedor;
    public String empresa;
    public String estadoProveedor;
    public String nitEmpresa;
    public String telefonoEmpresa;
    public String direccionEmpresa;
    public String correoEmpresa;

    public TOProveedores() {
    }

    public TOProveedores(int idUsuarioProveedor, String empresa, String estadoProveedor, String nitEmpresa, String telefonoEmpresa) {
        this.idUsuarioProveedor = idUsuarioProveedor;
        this.empresa = empresa;
        this.estadoProveedor = estadoProveedor;
        this.nitEmpresa = nitEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public TOProveedores(int idUsuarioProveedor, String empresa, String estadoProveedor, String nitEmpresa, String telefonoEmpresa, String nombres, String apellidos, String tipoUsuario) {
        super(nombres, apellidos, tipoUsuario);
        this.idUsuarioProveedor = idUsuarioProveedor;
        this.empresa = empresa;
        this.estadoProveedor = estadoProveedor;
        this.nitEmpresa = nitEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public TOProveedores(int idUsuarioProveedor, String empresa, String estadoProveedor, String nitEmpresa, String telefonoEmpresa, String nombres, String apellidos, String tipoUsuario, String tipoDocumento, String documento, String telefono, String direccion, String correo) {
        super(nombres, apellidos, tipoUsuario, tipoDocumento, documento, telefono, direccion, correo);
        this.idUsuarioProveedor = idUsuarioProveedor;
        this.empresa = empresa;
        this.estadoProveedor = estadoProveedor;
        this.nitEmpresa = nitEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public TOProveedores(int idUsuarioProveedor, String empresa, String estadoProveedor, String nitEmpresa, String telefonoEmpresa, String direccionEmpresa, String correoEmpresa) {
        this.idUsuarioProveedor = idUsuarioProveedor;
        this.empresa = empresa;
        this.estadoProveedor = estadoProveedor;
        this.nitEmpresa = nitEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.correoEmpresa = correoEmpresa;
    }

    public TOProveedores(int idUsuarioProveedor, String empresa, String estadoProveedor, String nitEmpresa, String telefonoEmpresa, String direccionEmpresa, String correoEmpresa, String nombres, String apellidos, String tipoUsuario) {
        super(nombres, apellidos, tipoUsuario);
        this.idUsuarioProveedor = idUsuarioProveedor;
        this.empresa = empresa;
        this.estadoProveedor = estadoProveedor;
        this.nitEmpresa = nitEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.correoEmpresa = correoEmpresa;
    }

    public TOProveedores(int idUsuarioProveedor, String empresa, String estadoProveedor, String nitEmpresa, String telefonoEmpresa, String direccionEmpresa, String correoEmpresa, String nombres, String apellidos, String tipoUsuario, String tipoDocumento, String documento, String telefono, String direccion, String correo) {
        super(nombres, apellidos, tipoUsuario, tipoDocumento, documento, telefono, direccion, correo);
        this.idUsuarioProveedor = idUsuarioProveedor;
        this.empresa = empresa;
        this.estadoProveedor = estadoProveedor;
        this.nitEmpresa = nitEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.correoEmpresa = correoEmpresa;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdUsuarioProveedor() {
        return idUsuarioProveedor;
    }

    public void setIdUsuarioProveedor(int idUsuarioProveedor) {
        this.idUsuarioProveedor = idUsuarioProveedor;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEstadoProveedor() {
        return estadoProveedor;
    }

    public void setEstadoProveedor(String estadoProveedor) {
        this.estadoProveedor = estadoProveedor;
    }

    public String getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getCorreoEmpresa() {
        return correoEmpresa;
    }

    public void setCorreoEmpresa(String correoEmpresa) {
        this.correoEmpresa = correoEmpresa;
    }

   
}
