public class ProgrammeParrainage {
    public static void main(String[] args) {
        Parrain[] parrains = new Parrain[10];
        parrains[0] = new Parrain("Ali", "Ben Ali", 40, 1);
        parrains[1] = new Parrain("Salah", "Ben Salah", 35, 2);
        parrains[2] = new ParrainMensuel("Tounes", "Ben Tounes", 45, 3, 100.0);

        Enfant[] enfants = new Enfant[1025];
        enfants[0] = new Enfant("Quatrième année", "Farah", "Ben Farah", 10);
        enfants[1] = new Enfant("Sixième année", "Amel", "Ben Amel", 12);
        enfants[2] = new Enfant("Sixième année", "Fedy", "Ben Fedy", 11);
        enfants[3] = new Enfant("Troisième année", "Sarra", "Ben Sarra", 9);

        
        parrains[0].ajouterEnfant(enfants[0]);

        
        parrains[2].ajouterEnfant(enfants[1]);
        parrains[2].ajouterEnfant(enfants[2]);

       
        int nombreTotalEnfantsParraines =
                parrains[0].getnbreEnfantsParraines()
              + parrains[1].getnbreEnfantsParraines()
              + parrains[2].getnbreEnfantsParraines();
        System.out.println("Nombre total d'enfants parrainés : " + nombreTotalEnfantsParraines);

       
        System.out.println("Enfants parrainés en Sixième année :");
        enfants[1].afficherInfos();
        enfants[2].afficherInfos();

        
        double totalVirementsMensuels =
                ((ParrainMensuel) parrains[2]).calculerVirementTotal();
        System.out.println("Total des virements mensuels : " + totalVirementsMensuels);
    }
}