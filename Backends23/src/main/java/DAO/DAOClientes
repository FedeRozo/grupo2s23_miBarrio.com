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
 * @author eliana
 */
public class DAOClientes {
    private final ConexionDB con;
    private final String nombreTabla;
    private final String nombreVista;

    public DAOClientes() {
        con = new ConexionDB();
        nombreTabla = "Clientes";
        nombreVista = "vistaclientes";
    }

    public ArrayList <TOClientes> consultarClientes() {
        TOClientes cliente;
        ArrayList <TOClientes> clientes = new ArrayList<>();
        try {
            ResultSet rs = con.consultar(nombreVista);
            while (rs.next()) {
                cliente = new TOClientes();
                cliente.setIdCliente(Integer.valueOf(rs.getString("idUsuarioCliente")));
                cliente.setCredito(rs.getString("credito"));
                cliente.setEstadoCliente(rs.getString("estadoCliente"));
                clientes.add(cliente);
            }
            return null;
        } catch (SQLException ex) {
            System.out.print("Error en DAOClientes.consultarUsuarios: " + ex.getMessage());
            return null;
        }
    }

    public int insertarCliente(TOClientes cliente) {
        String[] Valores = {cliente.getCredito(), cliente.getEstadoCliente()};
        try {
            return con.insertar(nombreTabla, Valores);
        } catch (Exception ex) {
            System.out.print("Error en DAOClientes.insertarUsuarios: " + ex.getMessage());
            return 0;
        }
    }

    public boolean modificarCliente(TOClientes cliente) {
        String[] Valores = {cliente.getCredito(), cliente.getEstadoCliente()};
        
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
