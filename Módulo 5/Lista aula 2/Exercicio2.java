import java.util.Scanner;
import java.text.DecimalFormat;
public class Exercicio2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        int Hor1 = 0;
        int Hor2 = 0;
        int Hor3 = 0;
        int Total = 0;
        double Media = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade vendida de lanches na primeira hora:");
        Hor1 = sc.nextInt();
        System.out.println("Digite a quantidade vendida de lanches na segunda hora:");
        Hor2 = sc.nextInt();
        System.out.println("Digite a quantidade vendida de lanches na terceira hora:");
        Hor3 = sc.nextInt();
        Total = Hor3 + Hor2 + Hor1;
        Media = (Hor3 + Hor2 + Hor1)/3;
        System.out.println("Média dos lanches vendidos: " + Media);
        System.out.println("Total de lanches vendidos na quarta-feira: " + Total);
    }
}
