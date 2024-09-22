package entities;

public class ReferenciaFilho extends Referencia{
	
	@Override
	public void variavel() {
		System.out.println("variaveis que podem ser acessadas por Filho da classe:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("D NÃO PODE SER ACESSADA");
	}
}
