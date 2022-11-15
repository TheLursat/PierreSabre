package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation=4;
		
	}

	public void extorquer( Commercant victime) {
		this.parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		int argentVictime = victime.getArgent();
		this.gagnerArgent(argentVictime);
		victime.seFaireExtorquer();
		this.reputation += 1;
		this.parler("J'ai piqué "+argentVictime+" sous de "+victime.getNom()+", ce qui me fait "+this.getArgent()+" sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int perte = this.getArgent();
		this.perdreArgent(perte);
		this.reputation -= 1;
		this.parler("J'ai perdu mon duel et mes "+perte+" sous, snif... J'ai déshonoré le clan "+this.clan+".");
		return perte;
	}
	
	public void gagner(int gain) {
		this.gagnerArgent(gain);
		this.reputation += 1;
		this.parler("Ce ronin pensait vraiment pouvoir battre "+this.getNom()+" du clan "+this.clan+" ? Je l'ai dépouillé de ses "+gain+" sous.");
	}

	/**
	 * @return the reputation
	 */
	public int getReputation() {
		return reputation;
	}
}
