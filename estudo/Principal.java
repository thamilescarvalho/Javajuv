package estudo;

import estudo.*;
import java.math.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

      aluna a = new aluna();

      a.idade = 27;

      Scanner sc = new Scanner(System.in);

      System.out.println("Digite a nota 1: ");
      double n1 = sc.nextDouble();

      System.out.println("Digite a nota 2: ");
      double n2 = sc.nextDouble();

      System.out.println("Digite o nome: ");
      String nome = sc.next();

      double media = a.calcularMedia(n1, n2);
      a.imprimirMedia();

      sc.close();
            
   }
    
}
    