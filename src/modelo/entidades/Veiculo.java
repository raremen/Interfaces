package modelo.entidades;

public class Veiculo {
	private String sModelo;
	
	public Veiculo(String sModelo) {
		this.sModelo = sModelo;
	}

	public String getsModelo() {
		return sModelo;
	}

	public void setsModelo(String sModelo) {
		this.sModelo = sModelo;
	}
}
