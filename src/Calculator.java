import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor1 = 0;
        double valor2 = 0;
        char sinal = ' ';
        int sim = 1;
        while (sim == 1) {

            System.out.println("Sinais: +, -, /, x");
            System.out.println("qual a operação desejada? ");
            sinal = scanner.next().charAt(0);
            if (sinal != '+' && sinal != '-' && sinal != '/' && sinal != 'x') {
                System.out.println("sinal inválido");
                continue;
            }

            System.out.println("informe o primeiro valor: ");
            valor1 = scanner.nextDouble();
            System.out.println("informe o segundo valor: ");
            valor2 = scanner.nextDouble();

            switch (sinal) {
                case '+':
                    System.out.println(" resultado " + (valor1 + valor2));
                    break;
                case '-':
                    System.out.println( "resultado " +(valor1 - valor2));
                    break;
                case '/':
                    if (valor2 != 0) {
                        System.out.println("resultado " + (valor1 / valor2));
                    } else {
                        System.out.println(" não pode dividir por zero");
                    }
                    break;
                case 'x':
                    System.out.println( "resultado " +(valor1 * valor2));
                    break;
                default:
                    System.out.println("opção inválida ");
            }
System.out.println();
            System.out.println("deseja fazer mais uma operação? \n-> 1 para 'sim' e 2 para 'não'");
            sim = scanner.nextInt();
        }
    }
}