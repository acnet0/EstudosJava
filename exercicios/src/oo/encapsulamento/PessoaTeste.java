package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Antonio", "Carlos", 45);
		
		System.out.println(pessoa1.toString());
		System.out.println(pessoa1.getNomeCompleto());
	}
}
