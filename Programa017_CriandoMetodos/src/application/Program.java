package application;

import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Triangulo x = new Triangulo();
		System.out.println("Entre com os dados do triangulo:");
		x.a=sc.nextDouble();
		x.b=sc.nextDouble();
		x.c=sc.nextDouble();
		System.out.println(x.area());
		sc.close();
	}

}
