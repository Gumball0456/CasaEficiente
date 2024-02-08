package entidades;

import java.util.ArrayList;

//@author Otília Marques

public class Cliente extends Usuario{
    
    private String provincia;
    private String municipio;
    private String bairro;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private ArrayList<Imovel> imoveisLocatados = new ArrayList();
    private ArrayList<Imovel> imoveisComprados = new ArrayList();


    
    public Cliente(String provincia,String municipio,String bairro,int dia,int mes,int ano,String identificacao, String nome, String Apelido, String numeroDeTelefone,int idade, String bI){
      super(identificacao, nome, Apelido, numeroDeTelefone, idade, bI);
        
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
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