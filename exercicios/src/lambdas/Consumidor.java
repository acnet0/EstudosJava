package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor { //recebe um unico parametro e não passa nenhum retorno, o forEach espera um consumer
	
	public static void main(String[] args) {
		Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!");
		
		Produto p1 = new Produto("Caneta", 10.90, 0.10);
		Produto p2 = new Produto("Lapis", 5.90, 0.10);
		Produto p3 = new Produto("Lapiseira", 14.90, 0.10);
		Produto p4 = new Produto("Borracha", 3.90, 0.10);
		
		imprimir.accept(p1);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4); 
		
		produtos.forEach(imprimir);
		
		produtos.forEach(p -> System.out.println(p.preco));
		
		produtos.forEach(System.out::println);
	}
}
