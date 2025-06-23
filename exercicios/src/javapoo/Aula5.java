package javapoo;

public class Aula5 {
	public static void main(String[] args) {
		ContaBanco c1 = new ContaBanco();
		c1.setNumConta(1111);
		c1.setDono("Antonio Neto");
		c1.abrirConta("CC");
		
		
		ContaBanco c2= new ContaBanco();
		c2.setNumConta(1112);
		c2.setDono("Eduarda Karem");
		c2.abrirConta("CP");

		c1.depositar(00.0);
		c2.depositar(500.0);
		
		c1.estadoAtual();
		c2.estadoAtual();
		
		
	}
}
