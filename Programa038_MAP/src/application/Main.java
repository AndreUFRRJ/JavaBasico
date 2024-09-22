package application;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> cookies = new HashMap<>();
		cookies.put("nome", "Tekila");
		cookies.put("email", "tekila@email.com");
		cookies.put("idade", "8");
		cookies.put("preco", "infinito");
		cookies.put("telefone", "999999999");
		
		System.out.println(cookies.containsKey("telefone"));
		System.out.println(cookies.containsKey("endereco"));
		
		System.out.println(cookies.containsValue("8"));
		System.out.println(cookies.containsValue("SRD"));
		
		
		System.out.println("------------------------");
		for(String key:cookies.keySet()) {
			System.out.println(key+": "+cookies.get(key));
		}
	}

}
