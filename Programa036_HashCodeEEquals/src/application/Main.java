package application;

import entities.Clients;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clients c1= new Clients("Ana","ana@gmail.com","0000000",(short)12);
		Clients c2= new Clients("Ana","ana@gmail.com","0000001",(short)12);
		if(c1.hashCode()==c2.hashCode()) {
			System.out.println(c1.equals(c2));
		}
		else System.out.println(false);
	
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	
	}
	

}
