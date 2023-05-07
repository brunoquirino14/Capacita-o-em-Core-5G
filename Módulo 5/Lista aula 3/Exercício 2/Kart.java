package Principal;

import java.util.Scanner;

public class Kart {
    Motor motor1 = new Motor();
    Piloto piloto1 = new Piloto();
    String nome = "Flash";
    Scanner sc = new Scanner(System.in);
    void fazerDrift(){
        System.out.println("Cavalinho de pau! (drift) vc derrapa seus pneus como ninguem!");
    }
    void soltarTurbo(){
        System.out.println("Turbo! Seu chapeu de palha voa com a brisa, mas vc pega outro!");
    }

    void pular(){
        System.out.println("Obstáculo na pista! vc pula com seu kart saltitante!");
    }

}
