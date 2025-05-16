package classe;

public class DataTeste {
	//mesmo sendo atributos do corpo da classe, estao presentes em cada uma das instancias
	//por estar num mesmo pacote nao é necessario importar a classe data
	public static void main(String[] args) {
		
	System.out.println("Insira a Data: ");
	
	Data d1 = new Data();
	d1.dia = 7;
	d1.mes = 11;
	d1.ano = 2021;
	
	// System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);
	System.out.println(d1.obterDataFormatada()); //d1 contem os valores que precisamos para aliementar e puxar a formatacao necessaria
	
	var d2 = new Data();
	d2.dia = 31;
	d2.mes = 12;
	d2.ano = 2020;
	
	// System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);
	System.out.println(d2.obterDataFormatada());
	}
}
