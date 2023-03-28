package personnages;

import personnages.*;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		reputation += 1;
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse!");
		int argentPique = victime.seFaireExtorquer();
		argent += argentPique;
		parler("J'ai piqué les " + argentPique + " sous de " + victime.getNom() + ", ce qui me fait " + argent + " sous dans ma poche. Hi! Hi!");
	}
	
}
