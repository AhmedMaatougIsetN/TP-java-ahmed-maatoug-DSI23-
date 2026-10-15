package tp6;

public class Document {
    private String titre;
    private int numeroIdentification;
    private int nombrePages;

    public Document(String titre, int numeroIdentification, int nombrePages) {
        this.titre = titre;
        this.numeroIdentification = numeroIdentification;
        this.nombrePages = nombrePages;
    }

    public String getTitre() {
        return titre;
    }

    public int getNumeroIdentification() {
        return numeroIdentification;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNumeroIdentification(int numeroIdentification) {
        this.numeroIdentification = numeroIdentification;
    }

    public void setNombrePages(int nombrePages) {
        this.nombrePages = nombrePages;
    }

    public String getType() {
        return "Document";
    }

    public void Edition() {
        System.out.println("Type : " + getType());
        System.out.println("Numéro d'identification : " + numeroIdentification);
        System.out.println("Titre : " + titre);
        System.out.println("Nombre de pages : " + nombrePages);
    }
}

