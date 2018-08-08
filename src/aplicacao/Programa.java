package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import modelo.entidades.AluguelDoCarro;
import modelo.entidades.Veiculo;
import modelo.servicos.AluguelDosServicos;
import modelo.servicos.TaxaDeServicoNoBrasil;

public class Programa {
	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat dFormatoDaData = new SimpleDateFormat("dd/MM/yyyy HH:ss");

		System.out.println("Entre com a inicio da cobrança: ");
		System.out.print("Modelo do Carro: ");
		String sModeloDoCarro = sc.nextLine();
		System.out.print("Retirada do carro (dd/MM/yyyy hh:ss): ");
		Date dInicio = dFormatoDaData.parse(sc.nextLine());
		System.out.print("Retorno do carro (dd/MM/yyyy hh:ss): ");
		Date dFim = dFormatoDaData.parse(sc.nextLine());
		
		AluguelDoCarro alugueldocarro = new AluguelDoCarro(dInicio, dFim, new Veiculo(sModeloDoCarro));
		
		System.out.print("Entre com o Preço por Hora: ");
		double dValorPorHora = sc.nextDouble();
		System.out.print("Entre com o Preço por Dia: ");
		double dValorPorDia = sc.nextDouble();
		
		AluguelDosServicos alugueldosservicos = new AluguelDosServicos(dValorPorDia, dValorPorHora, new TaxaDeServicoNoBrasil());
		
		alugueldosservicos.processoFatura(alugueldocarro);
		
		System.out.println("Fatura: ");
		System.out.printf("Pagamento Basico: " + String.format("%.2f", alugueldocarro.getFatura().getdPagamentoBasico()) +"\n");
		System.out.printf("Taxa: " + String.format("%.2f", alugueldocarro.getFatura().getdTaxa()) +"\n");
		System.out.printf("Pagamento Total: " + String.format("%.2f", alugueldocarro.getFatura().getPagamentoTotal()));
		sc.close();
	}
}
