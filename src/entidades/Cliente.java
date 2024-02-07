package entidades;

import java.util.ArrayList;

//@author Otília Marques

public class Cliente extends Usuario{
    private String endereco;
    private ArrayList<Imovel> imoveisLocatados = new ArrayList();
    private ArrayList<Imovel> imoveisComprados = new ArrayList();

    public Cliente(String endereco, String identificacao, String nome, String Apelido, String numeroDeTelefone, int idade, String bI) {
        super(identificacao, nome, Apelido, numeroDeTelefone, idade, bI);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Imovel> getImoveisLocatados() {
        return imoveisLocatados;
    }

    public void setImoveisLocatados(ArrayList<Imovel> imoveisLocatados) {
        this.imoveisLocatados = imoveisLocatados;
    }

    public ArrayList<Imovel> getImoveisComprados() {
        return imoveisComprados;
    }

    public void setImoveisComprados(ArrayList<Imovel> imoveisComprados) {
        this.imoveisComprados = imoveisComprados;
    }
    
    public void locatarImoveis(Imovel imovel){
        
    }
    
    public boolean terminarLocacao(Imovel imovel){
        
        return false;
    }
    
    public void comprarImovel(Imovel imovel){
        
    }
    
    public void registarCliente(Cliente cliente){
        
        
    }
}