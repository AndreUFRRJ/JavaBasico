package entities;

public class Product {
	private String nome;
	private int quantidade;
	private double valor;
	public Product(String nome, int quantidade, double valor) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	public Product(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade=0;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void addQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removeQuantidade(int quantidade) {
		if(this.quantidade<quantidade) System.out.println("Impossivel retirar " +quantidade+" tem apenas "+this.quantidade);
		else this.quantidade -= quantidade;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Product [nome=" + nome + ", quantidade=" + quantidade + ", valor=" + valor + "]";
	}
	
	
}
