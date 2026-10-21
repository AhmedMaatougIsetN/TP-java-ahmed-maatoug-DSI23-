package DS_2021;
import java.util.Scanner;


public class film {
	private String titre;
	private String realisateur;
	private String pays;
	private int duree;
	private int nbPlaces;
	private static final Scanner SCANNER = new Scanner(System.in);
	
	
	public film(String titre,String r,String pays,int d) {
		this.titre = titre;
		this.realisateur = r;
		this.pays = pays;
		this.duree = d;
		this.nbPlaces = 0;
	}
	
	
	public int getNombreDePlaces () {
		return this.nbPlaces;
	}
	
	public void setNombreDePlaces (int nbPlaces) {
		if (nbPlaces < 0) {
			throw new IllegalArgumentException("Le nombre de places ne peut pas être négatif");
		}
		this.nbPlaces = nbPlaces;
	}
	
	public String toString() {
		return (this.titre + " de " + this.realisateur + " ( " + this.pays + " ) - " + this.duree + "min ." );
	}
	
	public float totalVentesBillets () {
		int nbEtudiant;
		while (true) {
			System.out.print("Donner le nombre d'étudiants (entre 0 et " + this.nbPlaces + ") : ");
			if (SCANNER.hasNextInt()) {
				nbEtudiant = SCANNER.nextInt();
				if (nbEtudiant >= 0 && nbEtudiant <= this.nbPlaces) {
					break;
				}
			} else {
				SCANNER.next();
			}
			System.out.println("Veuillez saisir un nombre entier valide de places.");
		}
		return ((nbEtudiant * 2)+(nbPlaces-nbEtudiant)*3);
	}
	
	
}
