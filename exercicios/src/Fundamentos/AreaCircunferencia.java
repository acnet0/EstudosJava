package Fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4; // variaveis double são de tipos REAIS, é um tipo de dado primitivo que representa números decimais com precisão dupla
		final double PI = 3.14; // é um modificador que informa que assim que inicializado, seu valor não pode ser alterado.
		
		double area = PI * raio * raio;
		System.out.println(area);// em forma de atalho syso +ctrl espaço
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + "m2."); //utilizamos os operadores de + para indicar que os textos devem se seguir um do outro
	}
}
