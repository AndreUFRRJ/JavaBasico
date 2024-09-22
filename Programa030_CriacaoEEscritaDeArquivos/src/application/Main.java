package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Informe o caminho do arquivo");
		String arquivo = scan.nextLine();
		
		List<String> list = new ArrayList<>();
		System.out.println("escreva o texto:");
		String aux=scan.nextLine(); 
		while(!aux.equals("sair")) {
			list.add(aux);
			aux=scan.nextLine();						
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo,true))){
			for(String texto: list) {
				bw.write(texto);
				bw.newLine();
			}
			
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		finally {
			scan.close();
		}
		System.out.println("arquivo criado com sucesso.");
	}

}
