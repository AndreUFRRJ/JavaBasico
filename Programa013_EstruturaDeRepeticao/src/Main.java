import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite um valor: ");
		int x=sc.nextInt();
		int i;
		// Estrutura For
		
		for(i=0;i<x;i++) {
			System.out.println(i);
		}
		
		System.out.println("\n");
		//estrutura while
		i=0;
		while(i!=x) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("\n");
		//estrutura do-while
		i=0;
		do {
			System.out.println(i);
			i++;
		}while(i!=x);
		
		sc.close();
	}

}
