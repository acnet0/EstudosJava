package classe;

public class DataTeste {
	//mesmo sendo atributos do corpo da classe, estao presentes em cada uma das instancias
	//por estar num mesmo pacote nao é necessario importar a classe data
	public static void main(String[] args) {
		
	Data d1 = new Data();
	
	System.out.println(d1.obterDataFormatada()); //d1 contem os valores que precisamos para aliementar e puxar a formatacao necessaria
	
	var d2 = new Data(31, 12, 2020);
	
	System.out.println(d2.obterDataFormatada());
	}
}
