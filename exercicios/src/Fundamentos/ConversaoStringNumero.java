package Fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo numero");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1); // metodo para transformarmos de string para double, neste caso precisamos nos atentar que nem toda string pode ser um double
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("Soma é "+ soma);
		System.out.println("A media é " + soma / 2);
		
		// BigDecimal
		
	}
	
}
