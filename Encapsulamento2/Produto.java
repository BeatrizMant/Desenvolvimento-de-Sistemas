
public class Produto {
	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	double porcentagem;
	
	//Nome
	String getNome() {
		return this.nome;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	// Preço custo
	double getPrecoCusto() {
		return this.precoCusto;
	}
	
	void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	// Preço venda
	double getPrecoVenda() {
		return this.precoVenda;
	}
	
	void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
		if (precoVenda < precoCusto) {
			System.out.println("Aumente o valor para obter lucro.");
		}
	}
	
	// Margem lucro
	
	double getMargemLucro() {
		return this.margemLucro;
	}
	
	void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}
	
	String calcularMargemLucro (double getPrecoVenda, double getPrecoCusto) {
		margemLucro = getPrecoVenda - getPrecoCusto;
		return ("A margem de lucro é de R$"+ margemLucro);
	}
	
	String getMargemLucroPorcentagem(double getMargemLucro, double getPrecoCusto) {
		porcentagem = (getMargemLucro/getPrecoCusto) * 100;
		return("A porcentagem de lucro é de " + porcentagem + "%");
		
	}
		
}
