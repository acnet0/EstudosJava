package Fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		//em java quando atribuimos a uma variavel um tipo, ele não pode mudar! Se é caractere, não pode virar double e vice-versa.
		
		double a = 4.5; // neste caso a variavel foi declarada e inicializada
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto1"; // ao utilizarmos VAR o java faz uma inferença para identificar o tipo da variavel de acordo com seu conteúdo
		System.out.println(c);
		
		c = "outro texto"; // podemos alterar o valor da variavel desde que respeite ser do mesmo tipo
		System.out.println(c);
		
		/*
		 * c = 55;
		*
		*System.out.println(c);
		
		executar o código acima dará na seguinte mensagem de erro
		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Type mismatch: cannot convert from int to String

	at Fundamentos.Inferencia.main(Inferencia.java:19)
		*
		*/
		double d; //variavel foi declarada
		d = 123.65; // variavel foi iinicializada
		System.out.println(d); // variavel foi utilizada
		
		/*
		 * mensagem de erro: Cannot use 'var' on variable without initializer
		var e;//no caso de uma inferencia temos que declarar e já inicializar na mesma linha de código, não se pode fazer uma inferencia sem conteúdo.
		e = 123.45;
		System.out.println(e);
		*/		
		
	}
}
