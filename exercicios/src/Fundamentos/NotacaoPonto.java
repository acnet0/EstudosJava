package Fundamentos;

public class NotacaoPonto { // e um metodo para acessar determinado dado
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		// s.toUpperCase(); a funcao nao altera o valor original, ela altera apenas o que estiver em sua linha correspondente
		
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		// s.replace("X", "Senhora"); a funcao nao altera o valor original conforme na anterior, ela precisa receber o valor de s para fazelo
		
		System.out.println(s);
		
		String x = "Leo".
				toUpperCase();//podemos utilizar o ponto dessa forma para quebrar a linha em java deixando o conteudo abaixo. ou 
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase() //podemos utilizar o ponto quebrando a linha e acompanhando o conteudo, e em sequencia outro .
				.concat("!!!");// podemos encadear varias chamadas numa unica sequencia de código.
		System.out.println(y);
		
		// Tipos primitivos nao tem o operador ".", não podemos ter comportamentos e atributos a tipos primitivos,os objetos sim tem .
		
		int a = 3;
		System.out.println(a);
		
	
	}
}
