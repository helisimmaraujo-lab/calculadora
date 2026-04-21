import java.util.Scanner;

public class Bolo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] passos = {
                "pré-aquecer o forno",
                "misturar os ingredientes",
                "despejar a massa na forma",
                "colocar o bolo no forno",
                "retirar o bolo do forno"

        };
        int etapaAtual = 0;

        System.out.println("\nTHE CAKE GAME !!\n\n")

        System.out.println(" monte o bolo na ordem certa:\n\n");

        while (etapaAtual < passos.length) {

            System.out.println(" escolha o proximo passo\n");

            for (int i = 0; i < passos.length; i++) {
                System.out.println("passo " + i + " - " + passos[i]);

            }
            int escolha = scanner.nextInt();

            if (escolha == etapaAtual) {
                System.out.println(" correto");
                etapaAtual++;

            } else {
                System.out.println("errou");
                break;
            }

        }
        if (etapaAtual == passos.length) {
            System.out.println(" vc montou o bolo");

        }else{
            System.out.println(" vc perdeu nao conseguiu fazer o bolo");
        }
    }
}