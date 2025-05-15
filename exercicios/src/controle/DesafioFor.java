package controle;

public class DesafioFor {
	public static void main(String[] args) {
		
		String valor = "#";
		for(String valor1 = "#"; !valor1.contains("######"); valor1 = valor1 + "#") {
			System.out.println(valor);
			valor += "#";
		}
	}
}
