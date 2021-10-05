/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOProductos;
import TO.TOProductos;
import java.util.ArrayList;

/**
 *
 * @author federicorozomurcia
 */
public class CtrProductos {
    DAOProductos productosDAO;
    CtrProveedores proveedoresCtr;

    public CtrProductos () {
        productosDAO = new DAOProductos();
    }
    
    //consultar y crear usuarios.
    public ArrayList <TOProductos> consultarProductos() {
            return productosDAO.consultarProductos();      
    }

    public int isertarProductos (TOProductos producto){
            proveedoresCtr = new CtrProveedores();
            //producto.setIdProveedorProducto(proveedoresCtr.insertarProveedores(producto));
           return productosDAO.isertarProducto(producto);
    }
    // actualizar en foto
    public boolean modificarProducto (TOProductos producto){
            return productosDAO.modificarProducto(producto);
    }
    //Eleiminar en foto
    public boolean eliminarProducto (int id){
            return productosDAO.eliminarProducto(id);
    } 
}
