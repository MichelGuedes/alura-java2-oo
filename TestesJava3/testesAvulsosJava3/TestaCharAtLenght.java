package testesAvulsosJava3;

public class TestaCharAtLenght {

	public static void main(String[] args) {
		String nome = "Lucas";
		
		String exercicio13 = "Socorram-me subi num onibus em Marrocos";
		String[] palavras = exercicio13.split(" ");
		
        StringBuilder sb = new StringBuilder(exercicio13).reverse();
		
		for (int i = 0; i<nome.length();i++){
			System.out.println(nome.charAt(i));
		}
		
		for (int i = nome.length() -1; i>=0;i--){
			System.out.println(nome.charAt(i));
		}
		
		//faz a inversao de texto mostrada acima na variavel "exericio13", usando o dicionario criado em "palavras"
		for (int i = palavras.length -1; i >= 0 ; i--) {
			System.out.println(palavras[i]);
		}
		
		System.out.print("\n");
		System.out.println(sb);
		
		StringBuilder r = new StringBuilder();
		for (int i = 0; i<nome.length();i++){
			r.append(Character.getNumericValue(nome.charAt(i)));
		}
		
		System.out.println(r);
	}

}