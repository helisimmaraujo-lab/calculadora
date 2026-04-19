import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
      int[] numeros = new int[5];
        int maior = numeros[0];
      Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numero " + (i + 1));
            numeros[i] = scanner.nextInt();

        }

        for (int i = 0; i < numeros.length ; i++) {
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }
        System.out.println("maior valor = " + maior);
    }
}