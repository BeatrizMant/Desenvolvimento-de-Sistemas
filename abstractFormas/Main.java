import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, i;

		System.out.println("Quantas formas você deseja cadastrar?");
		n = in.nextInt();
		
		double areas[] = new double [n];
		int tipos[] = new int [n];
		
		
		
		for(i = 0; i<n; i++) {
			
			System.out.println("Qual será a " + (i+1) + "° forma a ser cadastrada? (1-Círculo, 2-Retângulo, 3-Quadrado, 4-Triângulo)");
			int resp = in.nextInt();
			
			if(resp == 1) {
				
				Circulo c1 = new Circulo();
			
				System.out.println("Qual o raio do círculo?");
				c1.setRaio(in.nextDouble());
				
				
				areas[i] = c1.area(c1.getRaio());
				tipos[i] = 1;
			
				
			} else if(resp == 2) {
				
				Retangulo r1 = new Retangulo();
				
				System.out.println("Qual a altura do retângulo?");
				r1.setAltura(in.nextDouble());
				
				System.out.println("Qual a largura do retângulo?");
				r1.setLargura(in.nextDouble());
			
				areas[i] = r1.area(r1.getAltura(), r1.getLargura());
				tipos[i] = 2;
				
				
			 } else if(resp == 3) {
				
				Quadrado q1 = new Quadrado();
				
				System.out.println("Qual a medida dos lados do quadrado?");
				q1.setLado(in.nextDouble());
			
				areas[i] = q1.area(q1.getLado());
				tipos[i] = 3;
				
				
			} else if(resp == 4) {
				
				Triangulo t1 = new Triangulo();
				
				System.out.println("Qual a altura do triângulo?");
				t1.setAltura(in.nextDouble());
				
				System.out.println("Qual a base do triângulo?");
				t1.setBase(in.nextDouble());
			
				areas[i] = t1.area(t1.getAltura(), t1.getBase());
				tipos[i] = 4;
				
			} else {
				System.out.println("Opção inválida!");
			}
			
			
		}
		
	
		for (i = 0; i < n; i++) {
			System.out.print((i+1) + "º Forma:          Tipo: ");
			if (tipos[i] == 1) {
				System.out.print("Círculo");
				System.out.println();
				System.out.println("Área do círculo: " + areas[i] + " m²");
				System.out.println();
				
			} else if (tipos[i] == 2) {
				System.out.print("Retângulo");
				System.out.println();
				System.out.println("Área do retângulo: " + areas[i] + " m²");
				System.out.println();
				
			} else if (tipos[i] == 3) {
				System.out.print("Quadrado");
				System.out.println();
				System.out.println("Área do quadrado: " + areas[i] + " m²");
				System.out.println();
				
			} else {
				System.out.print("Triângulo");
				System.out.println();
				System.out.println("Área do triângulo: " + areas[i] + " m²");
				System.out.println();
				
			}
			
			
			
			
		}
		
		

	}

}

