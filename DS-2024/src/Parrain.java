public class Parrain extends Personne {
    private int idParrain;
    private int nombreEnfantsParraines;
    private final int max = 100;
    private Enfant[] mesEnfants;

    public Parrain(String nom, String prenom, int age, int idParrain) {
        super(nom, prenom, age);
        this.idParrain = idParrain;
        this.nombreEnfantsParraines = 0;
        this.mesEnfants = new Enfant[max];
    }

    public void ajouterEnfant(Enfant enfant) {
        if (nombreEnfantsParraines < max) {
            mesEnfants[nombreEnfantsParraines] = enfant;
            nombreEnfantsParraines++;
        }
    }

    public int getnbreEnfantsParraines() {
        return nombreEnfantsParraines;
    }

    public Enfant getEnfantParraine(int index) {
        if (index < 0 || index >= nombreEnfantsParraines) {
            throw new IndexOutOfBoundsException("Indice d'enfant parrainé invalide : " + index);
        }
        return mesEnfants[index];
    }


    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("idParrain : " + idParrain);
        System.out.println("Nombre d'enfants parrainés : " + nombreEnfantsParraines);

        for (int i = 0; i < nombreEnfantsParraines; i++) {
            System.out.println("Enfant " + (i + 1) + " :");
            mesEnfants[i].afficherInfos();
        }
    }
}