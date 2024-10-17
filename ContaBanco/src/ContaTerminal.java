import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // Exibir as mensagens para o usuário
        // Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite o número da Conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite seu saldo inicial: ");
        Double saldo = scanner.nextDouble();


        // Exibir a mensagem conta criada com sucesso
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
