
public class Carro extends Veiculo{

	private int nPortas;
	
	//set e get
	
	void setNportas(int nPortas) {
		this.nPortas = nPortas;
	}
	
	int getNportas() {
		return nPortas;
	}

	//metodo para escrever
	
	String apresentar(String getMarca, String getModelo, String getCor, int getAno, int getNportas) {
		System.out.println("Marca: " + getMarca);
		System.out.println("Modelo: " + getModelo);
		System.out.println("Cor: " + getCor);
		System.out.println("Ano: " + getAno);
		return "Quantidade de portas: " + getNportas;
	}
}
