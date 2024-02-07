package controlers;

//@author Otília Marques

import entidades.Apartamento;


public class ApartamentoControlers {
    
    
    public boolean registarApartamento(int numeroDeVarandas, int numerosDeQuartos, int numerosDeWC, int numerosDeCozinhas, int numerosDeSalas, String endereco, double comprimento, int compartimentos, double preco, double largura, boolean estadoDaManutencao, String estadoDoImovel){
        
        
        if((numeroDeVarandas >= 0) && (numerosDeQuartos >= 0) && (numerosDeWC >= 0) && (numerosDeCozinhas >= 0) && (numerosDeSalas >= 0) && (endereco != null && endereco.length() > 0) && (compartimentos >= 0) && (comprimento >0.0) && (preco >= 0.0) && (largura >= 0.0) & (estadoDoImovel != null && estadoDoImovel.length() > 0) ){
            
            Apartamento apartamento = new Apartamento(numeroDeVarandas,numerosDeQuartos,numerosDeWC,numerosDeCozinhas,numerosDeSalas,endereco,comprimento,compartimentos,preco,largura,estadoDaManutencao,estadoDoImovel);
            apartamento.registarApartamento(apartamento);
            return true;
            
        }
        return false;
    }
}