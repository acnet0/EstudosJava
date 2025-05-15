package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Infome o número:"); // para aparecer a tela de leitura de dados do java e nao pelo console
		
		int numero = Integer.parseInt(valor);
			
		if (numero % 2 == 0) {
			System.out.println("O número é par!");
		} else {
			System.out.println("O número é ímpar!");
		}
	}
}
