package controlers;

//@author Otília Marques

import entidades.Cliente;


public class ClienteControlers {
    
    public boolean registerCliente(String provincia,String municipio,String bairro,int dia,int mes,int ano,String identificacao, String nome, String Apelido, String numeroDeTelefone,int idade, String bI){
        
        if((nome.length() > 0 && nome != null) && (Apelido != null && Apelido.length() > 0) && idade >=0 && (bI != null && bI.length() > 0)){
            
            Cliente cliente = new Cliente(provincia,municipio,bairro,dia,mes,ano,identificacao, nome, Apelido, numeroDeTelefone,idade, bI);
            cliente.registarCliente(cliente);
            return true;
            
        }
        
        
        return false;
    }
}