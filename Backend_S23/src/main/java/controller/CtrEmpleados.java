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
            empleado.setIdUsuariEmpleado(usuariosCtr.isertarUsuarios(usuario));
           return empleadosDAO.isertarEmpleado(empleado);
    }
    // actualizar en foto
    public boolean modificarEmpleado(TOEmpleados empleado){
            return empleadosDAO.modificarEmpleado(empleado);
    }
    //Eleiminar en foto
    public boolean eliminarEmpleado(int id){
            return empleadosDAO.eliminarEmpleado(id);
    }
    
    
    public TOEmpleados verificarEmpleados(String usuario, String clave) {
            return empleadosDAO.verificarEmpleados(usuario, clave);      
    }            
}
