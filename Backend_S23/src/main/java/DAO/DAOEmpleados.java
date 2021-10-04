/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TOEmpleados;
import db.ConexionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author federicorozomurcia
 */
public class DAOEmpleados {
    private final ConexionDB con;
    private final String nombreTabla;
    private final String nombreVista;

    public DAOEmpleados() {
        con = new ConexionDB ();
        nombreTabla = "Empleados";
        nombreVista = "vistaempleados";
    }
    // consultar datos empleados
    public ArrayList <TOEmpleados> consultarEmpleados (){
        TOEmpleados empleado;
        ArrayList<TOEmpleados> empleados = new ArrayList<>();
        try {
            ResultSet rs = con.consultar(nombreVista);
            while (rs.next()){
                empleado = new TOEmpleados();
                empleado.setIdEmpleados(rs.getInt("idEmpleados"));
                empleado.setIdUsuariEmpleado((rs.getInt("idUsuarioEmpleado")));
                empleado.setSalario((rs.getDouble("salario")));
                empleado.setFechaIngreso(rs.getString("fechaIngreso"));
                empleado.setEstadoEmpleado(rs.getString("estadoEmpleado"));
                empleado.setCargo(rs.getString("cargo"));
                empleado.setUsuario(rs.getString("usuario"));
                empleado.setClave(rs.getString("clave"));
                empleado.setFechaEgreso(rs.getString("fechaEgreso")); 
                empleado.setNombres(rs.getString("nombres"));
                empleado.setApellidos(rs.getString("apellidos"));
                empleado.setTipoUsuario(rs.getString("tipoUsuario"));
                empleado.setTipoDocumento(rs.getString("tipoDocumento"));
                empleado.setDocumento(rs.getString("documento"));
                empleado.setTelefono(rs.getString("telefono"));
                empleado.setDireccion(rs.getString("direccion"));
                empleado.setCorreo(rs.getString("correo"));
                empleados.add(empleado);
            }
            return empleados;
        } catch (SQLException ex) {
            System.out.print("Error en DAOEmpleado.consultarUsuarios: " + ex.getMessage());
            return null;
        }     
    }
    
    // insertar un nuevo empleado.
    public int isertarEmpleado(TOEmpleados empleado){
        try {
            if (empleado.getFechaIngreso()== null);
                empleado.setFechaIngreso("1900-01-01");
            if (empleado.getFechaEgreso()== null);
                empleado.setFechaEgreso("1900-01-01");
            String[] Valores = {String.valueOf(empleado.getSalario()), String.valueOf(empleado.getIdUsuariEmpleado()), empleado.getFechaIngreso(), empleado.getEstadoEmpleado(), empleado.getCargo(), empleado.getUsuario(), empleado.getClave(), empleado.getFechaEgreso()};
        
           return con.insertar(nombreTabla, Valores);
        } catch (Exception ex) {
            System.out.print("Error en DAOEmpleado.insertarUsuarios: " + ex.getMessage());
            return 0;
        }
    }
    // actualizar empleado
    public boolean modificarEmpleado(TOEmpleados empleado){
        
        try {
            if (empleado.getFechaIngreso()== null);
                empleado.setFechaIngreso("1900-01-01");
            if (empleado.getFechaEgreso()== null);
                empleado.setFechaEgreso("1900-01-01");
            String[] Valores = {String.valueOf(empleado.getSalario()), String.valueOf(empleado.getIdUsuariEmpleado()), empleado.getFechaIngreso(), empleado.getEstadoEmpleado(), empleado.getCargo(), empleado.getUsuario(), empleado.getClave(), empleado.getFechaEgreso()};
            return con.actualizar(nombreTabla, Valores, empleado.getIdEmpleados());
        } catch (Exception ex) {
            System.out.print("Error en DAOEmpleado.modificarUsuarios: " + ex.getMessage());
            return false;
        }
    }
    //Eleiminar empleado
    public boolean eliminarEmpleado(int id){
        try {
           return con.eliminar(nombreTabla, id);
        } catch (Exception ex) {
            System.out.print("Error en DAOEmpleado.eliminarUsuarios: " + ex.getMessage());
            return false;
        }
    }
   
    //funcion de login consulta por la clave y usuario
    
    public TOEmpleados verificarEmpleados (String usuario, String clave){
        TOEmpleados empleadoTo = new TOEmpleados();
        try {
            ResultSet rs = con.consultarXwhere(nombreVista, "usuario = '" + usuario + "' AND clave = '" + clave + "'");
            while (rs.next()){
                empleadoTo.setIdEmpleados(rs.getInt("idEmpleados"));
                empleadoTo.setIdUsuariEmpleado((rs.getInt("idUsuarioEmpleado")));
                empleadoTo.setSalario((rs.getDouble("salario")));
                empleadoTo.setFechaIngreso(rs.getString("fechaIngreso"));
                empleadoTo.setEstadoEmpleado(rs.getString("estadoEmpleado"));
                empleadoTo.setCargo(rs.getString("cargo"));
                empleadoTo.setUsuario(rs.getString("usuario"));
                empleadoTo.setClave(rs.getString("clave"));
                empleadoTo.setFechaEgreso(rs.getString("fechaEgreso")); 
                empleadoTo.setNombres(rs.getString("nombres"));
                empleadoTo.setApellidos(rs.getString("apellidos"));
                empleadoTo.setTipoUsuario(rs.getString("tipoUsuario"));
                empleadoTo.setTipoDocumento(rs.getString("tipoDocumento"));
                empleadoTo.setDocumento(rs.getString("documento"));
                empleadoTo.setTelefono(rs.getString("telefono"));
                empleadoTo.setDireccion(rs.getString("direccion"));
                empleadoTo.setCorreo(rs.getString("correo"));
                empleadoTo.setIdUsuarios(rs.getInt("idUsuarios"));
            }
            return empleadoTo;
        } catch (SQLException ex) {
            System.out.print("Error en DAOEmpleado.verificarUsuario: " + ex.getMessage());
            return null;
        }     
    }
    
}
