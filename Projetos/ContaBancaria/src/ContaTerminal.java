import java.util.Scanner;
public class ContaTerminal{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem vindo ao Cadastro Bancario");
        System.out.println("Digite o seu nome: ");
        String nomeCliente= leitor.next();

        System.out.println("Por favor, digite o numero da conta: ");
        int numeroConta = leitor.nextInt();

        System.out.println("Agora digite a Agencia: ");
        String agencia = leitor.next();

        System.out.println("Agora digite seu saldo: ");
        double saldo = leitor.nextDouble();

        System.out.printf("Olá ".concat(nomeCliente)+",obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia)+", conta "+numeroConta+" e seu saldo %.3f%n já está disponível para saque", saldo);
    }
}