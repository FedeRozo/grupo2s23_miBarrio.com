/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author federicorozomurcia
 */
public class Prueva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // solo para probar que hay conexion con la base de datos 
        ConexionDB c = new ConexionDB();
        if (c.getConnection()!= null)
            System.out.print("Conexion correcta");
        else
            System.out.print("Conexion erronea");
    }
    
}
