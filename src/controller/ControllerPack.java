/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.Conexion;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import model.Pack;

/**
 *
 * @author christian
 */
public class ControllerPack {
    //MÉTODO QUE CREA UN PACK
    public void createPack(Pack pack, Object listIdArticulo)
    {
        Conexion conexion = new Conexion();
        try{
            /*Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "INSERT INTO PACK (PCK_NOMBRE,PCK_COSTO,PCK_STOCK,PCK_ESTADO) VALUES ("
                    + "'"+pack.getPck_nombre()+"',"
                    + "'"+pack.getPck_costo()+"',"
                    + ""+pack.getPck_stock()+","
                    + ""+pack.isPck_estado()
                    + ");";
            
            System.out.println("Consulta a ejecutar "+consulta);
            stmt.executeUpdate(consulta);
            System.out.println("Consulta ejecutada correctamente");
            */
            
            System.out.println(listIdArticulo);
        }catch(Exception err)
        {
            System.out.println("ERROR EN EL METODO CREAR PACK "+err.getMessage());
        }
    }
    
    //MÉTODO QUE LISTA LOS PACK POR NOMBRE, SI ESTÁ VACÍO LOS TRAE TODOS
    /*public ArrayList<Pack> listPack(String name){
        ArrayList<Pack> listPack = new ArrayList<>();
        Conexion conexion = new Conexion();
        
        try{
            
        }catch(Exception err)
        {
            System.out.println("ERROR EN EL MÉTODO LISTAR PACKS "+err.getMessage());
        }
        
    }*/
    
    //MÉTODO QUE INSERTA ARTICULOS EN UN PACK
    public void insertArtPack(int id){
        Conexion conexion = new Conexion();
        
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "INSERT INTO pack_has_articulo (PCK_ID_PACK,ART_ID_ARTICULO,CANTIDAD) VALUES ("
                    + ""
                    + ""
                    + ");";
            
        }catch(Exception err)
        {
            System.out.println("ERROR EN EL METODO INSERTAR ARTICULOS EN PACK "+err.getMessage());
        }
    }
}
