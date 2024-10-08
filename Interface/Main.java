import java.util.Scanner;
public class Main extends Generica {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Corrente Corrente1 = new Corrente(); 
		Poupanca Poupanca1 = new Poupanca(); 
		String respAcao, respConta;
		
		// M�todos
		System.out.println("Qual tipo de conta você deseja criar? ('Corrente' ou 'Poupança')");
		respConta = in.next(); 
					

		if (respConta.equalsIgnoreCase("Corrente")) {
			
			// Nome
			System.out.println("Qual o seu nome?");
			Corrente1.setNome(in.next());
			
			// Cpf 
			System.out.println("Qual o seu cpf?");
			Corrente1.setCpf(in.next());
			
			// N�mero da conta
			//System.out.println("Qual o n�mero da conta?");
			//Corrente1.setNumeroConta(in.next());
			
			
			System.out.println("Qual ação você deseja realizar em sua conta? (Depósito, Saque, Consultar saldo)");
			respAcao = in.next();
			
			
			
			// A��es ------------------------------------------------
			if (respAcao.equalsIgnoreCase("Sacar") || respAcao.equalsIgnoreCase("Saque")) {
				System.out.println("Qual a quantia que deseja sacar?");
				Corrente1.setQuantia(in.nextDouble());
				System.out.println(Corrente1.sacar(Corrente1.getQuantia()));
				System.out.println(Corrente1.imprimirSaldo());
							
							
			} else if (respAcao.equalsIgnoreCase("Depositar") || respAcao.equalsIgnoreCase("Depósito") || respAcao.equalsIgnoreCase("Deposito")) {
				System.out.println("Qual a quantia que deseja depositar?");
				Corrente1.setQuantia(in.nextDouble());
						
				Corrente1.depositar(Corrente1.getQuantia());
				System.out.println(Corrente1.imprimirSaldo()); 
							
							
			} else if (respAcao.equalsIgnoreCase("Consultar saldo") || respAcao.equalsIgnoreCase("Saldo") ||
				respAcao.equalsIgnoreCase("Consultar")) {
				System.out.println(Poupanca1.imprimirSaldo());
									
			} else {
				System.out.println("Resposta inválida!");
			}
			
			
		} else if (respConta.equalsIgnoreCase("Poupança")) {
			
			Poupanca1.atualizarSaldo(Poupanca1.getTaxaRendimento());
			
			// Nome
			System.out.println("Qual o seu nome?");
			Poupanca1.setNome(in.next());
						
			// Cpf 
			System.out.println("Qual o seu cpf?");
			Poupanca1.setCpf(in.next());
						
			// N�mero da conta
			//System.out.println("Qual o n�mero da conta?");
			//Poupanca1.setNumeroConta(in.next());
						
			
			System.out.println("Qual ação você deseja realizar em sua conta? (Depósito, Saque, Consultar saldo)");
			respAcao = in.next();
			
			
			
			// A��es ------------------------------------------------
			if (respAcao.equalsIgnoreCase("Sacar") || respAcao.equalsIgnoreCase("Saque")) {
				System.out.println("Qual a quantia que deseja sacar?");
				Poupanca1.setQuantia(in.nextDouble());
				System.out.println(Poupanca1.sacar(Poupanca1.getQuantia()));
				System.out.println(Poupanca1.imprimirSaldo());
				
				
				
			} else if (respAcao.equalsIgnoreCase("Depositar") || respAcao.equalsIgnoreCase("Depósito") || respAcao.equalsIgnoreCase("Deposito")) {
				System.out.println("Qual a quantia que deseja depositar?");
				Poupanca1.setQuantia(in.nextDouble());
			
				Poupanca1.depositar(Poupanca1.getQuantia());
				System.out.println(Poupanca1.imprimirSaldo()); 
				
				
				
			} else if (respAcao.equalsIgnoreCase("Consultar saldo") || respAcao.equalsIgnoreCase("Saldo") ||
				respAcao.equalsIgnoreCase("Consultar")) {
				System.out.println(Poupanca1.imprimirSaldo());
						
			} else {
				System.out.println("Resposta inválida!");
			}

			
		} else {
			System.out.println("Resposta inválida!");
		}
		
		
		
		
		
		

	}

}
