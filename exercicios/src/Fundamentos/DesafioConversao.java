package Fundamentos;

import java.util.Scanner;

//Calcula e media dos 3 ultimos salarios de uma pessoa recebendo esses valores por meio do "Scanner" e nextline, converter string em valor numerico
public class DesafioConversao {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	System.out.print("Insira seu primeiro Salario: R$");
	String salario1 = entrada.next().replace(",", "."); //forma que o professor fez, para caso o usuario digite , ou . funcione corretamente.
	// forma que eu fiz String salario1 = entrada.nextLine();
	
	System.out.print("Insira seu segundo Salario: R$");
	String salario2 = entrada.next().replace(",", ".");
	
	System.out.print("Insira seu terceiro Salario: R$");
	String salario3 = entrada.next().replace(",", ".");
	
	double sal1 = Double.parseDouble(salario1);
	double sal2 = Double.parseDouble(salario2);
	double sal3 = Double.parseDouble(salario3);
	
	double soma = sal1 + sal2 + sal3;
	double media = soma /3;
			
	
	System.out.println("A media salarial dos valores: R$" + media);
	
	entrada.close();
}
	
}
