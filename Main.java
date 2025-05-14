import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = null;

        int opcao;

        do {
            System.out.println("===== MENU BANCÁRIO =====");
            System.out.println("1. Criar Conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Exibir Extrato");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.println("Nome do Titular:");
                    String nome = scanner.nextLine();
                    System.out.println("Número da conta: ");
                    String numero = scanner.nextLine();
                    System.out.println("Saldo Inicial: ");
                    double saldoInicial = scanner.nextDouble();
                    conta = new ContaBancaria(nome, numero, saldoInicial);
                    System.out.println("Conta criada com sucesso!");
                    break;

                case 2:
                    if (conta != null) {
                        System.out.println("Valor para depósito: ");
                        double valor = scanner.nextDouble();
                        conta.depositar(valor);
                    } else {
                        System.out.println("Você precisa criar uma conta primeiro.");
                    }
                    break;
                
                case 3:
                    if (conta != null) {
                        System.out.println("Valor para saque: ");
                        double valor = scanner.nextDouble();
                        conta.sacar(valor);
                    } else {
                        System.out.println("Você precisa criar uma conta primeiro.");
                    }
                    break;

                case 4:
                    if (conta != null) {
                        conta.exibirExtrato();
                    } else {
                        System.out.println("Você precisa criar uma conta primeiro.");
                    }
                    break;

                case 0:
                    System.out.println("Encerradno o programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0); 
            
        scanner.close();
    }
}