package veiculos;

import veiculos.Informacao;

import veiculos.Veiculo;

public class Principal {

    public static void main(String[] args) {

        Informacao info = new Informacao();


        Veiculo v = new Veiculo();
        v.setAno(ano:2023);
        v.setPlaca(placa:"BBB-1234");

        System.out.println(info.exibirInformacao(v));

        Caminhao c = new Caminhao();


        

    }
    
}
