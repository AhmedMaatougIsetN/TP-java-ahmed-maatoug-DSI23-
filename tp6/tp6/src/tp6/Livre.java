package tp6;

public class Livre extends Article {
    private String nomEditeur;

    public Livre(String titre, int numeroIdentification, int nombrePages, String nomAuteur, String nomEditeur) {
        super(titre, numeroIdentification, nombrePages, nomAuteur);
        this.nomEditeur = nomEditeur;
    }

    public String getNomEditeur() {
        return nomEditeur;
    }

    public void setNomEditeur(String nomEditeur) {
        this.nomEditeur = nomEditeur;
    }

    @Override
    public String getType() {
        return "Livre";
    }

    @Override
    public void Edition() {
        super.Edition();
        System.out.println("Éditeur : " + nomEditeur);
    }
}
