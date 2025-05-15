package Fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		int op1 = 3 + 2;
		int op2 = 6 * op1;
		double op3 = Math.pow(op2, 2);
		int op4 = 3 * 2;
		double op5 = op3 / op4;
		
		int op6 = (1-5) * (2-7);
		int op7 = op6 / 2;
		double op8 = Math.pow(op7, 2);
		double op9 = (op5 - op8);
		double op10 = (Math.pow(op9, 3));
		
		double op11 = Math.pow(10, 3);
		double op12 = (op10 / op11);
		
		System.out.println((int)op12);
		
		
	}
}
