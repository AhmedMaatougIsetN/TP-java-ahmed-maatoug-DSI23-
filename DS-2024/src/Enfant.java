public class Enfant extends Personne {
    private int idEnfant;
    private String classe;
    static int num = 0;

    public String getClasse() {
        return classe;
    }


    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("idEnfant =" + idEnfant);
        System.out.println("Class =" + classe);
    }
    public Enfant( String nom, String prenom, int age){
        super(nom, prenom, age);

    }

    public Enfant(String classe, String nom, String prenom, int age) {
        (nom, prenom, age);
        num++;
        this.idEnfant = num;
        this.classe = classe;
    }



        
    

    
}