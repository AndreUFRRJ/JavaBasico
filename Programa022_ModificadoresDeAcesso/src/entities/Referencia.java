package entities;

public class Referencia {
	public String a ="Variavel A";
	protected String b = "Variavel B";
	String c="Variavel C";
	private String d="Variavel D";
	
	public void variavel() {
		System.out.println("As variaveis que podem ser acessadas na classe Referencia:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
