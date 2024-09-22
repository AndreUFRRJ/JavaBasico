package application;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y,z;
		z=10;
		y=z;
		z=5;
		
		System.out.println("Y="+y);
		System.out.println("Z="+z);
		
		
		
		Objeto obj,obj2;
		
		obj2=new Objeto(100);
		obj=obj2;
		obj2.x=50;
		
		System.out.println("Obj ="+obj.x);
		System.out.println("Obj 2 ="+obj2.x);
		
		
	}

}
