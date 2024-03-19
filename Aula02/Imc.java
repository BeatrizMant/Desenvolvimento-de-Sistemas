
public class Imc {
	String nome;
	int idade;
	double peso;
	double altura;
	double valorImc;
	
	String calcularImc (double peso, double altura) {
		valorImc = peso/(altura*altura);
		
		if (valorImc < 18.5) {
			System.out.printf("Seu imc é de %.2f" , valorImc);
			return ". Você está abaixo do peso.";
			
		} else if(valorImc < 24.9) {
			System.out.printf("Seu imc é de %.2f" , valorImc);
			return ". Você está com o peso ideal.";
			
		} else if(valorImc < 29.9) {
			System.out.printf("Seu imc é de %.2f" , valorImc);
			return ". Você está com sobrepeso.";
			
		} else if(valorImc < 34.9) {
			System.out.printf("Seu imc é de %.2f" , valorImc);
			return ". Você está com obesidade grau 1.";
			
		} else if(valorImc < 39.9) {
			System.out.printf("Seu imc é de %.2f" , valorImc);
			return ". Você está com obesidade grau 2.";
			
		} else {
			System.out.printf("Seu imc é de %.2f" , valorImc);
			return ". Você está com obesidade grau 3.";
			
		}
	}
}
