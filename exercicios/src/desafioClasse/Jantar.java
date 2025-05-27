package desafioClasse;

public class Jantar {

	public static void main(String[] args) {
		//instanciar a pessoa, instanciar duas comidas, fazer com que coma
	Comida c1 = new Comida("Arroz", 0.50);
	Comida c2 = new Comida("Feijão", 1.0);
	Pessoa p1 = new Pessoa("Antonio Carlos", 70.50);
	
	System.out.println("Cardapio: ");
	System.out.println("Comida: " + c1.nome);
	//System.out.println("Peso:" + c1.peso);
	System.out.println("Comida: " + c2.nome);
	//System.out.println("Peso:" + c2.peso);
	
	System.out.println("Clientes: ");
	System.out.printf("Nome: %s \n", p1.nome); //ajustar formatacao
	System.out.printf("Peso: %d \n", p1.peso); //ajustar formatacao
	
	p1.peso = p1.pessoaComer(c1.peso, p1.peso);
	p1.peso = p1.pessoaComer(c2.peso, p1.peso);
	
	System.out.printf("Apos comer %s e %s, ficou com o peso final: %d ", c1.nome, c2.nome, p1.peso); //ajustar formtacao
	}
}
