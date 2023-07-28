package estudo;

public class aluna {

   String nome;

   public int idade;

   private String endereco;

   protected double nota1;

   protected double nota2;

   protected double media;
   
   public double calcularMedia(double n1, double n2){

      double m = (n1 + n2) / 2;

      media = m;

      return m;

   }

   public void imprimirMedia(){
      System.out.println("Média aluno: "+media);

      }

}