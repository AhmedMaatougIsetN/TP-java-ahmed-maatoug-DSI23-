public class TestMotDict {
    public static void main(String[] args) {
        MotDict m1 = new MotDict("rapide", "qui se deplace vite");
        MotDict m2 = new MotDict("vite", "qui se deplace vite");

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m1.synonyme(m2));
    }
}
