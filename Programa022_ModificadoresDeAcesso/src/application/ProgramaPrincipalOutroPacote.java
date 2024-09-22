package application;

import entities.ClasseMesmoPacote;
import entities.Referencia;
import entities.ReferenciaFilho;

public class ProgramaPrincipalOutroPacote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" variavel a =PUBLIC"
				+ "\n variavel b = PROTECTED"
				+ "\n variavel c = vazio"
				+ "\n variavel d = PRIVATE");
		
		
		System.out.println("\n\n ------------------------------"
				+ "\n Pacote DIFERENTE - Tem que instanciar a classe:");
		Referencia referencia=new Referencia();
		System.out.println(referencia.a);
		System.out.println("B NÃO PODE SER ACESSADO");
		System.out.println("C NÃO PODE SER ACESSADO");
		System.out.println("D NÃO PODE SER ACESSADO");

		
		System.out.println("\n\n ------------------------------"
				+ "\n Classe Filha OUTRO Pacote - Não precisa instanciar a classe:");
		ReferenciaFilhoOutroPacote referenciaFilhoOutroPacote =new ReferenciaFilhoOutroPacote();
		referenciaFilhoOutroPacote.variavel();

		
		System.out.println("\n\n ------------------------------"
				+ "\n Classe Filha MESMO Pacote - Não precisa instanciar a classe:");
		ReferenciaFilho referenciaFilho =new ReferenciaFilho();
		referenciaFilho.variavel();
		
		
		System.out.println("\n\n ------------------------------"
				+ "\n Pacote IGUAL - Tem que instanciar a classe:");
		ClasseMesmoPacote cmp =new ClasseMesmoPacote();
		cmp.variavel();
		
		
		

		System.out.println("\n\n ------------------------------"
				+ "\n A propria classe:");
		Referencia referencia1 =new Referencia();
		referencia1.variavel();

	}

}
