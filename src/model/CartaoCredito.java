package model;

public class CartaoCredito {
	private int id;
	private String numero;
	private String validade;
	private String nome;
	private String cpf;
	private int parcelamento;
	
	public CartaoCredito() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getParcelamento() {
		return parcelamento;
	}
	public void setParcelamento(int parcelamento) {
		this.parcelamento = parcelamento;
	}
	
	

}
