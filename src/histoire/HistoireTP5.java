package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Samurai;
import personnages.Yakuza;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco =  new Commercant("Marco",20);
		Commercant chonin = new Commercant("Chonin",40);
		Commercant kumi = new Commercant("Kumi",10);
		Yakuza yaku = new Yakuza("Yaku le noir","whisky",30,"Warsong");
		Ronin roro = new Ronin("Roro","sochu",60);
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(kumi);
		marco.faireConnaissanceAvec(chonin);
		
		marco.listerConnaissances();
		yaku.listerConnaissances();
		roro.listerConnaissances();

		Samurai akimoto = new Samurai("Miyamoto","Akimoto","saké",80);
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissances();
		akimoto.boire("thé");
	}

}
