
public class Circulo extends Forma {

	private double raio;
	
	// get e set
	void setRaio(double raio) {
		this.raio = raio;
	}
	
	double getRaio() {
		return this.raio;
	}
	
	// método
	double area (double getRaio) {
		double resultadoC = (this.raio*this.raio) * 3.14;
		return resultadoC;
	}
	

	
}
