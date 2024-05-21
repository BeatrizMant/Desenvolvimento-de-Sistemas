import java.util.Scanner;

public class MainClientes {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite 1 para cliente comum e 2 para cliente Premium.");
		int resposta = in.nextInt();
		
		if (resposta == 1) {
		
		//cliente comum
		Cliente cliente1 = new Cliente();
		
		System.out.println("Qual o nome?");
		cliente1.setNome(in.next());
		
		System.out.println("Qual a idade?");
		cliente1.setIdade(in.nextInt());
		
		System.out.println("Qual o endereço?");
		cliente1.setEndereco(in.next());
		
		System.out.println("Qual o valor total do pedido?");
		cliente1.setValorPedido(in.nextDouble());
		
		System.out.println(cliente1.calcularDesconto( cliente1.getValorPedido()));
		
		}else if(resposta == 2) {
		
		//cliente premium
		clientePremium cliente2 = new clientePremium();
		
		System.out.println("Qual o nome?");
		cliente2.setNome(in.next());
		
		System.out.println("Qual a idade?");
		cliente2.setIdade(in.nextInt());
		
		System.out.println("Qual o endereço?");
		cliente2.setEndereco(in.next());
		
		System.out.println("Qual o valor total do pedido?");
		cliente2.setValorPedido(in.nextDouble());
		
		System.out.println(cliente2.calcularDesconto( cliente2.getValorPedido()));
		
		} else {
			System.out.println("Valor inválido");
		}
	}
	
}
