package application;

import java.util.Scanner;

import services.ServicePrint;

public class Main {

	public static void main(String[] args) {
		ServicePrint<Integer> ps = new ServicePrint<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how many values?");
		int n=sc.nextInt();
		
		for (int i=0;i<n;i++) {
			Integer value= sc.nextInt();
			ps.addValue(value);			
		}
		ps.print();
		Integer x=ps.first();
		System.out.println("First: "+x);
		
		
		
		ServicePrint<String> listString = new ServicePrint<>();
		System.out.println("how many values?");
		n=sc.nextInt();
		sc.nextLine();
		for (int i=0;i<n;i++) {
			String value= sc.nextLine();
			listString.addValue(value);			
		}
		listString.print();
		String y=listString.first();
		System.out.println("First: "+y);
		
		
		
		
		
		sc.close();
		
	}

}
