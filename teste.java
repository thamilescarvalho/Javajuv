package teste;

import estudo.*;
import java.math.*;
import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        
        aluno a = new aluno();
        //a.nome = "Marcelo"; //Atributo criado com modificador default

        a.idade = 44; //Atributo criado com modificador public

        //a.endereco = "Rua A"; //Atributo criado com modificador private

        //a.media = 4; //Atributo criado com modificador protected

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a nota 2: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite o nome: ");
        String nome = sc.next();

        double media = a.calcularMedia(n1, n2);
        a.imprimirMedia();

        System.out.printf("O aluno \"%s\" esta com a media %.2f\n",nome, media);

        System.out.println("Hello World!!");

        sc.close();

    }

}