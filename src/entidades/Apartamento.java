package entidades;

//@author Otília Marques

public class Apartamento extends ImovelResidencial{
    private int numeroDeVarandas;

    public Apartamento(int numeroDeVarandas, int numerosDeQuartos, int numerosDeWC, int numerosDeCozinhas, int numerosDeSalas, String endereco, double comprimento, int compartimentos, double preco, double largura, boolean estadoDaManutencao, String estadoDoImovel) {
        super(numerosDeQuartos, numerosDeWC, numerosDeCozinhas, numerosDeSalas, endereco, comprimento, compartimentos, preco, largura, estadoDaManutencao, estadoDoImovel);
        this.numeroDeVarandas = numeroDeVarandas;
    }

    public int getNumeroDeVarandas() {
        return numeroDeVarandas;
    }

    public void setNumeroDeVarandas(int numeroDeVarandas) {
        this.numeroDeVarandas = numeroDeVarandas;
    }   
    
    public void registarApartamento(Apartamento apartamento){
        
        
        
    }
}