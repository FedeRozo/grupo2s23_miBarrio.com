/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TOProductos;
import db.ConexionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author federicorozomurcia
 */
public class DAOProductos {
    private final ConexionDB con;
    private final String nombreTabla;
    private final String nombreVista;

    public DAOProductos() {
        con = new ConexionDB ();
        nombreTabla = "Productos";
        nombreVista = "vistaproducto";
    }
    // consultar datos empleados
    public ArrayList <TOProductos> consultarProductos (){
        TOProductos producto;
        ArrayList<TOProductos> productos = new ArrayList<>();
        try {
            ResultSet rs = con.consultar(nombreVista);
            while (rs.next()){
                producto = new TOProductos();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setIdProveedorProducto((rs.getInt("idProveedorProducto")));
                producto.setCodigoProducto(rs.getString("codigoProducto"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setPresentacion(rs.getString("presentacion"));
                producto.setTipoProducto(rs.getString("tipoProducto"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setCantidadMinima(rs.getInt("cantidadMinima"));
                producto.setPrecioCompra(rs.getDouble("precioCompra"));
                producto.setPrecioVenta(rs.getDouble("precioVenta"));
                producto.setEstadoProducto(rs.getString("estadoProducto"));
                producto.setIva(rs.getDouble("iva"));
                producto.setIdProveedor((rs.getInt("idProveedor")));
                producto.setIdUsuarioProveedor(rs.getInt("idUsuarioProveedor"));
                producto.setEmpresa(rs.getString("empresa"));
                producto.setEstadoProveedor(rs.getString("estadoProveedor"));
                producto.setNitEmpresa(rs.getString("nitEmpresa"));
                producto.setTelefonoEmpresa(rs.getString("telefonoEmpresa"));
                producto.setDireccionEmpresa(rs.getString("direccionEmpresa"));
                producto.setCorreoEmpresa(rs.getString("correoEmpresa"));
                productos.add(producto);
            }
            return productos;
        } catch (SQLException ex) {
            System.out.print("Error en DAOEmpleado.consultarUsuarios: " + ex.getMessage());
            return null;
        }     
    }
    
    // insertar un nuevo empleado.
    public int isertarProducto(TOProductos producto){
        String[] Valores = {String.valueOf(producto.getIdProveedorProducto()), String.valueOf(producto.getCodigoProducto()), producto.getNombreProducto(), producto.getPresentacion(), producto.getTipoProducto(), String.valueOf(producto.getCantidad()),String.valueOf(producto.getCantidadMinima()), producto.getEstadoProducto() ,String.valueOf(producto.getIva()) };
        try {
           return con.insertar(nombreTabla, Valores);
        } catch (Exception ex) {
            System.out.print("Error en DAOEmpleado.insertarUsuarios: " + ex.getMessage());
            return 0;
        }
    }
    // actualizar empleado
    public boolean modificarProducto(TOProductos producto){
        //String[] Valores = {usuario.getNombres(), usuario.getApellidos(), usuario.getTipoUsuario(), usuario.getTipoDocumento(), usuario.getDocumento(), usuario.getTelefono(), usuario.getDireccion(), usuario.getCorreo()};
        String[] Valores = {String.valueOf(producto.getIdProveedorProducto()), String.valueOf(producto.getCodigoProducto()), producto.getNombreProducto(), producto.getPresentacion(), producto.getTipoProducto(), String.valueOf(producto.getCantidad()),String.valueOf(producto.getCantidadMinima()), producto.getEstadoProducto() ,String.valueOf(producto.getIva()) };
        try {
           return con.actualizar(nombreTabla, Valores, producto.getIdProducto());
        } catch (Exception ex) {
            System.out.print("Error en DAOEmpleado.modificarUsuarios: " + ex.getMessage());
            return false;
        }
    }
    //Eleiminar empleado
    public boolean eliminarProducto(int id){
        try {
           return con.eliminar(nombreTabla, id);
        } catch (Exception ex) {
            System.out.print("Error en DAOEmpleado.eliminarUsuarios: " + ex.getMessage());
            return false;
        }
    }
    
    
}
