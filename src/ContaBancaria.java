class ContaBancaria {

   private String titular;
    private double saldo;

    public ContaBancaria(String nome, double saldo){
        this.titular = nome;
        this.saldo = saldo;
    }

    void depositar (double valor){
        saldo += valor;
    }

    void sacar (double valor){
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("saque realizado");
        }else{
            System.out.println("saldo insuficiente");
        }
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }
}