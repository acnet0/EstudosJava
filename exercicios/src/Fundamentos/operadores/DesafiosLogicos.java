package Fundamentos.operadores;

public class DesafiosLogicos {
	public static void main(String[] args) {
		// se apenas 1 trabalho der certo = tv de 32 polegadas
		// se os 2 trabalhos der certo = tv de 50 polegadas
		// nos 2 casos onde algum trabalho da certo, a familia toma sorvete
		// nao faz nada se nao conseguir nenhum trabalho
		// nao conseguiu nenhum trabalho 
		// nao tomou nenhum sorvete
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean condtv50 = trabalho1 && trabalho2;
		boolean condtv32 = trabalho1 ^ trabalho2;
		boolean condsorvete = trabalho1 || trabalho2;
		boolean condsaudavel = ! condsorvete; 
		
		System.out.println("Comprou a Tv de 50 polegadas: " + condtv50);
		System.out.println("Comprou a Tv de 32 polegadas: " + condtv32);
		System.out.println("Tomaram Sorvete? " + condsorvete);
		System.out.println("Ficaram mais saudaveis? " + condsaudavel);
		
	
	}
}
