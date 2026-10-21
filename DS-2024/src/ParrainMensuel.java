public class ParrainMensuel extends Parrain {
    private double virementMensuel;

    public ParrainMensuel(String nom, String prenom, int age, int idParrain, double virementMensuel) {
        super(nom, prenom, age, idParrain);
        this.virementMensuel = virementMensuel;
    }

    public double calculerVirementTotal() {
        return getnbreEnfantsParraines() * virementMensuel;
    }

   
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Virement mensuel par enfant : " + virementMensuel);
        System.out.println("Montant total du soutien mensuel : " + calculerVirementTotal());
    }

    public double getvirementMensuel() {
        return virementMensuel;
    }
}