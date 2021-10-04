package controller;


import DAO.DAOEmpleados;
import TO.TOEmpleados;
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
public class CtrEmpleados {
    DAOEmpleados empleadosDAO;
    CtrUsuarios usuariosCtr;

    public CtrEmpleados () {
        empleadosDAO = new DAOEmpleados();
    }
    
    //consultar y crear usuarios.
    public ArrayList <TOEmpleados> consultarEmpleados() {
            return empleadosDAO.consultarEmpleados();      
    }

    public int isertarEmpleado(TOUsuarios usuario, TOEmpleados empleado){
            usuariosCtr = new CtrUsuarios();
            usuario.setTipoUsuario("Empleado");
            empleado.setIdUsuariEmpleado(usuariosCtr.isertarUsuarios(usuario));
           return empleadosDAO.isertarEmpleado(empleado);
    }
    // actualizar en foto
    public boolean modificarEmpleado(TOUsuarios usuario, TOEmpleados empleado){
            usuariosCtr = new CtrUsuarios();
            usuario.setIdUsuarios(empleado.getIdUsuariEmpleado());
            usuariosCtr.modificarUsuarios(usuario);
            return empleadosDAO.modificarEmpleado(empleado);
    }
    //Eleiminar en foto
    public boolean eliminarEmpleado(TOEmpleados empleado){
        
            empleadosDAO.eliminarEmpleado(empleado.getIdEmpleados());
            usuariosCtr = new CtrUsuarios();
            return usuariosCtr.eliminarUsuarios(empleado.getIdUsuariEmpleado());
            
    }
    
    
    public TOEmpleados verificarEmpleados(String usuario, String clave) {
            return empleadosDAO.verificarEmpleados(usuario, clave);      
    }            
}
