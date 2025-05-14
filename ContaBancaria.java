public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular, String numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    // Principais métodos
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
        System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
        System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void exibirExtrato() {
         System.out.println("\n=== Extrato da Conta ===");
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo Atual: R$" + saldo);
        System.out.println("========================\n");
    }
}
