
public class Veiculo {
	private String modelo;
	private double valorTabela;
	private String cor;
	private String combustivel;
	private double ipva;

	//get e set
	
	void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	String getModelo(){
		return this.modelo;
	}
	
	void setValorTabela(double valorTabela) {
		this.valorTabela = valorTabela;
	}
	
	double getValorTabela(){
		return this.valorTabela;
	}
	
	void setCor(String cor) {
		this.cor = cor;
	}
	
	String getCor(){
		return this.cor;
	}
	
	void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	String getCombustivel(){
		return this.combustivel;
	}
	
	double getIpva(){
		return this.ipva;
	}
	
	void setIpva(double ipva) {
		this.ipva = ipva;
	}
	
	
	//metodos

	void construtor(String modelo, double valorTabela, String cor, String combustivel) {
		this.modelo = modelo;
		this.valorTabela = valorTabela;
		this.cor = cor;
		this.combustivel = combustivel;
	}
	
	void imprimirFicha() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Valor tabela: " + this.valorTabela);
		System.out.println("Cor: " + this.cor);
		System.out.println("Combustivel: " + this.combustivel);
	}
	
}