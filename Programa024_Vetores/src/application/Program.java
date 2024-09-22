package application;

import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);

		int i;
		/*
		 * vetor com tipos primitivos
		*/
		System.out.println("Tamanho do vetor");
		int x =sc.nextInt();
		int[] vetorNumero =new int[x];
		System.out.println("Entre com os valores:");
		for(i=0;i<x;i++) {
			vetorNumero[i]=sc.nextInt();
		}
		for(i=0;i<x;i++) {
			System.out.print(" "+vetorNumero[i]);
		}
		
		
		/*
		 * vetor com objetos
		*/
		System.out.println("\n\nTamanho do vetor");
		x =sc.nextInt();
		Product[] vetor =new Product[x];
		System.out.println("Entre com os valores:");
		String nome;
		int quant;
		double valor;
		
		for(i=0;i<x;i++) {
			sc.nextLine();
			System.out.print("\nNome:");
			nome=sc.nextLine();
			System.out.print("Quantidade:");
			quant=sc.nextInt();
			System.out.print("Valor:");
			valor=sc.nextDouble();
			
			vetor[i]=new Product(nome,quant,valor);
		}	
		for(i=0;i<x;i++) {
			System.out.println(vetor[i]);
		}
		
		
	}
}
