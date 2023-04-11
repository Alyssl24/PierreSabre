package personnages;

import java.util.Iterator;
import java.util.concurrent.BrokenBarrierException;

public class Humain {
	private static final int  TAILLEMAX = 30;
	
	private String nom;
	private String boisson;
	protected int argent;
	protected Humain [] memoire = new Humain[TAILLEMAX];
	protected int nbConnaissance = 0;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + nom + " et j'aime boire du " + boisson + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + "! GLOUPS!");
	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if (prix < argent) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			argent -= prix;
		}
		else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		}
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissance == TAILLEMAX) {
			for (int i = 1; i < nbConnaissance; i++) {
				memoire[i-1] = memoire[i];
			}
			memoire[nbConnaissance-1] = humain;
		}
		else {
			memoire[nbConnaissance] = humain;
			nbConnaissance++;
		}
	}
	
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	public void faireConnaissanceAvec (Humain humain) {
		direBonjour();
		humain.repondre(this);
		memoriser(humain);
	}
	
	public void listerConnaissance() {
		String texte = "Je connais beaucooup de monde dont: ";
		for (int i = 0; i < nbConnaissance; i++) {
			texte += memoire[i].getNom();
			if (i != nbConnaissance-1) texte += ", ";
		}
		parler(texte);
	}
	
	
}
