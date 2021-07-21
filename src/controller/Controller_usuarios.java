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
import model.Usuario;

/**
 *
 * @author paudi
 */

public class Controller_usuarios {
    public void createUsuario(Usuario usuario)
    {
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt =conn.createStatement();
            
            String consulta = "INSERT INTO usuario (name,password,action) VALUES ("
                    +"'"+ usuario.getName()+ "','"
                    + usuario.getPassword()+"',"
                    + usuario.isAction() +");";
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
    public ArrayList<Usuario> listUsuario(String name)
    {
        ArrayList<Usuario> listUsuario = new ArrayList<>();
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "SELECT id,name,password,action FROM usuario WHERE name LIKE '"+name+"%' ORDER BY name;";
            System.out.println("Consulta a ejecutar "+consulta);
           
            ResultSet rs = stmt.executeQuery(consulta);
            
            while(rs.next())
            {
                Usuario bn = new Usuario();
                bn.setId(rs.getInt(1));
                bn.setName(rs.getString(2));
                bn.setPassword(rs.getString(3));
                bn.setAction(rs.getBoolean(4));
                listUsuario.add(bn);
                
}
            return listUsuario;
        }
        catch(Exception err)
        {
            System.out.println(err.getMessage());
            System.out.println("Error en el metodo buscar usuario");
            return new ArrayList<Usuario>();
        }
    }
    //MÉTODO QUE MODIFICA UNA COMUNA
    public void updateUsuario(Usuario usuario    )
    {
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            

            String consulta = "UPDATE usuario SET "
                    + "name = '"  +usuario.getName()+"',"
                    + "action ="  +usuario.isAction()+" "
                    + "WHERE id ="+usuario.getId()+";";
            
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
    public void validateUsuario(Usuario usuario)
    {
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
           String consulta = "SELECT * FROM usuario WHERE "
                   + "id="+ usuario.getId() +";";
           System.out.println("Consulta a ejecutar: "+consulta);
            ResultSet rt = stmt.executeQuery(consulta);
            System.out.println("Consulta ejecutada correctamente");
            if(rt.next())
            {
                System.out.println("BANCO A ACTUALIZAR "+rt.getInt(1));
                updateUsuario(usuario);
            }else{
                createUsuario(usuario);
            }
             }catch(Exception err)
        {
            System.out.println("ERROR EN EL METODO VALIDAR USUARIO  "+err.getMessage());
        }
    }
    
    //MÉTODO QUE DESACTIVA O ACTIVA UN USUARIO
    public void actionUsuario(Usuario usuario)
    {
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "UPDATE usuario "
                    + "SET action = "+usuario.isAction()+" "
                    + "WHERE id ="+usuario.getId()+";";
             System.out.println("Consulta a ejecutar "+consulta);
            stmt.executeUpdate(consulta);
            System.out.println("Consulta ejecutada correctamente");
            
        }catch(Exception err)
        {
            System.out.println("ERROR EN EL MÉTODO DESACTIVAR USUARIO "+err.getMessage());
        }
    }
   
}

        
    
