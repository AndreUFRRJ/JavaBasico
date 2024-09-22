package entities;

import java.util.Objects;

public class Clients {
	private String nome;
	private String email;
	private String cpf;
	private short idade;
	public Clients(String nome, String email, String cpf, short idade) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public short getIdade() {
		return idade;
	}
	public void setIdade(short idade) {
		this.idade = idade;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cpf, email, idade, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clients other = (Clients) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(email, other.email) && idade == other.idade
				&& Objects.equals(nome, other.nome);
	}
	
}
