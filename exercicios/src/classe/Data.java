package classe;

public class Data {
//mesmo sendo atributos do corpo da classe, estao presentes em cada uma das instancias
	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada(){
		return (dia + "/"+ mes + "/"+ ano); 
		
		//ou dessa forma mais sofisticada return String.format("%d/%d/%d)"dia, mes, ano);
		
		
	}
}
