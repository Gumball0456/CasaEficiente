package entidades;

//@author Otília Marques

import java.util.ArrayList;

public class Imovel {
    private String endereco;
    private double comprimento;
    private int compartimentos;
    private double preco;
    private double largura;
    private boolean estadoDaManutencao;
    private String estadoDoImovel;
    private ArrayList<Manutencao> historicoDeManutencao = new ArrayList<>();

    public Imovel(String endereco, double comprimento, int compartimentos, double preco, double largura, boolean estadoDaManutencao, String estadoDoImovel) {
        this.endereco = endereco;
        this.comprimento = comprimento;
        this.compartimentos = compartimentos;
        this.preco = preco;
        this.largura = largura;
        this.estadoDaManutencao = estadoDaManutencao;
        this.estadoDoImovel = estadoDoImovel;
    }

    public String getEstadoDoImovel() {
        return estadoDoImovel;
    }

    public void setEstadoDoImovel(String estadoDoImovel) {
        this.estadoDoImovel = estadoDoImovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getCompartimentos() {
        return compartimentos;
    }

    public void setCompartimentos(int compartimentos) {
        this.compartimentos = compartimentos;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public boolean isEstadoDaManutencao() {
        return estadoDaManutencao;
    }

    public void setEstadoDaManutencao(boolean estadoDaManutencao) {
        this.estadoDaManutencao = estadoDaManutencao;
    }

    public ArrayList<Manutencao> getHistoricoDeManutencao() {
        return historicoDeManutencao;
    }

    public void setHistoricoDeManutencao(ArrayList<Manutencao> historicoDeManutencao) {
        this.historicoDeManutencao = historicoDeManutencao;
    }
}