package personnages;

import java.util.Random;

public class Traitre extends Samurai {
	private int niveauTraitrise =0;

	public Traitre(String seigneur, String nom, String boisson, int argent) {
		super(seigneur, nom, boisson, argent);
	}

	@Override
	public void direBonjour(){
		super.direBonjour();
		this.parler("Mais je suis un traître et mon niveau de traîtrise est de : "+this.niveauTraitrise+". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if(this.niveauTraitrise < 3) {
			int argentRanconner = commercant.getArgent() * 2 / 10;
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			this.niveauTraitrise += 1;
			this.parler("Si tu veux ma protection contre les yakuzas, il va falloir payer ! Donne moi "+argentRanconner+" sous ou gare à toi !");
			commercant.parler("Tout de suite grand "+this.getNom()+".");
		}
		else {
			this.parler("Je ne peut plus rançonner personne aussinon un samuraï risque de me démasquer !");
		}
	}
	
	public void faireLeGentil() {
		if(this.nbConnaissances < 1) {
			this.parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		}
		else {
			int random = new Random().nextInt(this.nbConnaissances);
			random = random %this.memoire.length;
			int don = this.getArgent()/20;
			String nomAmi = this.memoire[random].getNom();
			this.parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec "+nomAmi+".");
			this.parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant "+don+" sous.");
			this.memoire[random].gagnerArgent(don);
			this.perdreArgent(don);
			String nom =this.getNom();
			this.memoire[random].parler("Merci "+nom+". Vous êtes quelqu'un de bien.");
			if(this.niveauTraitrise > 1) {
				this.niveauTraitrise -= 1;
			}
		}
	}
}
