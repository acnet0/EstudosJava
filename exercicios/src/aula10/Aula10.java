package aula10;

public class Aula10 {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Carlos", 30, "Masculino");
		Aluno p2 = new Aluno("Marcia", 25, "Feminino");
		Professor p3 = new Professor("Fernando", 40, "Masculino", "Informática", 1000f);
		Funcionario p4 = new Funcionario("Flavia", 20, "Feminino");
		
		p1.setNome("Flavio");
		p2.setNome("Maria");
		p3.setNome("Claudio");
		p4.setNome("Fabiana");
		
		p2.setCurso("Sistemas da Informação");
		p3.setSalario(2000.50f);
		p4.setSetor("Estoque");
		p2.setMatr(100);

		System.out.println(p4.getTrabalhando());
		System.out.println(p3.getSalario());
		System.out.println(p2.getMatr());
		
		System.out.println("ALTERANDO DADOS");
		
		p4.setTrabalhando(true);
		p4.mudarTrabalho("Técnico");
		p3.ReceberAum(500);
		p2.cancelarMatr();
		
		System.out.println(p4.getTrabalhando());
		System.out.println(p3.getSalario());
		System.out.println(p2.getMatr());
	}
}
