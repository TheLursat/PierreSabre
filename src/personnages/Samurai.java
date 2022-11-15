package personnages;

public class Samurai extends Ronin{
	private String seigneur;

	public Samurai(String seigneur, String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.seigneur = seigneur;
	}

	@Override
	public void direBonjour(){
		super.direBonjour();
		this.parler("Je suis fier de servir le seigneur "+this.seigneur);
	}
	
	public void boire(String boisson) {
		this.parler("Qu'est-ce que je vais prendre comme boisson ? Tiens je vais prendre du "+boisson+".");
	}
	
}
