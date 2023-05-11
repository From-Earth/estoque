package model;

public class Produto {
	private int id;
	private String nome;
	private double preco;
	private String tamanho;
	private int quantidade;

	public Produto() {

	}
	
	public Produto(int id,String nome, double preco, String tamanho) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.tamanho = tamanho;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade() {
		this.quantidade++;
	}
	
	
	
	

}
