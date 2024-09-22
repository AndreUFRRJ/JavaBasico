package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp = new ArrayList<>();
		String path = "C:\\Users\\andre\\Documents\\emp.txt";
		
		try(BufferedReader br= new BufferedReader(new FileReader(path)) ){
			String line= br.readLine();
			while(line!=null) {
				String[] data= line.split(",");
				emp.add(new Employee(data[0],Double.parseDouble(data[1])));
				line=br.readLine();
			}
			System.out.println(emp.get(1).compareTo(emp.get(4)));
			Collections.sort(emp);
			
			for(Employee x : emp) {
				System.out.println(x);
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
				
		
		
	}

}
