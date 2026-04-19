import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numero " + (i +1));
            numeros[i] = scanner.nextInt();
        }
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if ( numeros[i] % 2 == 0){
                contador++;
                System.out.println( "numero par : " +(numeros[i]));

            }

        }

        System.out.println(" numeros de pares " + contador + " ");
    }
}
