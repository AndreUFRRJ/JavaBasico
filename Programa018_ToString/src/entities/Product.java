package entities;

public class Product {
	public String nome;
	public int quantidade;
	public double valor;
	
	public String toString() {
		return "Nome: "+nome+"\nQuantidade: "+quantidade+"\nValor: "+valor+"\nValor total em estoque: "+quantidade*valor;
	}
}
