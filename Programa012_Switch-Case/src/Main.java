import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Escolha um Numero de 1 a 5: ");
		int x = sc.nextInt();
		switch(x) {
		case 1: System.out.println("opcao 1");
			break;
		case 2: System.out.println("opcao 2");
			break;
		case 3: System.out.println("opcao 3");
			break;
		case 4: System.out.println("opcao 4");
			break;
		case 5: System.out.println("opcao 5");
			break;
		default: System.out.println("opção invalida");			
		}
	}

}
