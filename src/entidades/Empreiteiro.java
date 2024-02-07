package entidades;

//@author Otília Marques

import java.util.ArrayList;


public class Empreiteiro extends Usuario {
    private ArrayList<Manutencao> manutencoes = new ArrayList<>();

    public Empreiteiro(String identificacao, String nome, String Apelido, String numeroDeTelefone, int idade, String bI) {
        super(identificacao, nome, Apelido, numeroDeTelefone, idade, bI);
    }

    public ArrayList<Manutencao> getManutencoes() {
        return manutencoes;
    }

    public void setManutencoes(ArrayList<Manutencao> manutencoes) {
        this.manutencoes = manutencoes;
    }
    
    public void realizarManutencao(Imovel imovel){
        
    }
    
    public void gerirPedidosDeManutencao(){
        
    }
    
    public void gerarHistoricoDeManutencoes(){
        
    }  

    public void registarEmpreiteiro(Empreiteiro empreiteiro){
        
        
    }
}