
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "	asd FGH jKl asd	";
		
		System.out.println("Original:" + original);
		System.out.println(".toLowerCase: " + original.toLowerCase());
		System.out.println(".toUpperCase: " + original.toUpperCase());
		System.out.println(".trim: " + original.trim());
		System.out.println(".substring(Index que quero começar): " + original.substring(3));
		System.out.println(".substring(faixa de recorte): " + original.substring(4,8));
		System.out.println(".replace(): " + original.replace('a','X'));
		System.out.println(".replace(): " + original.replace("asd","TROCOU"));
		System.out.println(".indexOf(): "+original.indexOf("asd"));
		System.out.println(".lastIndexOf(): "+original.lastIndexOf("asd"));
		
		
		//transformando string em vetores
		String x= "laranja banana maçã uva pera";
		String[] vetor= x.split(" ");
		int i;
		for(i=0;i<vetor.length;i++){
			System.out.println(vetor[i]);
		}
		
	}

}
