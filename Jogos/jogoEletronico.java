
public class jogoEletronico extends jogo {

	private String plataforma;
	private String genero;
	
	
	
	// Get e set plataforma
	void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
		
	String getPlataforma() {
		return this.plataforma;
	}
		
	// Get e set genero
	void setGenero (String genero) {
		this.genero = genero;
	}
		
	String getGenero() {
		return this.genero;
	}
	
	
	// Métodos
	
	void inicializar(String nome, double preco, String distribuidora, String plataforma, String genero) {
		super.setNome(nome);
		super.setPreco(preco);
		super.setDistribuidora(distribuidora);
		this.plataforma = plataforma;
		this.genero = genero;
		
	}
		
	@Override
	String imprimir() {
		super.imprimir();
		System.out.println("Plataforma: " + this.plataforma);
		return "Gênero: " + this.genero;
	}
	
	String jogarOnline(int quantJogadores) {
		return "Jogando online com " + quantJogadores + " jogadores.";
	}
}
