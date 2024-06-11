
public class jogoFisico extends jogo{
	private int quantJogadores;
	private int tempoPartida;
	
	// Get e set quantJogadores
	void setQuantJogadores (int quantJogadores) {
		this.quantJogadores = quantJogadores;
	}
		
	int getquantJogadores() {
		return this.quantJogadores;
	}
		
	// Get e set tempoPartida
	void setTempoPartida (int tempoPartida) {
		this.tempoPartida = tempoPartida;
	}
		
	int getTempoPartida() {
		return this.tempoPartida;
	}
	
	// Métodos
	
	void inicializar(String nome, double preco, String distribuidora, int quantJogadores, int tempoPartida) {
		super.setNome(nome);
		super.setPreco(preco);
		super.setDistribuidora(distribuidora);
		this.quantJogadores = quantJogadores;
		this.tempoPartida = tempoPartida;
		
	}
		
	@Override
	String imprimir() {
		super.imprimir();
		System.out.println("Quantidade de jogadores: " + this.quantJogadores);
		return "Tempo de partida: " + this.tempoPartida;
	}
	
	String calcularTempo(int quantPartidas) {
		int tempoTotal = tempoPartida * quantPartidas;
		
		if (tempoTotal > 60) {
			int horas = tempoTotal/60;
			int minutos = tempoTotal%60;
			return "Tempo total de jogo: " + horas + " horas e " + minutos + " minutos.";
		} else {
			return "Tempo total de jogo: " + tempoTotal + " minutos.";
		}
	}
	
}


