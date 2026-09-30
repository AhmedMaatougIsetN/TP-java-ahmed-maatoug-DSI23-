public class point {
	String nom;
	int abs;
	int ord;

	point(int a, int b) {
		abs = a;
		ord = b;
	}

	point(String a) {
		nom = a;
	}

	point(String ch, int a, int b) {
		nom = ch;
		abs = a;
		ord = b;
	}

	void TranslHoriz(int d) {
		abs += d;
	}

	void TranslVert(int d) {
		ord += d;
	}

	void Translation(int x, int y) {
		abs += x;
		ord += y;
	}

	boolean Coincide(point p) {
		return (this.abs == p.abs && this.ord == p.ord);
	}

	void Affiche() {
		System.out.println(" abs = " + abs);
		System.out.println(" ord = " + ord);
	}

	String getNom() {
		return nom;
	}

	int getAbscisse() {
		return abs;
	}

	int getOrdonnée() {
		return ord;
	}

	void setNom(String ch) {
		nom = ch;
	}

	void setAbscisse(int a) {
		abs = a;
	}

	void setOrdonnée(int a) {
		ord = a;
	}

	public static void main(String[] args) {
		point p1;
		p1 = new point(3, 5);
		point p2 = new point("a");
		point p3 = new point("b", 3, 5);
		System.out.println("\n ---------------------------\n");
		System.out.println("les points créés sont :");
		p1.Affiche();
		p2.Affiche();
		p3.Affiche();
		System.out.println("\n ---------------------------\n");
		if (p1.Coincide(p3) == true)
			System.out.println("Les 2 points p1 et p3 coïncident");
		else
			System.out.println("Les 2 points ne coïncident pas");
		System.out.println("\n ---------------------------\n");
		System.out.println("translation des point ");
		p1.TranslHoriz(4);
		p2.TranslVert(3);
		p3.Translation(5, 2);
		p1.Affiche();
		p2.Affiche();
		p3.Affiche();
		System.out.println("\n ---------------------------\n");
		System.out.println("modification des attributs des points");
		p1.setNom("SRI21");
		p2.setAbscisse(25);
		p3.setOrdonnée(50);
		p1.Affiche();
		p2.Affiche();
		p3.Affiche();
		System.out.println("\n ---------------------------\n");
		System.out.println("utilisation des méthodes get");
		String x = p1.getNom();
		int y = p1.getAbscisse();
		int z = p1.getOrdonnée();
		System.out.println(" le nom du point p1 est : " + x);
		System.out.println(" son abscisse est : " + y);
		System.out.println(" son ordonnée est : " + z);
	}
}
