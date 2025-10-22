package oo.polimorfismo;

public class Jantar {

	public static void main(String[]args) {
		
		Pessoa convidado1 = new Pessoa(99.0);
		
		Arroz ingrediente1 = new Arroz(0.2);
		
		Sorvete ingrediente2 = new Sorvete(0.5);
		
		Feijao ingrediente3 = new Feijao(0.3);
		
		Comida ingrediente4 = new Arroz(0.3); // porém podemos associar a Comida mas intanciando a classe arroz
//		Comida ingrediente5 = new Comida(0.3); retorna erro pois classes abstratas não podem ser intanciadas
		
		
		convidado1.comer(ingrediente1);
		convidado1.comer(ingrediente2);
		convidado1.comer(ingrediente3);
		convidado1.comer(ingrediente4);
		System.out.println(convidado1.getPeso());
		
	}
}
