import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        String sobrenomeCliente;
        double saldo;

        System.out.print("Por favor, digite o número da Conta: ");
        numeroConta = scanner.nextInt();

        System.out.print("Por favor, digite o número da Agencia: ");
        agencia = scanner.next();

        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = scanner.next();

        System.out.print("Por favor, digite o seu sobrenome: ");
        sobrenomeCliente = scanner.next();

        System.out.print("Por favor, digite o saldo: ");
        saldo = scanner.nextDouble();


        System.out.printf("\nOlá %s %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque\n",
                nomeCliente, sobrenomeCliente, agencia, numeroConta, saldo);


    }
}