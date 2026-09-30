class Personne {

    private String nom;
    private String prenom;
    private int age;
    private char sexe;

    public Personne() {
        nom = "Ben ALI";
        prenom = "Med";
        age = 30;
        sexe = 'M';
    }

    public Personne(String nom, String prenom, int age, char sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
    }

    public String getName() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public char getSexe() {
        return sexe;
    }

    public void affiche() {
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Âge : " + age);
        System.out.println("Sexe : " + sexe);
    }
    

    public boolean sameLastName(Personne p) {
        return this.nom.equals(p.nom);
    }
}

public class Main {

    public static void main(String[] args) {

        Personne p1 = new Personne();
        Personne p2 = new Personne("Maatoug", "Ahmed", 20, 'M');

        System.out.println("----- Personne 1 -----");
        p1.affiche();

        System.out.println("\n----- Personne 2 -----");
        p2.affiche();

        if (p1.sameLastName(p2)) {
            System.out.println("\nLes deux personnes ont le même nom.");
        } else {
            System.out.println("\nLes deux personnes n'ont pas le même nom.");
        }


        if (p1.getAge() > p2.getAge()) {
            System.out.println("La personne 1 est la plus âgée.");
        } else if (p2.getAge() > p1.getAge()) {
            System.out.println("La personne 2 est la plus âgée.");
        } else {
            System.out.println("Les deux personnes ont le même âge.");
        }

    }
}