package Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Kart kartinho = new Kart();
        int escolha=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Faça sua escolha:");
            System.out.println("1 - Pule!");
            System.out.println("2 - Turbo!");
            System.out.println("3 - Drift!");
            System.out.println("4 - Use seu poder!");
            System.out.println("5 - Mostre as informações do kart!");
            System.out.println("6 - Sair do programa!");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    kartinho.pular();
                    break;
                case 2:
                    kartinho.soltarTurbo();
                    break;
                case 3:
                    kartinho.fazerDrift();
                    break;
                case 4:
                    kartinho.piloto1.soltaSuperPoder();
                    break;
                case 5:
                    kartinho.motor1.mostraInfo();
                    break;
            }
        }while(escolha!=6);
    }
}