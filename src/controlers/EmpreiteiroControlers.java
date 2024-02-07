package controlers;

//@author Otília Marques

import entidades.Empreiteiro;


public class EmpreiteiroControlers {
    
    public boolean registarEmpreteiro(String identificacao, String nome, String Apelido, String numeroDeTelefone, int idade, String bI){
        
        if((nome.length() > 0 && nome != null) && (Apelido != null && Apelido.length() > 0) && idade >=0 && (bI != null && bI.length() > 0) && (identificacao != null && identificacao.length() > 0)){
            
            Empreiteiro empreiteiro = new Empreiteiro(identificacao,nome,Apelido,numeroDeTelefone,idade,bI);
            empreiteiro.registarEmpreiteiro(empreiteiro);
            
        }
        
        return false;
    }
}