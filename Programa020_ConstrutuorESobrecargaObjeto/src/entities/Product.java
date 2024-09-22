package entities;

public class Product {
	public String nome;
	public int quantidade;
	public double valor;
	
	public Product(String nome, int quantidade, double valor) {
		this.nome=nome;
		this.quantidade=quantidade;
		this.valor=valor;
	}
	
	public Product(String nome, double valor) {
		this.nome=nome;
		this.valor=valor;
	}
	
	@Override
	public String toString() {
		return "\n------------------------"
				+ "\nNome: "+this.nome
				+"\nValor: "+this.valor
				+"\nQuantidade: "+this.quantidade
				+"\nValor Total em Estoque: "+this.quantidade*this.valor+
				"\n----------------------";
	}
}
