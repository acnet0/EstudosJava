package oo.composicao.desafio.professor;

public class Sistema {
	
	public static void main(String[] args) {
		
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem("Caderno", 10, 10);
		compra1.adicionarItem(new Produto("impressora", 1897.00), 2);
		
		Cliente cliente1 = new Cliente ("Maria Julia");
		cliente1.adicionarCompra(compra1);
		cliente1.compras.add(compra1);
		
		System.out.println(cliente1.obterValorTotal());
	}
}
