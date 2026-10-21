package DS_2021;

public class Jcc {
	
	private film[] competition;
	private int annee;
	private int nbF=0;
	
	public Jcc (int taille , int annee) {
		if (taille < 0) {
			throw new IllegalArgumentException("La taille de la compétition ne peut pas être négative");
		}
		this.competition = new film[taille];
		this.annee = annee;
		this.nbF=0;
	}
	
	public void ajoutFilm (film f) {
		if (f == null) {
			throw new IllegalArgumentException("Le film ne peut pas être null");
		}
		if(this.nbF<this.competition.length) {
			this.competition[this.nbF]=f;
			this.nbF ++;
		}else {
			System.out.println("La compétition est au complet");
		}
	}	
	
	public void listeFilmJCC() {
		for(int i=0 ; i<this.nbF ;i++) {
			System.out.println(this.competition[i].toString());
		}
	}
	
	public float totalVenteBilletsJCC() {
		float t=0;
		for(int i=0 ; i<this.nbF ;i++) {
			t=t+this.competition[i].totalVentesBillets();
		}
		return t;
	}
}
