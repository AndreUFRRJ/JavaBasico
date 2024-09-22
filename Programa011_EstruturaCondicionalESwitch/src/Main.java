
public class Main {
	public static void main(String args[]) {
		/*
		 * Estrutura IF e ELSE~
		 * if(«CONDIÇÃO»){
		 * 	«COMANDOS»
		 * }else{
		 * 	«COMANDOS»
		 * }
		 * */
		int x=3;
		
		if(x%2==0) {
			System.out.println(x+ " é par");
		}
		else {
			System.out.println(x+" é impar");
		}
		
		/*Operador Ternario
		 * (condicional)? codigo 1 : codigo 2;
		*/
		System.out.println((x%2==0)? "é par":"é impar");
		
	}
}
