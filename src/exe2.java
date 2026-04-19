import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        double[] notas = new double[4];
        for (int i = 0; i < notas.length ; i++) {
            System.out.println("nota " + (i +1));
            notas[i] = scanner.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma = (soma + notas[i]);
        }
        double media = soma / notas.length;
        System.out.println(media);
    }
}
