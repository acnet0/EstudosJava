package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.SortedSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
//		Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>(); // garante a ordem de inserçãoj
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		System.out.println(listaAprovados);
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}	
}


//autobox - automaticamente alocar um tipo primitivo num wrapper de um objeto double -> Double, int -> Interger

//ao restringirmos o tipo <> para um dado, a lista só aceitará entradas dessa forma Set<TIPO> lista = new HashSet<>(); (é necessário adicionar o <> no final)
