package personnages;

public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		int perdu = argent;
		argent = 0;
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return perdu;
	}
	
	public void recevoir(int argents) {
		gagnerArgent(argents);
		parler(argents + " sous! Je te remercie généreux donateur!");
	}
}
