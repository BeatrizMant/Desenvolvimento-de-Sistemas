
public class jogo {
	private String nome;
	private double preco;
	private String distribuidora;
	
	
	// Get e set Nome
	void setNome (String nome) {
		this.nome = nome;
	}
	
	String getNome() {
		return this.nome;
	}
	
	// Get e set Preço
	void setPreco (double preco) {
		this.preco = preco;
	}
	
	double getPreco() {
		return this.preco;
	}
	
	// Get e set distribuidora
	void setDistribuidora (String distribuidora) {
		this.distribuidora = distribuidora;
	}
	
	String getDistribuidora() {
		return this.distribuidora;
	}
	
	// Métodos
	void inicializar(String nome, double preco, String distribuidora) {
		this.nome = nome;
		this.preco = preco;
		this.distribuidora = distribuidora;
		
	}
	
	
	String imprimir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Preço: " + this.preco);
		return "Distribuidora: " + this.distribuidora;
	}

}
