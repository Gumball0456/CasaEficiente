package controlers;

//@author Otília Marques

import entidades.Corrector;


public class CorrectorControlers {
    
    public boolean registarCorrector(int numeroDoCorrector, String identificacao, String nome, String Apelido, String numeroDeTelefone, int idade, String bI){
        
        if((nome.length() > 0 && nome != null) && (Apelido != null && Apelido.length() > 0) && idade >=0 && (bI != null && bI.length() > 0) && (identificacao != null && identificacao.length() > 0)){
            Corrector corrector = new Corrector(numeroDoCorrector,identificacao,nome,Apelido,numeroDeTelefone,idade,bI);
            corrector.registerCorrector(corrector);
            return true;
            
        }
        
        
        return false;
    }
}