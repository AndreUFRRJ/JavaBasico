package services;

import java.util.List;

public class ServicesGenerics {
	public static void copy(List<? extends Number> origin, List<? super Number> destiny) {
		for(Number originElement: origin) {
			destiny.add(originElement);
		}
	}
	public static void printListNumber(List<? super Number> list) {
		for(Object element:list) {
			System.out.print(element + " - ");
		}
	}
}
