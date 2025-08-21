package model;

public class Venda {

	private int numero;
	private int quantidade;
	private double valorUnidade;
	
	//Construtor
	
	public Venda(int numero, int quantidade, double valorUnidade) {
		this.numero = numero;
		this.quantidade = quantidade;
		this.valorUnidade = valorUnidade;
	}

	//Getters
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorUnidade() {
		return valorUnidade;
	}

	public void setValorUnidade(double valorUnidade) {
		this.valorUnidade = valorUnidade;
	}
	
	public double valorPagar() {
		return quantidade * valorUnidade;
	}
	
	
	
	
}
