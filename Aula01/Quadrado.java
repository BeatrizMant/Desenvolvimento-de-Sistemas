
public class Quadrado {
	double altura;
	double base; 
	double area;
	
	
	String CalcularArea (double altura, double base) {
		area = altura * base;
		return "Área do Quadrado: " + area + "²";
	}
}
