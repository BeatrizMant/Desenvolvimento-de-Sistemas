import java.util.Scanner;
public class MainImc {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Imc imc1 = new Imc();
		
		System.out.println("Qual o seu nome?");
		imc1.nome = in.next();
		
		System.out.println("Qual a sua idade?");
		imc1.idade = in.nextInt();
		
		System.out.println("Qual o seu peso?");
		imc1.setPeso(in.nextDouble());
		
		System.out.println("Qual a sua altura?");
		imc1.setAltura(in.nextDouble());
		
		System.out.println(imc1.calcularImc (imc1.getPeso(), imc1.getAltura()));
	}

}
