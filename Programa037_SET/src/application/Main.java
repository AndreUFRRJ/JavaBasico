package application;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	HashSet Mais rapido, mas nao tem ordem
			TreeSet Mais Lento, mas tem ordem bem definida
			LinkedHashSet velocidade intermediaria, elementos na ordem que são adicionados
		*/
		Set<Product> set= new LinkedHashSet<Product>();
		//Set<Product> set= new TreeSet<Product>();
		//Set<Product> set= new HashSet<Product>();
		
		set.add(new Product("pao", 2.35));
		set.add(new Product("maçã", 2.00));
		set.add(new Product("manteiga", 2.20));
		set.add(new Product("leite", 5.5));
		set.add(new Product("pao", 4.30));
		set.add(new Product("canela", 3.30));
		
		for(Product element:set) {
			System.out.println(element);
		}
		
		System.out.println("---------------------------");
		
		set.removeIf(x->x.getPreco()>3);
		for(Product element:set) {
			System.out.println(element);
		}
		System.out.println(set.size());
		System.out.println("---------------------------");
		
		set.clear();
		for(Product element:set) {
			System.out.println(element);
		}
		
		System.out.println("---------------------------");
		
		Set<Integer> group1 = new TreeSet<Integer>(Arrays.asList(2,3,5,7,11));
		Set<Integer> group2 = new TreeSet<Integer>(Arrays.asList(1,3,5,7,9));
		/*	União, interseção e diferença de conjuntos	 */
		Set<Integer> uniao = new TreeSet<Integer>(group1);
		uniao.addAll(group2);
		System.out.print("[ ");
		for(Integer element:uniao) {
			System.out.print(element+" ");
		}
		System.out.println("]");
		//------------------------//
		Set<Integer> intersecao = new TreeSet<Integer>(group1);
		intersecao.retainAll(group2);
		System.out.print("[ ");
		for(Integer element:intersecao) {
			System.out.print(element+" ");
		}
		System.out.println("]");
		//-----------------------//
		Set<Integer> diferenca = new TreeSet<Integer>(group1);
		diferenca.removeAll(group2);
		System.out.print("[ ");
		for(Integer element:diferenca) {
			System.out.print(element+" ");
		}
		System.out.println("]");
		
	}

}
