package entidades;

//@author Otília Marques

public class Vivenda extends ImovelResidencial{
    private boolean temQuintal;

    public Vivenda(boolean temQuintal, int numerosDeQuartos, int numerosDeWC, int numerosDeCozinhas, int numerosDeSalas, String endereco, double comprimento, int compartimentos, double preco, double largura, boolean estadoDaManutencao, String estadoDoImovel) {
        super(numerosDeQuartos, numerosDeWC, numerosDeCozinhas, numerosDeSalas, endereco, comprimento, compartimentos, preco, largura, estadoDaManutencao, estadoDoImovel);
        this.temQuintal = temQuintal;
    }

    public boolean isTemQuintal() {
        return temQuintal;
    }

    public void setTemQuintal(boolean temQuintal) {
        this.temQuintal = temQuintal;
    }
}