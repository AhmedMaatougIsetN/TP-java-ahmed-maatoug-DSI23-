package tp6;

public class Periodique extends Document {
    private String frequenceParution;

    public Periodique(String titre, int numeroIdentification, int nombrePages, String frequenceParution) {
        super(titre, numeroIdentification, nombrePages);
        this.frequenceParution = frequenceParution;
    }

    public String getFrequenceParution() {
        return frequenceParution;
    }

    public void setFrequenceParution(String frequenceParution) {
        this.frequenceParution = frequenceParution;
    }

    @Override
    public String getType() {
        return "Périodique";
    }

    @Override
    public void Edition() {
        super.Edition();
        System.out.println("Fréquence de parution : " + frequenceParution);
    }
}
