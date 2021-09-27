/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOProveedores;
import TO.TOProveedores;
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

    public int isertarProveedores (TOProveedores proveedor){
            usuariosCtr = new CtrUsuarios();
            proveedor.setIdUsuarioProveedor(usuariosCtr.isertarUsuarios(proveedor));
           return proveedoresDAO.insertarProveedor(proveedor);
    }
    // actualizar en foto
    public boolean modificarProveedor (TOProveedores proveedor){
            return proveedoresDAO.modificarProveedor(proveedor);
    }
    //Eleiminar en foto
    public boolean eliminarProveedor (int id){
            return proveedoresDAO.eliminarProveedor(id);
    }
}
