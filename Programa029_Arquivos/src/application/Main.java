package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\andre\\Documents\\Testando.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Erro: "+e.getMessage());
		}
		finally {
			if(sc!=null) sc.close();
			
			System.out.println("programa encerrado com sucesso");
		}
		
		
		
		/*
		 * usando filereader e buffereread para leitura mais rapida
		 * */
		
		String path ="C:\\Users\\andre\\Documents\\Testando.txt";
		try(BufferedReader br= new BufferedReader(new FileReader(path)) ){
			String line= br.readLine();
			while(line!=null) {
				System.out.println(line);
				line=br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
				
		
		
		
		
		/*
		 * criação e escrita de arquivo
		 * */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Informe o caminho do arquivo");
		String arquivo = scan.nextLine();
		
		List<String> list = new ArrayList<>();
		System.out.println("escreva o texto:");
		String aux=scan.nextLine();
		int i=0;  
		while(aux!="sair" && i>10) {
			list.add(aux);
			System.out.println(aux);
			aux=scan.nextLine();
			i++;
						
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
	}

}
