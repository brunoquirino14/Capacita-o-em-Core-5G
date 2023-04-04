import java.util.Scanner;
import java.text.DecimalFormat;
public class Exercicio3 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        int sw = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número do dia da semana: ");
        sw = sc.nextInt();
        while(sw<1 || sw>7){
            System.out.println("Numero inválido, digite novamente: ");
            sw = sc.nextInt();
        }
        switch (sw){
            case 1:
                System.out.println("O dia da semana é Segunda-feira");
                break;
            case 2:
                System.out.println("O dia da semana é Terça-feira");
                break;
            case 3:
                System.out.println("O dia da semana é Quarta-feira");
                break;
            case 4:
                System.out.println("O dia da semana é Quinta-feira");
                break;
            case 5:
                System.out.println("O dia da semana é Sexta-feira");
                break;
            case 6:
                System.out.println("O dia da semana é Sábado");
                break;
            case 7:
                System.out.println("O dia da semana é Domingo");
                break;
        }
    }
}

