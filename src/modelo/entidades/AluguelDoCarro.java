package modelo.entidades;

import java.util.Date;

public class AluguelDoCarro {
	
	private Date dInicio;
	private Date dFim;
	
	private Veiculo veiculo;
	private Fatura fatura;
	
	public AluguelDoCarro() {
	}

	public AluguelDoCarro(Date dInicio, Date dFim, Veiculo veiculo) {
		this.dInicio = dInicio;
		this.dFim = dFim;
		this.veiculo = veiculo;
	}

	public Date getdInicio() {
		return dInicio;
	}

	public void setdInicio(Date dInicio) {
		this.dInicio = dInicio;
	}

	public Date getdFim() {
		return dFim;
	}

	public void setdFim(Date dFim) {
		this.dFim = dFim;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
}
