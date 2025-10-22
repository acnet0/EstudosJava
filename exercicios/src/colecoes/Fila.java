package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Sergio");
		fila.offer("Carlos");
		fila.add("Michael");
		fila.offer("Serginho");
		
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}
}

//.add & .element -> Ambo os casos adicionam elementos a lista
//.add -> Adiciona um elemento da lista, se a mesma estiver cheia lança uma exceção. 
//.offer -> Também adiciona um elemento na lista, ele retorna em boolean se obeteve exito ou não.

//.poll -> retorna o primeiro elemento já o retirando da lista, caso esteja vazio, retorna Null
//.remove -> retorna o primeiro elemento já o retirando da lista, caso esteja vazio, retorna uma exceção.
//.size -> retorna o tamanho da lista
//.clear -> limpa a lista
//.isEmpty -> verifica se a lista está vazia.

//Ambos obtem os próximos itens da filam sem os remover
//.peek -> Obtem o próximo item da lista sem remover. Retorna null se a lista estiver vazia. 
//.element -> Obtem o próximo item da lista lançando uma exceção quando a mesma estiver vazia.
