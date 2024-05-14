package InterfazGrafica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author ADSI
 */
public class conexion {
    
   static String bd = "recepcion";
   static String login = "root";
   static String password = "root";
   static String url = "jdbc:mysql://localhost/"+bd;

   Connection conn = null;

   /** Constructor de DbConnection */
   public conexion() {
      try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         conn = DriverManager.getConnection(url,login,password);

         if (conn!=null){
            System.out.println("Conexión a base de datos "+bd+" OK");
         }
      }
      catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }catch(Exception e){
         System.out.println(e);
      }
   }
   /**Permite retornar la conexión*/
   public Connection getConnection(){
      return conn;
   }

   public void desconectar(){
       System.out.println("Desconexion de la base de datos "+bd+" OK");
       conn = null;
   }

}

