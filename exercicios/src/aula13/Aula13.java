package aula13;

public class Aula13 {
	public static void main(String[] args) {
		Cachorro c1 = new Cachorro();
		
		System.out.println("Cachorro latindo!");
		c1.emitirSom();
		
		System.out.println("Pessoa diz: toma comida");
		System.out.print("Cachorro: ");
		c1.reagir("toma comida");
		
		System.out.println("Pessoa chega as 08am.");
		System.out.print("Cachorro: ");
		c1.reagir(9, 0);
		
		System.out.println("Pessoa que se aproxima é o dono");
		System.out.print("Cachorro: ");
		c1.reagir(true);
		
		System.out.println("Dono percebe que seu cachorro é velho e gordo");
		System.out.print("Cachorro: ");
		c1.reagir(5, 8);
		
	}
}
