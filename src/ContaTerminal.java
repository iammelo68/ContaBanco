import java.util.Scanner;

public class ContaTerminal {
    int numeroDaConta;
    String numeroDaAgencia;
    String nomeDoUsuario;
    double saldo;

    public ContaTerminal(int numeroDaConta, String numeroDaAgencia, String nomeDoUsuario, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.numeroDaAgencia = numeroDaAgencia;
        this.nomeDoUsuario = nomeDoUsuario;
        this.saldo = saldo;
    }
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Seja bem vindo ao BIDET");
        System.out.println("Para criar sua conta, insira seus dados.");
        System.out.println("Por favor, insira o número da sua conta: ");
        int numero = read.nextInt();
        System.out.println("Insira o número da sua agencia: ");
        String agencia = read.next();
        read.nextLine();
        System.out.println("Insira seu nome: ");
        String usuario = read.nextLine();
        System.out.println("Insira o saldo: ");
        double valor = read.nextDouble();

        ContaTerminal user = new ContaTerminal(numero, agencia, usuario, valor);

        System.out.println("Olá " + usuario + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + valor + " ja está disponivel para saque");
    }
}
