package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import model.services.ProductService;

public class Main {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 999.99));
		list.add(new Product("Radio", 29.99));
		list.add(new Product("Secador", 79.99));
		list.add(new Product("Game", 100.00));
		list.add(new Product("Serra", 24.50));
		list.add(new Product("Garrafa", 5.99));
		list.add(new Product("Lapis", 2.5));
		list.add(new Product("Geladeira", 2500.0));
		list.add(new Product("Trator", 33999.99));
		list.add(new Product("Selo", 3.99));
		
		ProductService ps= new ProductService();
		 
		double sum=ps.filteredSum(list, product->product.getNome().charAt(0)=='S');
		System.out.println(sum);
		System.out.printf("%.2f",sum);
	}

}
