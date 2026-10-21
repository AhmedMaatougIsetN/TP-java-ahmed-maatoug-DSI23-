package DS_2021;

public class documentaire extends film {
    private String sujet;
    private static float tarif = 2.0f; // Attribut de classe partagé, initialisé à 2DT

    // Constructeur
    public documentaire(String titre, String r, String pays, int d, String sujet) {
        super(titre, r, pays, d); // Appel du constructeur de la classe mère (film)
        this.sujet = sujet;
    }

    // Getter pour le sujet
    public String getSujet() {
        return sujet;
    }

    // Setter pour le sujet
    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    // Redéfinition de la méthode toString()
    @Override
    public String toString() {
        return super.toString() + " - Sujet : " + this.sujet;
    }

    // Redéfinition de la méthode totalVentesBillets()
    @Override
    public float totalVentesBillets() {
        // Pour les documentaires, le tarif est unique pour tous les billets
        return this.getNombreDePlaces() * tarif;
    }
}
