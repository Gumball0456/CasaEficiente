package entidades;

//@author gumball

import java.util.ArrayList;

public class Proprietario extends Cliente{
    private ArrayList<Imovel> imoveis = new ArrayList();

    public Proprietario(String endereco, String identificacao, String nome, String Apelido, String numeroDeTelefone, int idade, String bI) {
        super(endereco, identificacao, nome, Apelido, numeroDeTelefone, idade, bI);
    }

    public ArrayList<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(ArrayList<Imovel> imoveis) {
        this.imoveis = imoveis;
    }
    
    public void verPagamento(){
        
    }
            
    public void submeterComissao(){
        
    }
            
    public void colocarAVenda(Imovel imovel){
        
    } 
    
    public void colocarEmAlocacao(Imovel imovel){
        
    }
}