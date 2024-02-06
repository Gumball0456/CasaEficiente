package entidades;

//@author Otília Marques

public class Usuario extends Pessoa{
    private String identificacao;

    public Usuario(String identificacao, String nome, String Apelido, String numeroDeTelefone, int idade, String bI) {
        super(nome, Apelido, numeroDeTelefone, idade, bI);
        this.identificacao = identificacao;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
    
    public void registar(){
        
    }
    
    public void editarPerfil(){
        
    }
    
    public void fazerLogin(){
        
    } 
    
    public void fazerLogout(){
        
    } 
    
    public void pesquisarImovel(){
        
    } 
}