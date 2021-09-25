/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOClientes;
import TO.TOClientes;
import java.util.ArrayList;

/**
 *
 * @author federicorozomurcia
 */
public class CtrClientes {
    DAOClientes clientesDAO;
    CtrUsuarios usuariosCtr;

    public CtrClientes () {
        clientesDAO = new DAOClientes();
    }
    
    //consultar y crear usuarios.
    public ArrayList <TOClientes> consultarClientes() {
            return clientesDAO.consultarClientes();      
    }

    public int isertarClientes (TOClientes cliente){
            usuariosCtr = new CtrUsuarios();
            cliente.setIdUsuarioCliente(usuariosCtr.isertarUsuarios(cliente));
           return clientesDAO.insertarCliente(cliente);
    }
    // actualizar en foto
    public boolean modificarCliente(TOClientes cliente){
            return clientesDAO.modificarCliente(cliente);
    }
    //Eleiminar en foto
    public boolean eliminarCliente(int id){
            return clientesDAO.eliminarCliente(id);
    }
     
}
