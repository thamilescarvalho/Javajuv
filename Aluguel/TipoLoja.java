package Aluguel;

public enum TipoLoja {
    
    SALA(1, "Sala Comercial"),
    LOJA(2, "Loja"),
    GALPAO(3, "Galpão/Armazém");

    private int codigo;

    private String descricao;

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    TipoLoja(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

}
