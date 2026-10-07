public class TestDictionnaire {
    public static void main(String[] args) {
        Dictionnaire d1 = new Dictionnaire("Petit Dico", 10);

        d1.Ajouter_Mot(new MotDict("rapide", "qui se deplace vite"));
        d1.Ajouter_Mot(new MotDict("vite", "qui se deplace vite"));
        d1.Ajouter_Mot(new MotDict("lent", "qui se deplace doucement"));

        d1.Lister_dictionnaire();

        System.out.println("Definition de 'vite' : " + d1.Recherche_dicho("vite"));
        d1.Supprimer_Mot("lent");
        d1.Lister_dictionnaire();

        System.out.println("Nombre de synonymes de 'rapide' : " + d1.Nombre_synonyme(d1.getDict()[1]));
    }
}