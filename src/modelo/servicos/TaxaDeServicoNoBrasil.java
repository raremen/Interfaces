package modelo.servicos;

public class TaxaDeServicoNoBrasil implements TaxaDeServico{

	
	public double dTaxa(double dQuantia) { // sempre sera valores numericos
		if (dQuantia <= 100.0) {
			return dQuantia * 0.2;
		} else {
			return dQuantia * 0.15;
		}

	}
}
