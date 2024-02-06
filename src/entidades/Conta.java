package entidades;

//@author Otília Marques

public class Conta {
    private Usuario usuario;
    private String passWord;
    private int numeroDaConta;

    public Conta(Usuario usuario, String passWord, int numeroDaConta) {
        this.usuario = usuario;
        this.passWord = passWord;
        this.numeroDaConta = numeroDaConta;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }   
}