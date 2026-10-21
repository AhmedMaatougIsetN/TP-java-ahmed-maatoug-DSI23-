public class Personne {
    private String nom ;
    private String prenom ;
    private int age ;

    public Personne(String nom, String prenom, int  age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }


    public void afficherInfos() {
        System.out.println("nom :"+nom);
        System.out.println("prenom :"+prenom);
        System.out.println("age :"+age);
         
    }


    public void setAge(int age) {
        this.age = age;
    }
    


}
