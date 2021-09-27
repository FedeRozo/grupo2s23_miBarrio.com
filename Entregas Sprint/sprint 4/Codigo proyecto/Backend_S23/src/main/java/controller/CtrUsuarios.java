package controller;


import DAO.DAOUsuarios;
import TO.TOUsuarios;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author federicorozomurcia
 */
public class CtrUsuarios {
    DAOUsuarios usuariosDAO;

    public CtrUsuarios() {
        usuariosDAO = new DAOUsuarios();
    }
    
    //consultar y crear usuarios.
    public ArrayList <TOUsuarios> consultarUsuarios() {
            return usuariosDAO.consultarUsuarios();      
    }

    public int isertarUsuarios(TOUsuarios usuario){
           return usuariosDAO.isertarUsuarios(usuario);
    }
    // actualizar en foto
    public boolean modificarUsuarios(TOUsuarios usuario){
            return usuariosDAO.modificarUsuarios(usuario);
    }
    //Eleiminar en foto
    public boolean eliminarUsuarios(int id){
            return usuariosDAO.eliminarUsuarios(id);
    }
    
}
