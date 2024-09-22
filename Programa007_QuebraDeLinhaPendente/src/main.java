import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		String s1,s2,s3;
		int x;
		Scanner sc =new Scanner(System.in);

		System.out.println("Entre com os dados:");
		
		/*
		 * se teve a leitura de um número antes de um nextline
		 * é importante por um .nextLine() para consumir a quebra de linha
		*/ 
		x=sc.nextInt();
		sc.nextLine();
		
		s1=sc.nextLine();
		s2=sc.nextLine();
		s3=sc.nextLine();
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
