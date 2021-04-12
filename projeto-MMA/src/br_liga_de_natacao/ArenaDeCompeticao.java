package br_liga_de_natacao;

public class ArenaDeCompeticao {

	public static void main(String[] args) {
		Nadador n[] = new Nadador[20];
		n[0] = new Nadador("Natan", "Brasil", 11, "Masculino");
		n[1] = new Nadador("Eziquiel", "Argentina", 13, "Masculino");
		n[2] = new Nadador("Pedro", "Uruguai", 17, "Masculino");
		n[3] = new Nadador("Anderson", "Chile", 20, "Masculino");
		n[4] = new Nadador("Roberto", "Ucrania", 27, "Masculino");
		n[5] = new Nadador("Marcelo", "India", 30, "Masculino");
		n[6] = new Nadador("Antonio", "França", 41, "Masculino");
		n[7] = new Nadador("Otavio", "Peru", 35, "Masculino");
		n[8] = new Nadador("Diego", "Romenia", 42, "Masculino");
		n[9] = new Nadador("Apolo", "Grecia", 18, "Masculino");
		n[10] = new Nadador("Bruna", "Italia", 13, "Feminino");
		n[11] = new Nadador("Gabriela", "Portugal", 12, "Feminino");
		n[12] = new Nadador("Marcela", "Espanha", 17, "Feminino");
		n[13] = new Nadador("Morgana", "Suecia", 19, "Feminino");
		n[14] = new Nadador("Isabela", "Finlandia", 24, "Feminino");
		n[15] = new Nadador("Ana", "Noruega", 31, "Feminino");
		n[16] = new Nadador("Natalia", "Japao", 37, "Feminino");
		n[17] = new Nadador("Bruna", "China", 33, "Feminino");
		n[18] = new Nadador("Bruna", "Alemanha", 14, "Feminino");
		n[19] = new Nadador("Simone", "Holanda", 25, "Feminino");
		
		
		Nadar natacao1 = new Nadar();
		natacao1.marcarCompetição(n[0], n[1]);
		natacao1.competir(n[0], n[1]);
		
		n[0].status();
		n[1].status();
		
		
		

	}

}
