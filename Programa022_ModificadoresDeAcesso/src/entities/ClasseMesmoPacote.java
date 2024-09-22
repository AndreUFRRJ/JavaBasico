package entities;
public class ClasseMesmoPacote {
	
	Referencia x=new Referencia();
	public void variavel() {
		System.out.println("variaveis que podem ser acessadas por Filho da classe:");
		System.out.println(x.a);
		System.out.println(x.b);
		System.out.println(x.c);
		System.out.println("D NÃO PODE SER ACESSADA");
	}
}
