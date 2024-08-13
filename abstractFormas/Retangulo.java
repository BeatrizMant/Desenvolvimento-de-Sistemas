
public class Retangulo extends Forma {

	private double altura;
	private double largura;
	
	//set e get
	
	void setAltura(double altura) {
		this.altura = altura;
	}
	
	double getAltura() {
		return this.altura;
	}
	
	void setLargura(double largura) {
		this.largura = largura;
	}
	
	double getLargura() {
		return this.largura;
	}
	
	//método

	double area (double getAltura, double getLargura) {
		double resultadoR = getAltura*getLargura;
		return resultadoR;
	}
}
