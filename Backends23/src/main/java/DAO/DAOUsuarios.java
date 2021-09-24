/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TOUsuarios;
import db.ConexionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author federicorozomurcia
 */
public class DAOUsuarios {
    
    // cneccion con la base de datos
    private final ConexionDB con;
    private final String nombreTabla;
    
    // constructor
    
    public DAOUsuarios(){
        con = new ConexionDB (); 
        nombreTabla = "Usuarios";
    }

    //consiltar y crear usuarios.
    public ArrayList <TOUsuarios> consultarUsuarios() {
        TOUsuarios usuario;
        ArrayList<TOUsuarios> usuarios = new ArrayList<>();
        try {
            ResultSet rs = con.consultar(nombreTabla);
            while (rs.next()){
                usuario = new TOUsuarios();
                usuario.setNombres(rs.getString("nombres"));
                usuario.setApellidos(rs.getString("apellidos"));
                usuario.setTipoUsuario(rs.getString("tipoUsuario"));
                usuario.setTipoDocumento(rs.getString("tipoDocumento"));
                usuario.setDocumento(rs.getString("documento"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setDireccion(rs.getString("direccion"));
                usuario.setCorreo(rs.getString("correo"));
                usuarios.add (usuario);
            }
            return usuarios;
        } catch (SQLException ex) {
            System.out.print("Error en DAOUsuario.consultarUsuarios: " + ex.getMessage());
            return null;
        }       
    }

    public int isertarUsuarios(TOUsuarios usuario){
        String[] Valores = {usuario.getNombres(), usuario.getApellidos(), usuario.getTipoUsuario(), usuario.getTipoDocumento(), usuario.getDocumento(), usuario.getTelefono(), usuario.getDireccion(), usuario.getCorreo()};
        try {
           return con.insertar(nombreTabla, Valores);
        } catch (Exception ex) {
            System.out.print("Error en DAOUsuarios.insertarUsuarios: " + ex.getMessage());
            return 0;
        }
    }
    // actualizar en foto
    public boolean modificarUsuarios(TOUsuarios usuario){
        String[] Valores = {usuario.getNombres(), usuario.getApellidos(), usuario.getTipoUsuario(), usuario.getTipoDocumento(), usuario.getDocumento(), usuario.getTelefono(), usuario.getDireccion(), usuario.getCorreo()};
        try {
           return con.actualizar(nombreTabla, Valores, usuario.getIdUsuarios());
        } catch (Exception ex) {
            System.out.print("Error en DAOUsuarios.modificarUsuarios: " + ex.getMessage());
            return false;
        }
    }
    //Eleiminar en foto
    public boolean eliminarUsuarios(int id){
        try {
           return con.eliminar(nombreTabla, id);
        } catch (Exception ex) {
            System.out.print("Error en DAOUsuarios.eliminarUsuarios: " + ex.getMessage());
            return false;
        }
    }
    
}
