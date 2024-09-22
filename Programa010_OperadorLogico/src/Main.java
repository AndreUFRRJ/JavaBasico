
public class Main {
	public static void main(String args[]) {
		/*
		 * operadores logicos 
		 * && (E)
		 * || (OU)
		 * ! (Não)
		 */
		
		boolean a=true,b=false;
		
		System.out.println(a&&a);
		System.out.println(a&&b);
		System.out.println(b&&a);
		System.out.println(b&&b);
		System.out.println();
		
		System.out.println(a||a);
		System.out.println(a||b);
		System.out.println(b||a);
		System.out.println(b||b);
		System.out.println();
		
		System.out.println(!a);
		System.out.println(!b);
	}
}
