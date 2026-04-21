import java.util.Random;
import java.util.Scanner;

public class pedraPapelTesoura {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        String[] escolhas = {"pedra","papel","tesoura"};
        Random random = new Random();
        String escolhaDoJogador;
        String escolhaDoPc;
        String continuarJogando = "sim";
        do {
            System.out.println("pedra papel ou tesoura ? escolhe aí mn");
            escolhaDoJogador = scanner.nextLine();

            if (!escolhaDoJogador.equals("pedra") && !escolhaDoJogador.equals("papel") && !escolhaDoJogador.equals("tesoura")){
                System.out.println("só pode escolher pedra papel ou tesouraaaa");
                continue;
            }

            escolhaDoPc = escolhas[random.nextInt(3)];
            System.out.println("PC escolheu "+(escolhaDoPc));

            if (escolhaDoPc.equals(escolhaDoJogador)){
                System.out.println("deu empate");

            } else if (escolhaDoJogador.equals("pedra") && escolhaDoPc.equals("tesoura")) {
                System.out.println("ganhou nice");

            } else if (escolhaDoJogador.equals("papel") && escolhaDoPc.equals("pedra")) {
                System.out.println("ganhou nice");

            } else if (escolhaDoJogador.equals("tesoura") && escolhaDoPc.equals("papel")) {
                System.out.println("ganhou nice");
            }else {
                System.out.println("perdeu pro pc kskskk");
            }
            System.out.println("quer continuar ? sim ou não");
            continuarJogando = scanner.nextLine();
        }while (continuarJogando.equals("sim"));

    }
}
