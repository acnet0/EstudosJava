package classe;

public class ValorNulo {
	
	public static void main(String[] args) {
		
		String s1 = ""; //mesmo ela sendo vazia, o vazio é o conteudo da variavel, existe um enderço na memoria alocado
		System.out.println(s1.concat("!!!!"));
		
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		if(d1 != null) {
			d1.mes = 3;	
			System.out.println(d1.obterDataFormatada());
		}
		
		String s2 = Math.random() > 0.5 ? "Opa" : null;		
		if(s2 != null) {
			System.out.println(s2.concat("????"));
		}
//		Data d1 = null;
//		d1.mes = 3; nao e possivel acessar . ou metodo de algo null
		
//		String s2 = null;
//		System.out.println(s2.concat("????")); 
	}
}
