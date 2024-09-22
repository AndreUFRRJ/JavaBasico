
public class Main {

	public static void main(String[] args) {
		int x=5, y=2;
		//sem casting - interpreta que é um numero inteiro dividido por outro inteiro
		//isso gera um resultado inteiro
		double resultado=x/y;
		System.out.println(resultado);
		//com casting - converte a conta para o tipo desejado
		resultado=(double)x/y;
		System.out.println(resultado);
	}

}
