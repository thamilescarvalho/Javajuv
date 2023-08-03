package Aluguel;

public class Casa extends Imovel{

    public Casa(String enderecoCasa, int numeroCasa, double vlrAluguel){
        setEndereco(enderecoCasa);
        setNumero(numeroCasa);
        setValorAluguel(vlrAluguel);
    }

}