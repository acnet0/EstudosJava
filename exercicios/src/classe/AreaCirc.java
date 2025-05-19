package classe;

public class AreaCirc {

	double raio;
	final static double PI = 3.14; // em maiusclo por ser constante, logo FINAL
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2); //pow é um metodo estatico
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
