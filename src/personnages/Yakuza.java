package personnages;

public class Yakuza extends Humain {
	String clan;
	int reputation;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation=0;
		
	}

	public void extorquer( Commercant victime) {
		this.parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		int argentVictime = victime.getArgent();
		this.gagnerArgent(argentVictime);
		victime.seFaireExtorquer();
		this.reputation += 1;
		this.parler("J'ai piqué "+argentVictime+" sous de "+victime.getNom()+", ce qui me fait "+this.getArgent()+" sous dans ma poche. Hi ! Hi !");
	}
}
