package oo.heranca.teste;
import oo.heranca.*;
public class Jogo {
	
	public static void main(String[] args) {
		
		Monstro npc1 = new Monstro();
		npc1.x = 10;
		npc1.y = 10;
		
		Heroi player1 = new Heroi(10, 11);
		
		System.out.println("Monstro tem => " + npc1.vida);
		System.out.println("Heroi tem => " + player1.vida);
		
		npc1.atacar(player1);
		player1.atacar(npc1);
		
		System.out.println("Monstro tem => " + npc1.vida);
		System.out.println("Heroi tem => " + player1.vida);
		
		
	
	}
}
