public class Cliente {
	private String nome;
	private int idade;
	private String endereco;
	private double valorPedido;
	private double valorPromocional;

	
	//set e get
	
	//nome
	void setNome (String nome) {
		this.nome = nome;
	}
	
	String getNome () {
		return this.nome;
	}
	
	//idade
	void setIdade (int idade) {
		this.idade = idade;
	}
	
	int getIdade() {
		return this.idade;
	}

	//endereco
	void setEndereco (String endereco) {
		this.endereco = endereco;
	}
	
	String getEndereco () {
		return this.endereco;
	}
	
	//valorPedido
	void setValorPedido (double valorPedido) {
		this.valorPedido = valorPedido;
	}
	
	double getValorPedido () {
		return this.valorPedido;
	}
	
	//valorPromocional
	void setValorPromocional (double valorPromocional) {
		this.valorPromocional = valorPromocional;
	}
	
	double getValorPromocional () {
		return this.valorPromocional;
	}
	
	//métodos
	
	String calcularDesconto(double getValorPedido) {
		valorPromocional = getValorPedido - (0.10 * getValorPedido);
		return "O valor com desconto é R$" + valorPromocional;
	}

}
