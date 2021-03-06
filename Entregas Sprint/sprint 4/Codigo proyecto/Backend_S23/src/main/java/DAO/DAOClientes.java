/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TOClientes;
import db.ConexionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author federicorozomurcia
 */
public class DAOClientes {
    private final ConexionDB con;
    private final String nombreTabla;
    private final String nombreVista;

    public DAOClientes() {
        con = new ConexionDB();
        this.nombreTabla = "Clientes";
        this.nombreVista = "vistaclientes";
    }

    public ArrayList <TOClientes> consultarClientes() {
        TOClientes cliente;
        ArrayList <TOClientes> clientes = new ArrayList<>();
        try {
            ResultSet rs = con.consultar(nombreVista);
            while (rs.next()) {
                cliente = new TOClientes();
                cliente.setIdClientes(rs.getInt("idClientes"));
                cliente.setIdUsuarioCliente(rs.getInt("idUsuarioCliente"));
                cliente.setCredito(rs.getDouble("credito"));
                cliente.setEstadoCliente(rs.getString("estadoCliente"));
                cliente.setNombres(rs.getString("nombres"));
                cliente.setApellidos(rs.getString("apellidos"));
                cliente.setTipoUsuario(rs.getString("tipoUsuario"));
                cliente.setTipoDocumento(rs.getString("tipoDocumento"));
                cliente.setDocumento(rs.getString("documento"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setCorreo(rs.getString("correo"));
                clientes.add(cliente);
            }
            return clientes;
        } catch (SQLException ex) {
            System.out.print("Error en DAOClientes.consultarUsuarios: " + ex.getMessage());
            return null;
        }
    }

    public int insertarCliente(TOClientes cliente) {
        String[] Valores = {String.valueOf(cliente.getCredito()), cliente.getEstadoCliente()};
        try {
            return con.insertar(nombreTabla, Valores);
        } catch (Exception ex) {
            System.out.print("Error en DAOClientes.insertarUsuarios: " + ex.getMessage());
            return 0;
        }
    }

    public boolean modificarCliente(TOClientes cliente) {
        String[] Valores = {String.valueOf(cliente.getCredito()), cliente.getEstadoCliente()};
        
        try {
            return con.actualizar(nombreTabla, Valores, cliente.getIdClientes());
        } catch (Exception ex) {
            System.out.print("Error en DAOClientes.modificarCliente: " + ex.getMessage());
            return false;
        }
    }

    public boolean eliminarCliente(int id) {
        try {
            return con.eliminar(nombreTabla, id);
        } catch (Exception ex) {
            System.out.print("Error en DAOClientes.eliminarCliente: " + ex.getMessage());
            return false;
        }
    }

}




    