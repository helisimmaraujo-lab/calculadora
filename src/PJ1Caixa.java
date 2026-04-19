import java.util.Scanner;

public class PJ1Caixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("valor da compra");
        double valorCompra = scanner.nextDouble();
        System.out.println("----------------------");
        System.out.println(valorCompra);
        System.out.println("----------------------");
        System.out.println("pagamento");
        double pagamento = scanner.nextDouble();
        System.out.println("----------------------");
        System.out.println(pagamento);
        System.out.println("----------------------");
        double troco = pagamento - valorCompra;
if (pagamento > valorCompra){
    System.out.println("troco " + "\n" +troco);
}else if (pagamento < valorCompra){
    System.out.println("valor inválido sua compra de: " + valorCompra + " e o pagamento foi: " + pagamento + " " + "\n" + " faltam: " + (valorCompra - pagamento));
}
        System.out.println("compra finalizada");
}
    }

