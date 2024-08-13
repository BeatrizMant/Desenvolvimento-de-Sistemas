
public class Triangulo extends Forma{
	private double altura;
	private double base;
	
	//set e get
	
	void setAltura(double altura) {
		this.altura = altura;
	}
	
	double getAltura() {
		return this.altura;
	}
	
	void setBase(double base) {
		this.base = base;
	}
	
	double getBase() {
		return this.base;
	}
	
	//método

	double area (double getAltura, double getBase) {
		double resultadoT = (getAltura*getBase)/2;
		return resultadoT;
	}
}
