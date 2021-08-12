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
import java.util.List;
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
    public ArrayList<Pack> listPack(String name){
        ArrayList<Pack> listPack = new ArrayList<>();
        Conexion conexion = new Conexion();
        
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "SELECT * FROM PACK WHERE PCK_NOMBRE LIKE '"
                    +name+ "%'"
                    + ";";
            
            ResultSet rs = stmt.executeQuery(consulta);
            System.out.println("CONSULTA EJECUTADA CORRECTAMENTE");
            
            while(rs.next())
            {
                Pack pk = new Pack();
                pk.setPck_id_pack(rs.getInt(1));
                pk.setPck_nombre(rs.getString(2));
                pk.setPck_costo(rs.getString(3));
                pk.setPck_stock(rs.getInt(4));
                pk.setPck_estado(rs.getBoolean(5));
                
                listPack.add(pk);
            }
            
            return listPack;
        }catch(Exception err)
        {
            System.out.println("ERROR EN EL MÉTODO LISTAR PACKS "+err.getMessage());
            return null;
        }
        
    }
    //MÉTODO QUE ACTIVA O DESACTIVA UN PACK
    public void actionPack(Pack pack)
    {
        Conexion conexion = new Conexion();
        
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "UPDATE PACK SET PCK_ESTADO ="
                    + pack.isPck_estado()
                    + " WHERE PCK_ID_PACK ="
                    + pack.getPck_id_pack()
                    + ";";
            
            stmt.executeUpdate(consulta);
            System.out.println("Consulta "+consulta);
            
        }catch(Exception err)
        {
            System.out.println("ERROR EN EL MÉTODO ACTION PACK "+err.getMessage());
        }
        
    }
    
    public void updatePack(int cod,String name,String price)
    {
        Conexion conexion = new Conexion();
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "UPDATE PACK SET PCK_NOMBRE='"
                    + name
                    + "',"
                    + "PCK_COSTO='"
                    + price
                    + "' "
                    + "WHERE PCK_ID_PACK="
                    + cod
                    + ";";
            
            stmt.executeUpdate(consulta);
            
            System.out.println("PACK ACTUALIZADO CORRECTAMENTE");
            
        }catch(Exception err){
            System.out.println("ERROR EN EL MÉTODO UPDATE PACK "+err.getMessage());
        }
    }
    public void searchPack(int cod)
    {
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
           String consulta = "SELECT PCK_ID_PACK FROM PACK WHERE "
                   + "id="+ cod +";";
           System.out.println("Consulta a ejecutar: "+consulta);
            ResultSet rt = stmt.executeQuery(consulta);
            System.out.println("Consulta ejecutada correctamente");
            
            if(rt.next())
            {
                String consulta2 = "";
            }else{
                
            }
           
        }catch(Exception err)
        {
            System.out.println("ERROR EN EL METODO BUSCAR PACK  "+err.getMessage());
        }
    }
    
    //MÉTODO QUE LISTA LOS PACK POR NOMBRE, SI ESTÁ VACÍO LOS TRAE TODOS
    public List listPack(ArrayList fechaInit, ArrayList fechaFn,String comuna){
       List<List<Object>> listPack = new ArrayList<List<Object>>();
        Conexion conexion = new Conexion();
        
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "SELECT C.NAME,P.PCK_NOMBRE,COUNT(*),V.VTA_TOTAL FROM `venta` V " +
                              "JOIN COMUNA C ON C.id = V.COM_ID_COMUNA " +
                              "JOIN PACK P ON P.PCK_ID_PACK = V.PCK_ID_PACK " +
                              "JOIN estado_venta EV ON EV.EST_ID_ESTADO = V.EST_ID_ESTADO " +
                              "WHERE V.EST_ID_ESTADO = 1 " 
                            + "AND V.VTA_FECHA_VENTA BETWEEN '"
                    + fechaInit.get(2)+ "-"
                    + fechaInit.get(1)+"-"
                    + fechaInit.get(0)
                    + "' AND "
                    + "'"
                    + fechaFn.get(2)+"-"
                    + fechaFn.get(1)+"-"
                    + fechaFn.get(0)
                    + "' AND "
                    + "C.NAME = '"
                    + comuna
                    + "'"
                    + " GROUP BY P.PCK_ID_PACK" +
                    ";";

            ResultSet rs = stmt.executeQuery(consulta);
            
            
            for (int i = 0; i < 4; i++) {
                listPack.add(new ArrayList());
            }
            
            
            while(rs.next()){
                listPack.get(0).add(rs.getString(1));
                listPack.get(1).add(rs.getString(2));
                listPack.get(2).add(rs.getString(3));
                listPack.get(3).add(rs.getString(4));
            }
                    
            
            return listPack;
        }catch(Exception err)
        {
            System.out.println("ERROR EN EL MÉTODO LISTAR PACKS "+err.getMessage());
            return null;
        }
        
    }
    public List listPack(String fechaInit, String fechaFn){
       List<List<Object>> listPack = new ArrayList<List<Object>>();
        Conexion conexion = new Conexion();
        
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "SELECT P.PCK_NOMBRE,COUNT(*),V.VTA_TOTAL FROM `venta` V " +
                              "JOIN PACK P ON P.PCK_ID_PACK = V.PCK_ID_PACK " +
                              "JOIN estado_venta EV ON EV.EST_ID_ESTADO = V.EST_ID_ESTADO " +
                              
                              "WHERE V.VTA_FECHA_VENTA BETWEEN '"
                    + fechaInit
                    + "' AND "
                    + "'"
                    + fechaFn
                    + "'"
                    + " GROUP BY P.PCK_ID_PACK" +
                    ";";
            System.out.println(consulta);
            ResultSet rs = stmt.executeQuery(consulta);
            
            
            for (int i = 0; i < 3; i++) {
                listPack.add(new ArrayList());
            }
            
            
            while(rs.next()){
                listPack.get(0).add(rs.getString(1));
                listPack.get(1).add(rs.getString(2));
                listPack.get(2).add(rs.getString(3));
            }
                    
            
            return listPack;
        }catch(Exception err)
        {
            System.out.println("ERROR EN EL MÉTODO LISTAR PACKS "+err.getMessage());
            return null;
        }
        
    }
   
}
