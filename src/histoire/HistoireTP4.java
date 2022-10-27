package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof","kombucha",54);
		
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		Commercant marco = new Commercant("Marco",20);
		
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		Yakuza yoku = new Yakuza("Yoku le noir","whisky",30,"Warsong");
		
		yoku.direBonjour();
		yoku.parler("Tiens, tiens, ne serait-ce pas un faible marchant qui passe par là ?");
		yoku.extorquer(marco);
		
	}

}
