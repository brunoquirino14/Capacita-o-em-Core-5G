import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
public class Exercicio4 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        Random gerador = new Random();
        Scanner sc = new Scanner(System.in);
        boolean bool = false;
        int ValorR = gerador.nextInt(10)+1;
        int ValorE;
        do{
            System.out.println("Qual é o número? (Entre 1 e 10)");
            ValorE = sc.nextInt();
            if(ValorE == ValorR){
                System.out.println("Você acertou!!!");
                bool = true;

            }
        }while (bool == false);


    }
}
