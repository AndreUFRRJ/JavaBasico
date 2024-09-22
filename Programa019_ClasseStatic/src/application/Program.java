package application;

import java.util.Scanner;
import util.Calculator;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o valor do raio: ");
		double radius=sc.nextDouble();
		
		System.out.printf("\nCircunferencia: %.4f",Calculator.circunferencia(radius));
		System.out.printf("\nÁrea: %.4f",Calculator.area(radius));
		System.out.printf("\nVolume: %.4f",Calculator.volume(radius));
		sc.close();
		
		
	}


}
