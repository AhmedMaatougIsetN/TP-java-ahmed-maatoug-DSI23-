package tp6;

public class Article extends Document {
    private String nomAuteur;

    public Article(String titre, int numeroIdentification, int nombrePages, String nomAuteur) {
        super(titre, numeroIdentification, nombrePages);
        this.nomAuteur = nomAuteur;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    @Override
    public String getType() {
        return "Article";
    }

    @Override
    public void Edition() {
        super.Edition();
        System.out.println("Auteur : " + nomAuteur);
    }
}