package Fundamentos;

// import java.util.Scanner;

public class Wrappers {

		public static void main(String[] args) {
			
			// Scanner entrada = new Scanner(System.in);
		
			// Para cada versão de tipo objetivo, existe um wrapper, uma versão de objtos... muda de minusculo para maisculo [alem da exceção Integer e Boolean
			
			//byte
			Byte b = 100;
			Short s = 1000;
			
			
			// Interger.parseInt(entrada.netxt());
			Integer i = 10000; // tipo primitivo int
			Long l = 100000L;
			
			System.out.println(b.byteValue());
			System.out.println(s.toString());
			System.out.println(i * 3);
			System.out.println(l / 3);
			
			Float f = 123F; //Obrigatoriamente precisa colocar o F no final para demonstrar que é float
			System.out.println(f);

			Double d = 1234.5678;
			System.out.println(d);
			
			Boolean bo = Boolean.parseBoolean("true");
			System.out.println(bo);
			System.out.println(bo.toString().toUpperCase()); // transforma o tipo de booleano para string e posteriormente aplica o metodo uppercase
			
			Character c = '#';  // char
			System.out.println(c + "...");
			
			// entrada.close();
		}
}
