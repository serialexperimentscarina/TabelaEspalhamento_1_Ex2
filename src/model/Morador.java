package model;

public class Morador {
	
	// Atributos
	// Cada morador tem o número do apartamento, o nome do morador, o modelo, a cor e a placa do carro. Todos os
	//carros tem um crachá com o número do apartamento.
	private int numApt;
	private String nome;
	private String modeloCarro;
	private String corCarro;
	private String placaCarro;
	
	// Construtor vazio
	public Morador() {
		super();
	}

	// Construtor com parâmetros
	public Morador(int numApt, String nome, String modeloCarro, String corCarro, String placaCarro) {
		this.numApt = numApt;
		this.nome = nome;
		this.modeloCarro = modeloCarro;
		this.corCarro = corCarro;
		this.placaCarro = placaCarro;
	}

	// Getters e setters
	public int getNumApt() {
		return numApt;
	}

	public void setNumApt(int numApt) {
		this.numApt = numApt;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModeloCarro() {
		return modeloCarro;
	}

	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}

	public String getCorCarro() {
		return corCarro;
	}

	public void setCorCarro(String corCarro) {
		this.corCarro = corCarro;
	}

	public String getPlacaCarro() {
		return placaCarro;
	}

	public void setPlacaCarro(String placaCarro) {
		this.placaCarro = placaCarro;
	}

	@Override
	public String toString() {
		return "[Nome: " + nome + ", apartamento: " + numApt + " | Carro: " + modeloCarro + ", cor: "
				+ corCarro + ", placa: " + placaCarro + "]";
	}
	
	@Override
	public int hashCode() {
		return ((numApt / 100) - 1);
	}

}
