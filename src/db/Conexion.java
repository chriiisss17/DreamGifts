/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author christian
 */
public class Conexion {
    private final static String SERVER="localhost:3306";
    private final static String USER="root";
    private final static String PASS="";
    private final static String DB="dreamgifts";
    
    //METÓDO QUE OBTIENE Y ESTABLECE LA CONEXIÓN
    public Connection getConnection()
    {
            Properties propiedadesConexion = new Properties();
            try
            {
                propiedadesConexion.put("user",USER);
                propiedadesConexion.put("password",PASS);
                
                Connection conn = DriverManager.getConnection("jdbc:mysql://"+SERVER+"/"+DB, propiedadesConexion);
                
                return conn;
            }
            catch(Exception err)
            {
                System.out.println(err.getMessage());
                return null;
            }
    }
}
