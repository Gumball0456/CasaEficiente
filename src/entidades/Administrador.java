package entidades;

//@author Otília Marques

import java.util.ArrayList;

public class Administrador extends Usuario {
    private ArrayList<Corrector> listaDeCorrectores = new ArrayList<>();
    private ArrayList<Empreiteiro> listaDeEmpreiteiros = new ArrayList<>();

    public Administrador(){
        this("","","","",0,"");
    }
    public Administrador(String identificacao, String nome, String Apelido, String numeroDeTelefone, int idade, String bI) {
        super(identificacao, nome, Apelido, numeroDeTelefone, idade, bI);
    }

    public ArrayList<Corrector> getListaDeCorrectores() {
        return listaDeCorrectores;
    }

    public void setListaDeCorrectores(ArrayList<Corrector> listaDeCorrectores) {
        this.listaDeCorrectores = listaDeCorrectores;
    }

    public ArrayList<Empreiteiro> getListaDeEmpreiteiros() {
        return listaDeEmpreiteiros;
    }

    public void setListaDeEmpreiteiros(ArrayList<Empreiteiro> listaDeEmpreiteiros) {
        this.listaDeEmpreiteiros = listaDeEmpreiteiros;
    }
    
    public void adicionarCorrector(){
        
    }
    
    public void eliminarCorrector(){
        
    }
    
    public void adicionarEmpreiteiro(){
        
    }
    
    public void eliminarEmpreiteiro(){
        
    }
    
    @Override
    public void pesquisarImovel(){
        
    }
    
    public void eliminarCliente(){
        
    }
    
    public void cadastrarAdministrador(Administrador administrador){
        
        
    }
}