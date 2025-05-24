package classe;

public class Data {
//mesmo sendo atributos do corpo da classe, estao presentes em cada uma das instancias
	int dia;
	int mes;
	int ano;
	
	Data(){
	//	dia = 1;
	//	mes = 1;
	//	ano = 1970;
	this(1, 1, 1990); // usando this como metodo podemos usar um construtor para chamar outro construtor
	}
		
	Data(int dia, int mes, int ano){
		this.dia = dia; // neste caso podemos utilizar o this para referenciar o objeto atual como mecanismo apra evitar conflito de nomes, referenciando os atributos da instancia
		this.mes = mes;
		this.ano = ano;
	}
	

	String obterDataFormatada(){
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano);
		
		//ou dessa forma mais sofisticada return String.format("%d/%d/%d)"dia, mes, ano);
		}
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada()); // this para acessar um metodo que pertence a instancia
	}
}
