import java.text.DecimalFormat;
public class Exercicio1 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        int Lan1 = 10;
        int Lan2 = 4;
        int Lan3 = 2;
        int Total = Lan1 + Lan2 + Lan3;
        double Media = (double) Total /3; //Casting
        System.out.println("Média dos lanches vendidos: " + df.format(Media));
        System.out.println("Total de lanches vendidos na semana: " + Total);
    }
}