package aluguel;

import java.time.LocalDate;

public class Principal_v2 {
    
    public static void main(String[] args) {
        
        Casa c1 = new Casa("Rua A", 123, 1000.35);

        mostrarInformacao(c1);

        Apartamento a1 = new Apartamento();
        a1.setEndereco("Rua B");
        a1.setNumero(456);
        a1.setValorAluguel(875.35);
        a1.setBloco("Bloco 1");

        mostrarInformacao(a1);

        Imovel l1 = new Loja();
        l1.setEndereco("Rua C");
        l1.setNumero(789);
        l1.setValorAluguel(753.65);

        Loja loja = (Loja)l1;
        loja.setTipoLoja(TipoLoja.SALA);

        mostrarInformacao(l1);

        Aluguel aluguel = new Aluguel();
        aluguel.setImovel(c1);

        LocalDate dtAtual = LocalDate.now();

        aluguel.setDtAluguel(dtAtual);
        aluguel.setDtValidadeAluguel(dtAtual.plusYears(1));

        System.out.println(aluguel.toString());

    }

    public static void mostrarInformacao(Imovel a){
        System.out.println(a.imprimir());
    }

}
