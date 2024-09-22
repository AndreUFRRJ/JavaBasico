
package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,5,4,2,85,7,8,78,32,24,344);
		//.map vai aplicar uma funcao nos demais elementos.
		Stream<Integer> st1= list.stream().map(x->x*10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		
		Stream<String> st2=Stream.of("Maria", "Tekila", "Bolinha");
		//tem que usar arrays pra poder imprimir
		System.out.println(Arrays.toString(st2.toArray()));
		
		
		//iterate cria uma stram atraves de uma funcao, no caso o inicio é 2 e vai multiplicando por 2
		Stream<Integer> st3=Stream.iterate(2, x->x*2);
		System.out.println(Arrays.toString(st3.limit(5).toArray()));
		//o .limit delimita quantos elementos você vai imprimir na tela.
		
		
		//reduce, operação binaria, bom para fazer somatorio ou produtorio de lista.
		List<Integer> list1=Arrays.asList(2,3,4,7,8);
		Stream<Integer> st4=list1.stream().map(x->x*10);
		System.out.println(Arrays.toString(st4.toArray()));
		int sum=list1.stream().reduce(0,(x,y)->x+y);
		int mult=list1.stream().reduce(1,(x,y)->x*y);
		System.out.println(sum+" "+mult);
		

		
		//filter = filtra a lista
		//collect(Collectors.toList) = Transforma a Stream em Lista
		List<Integer> newLista = list1.stream()
				.filter(x->x%2==0)
				.map(x->x*10)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(newLista.toArray()));
				
		
		
		
	}

}
