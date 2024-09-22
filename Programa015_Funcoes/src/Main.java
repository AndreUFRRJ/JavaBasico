import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int a,b,c;
		System.out.println("Entre com 3 numeros");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		int maior=max(a,b,c);
		
		showResult(maior);
		
		sc.close();
	}
	
	//criando a função
	public static int max(int x,int y,int z){
		if(x>y && x>z) return x;
		else if (y>z) return y;
		else return z;
	}
	public static void showResult(int x) {
		System.out.println("maior valor é "+x);
	}
	
}
