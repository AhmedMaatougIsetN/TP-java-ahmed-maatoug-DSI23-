package DS_2021;

public class documentaire extends film {
    private String sujet;
    private static float tarif = 2.0f;

    public documentaire(String titre, String r, String pays, int d, String sujet) {
        super(titre, r, pays, d);
        this.sujet = sujet;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    @Override
    public String toString() {
        return super.toString() + " - Sujet : " + this.sujet;
    }

    @Override
    public float totalVentesBillets() {
        return this.getNombreDePlaces() * tarif;
    }
}
