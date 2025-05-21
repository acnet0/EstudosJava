package classe;

public class valorReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribuição por valor
		
		a++;
		b--;
		
		System.out.print(a + "" + b);
		
		Data d1 = new Data(1,6, 2022);
		Data d2 = d1; // atribuição por referência
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}
}
