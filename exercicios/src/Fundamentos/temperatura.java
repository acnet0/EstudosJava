package Fundamentos;

public class temperatura {
	public static void main(String[] args) {
		//(ºF-32)x 5/9 = ºC
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		double farenheit = 86;
		double celcius = (farenheit - AJUSTE) * FATOR;
		System.out.println("O resultado de 86ºF em Celcius é " + celcius + ("ºC"));

		farenheit = 150;
		celcius = (farenheit - AJUSTE) * FATOR;
		System.out.println("O resultado de 150ºF em Celcius é " + celcius + ("ºC"));
	}
}
