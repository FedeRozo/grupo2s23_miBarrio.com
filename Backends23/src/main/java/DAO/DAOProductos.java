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
 * @author eliana
 */
public class DAOProductos {
    private final ConexionDB con;
    private final String nombreTabla;
    private final String nombreVista;

    public DAOProductos() {
        con = new ConexionDB();
        this.nombreTabla = "Productos";
        this.nombreVista = "vistaproductos";
    }

    public ArrayList <TOProductos> consultarProductos() {
        TOProductos producto;
        ArrayList <TOProductos> productos = new ArrayList<>();
        try {
            ResultSet rs = con.consultar(nombreVista);
            while (rs.next()) {
                producto = new TOProductos();
                producto.setIdProducto(Integer.valueOf(rs.getString("idProveedorProducto")));
                producto.setCodigoProducto(rs.getString("codigoProducto"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setPresentacion(rs.getString("presentacion"));
                producto.setTipoProducto(rs.getString("tipoProducto"));
                producto.setCantidad((int) Double.parseDouble(rs.getString("cantidad")));
                producto.setCantidadMinima((int) Double.parseDouble(rs.getString("cantidadMinima")));
                producto.PrecioCompra(Double.parseDouble(rs.getString("precioCompra")));
                producto.PrecioVenta(Double.parseDouble(rs.getString("precioVenta")));
                producto.setEstadoProducto(rs.getString("estadoProducto"));
                producto.Iva(Double.parseDouble(rs.getString("iva")));
                productos.add(producto);
            }
            return null;
        } catch (SQLException ex) {
            System.out.print("Error en DAOProducto.consultarUsuarios: " + ex.getMessage());
            return null;
        }
    }

    public int insertarProducto(TOProductos producto) {
        String[] Valores = {String.valueOf(producto.getIdProveedorProducto()), producto.getCodigoProducto(), producto.getNombreProducto(), producto.getPresentacion(), producto.getTipoProducto(),String.valueOf(producto.getCantidad()),String.valueOf(producto.getCantidadMinima()),String.valueOf(producto.getPrecioCompra()),String.valueOf(producto.getPrecioVenta()),producto.getEstadoProducto(),String.valueOf(producto.getIva())};
        try {
            return con.insertar(nombreTabla, Valores);
        } catch (Exception ex) {
            System.out.print("Error en DAOProductos.insertarUsuarios: " + ex.getMessage());
            return 0;
        }
    }

    public boolean modificarProductos(TOProductos producto) {
        String[] Valores = {String.valueOf(producto.getIdProveedorProducto()), producto.getCodigoProducto(), producto.getNombreProducto(), producto.getPresentacion(), producto.getTipoProducto(),String.valueOf(producto.getCantidad()),String.valueOf(producto.getCantidadMinima()),String.valueOf(producto.getPrecioCompra()),String.valueOf(producto.getPrecioVenta()),producto.getEstadoProducto(),String.valueOf(producto.getIva())};
        try {
            return con.actualizar(nombreTabla, Valores, producto.getIdProducto());
        } catch (Exception ex) {
            System.out.print("Error en DAOProducto.modificarProveedor: " + ex.getMessage());
            return false;
        }
    }

    public boolean eliminarProducto(int id) {
        try {
            return con.eliminar(nombreTabla, id);
        } catch (Exception ex) {
            System.out.print("Error en DAOProductos.eliminarProductos: " + ex.getMessage());
            return false;
        }
    }

    
    
}
