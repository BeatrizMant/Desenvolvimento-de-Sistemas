
public class Moto extends Veiculo{
	
	void calcularIpva(double valorTabela) {
		super.setIpva(valorTabela * 0.02);
	}

	
	void imprimirFicha() {
		super.imprimirFicha();
		System.out.println( "IPVA: " + super.getIpva());
	}
}
