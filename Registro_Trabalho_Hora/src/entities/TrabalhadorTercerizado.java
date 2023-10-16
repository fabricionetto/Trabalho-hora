package entities;

public class TrabalhadorTercerizado extends Trabalhador {
  
	private Double saldoAdicional;

	public TrabalhadorTercerizado() {
		super();
	}

	public TrabalhadorTercerizado(String nome, Integer horas, Double valorHora, Double saldoAdicional) {
		super(nome, horas, valorHora);
		this.saldoAdicional = saldoAdicional;
	}

	public Double getSaldoAdicional() {
		return saldoAdicional;
	}

	public void setSaldoAdicional(Double saldoAdicional) {
		this.saldoAdicional = saldoAdicional;
	}
	
	public double pagamento() {
		return ((this.valorHora * this.horas)+11)/100;
	}
	@Override
	public String toString() {
		return "Trabalhador Tercerizado [nome=" + super.getNome() + ", horas=" + horas + ", valorHora=" + valorHora + " Total = " + pagamento()+ " ]";
	}
}
