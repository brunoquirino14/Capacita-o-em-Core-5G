package Principal;
import java.util.Scanner;

public class Zumbi {
    String nome;
    int saude=50;
    boolean alimentado;
    Scanner sc = new Scanner(System.in);

    void alimentar(int sauderecebida){
        saude = saude + sauderecebida;
        System.out.println("Agora o zumbi tem "+saude+" de vida!");
        if(saude >= 100){
            alimentado = true;
            System.out.println("O zumbi está bem alimentado!");
        }if(saude < 100){
            alimentado = false;
            System.out.println("O zumbi ainda está com fome!");
        }
    }

    int perderVida(int sauderecebida){
        saude = saude - sauderecebida;
        if(saude >= 100) {
            alimentado = true;
            System.out.println("Uma rasteira pra ficar esperto, mas o zumbi ainda está bem alimentado!");
        }if(saude < 100 && saude > 0){
            alimentado = false;
            System.out.println("Vc dá um tiro no zumbi e a barriga dele ronca!");
            System.out.println("Agora o zumbi tem "+saude+" de vida!");
        }
        if(saude <= 0){
            System.out.println("HEADSHOT, vc eliminou o zumbi!");

        }
        return (saude);
    }


}
