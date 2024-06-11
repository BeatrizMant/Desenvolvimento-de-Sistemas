import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;
		
		System.out.println("Deseja cadastrar um jogo físico ou eletrônico? (Digite 1 para 'Físico' ou 2 para 'Eletrônico')");
		res = in.nextInt();
		
		if (res == 1) {
			
			jogoFisico jogoF1 = new jogoFisico(); 
			
			System.out.println("Qual o nome do jogo?");
			jogoF1.setNome(in.next());
			
			System.out.println("Qual o preço do jogo?");
			jogoF1.setPreco(in.nextDouble());
			
			System.out.println("Qual a distribuidora do jogo?");
			jogoF1.setDistribuidora(in.next());
			
			System.out.println("Qual a quantidade de jogadores?");
			jogoF1.setQuantJogadores(in.nextInt());
			
			System.out.println("Qual o tempo de partida em minutos?");
			jogoF1.setTempoPartida(in.nextInt());
			
			System.out.println(jogoF1.imprimir());
			
			System.out.println();
			
			System.out.println("Qual a quantidade de partidas?");
			int quantPartidas = in.nextInt();
			
			System.out.println(jogoF1.calcularTempo(quantPartidas));
			
			
		} else if (res == 2) {
			
			jogoEletronico jogoE1 = new jogoEletronico();
			
			System.out.println("Qual o nome do jogo?");
			jogoE1.setNome(in.next());
			
			System.out.println("Qual o preço do jogo?");
			jogoE1.setPreco(in.nextDouble());
			
			System.out.println("Qual a distribuidora do jogo?");
			jogoE1.setDistribuidora(in.next());
			
			System.out.println("Qual a plataforma?");
			jogoE1.setPlataforma(in.next());
			
			System.out.println("Qual o gênero do jogo?");
			jogoE1.setGenero(in.next());
			
			System.out.println(jogoE1.imprimir());
			
			System.out.println();
			
			System.out.println("Tem quantos jogadores no jogo?");
			int jogadores = in.nextInt();
					
			System.out.println(jogoE1.jogarOnline(jogadores));
			
			
			
			
			
			  
		} else {
			System.out.println("Opção inválida!");
		}

	}

}
