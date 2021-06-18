package principal;

public class Main {

	public static void main(String[] args) {
		Video v[] = new Video[3];
		
		v[0] = new Video("satã clama metal banda azul limão");
		v[1] = new Video("cruzada ao lado de satã banda flagelador");
		v[2] = new Video("satã apareça banda velho");
		
		Gafanhoto g[] = new Gafanhoto[2];
		
		g[0] = new Gafanhoto("satã", 666, "M", "Supremo Tio Lu");
		g[1] = new Gafanhoto("diga-me algo", 8, "M", "Algo");
		
//		System.out.println(v[0].toString());
//		System.out.println(g[1].toString());
		
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(g[0], v[0]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		vis[1] = new Visualizacao(g[0], v[1]);
		vis[1].avaliar(10.0f);
		System.out.println(vis[1].toString());
		vis[2] = new Visualizacao(g[0], v[2]);
		vis[2].avaliar(100);
		System.out.println(vis[2].toString());
		
	}

}
