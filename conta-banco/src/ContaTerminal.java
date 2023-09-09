import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("\nPor favor, informe o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Por favor, informe o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nomeCliente + ", obrigado pro criar uma conta em nosso banco, sua agência é "
            + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.\n");

    }
}
