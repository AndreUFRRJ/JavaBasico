package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Nome do Produto: ");
		
		String nome=sc.nextLine();
		System.out.println("Quantidade: ");
		int quantidade=sc.nextInt();
		System.out.println("Valor: ");
		double valor=sc.nextDouble();
		sc.nextLine();
		Product produto =new Product(nome,quantidade,valor);
		
		boolean option=true;
		int opt;
		while(option) {
			menu();
			opt=sc.nextInt();
			switch(opt) {
			case 1:
				System.out.print("Adicionar quantos: ");
				quantidade=sc.nextInt();
				produto.addQuantidade(quantidade);
				break;
			case 2:
				System.out.print("Remover quantos: ");
				quantidade=sc.nextInt();
				produto.removeQuantidade(quantidade);
				break;
			case 3:
				sc.nextLine();
				System.out.print("Qual o novo nome: ");
				nome=sc.nextLine();
				produto.setNome(nome);
				break;
			case 4:
				System.out.print("Qual o novo valor: ");
				valor=sc.nextDouble();
				produto.setValor(valor);
				
				break;
			case 5:
				System.out.println(produto);
				break;
			case 6:
				option=false;
				break;
			default: System.out.println("opção invalida");
			}

		}
		
		
		
		
		sc.close();
	}
	public static void menu() {
		System.out.println("1)Adicionar Produto");
		System.out.println("2)Remover Produto");
		System.out.println("3)Alterar Nome do Produto");
		System.out.println("4)Alterar Valor do Produto");
		System.out.println("5)Imprimir Produto");
		System.out.println("6)Sair");
		System.out.print("Escolha uma opção:");
	}

}
