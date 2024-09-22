package application;

import entities.Referencia;

public class ReferenciaFilhoOutroPacote extends Referencia{
	
	@Override
	public void variavel(){
		System.out.println(a);
		System.out.println(b);
		System.out.println("C NÃO PODE SER ACESSADO");
		System.out.println("D NÃO PODE SER ACESSADO");
	}
}
