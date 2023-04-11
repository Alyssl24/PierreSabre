package personnages;

import personnages.*;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public int getReputation() {
		return reputation;
	}

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		reputation += 1;
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse!");
		int argentPique = victime.seFaireExtorquer();
		gagnerArgent(argentPique);
		parler("J'ai piqué les " + argentPique + " sous de " + victime.getNom() + ", ce qui me fait " + argent + " sous dans ma poche. Hi! Hi!");
	}
	
	public int perdre() {
		int perdu = argent;
		argent = 0;
		reputation--;
		parler("J’ai perdu mon duel et mes " + perdu + " sous, snif... J'ai déshonoré le clan de " + clan +".");
		return perdu;
		}
	
	public void gagner(int gain) {
		argent += gain;
		reputation++;
		parler("Ce ronin pensait vraiment battre Yaku Le Noir du clan de Warsong? Je l'ai dépouillé de ses " + gain + " sous.");
	}
	
@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan + ".");
	}
	
}
