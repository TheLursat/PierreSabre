package personnages;

public class Ronin extends Humain{
	int honneur = 1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		// TODO Auto-generated constructor stub
	}

	public void donner(Commercant beneficiaire) {
		int don = this.getArgent()/10;
		this.parler(beneficiaire.getNom()+" prend ces "+don+" sous.");
		beneficiaire.recevoir(don);
		this.perdreArgent(don);
	}

}
