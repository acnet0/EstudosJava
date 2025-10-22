package oo.heranca.desafio;

public interface Luxo {
	
	void ligarAr();
	void desligarAr();
	
	default int velocidadeDoAr() { //quando implementamos um metodo default na interface, esse metodo não é obrigatoriamente implementado na classe, mas ela pode utilizar seu dado. 
		return 1;
	}
}
