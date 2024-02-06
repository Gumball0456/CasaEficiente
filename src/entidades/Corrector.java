package entidades;

//@author Otília Marques

public class Corrector extends Usuario{
    private int numeroDoCorrector;

    public Corrector(int numeroDoCorrector, String identificacao, String nome, String Apelido, String numeroDeTelefone, int idade, String bI) {
        super(identificacao, nome, Apelido, numeroDeTelefone, idade, bI);
        this.numeroDoCorrector = numeroDoCorrector;
    }

    public int getNumeroDoCorrector() {
        return numeroDoCorrector;
    }

    public void setNumeroDoCorrector(int numeroDoCorrector) {
        this.numeroDoCorrector = numeroDoCorrector;
    }
    
    public void venderImovel(){
        
    }
    
    public void registarImovel(){
        
    }
    
    public void actualizarImovel(){
        
    }
    
    public void listarImovel(){
        
    }
    
    public void gerarContrato(){
        
    }
    
    public void verPagamento(){
        
    }
}