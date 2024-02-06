package entidades;

//@author Otília Marques

public class Pessoa {
    private String nome;
    private String Apelido;
    private String numeroDeTelefone;
    private int idade;
    private String bI;

    public Pessoa(String nome, String Apelido, String numeroDeTelefone, int idade, String bI) {
        this.nome = nome;
        this.Apelido = Apelido;
        this.numeroDeTelefone = numeroDeTelefone;
        this.idade = idade;
        this.bI = bI;
    }

    public String getbI() {
        return bI;
    }

    public void setbI(String bI) {
        this.bI = bI;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return Apelido;
    }

    public void setApelido(String Apelido) {
        this.Apelido = Apelido;
    }

    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public void setNumeroDeTelefone(String numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    } 
}