package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Anna");
		
		
		System.out.println("\nUtilizando for... ");
		for (int i = 0; i < aprovados.size(); i++) { //SE i = 0, i MENOR QUE tamanho de itens em APROVADOS, i soma 1
			System.out.println(aprovados.get(i)); //pegue o valor de i
		}
		
		
		System.out.println("\nUsando o foreach...");
		for(String nome: aprovados) { // : para cada elemento NOME em APROVADOS
			System.out.println(nome); // ele imprime NOME
		}
		
		System.out.println("\nUsando Iterator...");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) { //estabelece a condicao de verdade onde se tem proxito item 
			System.out.println(iterator.next()); // ele da continuidade e imprime
		}
		
		System.out.println("\nUsando Stream...");
		Stream<String> stream = aprovados.stream(); //uma sequencia de dados
		stream.forEach(System.out::println); // Laço Interno
	}
}