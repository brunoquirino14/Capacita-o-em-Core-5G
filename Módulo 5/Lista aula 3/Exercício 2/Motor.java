package Principal;

public class Motor {
    int cilindradas = 100;
    int velocidadeMaxima = 250;

    void mostraInfo(){
        System.out.println("Seu motor de kart possui "+cilindradas+ " cilindradas!");
        System.out.println("A velocidade máxima que seu kart atinge eh de "+velocidadeMaxima+ " km/h!");
    }
}
