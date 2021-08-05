package controller;
import java.sql.ResultSet;
import db.Conexion;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Comuna;
/**
 *
 * @author christian
 */
public class ControllerComuna {
    //MÉTODO QUE ALMACENA UNA COMUNA
    public void createComuna(Comuna comuna)
    {
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt =conn.createStatement();
            
            String consulta = "INSERT INTO comuna (name,cod,action) VALUES ("
                    +"'"+ comuna.getName() + "',"
                    + comuna.getCod() +","
                    + comuna.isAction() +");";
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
    public ArrayList<Comuna> listComuna(String name)
    {
        ArrayList<Comuna> listComuna = new ArrayList<>();
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "SELECT id,cod,name,action FROM comuna WHERE name LIKE '"+name+"%' ORDER BY cod;";
            System.out.println("Consulta a ejecutar "+consulta);
            
            ResultSet rs = stmt.executeQuery(consulta);
            
            while(rs.next())
            {
                Comuna cm = new Comuna();
                cm.setId(rs.getInt(1));
                cm.setCod(rs.getInt(2));
                cm.setName(rs.getString(3));
                cm.setAction(rs.getBoolean(4));
                listComuna.add(cm);
                
            }
            return listComuna;
        }
        catch(Exception err)
        {
            System.out.println(err.getMessage());
            System.out.println("Error en el metodo buscar comuna");
            return new ArrayList<Comuna>();
        }
    }
    //MÉTODO QUE MODIFICA UNA COMUNA
    public void updateComuna(Comuna comuna)
    {
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "UPDATE COMUNA "
                    + "SET cod = "+comuna.getCod()+","
                    + "name = '"  +comuna.getName()+"',"
                    + "action ="  +comuna.isAction()+" "
                    + "WHERE id ="+comuna.getId()+";";
            
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
    public void validateComuna(Comuna comuna)
    {
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
           String consulta = "SELECT * FROM COMUNA WHERE "
                   + "id="+ comuna.getId() +";";
           System.out.println("Consulta a ejecutar: "+consulta);
            ResultSet rt = stmt.executeQuery(consulta);
            System.out.println("Consulta ejecutada correctamente");
            if(rt.next())
            {
                System.out.println("COMUNA A ACTUALIZAR "+rt.getInt(1));
                updateComuna(comuna);
            }else{
                createComuna(comuna);
            }
            
           
        }catch(Exception err)
        {
            System.out.println("ERROR EN EL METODO VALIDAR COMUNA  "+err.getMessage());
        }
    }
    
    //MÉTODO QUE DESACTIVA O ACTIVA UNA COMUNA
    public void actionComuna(Comuna comuna)
    {
        Conexion conexion = new Conexion();
        try
        {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "UPDATE COMUNA "
                    + "SET action = "+comuna.isAction()+" "
                    + "WHERE id ="+comuna.getId()+";";
            
            System.out.println("Consulta a ejecutar "+consulta);
            stmt.executeUpdate(consulta);
            System.out.println("Consulta ejecutada correctamente");
            
        }catch(Exception err)
        {
            System.out.println("ERROR EN EL MÉTODO DESACTIVAR COMUNA "+err.getMessage());
        }
    }
    //MÉTODO QUE LISTA LOS PACK POR COMUNA
    public ArrayList<Object> listComuna(ArrayList fechaInit, ArrayList fechaFn){
        ArrayList<Object> listPack = new ArrayList<>();
        Conexion conexion = new Conexion();
        
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String day=(String) fechaInit.get(1);
            String month=(String) fechaInit.get(2);
            String year=(String) fechaInit.get(3);
            
            String day2=(String) fechaFn.get(1);
            String month2=(String) fechaFn.get(2);
            String year2=(String) fechaFn.get(3);
            
            
            return listPack;
        }catch(Exception err)
        {
            System.out.println("ERROR EN EL MÉTODO LISTAR PACKS "+err.getMessage());
            return null;
        }
        
    }
    
    //MÉTODO QUE OBTIENE LAS COMUNAS
    public List listComuna(){
        
        Conexion conexion = new Conexion();
        //ArrayList<Object> listComuna= new ArrayList<>();
        

        List<List<String>> ejemploLista = new ArrayList<List<String>>();
        
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "SELECT ID FROM COMUNA;";
            
            ResultSet rs= stmt.executeQuery(consulta);
            
            for(int i =0;i<2;i++)
            {
                ejemploLista.add(new ArrayList<String>());
            }
            while(rs.next()){
                ejemploLista.get(0).add(Integer.toString(rs.getInt(1)));
            }
            
            String consulta2 = "SELECT NAME FROM COMUNA;";
            
            rs = stmt.executeQuery(consulta2);
            
            while(rs.next()){
                ejemploLista.get(1).add(rs.getString(1));
            }
            
            return ejemploLista;
            
        }catch(Exception err){
            System.out.println("ERROR EN EL MÉTODO QUE OBTIENE LAS COMUNAS "+err.getMessage());
            return null;
        }
    }
}
