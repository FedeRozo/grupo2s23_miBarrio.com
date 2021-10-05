/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TOProveedores;
import db.ConexionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author federicorozomurcia
 */
public class DAOProveedores {
    private final ConexionDB con;
    private final String nombreTabla;
    private final String nombreVista;

    public DAOProveedores() {
        con = new ConexionDB();
        this.nombreTabla = "Proveedores";
        this.nombreVista = "vistaproveedor";
    }

    // consultar datos empleados
    public ArrayList <TOProveedores> consultarProveedores() {
        TOProveedores proveedor;
        ArrayList <TOProveedores> proveedores = new ArrayList<>();
        try {
            ResultSet rs = con.consultar(nombreVista);
            while (rs.next()) {
                proveedor = new TOProveedores();
                proveedor.setIdProveedores((rs.getInt("idProveedores")));
                proveedor.setIdUsuarioProveedor(rs.getInt("idUsuarioProveedor"));
                proveedor.setEmpresa(rs.getString("empresa"));
                proveedor.setEstadoProveedor(rs.getString("estadoProveedor"));
                proveedor.setNitEmpresa(rs.getString("nitEmpresa"));
                proveedor.setTelefonoEmpresa(rs.getString("telefonoEmpresa"));
                proveedor.setDireccionEmpresa(rs.getString("direccionEmpresa"));
                proveedor.setCorreoEmpresa(rs.getString("correoEmpresa"));
                proveedor.setNombres(rs.getString("nombres"));
                proveedor.setApellidos(rs.getString("apellidos"));
                proveedor.setTipoUsuario(rs.getString("tipoUsuario"));
                proveedor.setTipoDocumento(rs.getString("tipoDocumento"));
                proveedor.setDocumento(rs.getString("documento"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedor.setDireccion(rs.getString("direccion"));
                proveedor.setCorreo(rs.getString("correo"));
                proveedores.add(proveedor);
            }
            return proveedores;
        } catch (SQLException ex) {
            System.out.print("Error en DAOProveedores.consultarUsuarios: " + ex.getMessage());
            return null;
        }
    }

    public int insertarProveedor(TOProveedores proveedor) {
        String[] Valores = {String.valueOf(proveedor.getIdUsuarioProveedor()),proveedor.getEmpresa(), proveedor.getEstadoProveedor(), proveedor.getNitEmpresa(), proveedor.getTelefonoEmpresa(), proveedor.getDireccionEmpresa(), proveedor.getCorreoEmpresa()};
        try {
            return con.insertar(nombreTabla, Valores);
        } catch (Exception ex) {
            System.out.print("Error en DAOProveedores.insertarUsuarios: " + ex.getMessage());
            return 0;
        }
    }

    public boolean modificarProveedor(TOProveedores proveedor) {
        String[] Valores = {proveedor.getEmpresa(), proveedor.getEstadoProveedor(), proveedor.getNitEmpresa(), proveedor.getTelefonoEmpresa(), proveedor.getDireccionEmpresa(), proveedor.getCorreoEmpresa()};
        try {
            return con.actualizar(nombreTabla, Valores, proveedor.getIdProveedores());
        } catch (Exception ex) {
            System.out.print("Error en DAOProveedores.modificarProveedor: " + ex.getMessage());
            return false;
        }
    }

    public boolean eliminarProveedor(int id) {
        try {
            return con.eliminar(nombreTabla, id);
        } catch (Exception ex) {
            System.out.print("Error en DAOProveedores.eliminarProveedores: " + ex.getMessage());
            return false;
        }
    }

}
