import java.util.Scanner;

public class QMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Quadrado primeiroQuadrado = new Quadrado();
		
		System.out.println("Entre com a altura do quadrado:");
		primeiroQuadrado.altura = in.nextDouble();
		
		System.out.println("Entre com a base do quadrado:");
		primeiroQuadrado.base = in.nextDouble();
		System.out.println(primeiroQuadrado.CalcularArea(primeiroQuadrado.altura, primeiroQuadrado.base));

	}

}
