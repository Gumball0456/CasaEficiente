package entidades;

//@author Otília Marques

public class Data {
    private int dia;
    private int mes;
    private int ano;

    //Construtor da Data
    public Data(int dia, int mes, int ano) {
        if ( validarData(dia, mes, ano) ) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida.");
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    //Método para validar data
    public boolean validarData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            return false; // Mês ou dia inválido
        }

        int[] diasNosMeses = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};   
        
        return dia <= diasNosMeses[mes];
    }

    @Override
    public String toString() {
        return "{" + "dia:" + dia + ", mes:" + mes + ", ano:" + ano + '}';
    }
}