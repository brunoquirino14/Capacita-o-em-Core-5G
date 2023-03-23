import java.util.Scanner;


public class Exercicio2 {

    public static void main(String[] args) {
        int NPA;
        int NP3;
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua NPA: ");
        NPA = scanner.nextInt();

        while(repeat){
            if (NPA >= 60 && NPA<100 && NPA > 0) {
                System.out.println("-> Você passou!");
                repeat = false;
            } else if (NPA < 60 && NPA >= 30) {
                System.out.println("-> Você está de NP3");
                System.out.println("Digite sua NP3: ");
                NP3 = scanner.nextInt();
                if(((NP3/2)+(NPA/2)>=50)){
                    System.out.println("-> Você passou!");
                }else{
                    System.out.println("-> Você não passou! :( ");
                }
                repeat = false;
            } else if(NPA>=0 && NPA<30){
                System.out.println("-> Você não passou! :( ");
                repeat = false;
            }else{
                System.out.println("-> Você não digitou uma nota válida! :( ");
                System.out.println("Digite sua NPA: ");
                NPA = scanner.nextInt();
            }
        }
    }
}