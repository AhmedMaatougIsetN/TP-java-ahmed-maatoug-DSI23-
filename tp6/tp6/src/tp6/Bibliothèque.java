package tp6;
public class Bibliothèque {
    private Document[] Listdoc;
    private int nombreDocuments;
    private int capaciteMax;

    public Bibliothèque(int capaciteMax) {
        this.capaciteMax = capaciteMax;
        this.Listdoc = new Document[capaciteMax];
        this.nombreDocuments = 0;
    }

    public int getCapacité() {
        return capaciteMax;
    }

    public int getNombre_document() {
        return nombreDocuments;
    }

    public void Ajout_doc(Document d) {
        if (nombreDocuments >= capaciteMax) {
            System.out.println("Erreur : La bibliothèque est pleine.");
            return;
        }

        // Insertion en respectant l'ordre des numéros d'identification
        int i = nombreDocuments - 1;
        while (i >= 0 && Listdoc[i].getNumeroIdentification() > d.getNumeroIdentification()) {
            Listdoc[i + 1] = Listdoc[i];
            i--;
        }
        Listdoc[i + 1] = d;
        nombreDocuments++;
    }

    public void Supprim_doc(int num) {
        int index = -1;
        for (int i = 0; i < nombreDocuments; i++) {
            if (Listdoc[i].getNumeroIdentification() == num) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Document introuvable.");
            return;
        }

        // Décalage des éléments
        for (int i = index; i < nombreDocuments - 1; i++) {
            Listdoc[i] = Listdoc[i + 1];
        }
        Listdoc[nombreDocuments - 1] = null;
        nombreDocuments--;
        System.out.println("Document supprimé avec succès.");
    }

    public void Inventaire_doc() {
        System.out.println("--- Inventaire de la Bibliothèque ---");
        for (int i = 0; i < nombreDocuments; i++) {
            Listdoc[i].Edition();
            System.out.println("-------------------");
        }
    }

    public Bibliothèque liste_livre() {
        Bibliothèque biblioLivres = new Bibliothèque(capaciteMax);
        for (int i = 0; i < nombreDocuments; i++) {
            if (Listdoc[i] instanceof Livre) {
                biblioLivres.Ajout_doc(Listdoc[i]);
            }
        }
        return biblioLivres;
    }

    public Bibliothèque liste_article() {
        Bibliothèque biblioArticles = new Bibliothèque(capaciteMax);
        for (int i = 0; i < nombreDocuments; i++) {
            // Un article qui n'est pas un livre (ou selon la hiérarchie stricte)
            if (Listdoc[i] instanceof Article && !(Listdoc[i] instanceof Livre)) {
                biblioArticles.Ajout_doc(Listdoc[i]);
            }
        }
        return biblioArticles;
    }

    public Bibliothèque liste_docsimples() {
        Bibliothèque biblioSimples = new Bibliothèque(capaciteMax);
        for (int i = 0; i < nombreDocuments; i++) {
            // Document simple = ni Article, ni Périodique (classe exacte Document)
            if (Listdoc[i].getClass().equals(Document.class)) {
                biblioSimples.Ajout_doc(Listdoc[i]);
            }
        }
        return biblioSimples;
    }

    public Bibliothèque liste_periodique() {
        Bibliothèque biblioPeriodiques = new Bibliothèque(capaciteMax);
        for (int i = 0; i < nombreDocuments; i++) {
            if (Listdoc[i] instanceof Periodique) {
                biblioPeriodiques.Ajout_doc(Listdoc[i]);
            }
        }
        return biblioPeriodiques;
    }
}