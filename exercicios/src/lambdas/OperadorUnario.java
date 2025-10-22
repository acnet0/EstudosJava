package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario { //simples para fazer encadeamento de varias chamadas
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultadoAndThen = maisDois //no caso do andThen é "Faça x e depois faça y"
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		
		System.out.println(resultadoAndThen);
		
		int resultadoCompose = aoQuadrado //no caso do compose é "Antes de x, faça y"
				.compose(vezesDois)
				.compose(maisDois) // para termos o mesmo resultado a estrutura foi inversa ao andThen
				.apply(0); 
		
		System.out.println(resultadoCompose);
	}
}
