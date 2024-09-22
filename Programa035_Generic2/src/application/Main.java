package application;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import services.ServicesGenerics;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myInteger = Arrays.asList(12,24,26,55,88,13,27);
		List<Double> myDouble = Arrays.asList(2.5,3.9,8.8,0.1);
		List<Number> myList = new ArrayList<>();
		ServicesGenerics.copy(myInteger, myList);
		ServicesGenerics.copy(myDouble, myList);
		ServicesGenerics.printListNumber(myList);
	}

}
