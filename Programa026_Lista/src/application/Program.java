package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<>();
		
		//adicionando itens a lista
		list.add("André");
		list.add("Tekila");
		list.add("Vanessa");
		list.add("Maria");
		list.add("João");
		list.add("Tirulipa");
		list.add("Tania");
		list.add("Tauã");
		list.add("Marcos");
		list.add("Rita");
		
		//tamanho da lista
		System.out.println(list.size());
		
		//imprimindo list
		for(String x: list) {
			System.out.println(x);
		}
		
		//removendo por comparação e por indice
		list.remove("Rita");
		list.remove(4);
		
		//imprimindo lista
		System.out.println("-----------------------");
		for(String x: list) {
			System.out.println(x);
		}
		
		//removendo por expressão lambida - no caso excluindo todos começados com M
		list.removeIf(x->x.charAt(0)=='M');
		
		//imprimindo lista
		System.out.println("-----------------------");
		for(String x: list) {
			System.out.println(x);
		}

		//Localizando indice dos itens - se não existir retorna -1
		System.out.println("indice do André: "+list.indexOf("André"));
		System.out.println("indice da Olivia: "+list.indexOf("Olivia"));
	
		
		
		/*
		 * criando uma lista a partir de um filtro
		 * primeiro transforme para STREAM, vai fazer a lista deixar de ser lista
		 * Segundo use FILTER e a função que desejar.
		 * Terceiro use .collect(Collectors.toList()) para transformar novamente para list
		*/
		List<String> aux = list.stream().filter(x->x.charAt(0)=='T').collect(Collectors.toList());
	
		
		System.out.println("-----------------------");
		for(String x: aux) {
			System.out.println(x);
		}
		
		/*
		 * Localizando primeiro caso da lista com predicado 
		 * transforma para Stream
		 * usa o filtro com expressão lambida
		 * utiliza findFirst (acontece primeiro)
		 * e utiliza o orElse que serve como um senão, caso não ache um evento
		 * 
		*/
		System.out.println("---------------------------------");
		String nome = list.stream().filter(x->x.charAt(0)=='V').findFirst().orElse(null);
		System.out.println(nome);
	}

}
