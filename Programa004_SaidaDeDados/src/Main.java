import java.awt.desktop.PrintFilesEvent;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double x = 3.14159;
		//println quebra linha \n também quebra linha
		
		System.out.println("\nOla ");
		System.out.println("Mundo");

		//print nao quebra linha
		System.out.print("Ola ");
		System.out.print("Mundo\n");
		
		//imprimir ponto flutuante
		System.out.printf("%.3f",x);
				
		//definir local, muito util para inserção de dados
		Locale.setDefault(Locale.US);
		System.out.println("\n"+x);
		
		//concatenar
		System.out.println("o valor de pi é: "+x+" tudo na mesma frase");
		
		//concatenar usando printf
		String nome="maria";
		int idade=62;
		double altura=1.50;
		System.out.printf("%s tem %.2f de altura e %d anos",nome,altura,idade);
		
	}

}
