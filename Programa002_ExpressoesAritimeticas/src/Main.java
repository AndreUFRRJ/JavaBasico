
public class Main {

	public static void main(String[] args) {
		//soma subtração multiplicação divisão e mod
		double x,y,z;
		y=5;
		z=3;
		x=y+z;
		System.out.println("soma:"+x);
		x=y-z;
		System.out.println("subtração:"+x);
		x=y*z;
		System.out.println("multiplicação:"+x);
		x=y/z;
		System.out.println("divisão:"+x);
		x=y%z;
		System.out.println("resto:"+x);
		
		//operações equivalentes
		x=x+y;
		x+=y;

		x=x-y;
		x-=y;
		
		x=x*y;
		x*=y;
		
		x=x/y;
		x/=y;
	}

}
