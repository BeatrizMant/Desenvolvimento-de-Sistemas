
public class Moto extends Veiculo{

	private int cilindrada;
	
	//set e get
	
	void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	int getCilindrada() {
		return cilindrada;
	}
	
	//metodo para escrever
	
	String apresentar(String getMarca, String getModelo, String getCor, int getAno, int getCilindrada) {
		System.out.println("Marca: " + getMarca);
		System.out.println("Modelo: " + getModelo);
		System.out.println("Cor: " + getCor);
		System.out.println("Ano: " + getAno);
		return "Cilindrada: " + getCilindrada;
	}

}
