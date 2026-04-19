import java.util.Scanner;

public class celciusParaFarenhit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double grauCelsius;
        String repetir = "";
        do {

            System.out.println("digite o grau celsius:");
            grauCelsius = scanner.nextDouble();
            fahrenheit = grauCelsius * 9 / 5 +32;
            System.out.println("fahrenheit "+fahrenheit);
            System.out.println(" deseja repetir?");
            repetir = scanner.next();
        }while (repetir.equals("sim"));

    }
}
