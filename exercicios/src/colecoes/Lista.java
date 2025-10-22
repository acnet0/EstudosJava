package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Carlos")); //indice 0
		lista.add(new Usuario("Mia")); //indice 1
		lista.add(new Usuario("Bia")); //indice 2
		lista.add(new Usuario("Manu")); //indice 3
		
		System.out.println(lista.get(3)); //acessar pelo índice
		
		System.out.println(">>>>" + lista.remove(1));
		System.out.println(lista.remove(new Usuario("Manu")));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Mia")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
