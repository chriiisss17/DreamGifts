/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.ResultSet;
import db.Conexion;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import model.Banco;


public class ControllerBanco {
    //MÉTODO QUE ALMACENA UNA COMUNA
    public void createBanco(Banco banco)
    {
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt =conn.createStatement();
            
            String consulta = "INSERT INTO banco (name,cod,action) VALUES ("
                    +"'"+ banco.getDescripcion()+ "',"
                    + banco.getCod() +","
                    + banco.isAction() +");";
            System.out.println("Consulta a ejecutar "+consulta);
            stmt.executeUpdate(consulta);//<--- METODO SIRVE PARA INSERT - UPDATE - DELETE
            System.out.println("Consulta ejecutada correctamente");
        }
        catch(Exception err)
        {
            System.out.println(err.getMessage());
            System.out.println("ERROR EN EL MÉTODO ALMACENAR");
        }
        }
    //MÉTODO QUE BUSCA UNA COMUNA POR NOMBRE, SI ESTÁ VACÍO LAS TRAE TODAS
    public ArrayList<Banco> listBanco(String name)
    {
        ArrayList<Banco> listBanco = new ArrayList<>();
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "SELECT id,cod,name,action FROM banco WHERE name LIKE '"+name+"%' ORDER BY cod;";
            System.out.println("Consulta a ejecutar "+consulta);
           
            ResultSet rs = stmt.executeQuery(consulta);
            
            while(rs.next())
            {
                Banco bn = new Banco();
                bn.setId(rs.getInt(1));
                bn.setCod(rs.getInt(2));
                bn.setDescripcion(rs.getString(3));
                bn.setAction(rs.getBoolean(4));
                listBanco.add(bn);
                
}
            return listBanco;
        }
        catch(Exception err)
        {
            System.out.println(err.getMessage());
            System.out.println("Error en el metodo buscar banco");
            return new ArrayList<Banco>();
        }
    }
    //MÉTODO QUE MODIFICA UNA COMUNA
    public void updateBanco(Banco banco    )
    {
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            

            String consulta = "UPDATE BANCO "
                    + "SET cod = "+banco.getCod()+","
                    + "name = '"  +banco.getDescripcion()+"',"
                    + "action ="  +banco.isAction()+" "
                    + "WHERE id ="+banco.getId()+";";
            
            System.out.println("Consulta a ejecutar: "+consulta);
            stmt.executeUpdate(consulta);
            System.out.println("Consulta ejecutada correctamente");
            
  }
        catch(Exception err)
        {
            System.out.println(err.getMessage());
            System.out.println("ERROR EN EL MÉTODO MODIFICAR BANCO");
        }
    }
    //MÉTODO QUE BUSCA UN BANCO, SI EXISTE LA ACTUALIZA,
    //SI NO EXISTE LA ALMACENA
    public void validateBanco(Banco banco)
    {
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
           String consulta = "SELECT * FROM BANCO WHERE "
                   + "id="+ banco.getId() +";";
           System.out.println("Consulta a ejecutar: "+consulta);
            ResultSet rt = stmt.executeQuery(consulta);
            System.out.println("Consulta ejecutada correctamente");
            if(rt.next())
            {
                System.out.println("BANCO A ACTUALIZAR "+rt.getInt(1));
                updateBanco(banco);
            }else{
                createBanco(banco);
            }
             }catch(Exception err)
        {
            System.out.println("ERROR EN EL METODO VALIDAR COMUNA  "+err.getMessage());
        }
    }
    
    //MÉTODO QUE DESACTIVA O ACTIVA UN BANCO
    public void actionBanco(Banco banco)
    {
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "UPDATE BANCO "
                    + "SET action = "+banco.isAction()+" "
                    + "WHERE id ="+banco.getId()+";";
             System.out.println("Consulta a ejecutar "+consulta);
            stmt.executeUpdate(consulta);
            System.out.println("Consulta ejecutada correctamente");
            
        }catch(Exception err)
        {
            System.out.println("ERROR EN EL MÉTODO DESACTIVAR BANCO "+err.getMessage());
        }
    }
}
