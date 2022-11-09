

package conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Conecta_Pruebas {
    
  public static void main (String[]args){
      //en el try es donde vamos crear la conexión
      try {
          //1 .crear conexion
        Connection miConexion = DriverManager.getConnection("at com.mysql.cj.jdbc:mysql://localhost:3307/sistemaventa","root","");
        // 2.Crear objeto Statement
        Statement miStatement = miConexion.createStatement();
          ResultSet miResultset =miStatement.executeQuery("SELECT *FROM ");
       //Leer el resultSet
          while (miResultset.next()) {              
              System.out.println(miResultset.getString("id")+" "+miResultset.getString("nombre")+" "+miResultset.getString("telefono"));
          }
      } catch (SQLException e) {
          System.out.println("NO CONECTA!");
          
          e.printStackTrace();
      }
  }  
}
