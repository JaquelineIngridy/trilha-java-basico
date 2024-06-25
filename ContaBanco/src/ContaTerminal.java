import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String cliente;
        float saldo;
        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);

        System.out.println("Cadastrando novo cliente.\n");
        System.out.println("Digite o nome do cliente: ");
        cliente = entrada.nextLine();
        
        System.out.println("Digite numero: ");
        numero = entrada1.nextInt();

        System.out.println("Digite a agencia: ");
        agencia = entrada2.nextLine();

        System.out.println("Digite o saldo: ");
        saldo = entrada3.nextFloat();

        System.out.println("Olá "+ cliente + " obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + " conta: " + numero + " e seu saldo: " + saldo + " já está disponível para saque!" );
    }
}
