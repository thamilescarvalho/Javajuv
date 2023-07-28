package aluguel_v1.Aluguel;

public class Casa {

    private int numero;

    private String endereco;

    private double area;

    private String bairro;

    private double valorAluguel;

    public Casa(String enderecoCasa, int numeroCasa, double vlorAluguel){
        endereco = enderecoCasa;
        numero = numeroCasa;
        valorAluguel = vlorAluguel;
    }
    
}
