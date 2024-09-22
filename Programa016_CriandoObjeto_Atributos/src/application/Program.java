package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Entre com os 3 lados do Triângulo");
		x.a=sc.nextDouble();
		x.b=sc.nextDouble();
		x.c=sc.nextDouble();
		System.out.println("Entre com os 3 lados do outro triângulo");
		y.a=sc.nextDouble();
		y.b=sc.nextDouble();
		y.c=sc.nextDouble();
		
		double areaX=areaTriangulo(x.a,x.b,x.c);
		double areaY=areaTriangulo(y.a,y.b,y.c);
		
		System.out.printf("Area triangulo 1: %.4f\n",areaX);
		System.out.printf("Area triangulo 2: %.4f\n",areaY);
		System.out.printf((areaX<areaY)?"Maior é o Triangulo 2" : "Maior é o Triangulo 1");
		sc.close();
	}
	
	public static double areaTriangulo(double a, double b, double c) {
		double p=(a+b+c)/2;
		double area= Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return area;
	}

}
