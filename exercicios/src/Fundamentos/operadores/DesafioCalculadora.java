package Fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		// Ler 1 num
		// Ler 2 num
		// + - * / %
	
		Scanner entrada = new Scanner(System.in); // Iniciar metodo para ler os numeros
		
		System.out.println("Insira o primeiro número: ");
		double num1 = entrada.nextDouble(); // primeiro numero
		
		System.out.println("Insira o segundo número: ");
		double num2 = entrada.nextDouble(); // segundo numero
		
		System.out.println("Qual operação deseja efetuar?");
		String operacao = entrada.next(); // operacao
		
		// Logica = irá verificar se o resultado da operação é o operador, e em sequencia ira retornar a operação.
		// ele primeiro verifica se é a operacao, se for ele efetua ela após o ?  se nao for ele retorna para o : sendo o resultado seguinte 
		double resultado = "+".equals(operacao) ? num1 + num2 : 0; //ele retorna 0 caso nao seja nenhuma dos simbolos listados abaixo
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		System.out.print(resultado);
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado); //%f substitui o float, %s substitui uma string
		
		entrada.close();
	
	}
}
