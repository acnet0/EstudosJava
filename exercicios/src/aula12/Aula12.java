package aula12;

public class Aula12 {
	public static void main(String[] args) {
		Mamifero m1 = new Mamifero();
		
		System.out.println("MAMIFERO");
		m1.setPeso(35.3f);
		m1.setCorPelo("Branco");
		m1.getCorPelo();
		m1.alimentar();
		m1.locomover();
		m1.emitirSom();
		System.out.println("________________");
		
		Reptil r1 = new Reptil();
		
		System.out.println("REPTIL");
		r1.setPeso(5.0f);
		r1.setCorEscama("Verde");
		r1.getCorEscama();
		r1.alimentar();
		r1.locomover();
		r1.emitirSom();
		System.out.println("__________________");
		
		Peixe p1 = new Peixe();
		
		System.out.println("PEIXE");
		p1.setPeso(9.0f);
		p1.setCorEscama("Azul");
		p1.getCorEscama();
		p1.locomover();
		p1.alimentar();
		p1.soltarBolha();
		System.out.println("___________________");
		
		Ave a1 = new Ave();
		
		System.out.println("AVE");
		a1.setPeso(8.0f);
		a1.setCorPena("Branca");
		a1.getCorPena();
		a1.alimentar();
		a1.locomover();
		a1.emitirSom();
		System.out.println("____________________");
		
		Canguru c1 = new Canguru();
		
		System.out.println("CANGURU");
		c1.setPeso(50.0f);
		c1.getPeso();
		c1.locomover();
		c1.alimentar();
		c1.emitirSom();
		c1.usarBolsa();
		System.out.println("____________________");
		
		Cachorro ca1 = new Cachorro();
		
		System.out.println("CACHORRO");
		ca1.setPeso(20.0f);
		ca1.getPeso();
		ca1.setCorPelo("Loiro");
		ca1.alimentar();
		ca1.locomover();
		ca1.emitirSom();
		System.out.println("____________________");
		
		Tartaruga t1 = new Tartaruga();
		
		System.out.println("TARTARUGA");
		t1.setPeso(25.0f);
		t1.getPeso();
		t1.locomover();
		t1.alimentar();
		t1.emitirSom();
		t1.setCorEscama("Verde");
		System.out.println("____________________");
		
		Goldfish g1 = new Goldfish();
		
		System.out.println("GOLDFISH");
		g1.setPeso(26.0f);
		g1.getPeso();
		g1.locomover();
		g1.alimentar();
		g1.soltarBolha();
		g1.setCorEscama("Dourada");
		System.out.println("____________________");
		
		Cobra co1 = new Cobra();
		
		System.out.println("COBRA");
		co1.setPeso(3.5f);
		co1.getPeso();
		co1.locomover();
		co1.alimentar();
		co1.emitirSom();
		System.out.println("____________________");
		
		Arara ar1 = new Arara();
		
		System.out.println("ARARA");
		ar1.setPeso(6.3f);
		ar1.getPeso();
		ar1.alimentar();
		ar1.locomover();
		ar1.emitirSom();
	}
}
