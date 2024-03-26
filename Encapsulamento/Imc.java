
public class Imc {
	
	String nome;
	int idade;
	private double peso;
	private double altura;
	double valorImc;
	
	void setPeso(double peso) {
		this.peso = peso;
	}
	
	double getPeso() {
		return this.peso;
	}
	
	void setAltura(double altura) {
		this.altura = altura;
	}
	
	double getAltura() {
		return this.altura;
	}
	
	
	String calcularImc (double getPeso, double getAltura) {
		valorImc = getPeso/(getAltura*getAltura);
		
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
