package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		int quantidade;
		double valor;
		String nome;
		
		System.out.println("criando construtor com quantidade");
		System.out.print("Nome:");
		nome=sc.nextLine();
		System.out.print("Valor:");
		valor=sc.nextDouble();
		System.out.print("Quantidade:");
		quantidade=sc.nextInt();
		Product product1 =new Product(nome, quantidade, valor);
		System.out.println(product1);
		sc.nextLine();
		
		
		System.out.println("\n\ncriando construtor SEM quantidade");
		System.out.print("Nome:");
		nome=sc.nextLine();
		System.out.print("Valor:");
		valor=sc.nextDouble();
		Product product2 =new Product(nome, valor);
		System.out.println(product2);
		
		
		
		sc.close();
	}

}
