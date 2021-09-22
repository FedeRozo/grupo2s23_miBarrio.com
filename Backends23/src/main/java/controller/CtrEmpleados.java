package controller;


import DAO.DAOEmpleados;
import TO.TOEmpleados;
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
    
    //consiltar y crear usuarios.
    public ArrayList <TOEmpleados> consultarEmpleados() {
            return empleadosDAO.consultarEmpleados();      
    }

    public int isertarEmpleado(TOEmpleados empleado){
            usuariosCtr = new CtrUsuarios();
            empleado.setIdUsuariEmpleado(usuariosCtr.isertarUsuarios(empleado));
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
    
}
