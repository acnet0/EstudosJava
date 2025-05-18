package classe;

public class Data {
//mesmo sendo atributos do corpo da classe, estao presentes em cada uma das instancias
	int dia;
	int mes;
	int ano;
	
	
	Data(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	String obterDataFormatada(){
		return (dia + "/"+ mes + "/"+ ano); 
		
		//ou dessa forma mais sofisticada return String.format("%d/%d/%d)"dia, mes, ano);
		
		
	}
}
