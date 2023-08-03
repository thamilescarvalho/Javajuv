package aluguel;

public class Loja extends Imovel{

    private TipoLoja tipoLoja;

    public TipoLoja getTipoLoja() {
        return tipoLoja;
    }

    public void setTipoLoja(TipoLoja tipoLoja) {
        this.tipoLoja = tipoLoja;
    }

    public String imprimir(){
        return getEndereco()+" - "+getNumero()+" - "+getTipoLoja().getDescricao()+" : "+getValorAluguel();
    }

}
