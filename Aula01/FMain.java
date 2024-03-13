import java.util.Scanner;

public class FMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Funcionario primeiroFunc = new Funcionario();
		Funcionario segundoFunc = new Funcionario();
		
		
		//salário de Pedro
		primeiroFunc.nome = "Pedro";
		
		System.out.println("Qual o salário bruto de " + primeiroFunc.nome + "?");
		primeiroFunc.salarioBruto = in.nextDouble();
		
		System.out.println("Quanto é o imposto de " + primeiroFunc.nome + "?");
		primeiroFunc.imposto = in.nextDouble();
		
		System.out.println(primeiroFunc.salarioLiquido(primeiroFunc.salarioBruto, primeiroFunc.imposto, primeiroFunc.nome));
		
		
		//salário de Vagner
		segundoFunc.nome = "Vagner";
		
		System.out.println("Qual o salário bruto de " + segundoFunc.nome + "?");
		segundoFunc.salarioBruto = in.nextDouble();
		
		System.out.println("Quanto é o imposto de" + segundoFunc.nome + "?");
		segundoFunc.imposto = in.nextDouble();
		
		System.out.println(primeiroFunc.salarioLiquido(segundoFunc.salarioBruto, segundoFunc.imposto, segundoFunc.nome));

	}

}
