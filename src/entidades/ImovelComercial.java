package entidades;

//@author Otília Marques

public class ImovelComercial extends Imovel{
    private int numeroDoImovel;
    private String descricaoDoImovel;

    public ImovelComercial(int numeroDoImovel, String descricaoDoImovel, String endereco, double comprimento, int compartimentos, double preco, double largura, boolean estadoDaManutencao, String estadoDoImovel) {
        super(endereco, comprimento, compartimentos, preco, largura, estadoDaManutencao, estadoDoImovel);
        this.numeroDoImovel = numeroDoImovel;
        this.descricaoDoImovel = descricaoDoImovel;
    }

    public String getDescricaoDoImovel() {
        return descricaoDoImovel;
    }

    public void setDescricaoDoImovel(String descricaoDoImovel) {
        this.descricaoDoImovel = descricaoDoImovel;
    }

    public int getNumeroDoImovel() {
        return numeroDoImovel;
    }

    public void setNumeroDoImovel(int numeroDoImovel) {
        this.numeroDoImovel = numeroDoImovel;
    }
}