import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 1000.00; // saldo inicial de R$ 1000,00

        System.out.print("Informe a operação desejada (saque ou depósito): ");
        String operacao = scanner.nextLine();

        System.out.print("Informe o valor da operação: ");
        double valor = scanner.nextDouble();

        if (operacao.equalsIgnoreCase("saque")) {
            // verificar se o valor do saque é válido e o saldo da conta é suficiente
            if (valor > 0 && valor <= saldo) {
                // realizar saque
                saldo -= valor;
                System.out.printf("Saque de R$ %.2f realizado com sucesso. Saldo atual: R$ %.2f.\n", valor, saldo);
            } else if (valor > saldo) {
                System.out.println("Saldo insuficiente para realizar saque.");
            } else {
                System.out.println("Valor inválido para saque.");
            }

        }
    }
}