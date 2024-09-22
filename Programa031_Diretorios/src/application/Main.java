package application;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Entre com o caminho:");
		String caminho=sc.nextLine();
		
		File path = new File(caminho);
		
		File[] diretorio= path.listFiles(File::isDirectory);
			
		System.out.println("listando Diretorios");
		for(File file: diretorio) {
			System.out.println(file);
		}
	
		File[] path2 = path.listFiles(File::isFile);
		System.out.println("Listando Arquivos");
		for(File file:path2) {
			System.out.println(file);
		}
		
		System.out.println("criando pasta no caminho: "+caminho);
		String nomePasta = sc.nextLine();
		boolean sucess = new File(caminho+"\\"+nomePasta).mkdir();
		System.out.println(sucess);
		sc.close();
	}

}
