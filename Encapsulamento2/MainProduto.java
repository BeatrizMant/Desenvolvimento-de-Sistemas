import java.util.Scanner;
public class MainProduto {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Produto produto1 = new Produto();
		
		System.out.println("Qual o seu nome?");
		produto1.setNome(in.next());
		
		System.out.println("Qual o preço de custo do produto?");
		produto1.setPrecoCusto(in.nextDouble());
		
		System.out.println("Qual o preço de venda?");
		produto1.setPrecoVenda(in.nextDouble());
		
		System.out.println(produto1.calcularMargemLucro(produto1.getPrecoVenda(), produto1.getPrecoCusto()));
		
		System.out.println(produto1.getMargemLucroPorcentagem(produto1.getMargemLucro(), produto1.getPrecoCusto()));
	}

}
