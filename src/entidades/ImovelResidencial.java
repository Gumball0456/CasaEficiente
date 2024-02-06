package entidades;

//@author Otília Marques

public class ImovelResidencial extends Imovel{
    private int numerosDeQuartos;
    private int numerosDeWC;
    private int numerosDeCozinhas;
    private int numerosDeSalas;

    public ImovelResidencial(int numerosDeQuartos, int numerosDeWC, int numerosDeCozinhas, int numerosDeSalas, String endereco, double comprimento, int compartimentos, double preco, double largura, boolean estadoDaManutencao, String estadoDoImovel) {
        super(endereco, comprimento, compartimentos, preco, largura, estadoDaManutencao, estadoDoImovel);
        this.numerosDeQuartos = numerosDeQuartos;
        this.numerosDeWC = numerosDeWC;
        this.numerosDeCozinhas = numerosDeCozinhas;
        this.numerosDeSalas = numerosDeSalas;
    }

    public int getNumerosDeSalas() {
        return numerosDeSalas;
    }

    public void setNumerosDeSalas(int numerosDeSalas) {
        this.numerosDeSalas = numerosDeSalas;
    }

    public int getNumerosDeQuartos() {
        return numerosDeQuartos;
    }

    public void setNumerosDeQuartos(int numerosDeQuartos) {
        this.numerosDeQuartos = numerosDeQuartos;
    }

    public int getNumerosDeWC() {
        return numerosDeWC;
    }

    public void setNumerosDeWC(int numerosDeWC) {
        this.numerosDeWC = numerosDeWC;
    }

    public int getNumerosDeCozinhas() {
        return numerosDeCozinhas;
    }

    public void setNumerosDeCozinhas(int numerosDeCozinhas) {
        this.numerosDeCozinhas = numerosDeCozinhas;
    }
}