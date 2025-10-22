package oo.heranca.teste;

import oo.heranca.desafio.*;

public class CorridaTeste {

	public static void main(String[] args) {
	
		Vectra vectra1 = new Vectra(160);
		
		Classic classic1 = new Classic(140);
		
		Ferrari ferrari1 = new Ferrari(300);
		
		System.out.println("INÍCIO DA CORRIDA");
		
		System.out.println("Ferrari =>" + ferrari1.toString());
		System.out.println("Classic =>" + classic1.toString());
		System.out.println("Vectra =>" + vectra1.toString());
		
		vectra1.acelerar();
		classic1.acelerar();
		ferrari1.acelerar();
		
		System.out.println("Ferrari =>" + ferrari1.toString());
		System.out.println("Classic =>" + classic1.toString());
		System.out.println("Vectra =>" + vectra1.toString());
		
		vectra1.frear();
		classic1.frear();
		ferrari1.frear();
		
		System.out.println("Ferrari =>" + ferrari1.toString());
		System.out.println("Classic =>" + classic1.toString());
		System.out.println("Vectra =>" + vectra1.toString());
		
		vectra1.frear();
		classic1.frear();
		ferrari1.frear();
		
		System.out.println("Ferrari =>" + ferrari1.toString());
		System.out.println("Classic =>" + classic1.toString());
		System.out.println("Vectra =>" + vectra1.toString());
		
		Ferrari ferrari2 = new Ferrari(400);
		
		ferrari2.ligarTurbo();
		ferrari2.acelerar();
		ferrari2.acelerar();
		ferrari2.acelerar();
		
		System.out.println(ferrari2.toString());
	}
		
}
