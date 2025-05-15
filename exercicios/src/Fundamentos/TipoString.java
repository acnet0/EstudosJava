package Fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(0)); // charAT identifica a posição de um caractere na string começando do 0
		
		String s = "Boa tarde"; // numa string não podemos modificar o valor original
		
		s = s.toUpperCase(); // se pode SUBSTITUIR o valor original, mas não modificar, palavras distintas, significados tbm
		
		System.out.println(s.concat("!!!")); // a função concat efetua a concatenação dos conteudos
		
		System.out.println(s + "!!!"); // neste caso o simbolo + funciona como concat na string
		
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("Tarde"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println(("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nidade" + idade + "\nSalario: " + salario ));
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%f. ", nome, sobrenome, idade, salario);
		
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$%f. ", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual")); //retorna em booleano se contem a frase na string
		System.out.println("Frase qualquer".indexOf("qual")); // retorna em inteiro a posição do caractere na String
		System.out.println("Frase qualquer".substring(6)); // retorna em string o conteúdo a partir da posição indicada
		System.out.println("Frase qualquer".substring(6, 10)); // retorna em string o conteúdo no intervalo determinado entre a posição estabelecida
	}

}
