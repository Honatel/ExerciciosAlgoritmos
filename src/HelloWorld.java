import java.util.ArrayList;
import java.util.Iterator;
import com.senac.SimpleJava.Console;

public class HelloWorld {
	public void run() {
		//MARCOS HONATEL NO GITHUB
		
		//int aux = VerificaQuantidadeDeLetras("macaco");
		
		ArrayList<String> listaResultados = CountCharacters("banana");

		System.out.println("Resposta do Exercicio 2 (palava = banana)");
		for (String item : listaResultados) {
			System.out.println(item);
		}
	}
	
	public static int Calcular(int valor1, int valor2){
		int resultado= 0;
		int aux= valor1;
		
		for (int i = 1; i < valor2; i++) {
			for (int j = 0; j < valor1; j++) {
						resultado = resultado + aux;
				}
			aux = resultado;
			resultado = 0;
		}			 
		return aux;
	}
	
	public static int VerificaQuantidadeDeLetras(String palavras){
		int quantidade = 0;
		String auxPalavras="";
		
		for (int i = 0; i < palavras.length(); i++) {
			int total = 0;
			
			for (int j = 0; j < palavras.length(); j++) {
				if (palavras.charAt(i) == palavras.charAt(j)){  
					total ++;	
				}
			}
			
			if (total == 2)
				auxPalavras =  auxPalavras + palavras.charAt(i);
			
			System.out.println(palavras.charAt(i) +": " + total);
			
		}	
		return quantidade;
	}
	
	public ArrayList<String> CountCharacters(String p) {
		ArrayList<String> response = new ArrayList<>();
		ArrayList<String> aux = new ArrayList<>();

		for (int i = 0; i < p.length(); i++) {
			char letra = p.charAt(i); 
			
			if(aux.contains(Character.toString(letra)))
				continue;

			int total = 0;
			for (int j = 0; j < p.length(); j++) {
				if(letra == p.charAt(j))
					total ++;
			}
			
			aux.add(Character.toString(letra));
			response.add(Character.toUpperCase(letra) + " - " + total);		
		}
		
		return response;
	}	
}