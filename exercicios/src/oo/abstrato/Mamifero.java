package oo.abstrato;

public abstract class Mamifero extends Animal{ //uma classe abstract que extende uma outra classe não necessáriamente precisa implementar os seus metodos

	@Override
	public String mover() {
		// TODO Auto-generated method stub
		return "Movendo";
	}
	public abstract String mamar();
}
