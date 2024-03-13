
public class Funcionario {
	String nome;
	double salarioBruto;
	double imposto;
	double salarioLiquido;
	double aumentaSalario;
	
	String salarioLiquido (double salarioBruto, double imposto, String nome) {
		salarioLiquido = salarioBruto - imposto;
		return "O salário líquido do " + nome + " é de R$" + salarioLiquido;
		
	}
	
	String aumentaSalario (double salarioLiquido, double aumento) {
		aumentaSalario = salarioLiquido + aumento;
		return  "O novo salário do " + nome + " será de R$" + aumentaSalario;
		
	}
}
