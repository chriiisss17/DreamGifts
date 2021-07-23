/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.Articulo;

/**
 *
 * @author christian
 */
public class ControllerArticulo {
    //MÉTODO QUE LISTA TODOS LOS ARTICULOS
    public ArrayList<Articulo> listArticulo()
    {
        ArrayList<Articulo> listArticulo = new ArrayList<>();
        Conexion conexion = new Conexion();
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta= "SELECT * FROM ARTICULO;";
            
            ResultSet rs= stmt.executeQuery(consulta);
            
            System.out.println("Consulta ejecutada correctamente");
            while(rs.next()){
                Articulo art = new Articulo();
                art.setArt_id_articulo(rs.getInt(1));
                art.setArt_descripcion(rs.getString(2));
                art.setArt_stock(rs.getInt(3));
                
                listArticulo.add(art);
            }
            return listArticulo;
            
        }catch(Exception err)
        {
            System.out.println("ERROR EN EL METODO QUE LISTA LOS ARTICULOS "+err.getMessage());
            return new ArrayList<Articulo>();
        }
    }
}
