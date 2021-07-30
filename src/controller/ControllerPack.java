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
import java.util.Iterator;
import model.Pack;

/**
 *
 * @author christian
 */
public class ControllerPack {
    
    public static int idPack;
    public static int idArticulo;
    public static int cantidad;
    //MÉTODO QUE CREA UN PACK
    public void createPack(Pack pack, ArrayList cantArt,ArrayList idArticulo)
    {
        Conexion conexion = new Conexion();
        try{
            
            Connection conn = conexion.getConnection();
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
            
            
            String consultaIdPack = "SELECT MAX(PCK_ID_PACK) FROM PACK;";
            ResultSet rs = stmt.executeQuery(consultaIdPack);
            if(rs.next()){
                idPack=rs.getInt(1);
            }else{
            
            }
            
            for(int i=0;i<idArticulo.size();i++){
                String insertPck = "INSERT INTO PACK_HAS_ARTICULO (PCK_ID_PACK,ART_ID_ARTICULO,CANTIDAD) VALUES("
                        +idPack+ ","
                        +idArticulo.get(i)+ ","
                        +cantArt.get(i)+ ");";
                
                stmt.executeUpdate(insertPck);
            }
            
            
            
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
