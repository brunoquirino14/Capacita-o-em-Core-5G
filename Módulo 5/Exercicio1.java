import java.util.Scanner;


public class Exercicio1 {

    public static void main(String[] args) {
        int Numero;
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de alunos: ");
        Numero = scanner.nextInt();

        while(repeat){
            if (Numero == 10 | Numero == 20) {
                System.out.println("-> Use a sala 16");
                repeat = false;
            } else if (Numero == 30) {
                System.out.println("-> Use a sala 22");
                repeat = false;
            } else {
                System.out.println("-> Nenhuma sala pode ser usada para essa quantidade de alunos.");
                System.out.println("Digite o número de alunos: ");
                Numero = scanner.nextInt();
            }
        }
    }
}