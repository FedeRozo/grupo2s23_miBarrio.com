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
                empleado.setSalario(Double.parseDouble(rs.getString("salario")));
                empleado.setIdEmpleado(Integer.valueOf(rs.getString("idUsuarioEmpleado")));
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
            return null;
        } catch (SQLException ex) {
            System.out.print("Error en DAOEmpleado.consultarUsuarios: " + ex.getMessage());
            return null;
        }     
    }
    
    // insertar un nuevo empleado.
    public int isertarEmpleado(TOEmpleados empleado){
        //String[] Valores = {usuario.getNombres(), usuario.getApellidos(), usuario.getTipoUsuario(), usuario.getTipoDocumento(), usuario.getDocumento(), usuario.getTelefono(), usuario.getDireccion(), usuario.getCorreo()};
        String[] Valores = {String.valueOf(empleado.getSalario()), String.valueOf(empleado.getIdUsuariEmpleado()), empleado.getFechaIngreso(), empleado.getEstadoEmpleado(), empleado.getCargo(), empleado.getUsuario(), empleado.getClave(), empleado.getFechaEgreso()};
        try {
           return con.insertar(nombreTabla, Valores);
        } catch (Exception ex) {
            System.out.print("Error en DAOEmpleado.insertarUsuarios: " + ex.getMessage());
            return 0;
        }
    }
    // actualizar empleado
    public boolean modificarEmpleado(TOEmpleados empleado){
        //String[] Valores = {usuario.getNombres(), usuario.getApellidos(), usuario.getTipoUsuario(), usuario.getTipoDocumento(), usuario.getDocumento(), usuario.getTelefono(), usuario.getDireccion(), usuario.getCorreo()};
        String[] Valores = {String.valueOf(empleado.getSalario()), String.valueOf(empleado.getIdUsuariEmpleado()), empleado.getFechaIngreso(), empleado.getEstadoEmpleado(), empleado.getCargo(), empleado.getUsuario(), empleado.getClave(), empleado.getFechaEgreso()};
        try {
           return con.actualizar(nombreTabla, Valores, empleado.getIdEmpleado());
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
    
    
}
