
public class Quadrado extends Forma {

	private double lado;
	
	//set e get
	
	void setLado(double lado) {
		this.lado = lado;
	}
	
	double getLado() {
		return this.lado;
	}
	
	//método

	double area (double getLado) {
		double resultadoQ = getLado * getLado;
		return resultadoQ;
	}
}
