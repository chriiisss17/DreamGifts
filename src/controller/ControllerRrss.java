package controller;
import java.sql.ResultSet;
import db.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.RRSS;

/**
 *
 * @author Usuario
 */
public class ControllerRrss {
    
     //MÉTODO QUE ALMACENA UNA RRSS
    public void createRrss(RRSS rrss)
    {
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt =conn.createStatement();
            
            String consulta = "INSERT INTO rrss (name,cod,action) VALUES ("
                    +"'"+ rrss.getName() + "',"
                    + rrss.getCod() +","
                    + rrss.isAction() +");";
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
    //MÉTODO QUE BUSCA UNA RRSS POR NOMBRE, SI ESTÁ VACÍO LAS TRAE TODAS
    public ArrayList<RRSS> listRrss(String name)
    {
        ArrayList<RRSS> listRrss = new ArrayList<>();
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "SELECT id,cod,name,action FROM rrss WHERE name LIKE '"+name+"%' ORDER BY cod;";
            System.out.println("Consulta a ejecutar "+consulta);
            
            ResultSet rs = stmt.executeQuery(consulta);
            
            while(rs.next())
            {
                RRSS cm = new RRSS();
                cm.setId(rs.getInt(1));
                cm.setCod(rs.getInt(2));
                cm.setName(rs.getString(3));
                cm.setAction(rs.getBoolean(4));
                listRrss.add(cm);
                
            }
            return listRrss;
        }
        catch(Exception err)
        {
            System.out.println(err.getMessage());
            System.out.println("Error en el metodo buscar comuna");
            return new ArrayList<RRSS>();
        }
    }
    //MÉTODO QUE MODIFICA UNA RRSS
    public void updateRrss(RRSS rrss)
    {
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "UPDATE rrss "
                    + "SET cod = "+rrss.getCod()+","
                    + "name = '"  +rrss.getName()+"',"
                    + "action ="  +rrss.isAction()+" "
                    + "WHERE id ="+rrss.getId()+";";
            
            System.out.println("Consulta a ejecutar: "+consulta);
            stmt.executeUpdate(consulta);
            System.out.println("Consulta ejecutada correctamente");
            
        }
        catch(Exception err)
        {
            System.out.println(err.getMessage());
            System.out.println("ERROR EN EL MÉTODO MODIFICAR COMUNA");
        }
    }
    
    //MÉTODO QUE BUSCA UNA COMUNA, SI EXISTE LA ACTUALIZA,
    //SI NO EXISTE LA ALMACENA
    public void validateComuna(RRSS rrss)
    {
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
           String consulta = "SELECT * FROM rrss WHERE "
                   + "id="+ rrss.getId() +";";
           System.out.println("Consulta a ejecutar: "+consulta);
            ResultSet rt = stmt.executeQuery(consulta);
            System.out.println("Consulta ejecutada correctamente");
            if(rt.next())
            {
                System.out.println("COMUNA A ACTUALIZAR "+rt.getInt(1));
                updateRrss(rrss);
            }else{
                createRrss(rrss);
            }
            
           
        }catch(Exception err)
        {
            System.out.println("ERROR EN EL METODO VALIDAR COMUNA  "+err.getMessage());
        }
    }
    
    //MÉTODO QUE DESACTIVA O ACTIVA UNA COMUNA
    public void actionRrss(RRSS rrss)
    {
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "UPDATE rrss "
                    + "SET action = "+rrss.isAction()+" "
                    + "WHERE id ="+rrss.getId()+";";
            
            System.out.println("Consulta a ejecutar "+consulta);
            stmt.executeUpdate(consulta);
            System.out.println("Consulta ejecutada correctamente");
            
        }catch(Exception err)
        {
            System.out.println("ERROR EN EL MÉTODO DESACTIVAR COMUNA "+err.getMessage());
        }
    }
}
