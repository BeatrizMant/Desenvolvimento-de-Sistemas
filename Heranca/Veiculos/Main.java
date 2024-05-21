import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int resp, resp2;
	
	do {
		System.out.println("Você deseja cadastrar um carro ou uma moto? (Coloque 1 para carro ou 2 para moto)");
		resp = in.nextInt();
	
		if(resp == 1) {
		
			//carro
		
			Carro carro1 = new Carro();
			
			System.out.println("Qual a marca?");
			carro1.setMarca(in.next());
		
			System.out.println("Qual o modelo?");
			carro1.setModelo(in.next());
			
			System.out.println("Qual a cor?");
			carro1.setCor(in.next());
			
			System.out.println("Qual o ano?");
			carro1.setAno(in.nextInt());
			
			System.out.println("Qual a quantidade de portas?");
			carro1.setNportas(in.nextInt());
			
			System.out.println(carro1.apresentar(carro1.getMarca(), carro1.getModelo(), carro1.getCor(), carro1.getAno(), carro1.getNportas()));
			
		} else if(resp == 2){
			
			//moto
		
			Moto moto1 = new Moto();
			
			System.out.println("Qual a marca?");
			moto1.setMarca(in.next());
		
			System.out.println("Qual o modelo?");
			moto1.setModelo(in.next());
			
			System.out.println("Qual a cor?");
			moto1.setCor(in.next());
			
			System.out.println("Qual o ano?");
			moto1.setAno(in.nextInt());
			
			System.out.println("Qual a medida da cilindrada?");
			moto1.setCilindrada(in.nextInt());
			
			System.out.println(moto1.apresentar(moto1.getMarca(), moto1.getModelo(), moto1.getCor(), moto1.getAno(), moto1.getCilindrada()));
			
		}
		
		System.out.println("Deseja cadastrar outro veículo? (Digite 1 para sim ou 2 para não)");
		resp2 = in.nextInt();
		

		

	} while (resp2 == 1);
	
	}
	

}
