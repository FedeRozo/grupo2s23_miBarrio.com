/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOClientes;
import TO.TOClientes;
import TO.TOUsuarios;
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

    public int isertarClientes (TOUsuarios usuario, TOClientes cliente){
            usuariosCtr = new CtrUsuarios();
            usuario.setTipoUsuario("Cliente");
            cliente.setIdUsuarioCliente(usuariosCtr.isertarUsuarios(usuario));
           return clientesDAO.insertarCliente(cliente);
           
    }
    // actualizar en foto
    public boolean modificarCliente(TOUsuarios usuario, TOClientes cliente){
            usuariosCtr = new CtrUsuarios();
            usuario.setIdUsuarios(cliente.getIdUsuarioCliente());
            usuariosCtr.modificarUsuarios(usuario);
            return clientesDAO.modificarCliente(cliente);
            
    }
    //Eleiminar en foto
    public boolean eliminarCliente(TOClientes cliente){
            clientesDAO.eliminarCliente(cliente.getIdClientes());
            usuariosCtr = new CtrUsuarios();
            return usuariosCtr.eliminarUsuarios(cliente.getIdUsuarioCliente());
       
    }
     
}
