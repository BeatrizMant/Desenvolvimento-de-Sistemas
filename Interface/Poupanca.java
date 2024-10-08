
public class Poupanca extends Generica {
	
	private double taxaRendimento;
	

	void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
	double getTaxaRendimento() {
		return taxaRendimento;
	}
	
	// metodos

	double atualizarSaldo (double taxaRendimento) {
		double aux = ((getTaxaRendimento() * super.getSaldo())/100) + super.getSaldo();
		super.setSaldo(aux);
		return super.getSaldo();
	}

}