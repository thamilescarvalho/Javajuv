package aula04;

import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);      

        System.out.print("Digite o raio: ");
        double raio = s.nextDouble();

        double areaCirculo = Math.PI * raio * raio;

        System.out.println("A área do círculo é: "+areaCirculo);

        System.out.println("Digite a altura para calcular a area do quadrado: ");
        double alturaQuadrado = s.nextDouble();
    
        s.close();
    }
}
