package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	public void donner(Commercant beneficiaire) {
		int don = this.getArgent()/10;
		this.parler(beneficiaire.getNom()+" prend ces "+don+" sous.");
		beneficiaire.recevoir(don);
		this.perdreArgent(don);
	}

	public void provoquer(Yakuza adversaire) {
		int force = this.honneur * 2;
		if(force >= adversaire.getReputation()) {
			this.honneur += 1;
			this.parler("Je t'ai eu petit yakuza!");
			this.gagnerArgent(adversaire.perdre());
		}
		else {
			this.honneur -= 1;
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(this.getArgent());
			this.perdreArgent(this.getArgent());
		}
	}
}
