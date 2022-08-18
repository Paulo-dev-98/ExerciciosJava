package principal;

import java.awt.Desktop;
import java.net.URI;

public class AbrirLink {

	public static void main(String[] args) {
		try {
			URI link = new URI("https://www.youtube.com/watch?v=91MTUXla-lE");
			Desktop.getDesktop().browse(link);
		} catch (Exception erro) {
			System.out.println(erro);
		}
	}
}
