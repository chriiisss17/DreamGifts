

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
public class Controller_login {
     
    /*public ArrayList<Usuario> listUsuario(String name, String password)
    {
        ArrayList<Usuario> listUsuario = new ArrayList<>();
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();

            String consulta = "SELECT name FROM usuario WHERE name = '"+name+"' and password ='"+password+"';";
            
            System.out.println("Consulta a ejecutar "+consulta);

            ResultSet rs = stmt.executeQuery(consulta);

         
            return listUsuario;
        }
        catch(Exception err)
        {
            System.out.println(err.getMessage());
            System.out.println("Error en el metodo buscar Usuario");
            return new ArrayList<Usuario>();
        }
    }*/
    
    public void validateUsuario(Usuario usuario)
    {
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
           String consulta = "SELECT * FROM usuario WHERE "
                   + "name='"+ usuario.getName() +"';";
                   
            System.out.println("Consulta a ejecutar 1: "+consulta);
            ResultSet rs = stmt.executeQuery(consulta);
            System.out.println("Consulta correcta de usuario");
            if(rs.next())
            {
               
                System.out.println("USUARIO ENCONTRADO  "+rs.getString(2)+" "+rs.getString(3));
                validatePass(usuario);
            }else{
                System.out.println("Usuario no existe");
            }
        }catch(Exception err)
        {
            System.out.println("ERROR EN EL METODO VALIDAR USUARIO  "+err);
        }
    }
    
     public void validatePass(Usuario usuario){
         Conexion conexion = new Conexion();
         try
         {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "SELECT * FROM usuario WHERE "
                   + "password='"+ usuario.getPassword()+"';";
            System.out.println("Consulta a ejecutar 2: "+consulta);
            ResultSet rt = stmt.executeQuery(consulta);
            if(rt.next()){
                System.out.println("Passwor VALIDO CHOROOOO"+ rt.getString(3));
                
            }else{
                System.out.println("Clave incorrecta");
            }
            
         }catch(Exception err)
        {
            System.out.println("ERROR EN EL METODO VALIDAR PASSWORD  "+err);
        }
     }
     

}
