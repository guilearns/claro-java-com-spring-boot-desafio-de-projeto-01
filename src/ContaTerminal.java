import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Agradecemos a sua escolha para criar uma conta conosco!\n");
		
		String nomeCliente = receberEntradaTexto("Por favor, digite o seu nome e sobrenome: ", scanner);
		
		String numeroConta = receberEntradaTexto("Por favor, digite o número da Agência: ", scanner);
		
		int numeroAgencia = receberEntradaInteiro("Por favor, digite o número da Conta: ", scanner);
		
		float saldoConta = receberEntradaDecimal("Por favor, faça depósito inicial: R$ ", scanner);

		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo de R$%.2f já está disponível para saque.", nomeCliente, numeroAgencia, numeroConta, saldoConta);
	}
	
	private static String receberEntradaTexto(String mensagemPergunta, Scanner scanner) {
		System.out.print(mensagemPergunta);
		String saidaTexto = scanner.next();
		System.out.println();
		return saidaTexto;
	}
	
	private static int receberEntradaInteiro(String mensagemPergunta, Scanner scanner) {
		System.out.print(mensagemPergunta);
		int saidaInteiro = scanner.nextInt();
		System.out.println();
		return saidaInteiro;
	}
	
	private static float receberEntradaDecimal(String mensagemPergunta, Scanner scanner) {
		System.out.print(mensagemPergunta);
		float saidaInteiro = scanner.nextFloat();
		System.out.println();
		return saidaInteiro;
	}
	
}