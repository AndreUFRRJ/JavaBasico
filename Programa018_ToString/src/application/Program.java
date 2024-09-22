package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Product x =new Product();
		System.out.print("Entre com o nome do Produto: ");
		x.nome=sc.nextLine();
		System.out.print("Entre com a quantidade: ");
		x.quantidade=sc.nextInt();
		System.out.print("Entre com o valor: ");
		x.valor=sc.nextDouble();
		
		System.out.println(x);
		
		
		
		sc.close();
	}

}
