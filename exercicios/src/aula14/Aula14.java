package aula14;

public class Aula14 {
	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula 01 de POO");
		v[1] = new Video("Aula 02 de POO");
		v[2] = new Video("Aula 03 de POO");
		
		System.out.println(v[0].toString());

		Garfanhoto g[] = new Garfanhoto[9];
		g[0] = new Garfanhoto("Carlos", 26, "M", "Carlos134");
		g[1] = new Garfanhoto("Cezar", 40, "M", "Cezar40");
		g[2] = new Garfanhoto("Luiza", 20, "F", "Luiza20");
		System.out.println(g[0].toString());

		Visualizacao vis = new Visualizacao(g[0], v[0]);
		System.out.println(vis.toString());
	}
}
