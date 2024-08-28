
public class Carro extends Veiculo{
	
	void calcularIpva(double valorTabela) {
		 super.setIpva(valorTabela * 0.04);
	}
	
	@Override
	void imprimirFicha() {
		super.imprimirFicha();
		System.out.println( "IPVA: " + super.getIpva());
	}

}