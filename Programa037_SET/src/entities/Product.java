package entities;

import java.util.Objects;

public class Product implements Comparable<Product>{
	private String nome;
	private Double preco;
	
	public Product(String nome, double preco) {
		this.nome=nome;
		this.preco=preco;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public void setPreco(double preco) {
		this.preco=preco;
	}
	public String getNome() {
		return this.nome;
	}
	public double getPreco() {
		return this.preco;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome, preco);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco);
	}
	@Override
	public int compareTo(Product o) {
		if(nome.compareTo(o.getNome())!=0) return nome.compareTo(o.getNome());
		else return preco.compareTo(o.getPreco());
	}
	@Override
	public String toString() {
		return "Product [nome=" + nome + ", preco=" + preco + "]";
	}
	
	
	
}
