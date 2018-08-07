package modelo.entidades;

public class Fatura {
	private Double dPagamentoBasico; // aceita valor nulo pode não ter valor em numero
	private Double dTaxa;
	
	public Fatura() {
	}

	public Double getdPagamentoBasico() {
		return dPagamentoBasico;
	}

	public void setdPagamentoBasico(Double dPagamentoBasico) {
		this.dPagamentoBasico = dPagamentoBasico;
	}

	public Double getdTaxa() {
		return dTaxa;
	}

	public void setdTaxa(Double dTaxa) {
		this.dTaxa = dTaxa;
	}
	
	public Double getPagamentoTotal() {
		return getdPagamentoBasico() + getdTaxa();
	}
}
