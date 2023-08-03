package Aluguel;

public class Imovel {
    
    private int numero;

    private String endereco;

    private double area;

    private String bairro;

    private double valorAluguel;

    public double getArea() {
        return area;
    }

    public String getBairro() {
        return bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getNumero() {
        return numero;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setValorAluguel(double valorDoAluguel) {
        valorAluguel = valorDoAluguel;
    }

    public String imprimir(){
        return getEndereco()+" - "+getNumero()+" : "+getValorAluguel();
    }

}
