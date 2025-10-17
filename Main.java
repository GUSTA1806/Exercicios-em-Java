import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome:");
        String nome = input.nextLine();

        System.out.print("Digite a primeira nota:");
        double nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota:");
        double nota2 = input.nextDouble();

        System.out.print("Digite a terceira nota:");
        double nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;

        System.out.println("----------------------------");

       System.out.println("Nome do aluno: " +nome);
        media = Math.ceil(media * 10) / 10.0;
       System.out.printf("Media do aluno: %.1f\n", media);

       if(media >= 6){
           System.out.println("Resultado: Aprovado");
       }else{
           System.out.println("Resultado: Reprovado");
       }

    }
}
