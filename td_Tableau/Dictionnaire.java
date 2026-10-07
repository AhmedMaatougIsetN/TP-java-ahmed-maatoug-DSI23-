public class Dictionnaire {
	private int nb_mots ;
	private MotDict [] Dict ;
	private String Nom ;
	public Dictionnaire( String nom , int taille) {
		this.nb_mots = 0;
		Dict = new MotDict[taille];
		Nom = nom;
	}
	
	public int getNb_mots() {
		return nb_mots;
	}

	public void setNb_mots(int nb_mots) {
		this.nb_mots = nb_mots;
	}

	public MotDict[] getDict() {
		return Dict;
	}

	public void setDict(MotDict[] dict) {
		Dict = dict;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public void Ajouter_Mot (MotDict dict) {
		if (dict == null) {
			System.out.println("Le mot ne peut pas etre null !");
			return;
		}
		if (this.nb_mots >= Dict.length) {
			System.out.println("Le dictionnaire est plein !");
			return ;
		}
		else {
			Dict[nb_mots] = dict;
	        nb_mots++;
	        Trier(); 
		}
	}
	public void Trier() {
        for (int i = 0; i < nb_mots - 1; i++) {
            for (int j = i + 1; j < nb_mots; j++) {
                if (Dict[i].getMot().compareTo(Dict[j].getMot()) > 0) {
                    MotDict temp = Dict[i];
                    Dict[i] = Dict[j];
                    Dict[j] = temp;
                }
            }
        }
    }
	
	
	public void Supprimer_Mot(String mot) {
        int index = -1;
        for (int i = 0; i < nb_mots; i++) {
            if (Dict[i].getMot().equals(mot)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < nb_mots - 1; i++) {
                Dict[i] = Dict[i + 1];
            }
            Dict[nb_mots - 1] = null;
            nb_mots--;
        } else {
            System.out.println("Mot introuvable !");
        }
    }
	
	
	
	public String Recherche_dicho(String mot) {
        int g = 0, d = nb_mots - 1;
        while (g <= d) {
            int m = (g + d) / 2;
            int cmp = Dict[m].getMot().compareTo(mot);
            if (cmp == 0) {
                return Dict[m].getDefinition();
            } else if (cmp < 0) {
                g = m + 1;
            } else {
                d = m - 1;
            }
        }
		return "Mot non trouve.";
    }

	public String Recherche(String mot) {
		for (int i = 0; i < nb_mots; i++) {
			if (Dict[i].getMot().equals(mot)) {
				return Dict[i].getDefinition();
			}
		}
		return "Mot non trouve.";
	}
	
	
	
	public void Lister_dictionnaire() {
        for (int i = 0; i < nb_mots; i++) {
            System.out.println(Dict[i]);
        }
    }
	
	
	public int Nombre_synonyme(MotDict dict) {
        int count = 0;
        for (int i = 0; i < nb_mots; i++) {
            if (Dict[i].synonyme(dict)) {
                count++;
            }
        }
        return count;
    }
	
	
}
