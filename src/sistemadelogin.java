import java.util.Scanner;

public class sistemadelogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String username = "craizy";
        final String password = "1234";

        String usernameDigitado;
        String passwordDigitada;

do {
    System.out.println(" nome de usuário: ");
     usernameDigitado = scanner.next();


    System.out.println(" senha: ");
     passwordDigitada = scanner.next();

    if (usernameDigitado.equals(username) && passwordDigitada.equals(password)){
        System.out.println(" acesso permitido");

    }else{
        System.out.println(" acesso negado\n usuário ou senha incorretos");
    }

}while (!usernameDigitado.equals(username) || !passwordDigitada.equals(password));



}
    }


