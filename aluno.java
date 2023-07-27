package estudo;

public class aluno {

    String nome;

    public int idade;

    private String endereco;

    protected double nota1;

    protected double media;

    public double calcularMedia(double n1, double n2){

        double m = (n1 + n2) / 2;

        media = m;

        return m;
    }

    public void imprimirMedia(){
        System.out.println("Média aluno: "+media);
        System.out.println("Aprovado!!");
    }

}