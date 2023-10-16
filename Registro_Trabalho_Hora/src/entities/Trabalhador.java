package entities;

public class Trabalhador {

	private String nome;
	protected Integer horas;
	protected Double valorHora;
	
	public Trabalhador() {

	}

	public Trabalhador(String nome, Integer horas, Double valorHora) {
		super();
		this.nome = nome;
		this.horas = horas;
		this.valorHora = valorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
		
	public double pagamento() {
		return this.valorHora * this.horas;
	}

	@Override
	public String toString() {
		return "Trabalhador [nome=" + nome + ", horas=" + horas + ", valorHora=" + valorHora + " Total = " + pagamento()+ " ]";
	}
	
	
}
