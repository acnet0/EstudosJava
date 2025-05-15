package controle;
//deixarei os comentarios no codigo como exemplo do que não fazer 
// para resposta adequada, confira DesafioWhileRespostaProfessor
import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nota = "";
		Double notavalida = 0.0;
		Double media = 0.0;
		Double notal = 0.0;
		int contador = -1; //por iniciarmos com o do, o contador ja avança 1 casa a mais, sendo necessario a gambiarra
		
		do { // deveria começar com o while(nota != -1), e nao ja iniciando, resolveria o problema do contador e da soma na media
			System.out.print("Insira uma nota válida: ");
			nota = entrada.nextLine();
			notal = Double.parseDouble(nota); // codigo feito exageradamente complexo dado o que precisava
		if ((notal >= 0) && (notal <=10));{ // if estaria dentro do while, e nao dentro do "do", devido a isso interfere na media
			notavalida = notal;	
			media = notavalida + media;
			contador++; // o contador recebe 1 a mais pois ele ja inicia dentro do "do", se fosse no while não teria esse problema
		}
		}while (!("-1".equals(nota))); 
		media = media +1; //gambiarra para fazer com que o -1 nao interfira no valor da media
		media = media/contador;
		System.out.print("A media final da turma foi " 
				+ media + " com " + contador + " provas corrigidas.");
		entrada.close();
		
	}
}
