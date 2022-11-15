package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	protected Humain[] memoire = new Humain[30];
	protected int nbConnaissances = 0;
	
	public Humain( String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @return the argent
	 */
	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println("("+this.getNom()+") - "+texte);
	}
	
	public void direBonjour(){
		this.parler("Bonjour ! Je m'appelle "+this.getNom()+" et j'aime boire du "+this.boisson+".");
	}
	
	public void boire() {
		this.parler("Mmmm, un bon verre de "+this.boisson+" ! GLOUPS !");
	}
	
	public int gagnerArgent(int gain) {
		return this.argent = this.argent + gain;
	}
	
	public int perdreArgent(int perte){
		return this.argent = this.argent - perte;
	}

	public void acheter(String bien, int prix) {
		if(this.getArgent() >= prix) {
			this.parler("J'ai "+this.argent+" en poche. Je vais pouvoir m'offrir "+bien+" à "+prix+" sous.");
			this.perdreArgent(prix);
		}else {
			this.parler("Je n'ai plus que "+this.argent+" sous en poche. Je ne peut meme pas m'offrir "+bien+" à "+prix+" sous.");
		}
	}
	
	private void memoriser( Humain humain ) {
		this.nbConnaissances = this.nbConnaissances % this.memoire.length;
		this.memoire[this.nbConnaissances% this.memoire.length] = humain;
		this.nbConnaissances = this.nbConnaissances + 1;
	}
	
	private void repondre( Humain humain){
		this.direBonjour();
		this.memoriser(humain);
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		this.direBonjour();
		humain.repondre(this);
		this.memoriser(humain);
	}
	
	public void listerConnaissances() {
		if(this.nbConnaissances >0) {
			String phrase = "Je connais beaucoup de monde dont : "+this.memoire[0].getNom();
			int i = 1;
			while(i < this.memoire.length && this.memoire[i] != null) {
				phrase += ", "+this.memoire[i].getNom();
				i += 1;
			}
			this.parler(phrase);
		}
	}
}
