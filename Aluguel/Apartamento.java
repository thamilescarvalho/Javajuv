package Aluguel;

public class Apartamento extends Imovel{

    private String bloco;

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String imprimir(){
        return getEndereco()+" - "+getNumero()+" - "+getBloco()+" : "+getValorAluguel();
    }

}
