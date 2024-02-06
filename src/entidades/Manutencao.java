package entidades;

//@author Otília Marques

public class Manutencao {
    private Empreiteiro empreiteiroResponsavel;
    private Imovel imovel;
    private Data data;

    public Manutencao(Empreiteiro empreiteiroResponsavel, Imovel imovel, Data data) {
        this.empreiteiroResponsavel = empreiteiroResponsavel;
        this.imovel = imovel;
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Empreiteiro getEmpreiteiroResponsavel() {
        return empreiteiroResponsavel;
    }

    public void setEmpreiteiroResponsavel(Empreiteiro empreiteiroResponsavel) {
        this.empreiteiroResponsavel = empreiteiroResponsavel;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }
}