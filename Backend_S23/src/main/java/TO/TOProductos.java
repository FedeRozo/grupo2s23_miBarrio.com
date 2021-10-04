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
public class TOProductos extends TOProveedores {
    public int idProductos;
    public int idProveedorProducto;
    public String codigoProducto;
    public String nombreProducto;
    public String presentacion;
    public String tipoProducto; 
    public int cantidad;
    public int cantidadMinima;
    public double precioCompra;
    public double precioVenta;
    public String estadoProducto;
    public double iva;

    public TOProductos() {
    }

    public TOProductos(int idProveedorProducto, String nombreProducto, String presentacion, String tipoProducto, int cantidad, int cantidadMinima, double precioCompra, double precioVenta, String estadoProducto, double iva, int idUsuarioProveedor, String empresa, String estadoProveedor, String nitEmpresa, String telefonoEmpresa) {
        super(idUsuarioProveedor, empresa, estadoProveedor, nitEmpresa, telefonoEmpresa);
        this.idProveedorProducto = idProveedorProducto;
        this.nombreProducto = nombreProducto;
        this.presentacion = presentacion;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.cantidadMinima = cantidadMinima;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.estadoProducto = estadoProducto;
        this.iva = iva;
    }

    public TOProductos(int idProveedorProducto, String nombreProducto, String presentacion, String tipoProducto, int cantidad, int cantidadMinima, double precioCompra, double precioVenta, String estadoProducto, double iva, int idUsuarioProveedor, String empresa, String estadoProveedor, String nitEmpresa, String telefonoEmpresa, String nombres, String apellidos, String tipoUsuario) {
        super(idUsuarioProveedor, empresa, estadoProveedor, nitEmpresa, telefonoEmpresa, nombres, apellidos, tipoUsuario);
        this.idProveedorProducto = idProveedorProducto;
        this.nombreProducto = nombreProducto;
        this.presentacion = presentacion;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.cantidadMinima = cantidadMinima;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.estadoProducto = estadoProducto;
        this.iva = iva;
    }

    public TOProductos(int idProveedorProducto, String nombreProducto, String presentacion, String tipoProducto, int cantidad, int cantidadMinima, double precioCompra, double precioVenta, String estadoProducto, double iva, int idUsuarioProveedor, String empresa, String estadoProveedor, String nitEmpresa, String telefonoEmpresa, String nombres, String apellidos, String tipoUsuario, String tipoDocumento, String documento, String telefono, String direccion, String correo) {
        super(idUsuarioProveedor, empresa, estadoProveedor, nitEmpresa, telefonoEmpresa, nombres, apellidos, tipoUsuario, tipoDocumento, documento, telefono, direccion, correo);
        this.idProveedorProducto = idProveedorProducto;
        this.nombreProducto = nombreProducto;
        this.presentacion = presentacion;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.cantidadMinima = cantidadMinima;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.estadoProducto = estadoProducto;
        this.iva = iva;
    }

    public TOProductos(int idProveedorProducto, String nombreProducto, String presentacion, String tipoProducto, int cantidad, int cantidadMinima, double precioCompra, double precioVenta, String estadoProducto, double iva, int idUsuarioProveedor, String empresa, String estadoProveedor, String nitEmpresa, String telefonoEmpresa, String direccionEmpresa, String correoEmpresa) {
        super(idUsuarioProveedor, empresa, estadoProveedor, nitEmpresa, telefonoEmpresa, direccionEmpresa, correoEmpresa);
        this.idProveedorProducto = idProveedorProducto;
        this.nombreProducto = nombreProducto;
        this.presentacion = presentacion;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.cantidadMinima = cantidadMinima;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.estadoProducto = estadoProducto;
        this.iva = iva;
    }

    public TOProductos(int idProveedorProducto, String nombreProducto, String presentacion, String tipoProducto, int cantidad, int cantidadMinima, double precioCompra, double precioVenta, String estadoProducto, double iva, int idUsuarioProveedor, String empresa, String estadoProveedor, String nitEmpresa, String telefonoEmpresa, String direccionEmpresa, String correoEmpresa, String nombres, String apellidos, String tipoUsuario) {
        super(idUsuarioProveedor, empresa, estadoProveedor, nitEmpresa, telefonoEmpresa, direccionEmpresa, correoEmpresa, nombres, apellidos, tipoUsuario);
        this.idProveedorProducto = idProveedorProducto;
        this.nombreProducto = nombreProducto;
        this.presentacion = presentacion;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.cantidadMinima = cantidadMinima;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.estadoProducto = estadoProducto;
        this.iva = iva;
    }

    public TOProductos(int idProveedorProducto, String nombreProducto, String presentacion, String tipoProducto, int cantidad, int cantidadMinima, double precioCompra, double precioVenta, String estadoProducto, double iva, int idUsuarioProveedor, String empresa, String estadoProveedor, String nitEmpresa, String telefonoEmpresa, String direccionEmpresa, String correoEmpresa, String nombres, String apellidos, String tipoUsuario, String tipoDocumento, String documento, String telefono, String direccion, String correo) {
        super(idUsuarioProveedor, empresa, estadoProveedor, nitEmpresa, telefonoEmpresa, direccionEmpresa, correoEmpresa, nombres, apellidos, tipoUsuario, tipoDocumento, documento, telefono, direccion, correo);
        this.idProveedorProducto = idProveedorProducto;
        this.nombreProducto = nombreProducto;
        this.presentacion = presentacion;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.cantidadMinima = cantidadMinima;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.estadoProducto = estadoProducto;
        this.iva = iva;
    }

    public TOProductos(int idProveedorProducto, String codigoProducto, String nombreProducto, String presentacion, String tipoProducto, int cantidad, int cantidadMinima, double precioCompra, double precioVenta, String estadoProducto, double iva) {
        this.idProveedorProducto = idProveedorProducto;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.presentacion = presentacion;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.cantidadMinima = cantidadMinima;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.estadoProducto = estadoProducto;
        this.iva = iva;
    }

    public TOProductos(int idProveedorProducto, String codigoProducto, String nombreProducto, String presentacion, String tipoProducto, int cantidad, int cantidadMinima, double precioCompra, double precioVenta, String estadoProducto, double iva, int idUsuarioProveedor, String empresa, String estadoProveedor, String nitEmpresa, String telefonoEmpresa) {
        super(idUsuarioProveedor, empresa, estadoProveedor, nitEmpresa, telefonoEmpresa);
        this.idProveedorProducto = idProveedorProducto;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.presentacion = presentacion;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.cantidadMinima = cantidadMinima;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.estadoProducto = estadoProducto;
        this.iva = iva;
    }

    public TOProductos(int idProveedorProducto, String codigoProducto, String nombreProducto, String presentacion, String tipoProducto, int cantidad, int cantidadMinima, double precioCompra, double precioVenta, String estadoProducto, double iva, int idUsuarioProveedor, String empresa, String estadoProveedor, String nitEmpresa, String telefonoEmpresa, String nombres, String apellidos, String tipoUsuario) {
        super(idUsuarioProveedor, empresa, estadoProveedor, nitEmpresa, telefonoEmpresa, nombres, apellidos, tipoUsuario);
        this.idProveedorProducto = idProveedorProducto;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.presentacion = presentacion;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.cantidadMinima = cantidadMinima;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.estadoProducto = estadoProducto;
        this.iva = iva;
    }

    public TOProductos(int idProveedorProducto, String codigoProducto, String nombreProducto, String presentacion, String tipoProducto, int cantidad, int cantidadMinima, double precioCompra, double precioVenta, String estadoProducto, double iva, int idUsuarioProveedor, String empresa, String estadoProveedor, String nitEmpresa, String telefonoEmpresa, String nombres, String apellidos, String tipoUsuario, String tipoDocumento, String documento, String telefono, String direccion, String correo) {
        super(idUsuarioProveedor, empresa, estadoProveedor, nitEmpresa, telefonoEmpresa, nombres, apellidos, tipoUsuario, tipoDocumento, documento, telefono, direccion, correo);
        this.idProveedorProducto = idProveedorProducto;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.presentacion = presentacion;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.cantidadMinima = cantidadMinima;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.estadoProducto = estadoProducto;
        this.iva = iva;
    }

    public TOProductos(int idProveedorProducto, String codigoProducto, String nombreProducto, String presentacion, String tipoProducto, int cantidad, int cantidadMinima, double precioCompra, double precioVenta, String estadoProducto, double iva, int idUsuarioProveedor, String empresa, String estadoProveedor, String nitEmpresa, String telefonoEmpresa, String direccionEmpresa, String correoEmpresa) {
        super(idUsuarioProveedor, empresa, estadoProveedor, nitEmpresa, telefonoEmpresa, direccionEmpresa, correoEmpresa);
        this.idProveedorProducto = idProveedorProducto;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.presentacion = presentacion;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.cantidadMinima = cantidadMinima;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.estadoProducto = estadoProducto;
        this.iva = iva;
    }

    public TOProductos(int idProveedorProducto, String codigoProducto, String nombreProducto, String presentacion, String tipoProducto, int cantidad, int cantidadMinima, double precioCompra, double precioVenta, String estadoProducto, double iva, int idUsuarioProveedor, String empresa, String estadoProveedor, String nitEmpresa, String telefonoEmpresa, String direccionEmpresa, String correoEmpresa, String nombres, String apellidos, String tipoUsuario) {
        super(idUsuarioProveedor, empresa, estadoProveedor, nitEmpresa, telefonoEmpresa, direccionEmpresa, correoEmpresa, nombres, apellidos, tipoUsuario);
        this.idProveedorProducto = idProveedorProducto;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.presentacion = presentacion;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.cantidadMinima = cantidadMinima;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.estadoProducto = estadoProducto;
        this.iva = iva;
    }

    public TOProductos(int idProveedorProducto, String codigoProducto, String nombreProducto, String presentacion, String tipoProducto, int cantidad, int cantidadMinima, double precioCompra, double precioVenta, String estadoProducto, double iva, int idUsuarioProveedor, String empresa, String estadoProveedor, String nitEmpresa, String telefonoEmpresa, String direccionEmpresa, String correoEmpresa, String nombres, String apellidos, String tipoUsuario, String tipoDocumento, String documento, String telefono, String direccion, String correo) {
        super(idUsuarioProveedor, empresa, estadoProveedor, nitEmpresa, telefonoEmpresa, direccionEmpresa, correoEmpresa, nombres, apellidos, tipoUsuario, tipoDocumento, documento, telefono, direccion, correo);
        this.idProveedorProducto = idProveedorProducto;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.presentacion = presentacion;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.cantidadMinima = cantidadMinima;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.estadoProducto = estadoProducto;
        this.iva = iva;
    }

    public int getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(int idProductos) {
        this.idProductos = idProductos;
    }

    public int getIdProveedorProducto() {
        return idProveedorProducto;
    }

    public void setIdProveedorProducto(int idProveedorProducto) {
        this.idProveedorProducto = idProveedorProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(String estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    
}