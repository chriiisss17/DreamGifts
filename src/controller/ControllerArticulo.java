/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.Conexion;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author christian
 */
public class ControllerArticulo {
    //MÉTODO QUE LISTA TODOS LOS ARTICULOS
    public void listArticulo()
    {
        Conexion conexion = new Conexion();
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta= "SELECT * FROM ARTICULO;";
            
            stmt.executeQuery(consulta);
            
            System.out.println("Consulta ejecutada correctamente");
            
        }catch(Exception err)
        {
            System.out.println("ERROR EN EL METODO QUE LISTA LOS ARTICULOS "+err.getMessage());
        }
    }
}
