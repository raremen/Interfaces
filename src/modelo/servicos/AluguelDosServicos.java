package modelo.servicos;

import modelo.entidades.AluguelDoCarro;

public class AluguelDosServicos {
	
	private Double dValorPorDia;
	private Double dValorPorHora;
	
	private TaxaDeServicoNoBrasil taxadeserviconobrasil;

	public AluguelDosServicos(Double dValorPorDia, Double dValorPorHora, TaxaDeServicoNoBrasil taxadeserviconobrasil) {
		this.dValorPorDia 		   = dValorPorDia;
		this.dValorPorHora 	 	   = dValorPorHora;
		this.taxadeserviconobrasil = taxadeserviconobrasil;
	}
	
	public void processoFatura(AluguelDoCarro alugueldocarro) {
		long lInstante1 = alugueldocarro.getdInicio().getTime();
		long lInstante2 = alugueldocarro.getdFim().getTime();
		double dHoras   = (double)(lInstante1 - lInstante1) / 1000 / 60 / 60;
		
		double dPagamentoBasico;
		if (dHoras <= 12.0) {
			dPagamentoBasico = Math.ceil(dHoras) * dValorPorHora;
		} else {
			dPagamentoBasico = Math.ceil(dHoras / 24) * dValorPorDia;
		}
		
		double dTaxa = taxadeserviconobrasil.dTaxa(dPagamentoBasico);
	}
}
