package Fundamentos;

public class ConversaoTiposPrimitivoNumerico {

		public static void main(String[] args) {
			
			double a = 1.123456788888888; // aqui ja houve uma conversao implicita, de um valor inteiro e indo para double, não tem problema pois double consegue armazenar mais do que inter
			System.out.println(a);

			float b = (float) 1.123458888888; // o litoral de tipo float / a conversão explicita é quandoc colocamos em (float) estamos efetuando um cast
			System.out.println(b);
			
			int c = 4;
			byte d = (byte) c; // explícita (CAST)
			System.out.println(d);
			
			double e = 1; 
			int f = (int) e; // conforme mostra no console ocorre a perca de informação ao transformar de double em int no caso perdendo os valores decimais.
			System.out.println(f);

			
		}
}
