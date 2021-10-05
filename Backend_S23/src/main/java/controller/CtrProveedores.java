/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOProveedores;
import TO.TOProveedores;
import TO.TOUsuarios;
import java.util.ArrayList;

/**
 *
 * @author federicorozomurcia
 */
public class CtrProveedores {
    DAOProveedores proveedoresDAO;
    CtrUsuarios usuariosCtr;

    public CtrProveedores () {
        proveedoresDAO = new DAOProveedores();
    }
    
    //consultar y crear usuarios.
    public ArrayList <TOProveedores> consultarProveedores() {
            return proveedoresDAO.consultarProveedores();      
    }

    public int insertarProveedores (TOUsuarios usuario, TOProveedores proveedor){
            usuariosCtr = new CtrUsuarios();
            usuario.setTipoUsuario("Proveedor");
            proveedor.setIdUsuarioProveedor(usuariosCtr.isertarUsuarios(usuario));
            return proveedoresDAO.insertarProveedor(proveedor);

    }
    // actualizar en foto
    public boolean modificarProveedor (TOUsuarios usuario, TOProveedores proveedor){
        usuariosCtr = new CtrUsuarios();
        usuario.setIdUsuarios(proveedor.getIdUsuarioProveedor());
        usuariosCtr.modificarUsuarios(usuario);
        return proveedoresDAO.modificarProveedor(proveedor);
           
    }
    //Eleiminar en foto
    public boolean eliminarProveedor (TOProveedores proveedor){
            
            proveedoresDAO.eliminarProveedor(proveedor.getIdProveedores());
            usuariosCtr = new CtrUsuarios();
            return usuariosCtr.eliminarUsuarios(proveedor.getIdUsuarioProveedor());
    }
}
