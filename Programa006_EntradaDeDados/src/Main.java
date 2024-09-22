import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x;

		//.nextLine le uma frase
		System.out.print("escreva uma frase:");
		x=sc.nextLine();
		System.out.println(x);
		
		// leitura de numero
		int i;
		double d;
		System.out.println("escreva um inteiro:");
		i=sc.nextInt();
		System.out.println(i);
		
		System.out.println("escreva um numero decimal com , :");
		d=sc.nextDouble();
		System.out.println(d);
		
		sc.close();

	}

}
