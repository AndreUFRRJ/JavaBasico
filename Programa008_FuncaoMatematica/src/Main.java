import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double a,b,c;
		System.out.println("Digite um valor:");
		a=sc.nextDouble();
		System.out.println("Digite um valor:");
		b=sc.nextDouble();
		System.out.printf("%.2f elevado a %.2f é: %f\n",a,b,Math.pow(a,b));
		System.out.printf("A raiz quadrada de %f é: %f\n", a, Math.sqrt(a));
		System.out.printf("O valor absoluto de %f é %f\n",b,Math.abs(b));
	}

}
