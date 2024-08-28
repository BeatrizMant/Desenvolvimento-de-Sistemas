import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//carro 1
		System.out.println("Cadastre o 1º carro:");
		Carro c1 = new Carro();
		
		System.out.println("Qual o modelo do carro?");
		c1.setModelo(in.next());
		
		System.out.println("Qual o valor tabelado do carro?");
		c1.setValorTabela(in.nextDouble());
		
		System.out.println("Qual a cor do carro?");
		c1.setCor(in.next());
		
		System.out.println("Qual o combustivel do carro?");
		c1.setCombustivel(in.next());
		
		c1.calcularIpva(c1.getValorTabela());
		
		c1.imprimirFicha();
		System.out.println();
		
		
		//carro 2
		System.out.println("Cadastre o 2º carro:");
		Carro c2 = new Carro();
		
		System.out.println("Qual o modelo do carro?");
		c2.setModelo(in.next());
		
		System.out.println("Qual o valor tabelado do carro?");
		c2.setValorTabela(in.nextDouble());
		
		System.out.println("Qual a cor do carro?");
		c2.setCor(in.next());
		
		System.out.println("Qual o combustivel do carro?");
		c2.setCombustivel(in.next());
		
		c2.calcularIpva(c2.getValorTabela());
		
		c2.imprimirFicha();		
		System.out.println();
		
		
		//moto 1
		System.out.println("Cadastre a 1º moto:");
		Moto m1 = new Moto();
		
		System.out.println("Qual o modelo do moto?");
		m1.setModelo(in.next());
		
		System.out.println("Qual o valor tabelado do moto?");
		m1.setValorTabela(in.nextDouble());
		
		System.out.println("Qual a cor do moto?");
		m1.setCor(in.next());
		
		System.out.println("Qual o combustivel do moto?");
		m1.setCombustivel(in.next());
		
		m1.calcularIpva(m1.getValorTabela());
		
		m1.imprimirFicha();
		System.out.println();
		
		// Moto 2
		System.out.println("Cadastre a 2º moto:");
		Moto m2 = new Moto();
		
		System.out.println("Qual o modelo do moto?");
		m2.setModelo(in.next());
		
		System.out.println("Qual o valor tabelado do moto?");
		m2.setValorTabela(in.nextDouble());
		
		System.out.println("Qual a cor do moto?");
		m2.setCor(in.next());
		
		System.out.println("Qual o combustivel do moto?");
		m2.setCombustivel(in.next());
		
		m2.calcularIpva(m2.getValorTabela());
		
		m2.imprimirFicha();
		
		
	}


}
