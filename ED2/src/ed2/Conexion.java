/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed2;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class Conexion{
    public String db = "ed2";
    public String url = "jdbc:mysql://localhost/"+db;
    public String user = "root";
    public String pass = "";
    Connection link = null;
    
   public Connection Conectar(){

       

       try{

           Class.forName("org.gjt.mm.mysql.Driver");

           link = DriverManager.getConnection(this.url, this.user, this.pass);
           System.out.println("Conexion a ED valida");

       }catch(Exception ex){

           JOptionPane.showMessageDialog(null, ex);

       }
        


       return link;

   }
   public ResultSet SelectQuery(String st) throws SQLException{
       PreparedStatement stm= link.prepareStatement(st);
       ResultSet rs= stm.executeQuery();
       System.out.println("fvf");
       return rs;
       
   }
   public void InsertQuery(String nombre,int id,String contra) throws SQLException{
       PreparedStatement stmt = link.prepareStatement("INSERT INTO usuario VALUES (?,?,?)");
       stmt.setInt(1,id);
       stmt.setString(2,nombre);
       stmt.setString(3,contra);
       stmt.executeUpdate();
   }
    
}
