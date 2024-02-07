package controlers;

//@author Otília Marques

import entidades.Administrador;


public class AdministradorControlers {
   
    public boolean cadastrarAdministrador(String identicicao,String nome, String apelido, String telefone, int idade,String BI ){
        
        if((identicicao != null && identicicao.length() > 0) && (nome.length() > 0 && nome != null) && (apelido.length() > 0 && apelido != null)){
            
            Administrador admin = new Administrador();
            admin.setNome(nome);
            admin.setApelido(apelido);
            admin.setIdentificacao(identicicao);
            admin.setIdade(idade);
            admin.setbI(BI);
            
            return true;
            
        }
        
        return false;
    }
    
}