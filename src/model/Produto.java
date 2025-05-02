package model;

public class Produto {
	
	private String nome;
	private int codigo, quantidade;
	private double preco;
	
	public Produto() {
	}
	
	public Produto(String nome, int codigo, int quantidade, double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void alterarPrecoProduto(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome()+ " " + 
				" Código: " + getCodigo() + " " + 
				" Quantidade: " + getQuantidade() + " " + 
				" Preço: " + getPreco();
	}
}
