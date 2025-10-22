package lambdas;

@FunctionalInterface //declara que esta interface pode ter apenas um metodo, caso contrario retornara em erro
public interface Calculo {

	public abstract double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}
}

	
//caso declaremos numa mesma interface um metodo asbtract,, default e metodo statico, ambos podem coexistir e a interface pode continuar como funcional, pois default é implicito e nao obrigatorio.
//dessa forma e possivel termos mais de um metodo dentro de uma interface funcional, desde que tenha um metodo sem implementacao (abstrato) ela pode ser utilizada.