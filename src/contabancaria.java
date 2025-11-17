public class contabancaria {
    private String titular;
    private int numeroConta;
    private double saldo;

    contabancaria(String titular, int numeroConta, double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    //Get e Set

    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    // metodo de depositar
    public void depositar(double valor){
        // Se valor for maior que zero, o saldo vai ser depositado
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Saldo depositado");
        }else{
            System.out.println("Falha");
        }
    }
    //Metodo de sacar o dinheiro
    public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            this.saldo -= valor;
        }
    }
    public void exibirInformacoes() {
        System.out.println("Titular da conta: " + titular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo atual: R$ " + saldo);
    }
}

