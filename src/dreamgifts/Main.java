package dreamgifts;

import db.Conexion;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import view.Ventana;
import view.Ventana_login;

/**
 *
 * @author christian
 */
public class Main {
    public static void main(String[] args)
    {
      /*Ventana_login vtl = new Ventana_login();
      vtl.setVisible(true);
      Ventana vt = new Ventana();*/
       Ventana vt = new Ventana();
       vt.setVisible(true);
      
      //COMPROBAR CONEXIÓN A LA BASE DE DATOS
      Conexion conexion = new Conexion();
      Connection conn = conexion.getConnection();
      
      if(conn != null){
          System.out.println("Conexión exitosa a la base de datos");
      }else{
          System.out.println("Problema en la conexión");
      }
    
    }
    
}
