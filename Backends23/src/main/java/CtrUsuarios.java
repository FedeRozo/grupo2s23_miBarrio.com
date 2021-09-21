
import DAO.DAOUsuarios;
import TO.ToUsuarios;
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

    public CtrUsuarios(DAOUsuarios usuarioDAO) {
        usuariosDAO = new DAOUsuarios();
    }
    
    //consiltar y crear usuarios.
    public ArrayList <ToUsuarios> consultarUsuarios() {
            return usuariosDAO.consultarUsuarios();      
    }

    public int isertarUsuarios(ToUsuarios usuario){
           return usuariosDAO.isertarUsuarios(usuario);
    }
    // actualizar en foto
    public boolean modificarUsuarios(ToUsuarios usuario){
            return usuariosDAO.modificarUsuarios(usuario);
    }
    //Eleiminar en foto
    public boolean eliminarUsuarios(int id){
            return usuariosDAO.eliminarUsuarios(id);
    }
    
}
