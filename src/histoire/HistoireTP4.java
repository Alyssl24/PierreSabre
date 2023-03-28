package histoire;

import personnages.*;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain Prof = new Humain("Prof", "Kombucha", 54);
		Prof.direBonjour();
		Prof.acheter("une boisson", 12);
		Prof.boire();
		Prof.acheter("un jeu", 2);
		Prof.acheter("un kimono", 50);
		
		System.out.println();
		System.out.println();
		Commercant Marco = new Commercant("Marco", 20);
		Marco.direBonjour();
		Marco.seFaireExtorquer();
		Marco.recevoir(15);
		Marco.boire();
		
		System.out.println();
		System.out.println();
		Yakuza Noir = new Yakuza("Yaku Le Noir", "Whisky", 30, "Warsong");
		Noir.direBonjour();
		Noir.extorquer(Marco);
		
		System.out.println();
		System.out.println();
		Ronin Roro = new Ronin("Roro", "Shochu", 60);
		Roro.direBonjour();
		Roro.donner(Marco);
		
		System.out.println();
		System.out.println();
		Roro.provoquer(Noir);
	}
}
