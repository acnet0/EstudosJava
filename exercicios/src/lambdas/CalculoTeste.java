package lambdas;

public class CalculoTeste {
	
	public static void main(String[] args) {
		
		Calculo calculo = new Somar(); // como podeoms ver na instanciação do objeto, a estrutura segue o guardachuva INTERFACE/CLASSEPAI VARIAVEL = new CLASSE
		System.out.println(calculo.executar(2, 3));
		
		calculo = new Multiplicar(); //neste caso a variavel pode instanciar Somar e Multiplicar, pois ambas sao instancias de Calculo, sendo assim tendo mesma classe PAI
		System.out.println(calculo.executar(2, 3));
		
		System.out.println(calculo.legal()); // chamando a funcao default
		System.out.println(Calculo.muitoLegal()); //chamando a funcao static
	}
}
