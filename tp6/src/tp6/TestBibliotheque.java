package tp6;

public class TestBibliotheque {
    public static void main(String[] args) {
        // Création d'une bibliothèque d'une capacité de 10 documents
        Bibliothèque maBiblio = new Bibliothèque(10);

        // Création de différents documents
        Document d1 = new Document("Guide Général", 105, 50);
        Article a1 = new Article("Programmation Java", 102, 120, "Jean Dupont");
        Livre l1 = new Livre("Les Misérables", 101, 500, "Victor Hugo", "Gallimard");
        Periodique p1 = new Periodique("Science & Vie", 108, 100, "Mensuel");

        // Ajout dans la bibliothèque (l'ordre d'insertion n'importe pas, l'affichage sera trié par ID)
        maBiblio.Ajout_doc(d1);
        maBiblio.Ajout_doc(a1);
        maBiblio.Ajout_doc(l1);
        maBiblio.Ajout_doc(p1);

        // Affichage de l'inventaire complet
        System.out.println("=== INVENTAIRE COMPLET ===");
        maBiblio.Inventaire_doc();

        // Test des méthodes de filtrage
        System.out.println("\n=== LISTE DES LIVRES ===");
        Bibliothèque livresOnly = maBiblio.liste_livre();
        livresOnly.Inventaire_doc();

        // Test de suppression
        System.out.println("\n=== SUPPRESSION DU DOCUMENT 105 ===");
        maBiblio.Supprim_doc(105);
        
        System.out.println("\n=== INVENTAIRE APRÈS SUPPRESSION ===");
        maBiblio.Inventaire_doc();
    }
}