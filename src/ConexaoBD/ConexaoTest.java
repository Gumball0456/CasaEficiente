/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexaoBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author kd
 */
public class ConexaoTest {
    
    public Connection getConexao(){
        Connection conexao = null;
        
        try{
            
            conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/CasaEficiente?useSSL=false", "lrngsql", "K4d1mb1c0_KD");
            
        }catch(SQLException e){
            
            e.printStackTrace();
            
        }
        
        return conexao;
    }
    
}
