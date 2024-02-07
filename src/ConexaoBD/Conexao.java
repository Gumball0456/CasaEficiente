/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexaoBD;
import java.io.File;
import java.sql.*;
/**
 *
 * @author gumball
 */
public class Conexao {
    static Statement stm;
    static ResultSet rs;
    public static ResultSet getImovel(){
        try {
            rs = stm.executeQuery("select * from imovel");
            if(rs.next())
                return rs;
        } catch (SQLException ex) {
            System.out.println("Erro. Nao pode obter imovel");    
        }
        return null;
    }
    public static void conectar(){
        Connection connection = null;
        try
        {
          // create a database connection
          connection = DriverManager.getConnection("jdbc:sqlite:database" + File.separator +"CasaEficiente.db");
          stm = connection.createStatement();
          stm.setQueryTimeout(30);  // set timeout to 30 sec.
        }
        catch(SQLException e)
        {
          // if the error message is "out of memory",
          // it probably means no database file is found
          System.err.println(e.getMessage());
        }
    }
}
