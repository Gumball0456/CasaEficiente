/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexaoBD;

import entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author kd
 */
public class ClienteDAO {
    
    public void registarCliente(Cliente cliente){
        
        Connection conexao = null;
        
        String query = "INSERT INTO Cliente (BI,nome,sobrenome)values(?,?,?)";
        
        try{
            conexao = new ConexaoTest().getConexao();
            PreparedStatement statement = conexao.prepareStatement(query);
            statement.setString(1, cliente.getbI());
            statement.setString(2, cliente.getNome());
            statement.setString(3, cliente.getApelido());
            
            statement.execute();
            
        }catch(SQLException e){
            
            e.printStackTrace();
            
        }
        
    }
    
}
