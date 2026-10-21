package DS_2021;

public class main {
    public static void main(String[] args) {
        documentaire film1 = new documentaire(
            "Le dernier refuge",
            "Ousman",
            "Mali",
            86,
            "La guerre civile"
        );
        film1.setNombreDePlaces(30);

        film film2 = new film(
            "Insurrection",
            "Jilani Saadi",
            "Tunisie",
            105
        );
        film2.setNombreDePlaces(45);

        Jcc jcc2021 = new Jcc(2, 2021);
        jcc2021.ajoutFilm(film1);
        jcc2021.ajoutFilm(film2);

        System.out.println("Films en compétition aux JCC 2021 :");
        jcc2021.listeFilmJCC();

        System.out.println(
            "\nPour Insurrection, entrez 17 étudiants quand demandé."
        );
        System.out.println(
            "Total des ventes : " + jcc2021.totalVenteBilletsJCC() + " DT"
        );
    }
}