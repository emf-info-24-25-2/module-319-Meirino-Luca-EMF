package devoirs.devoir02;

public class devoir02 {

    public static final double CAPA_RES_A = 3;
    public static final double CAPA_RES_B = 5;

    public static void main(String[] args) {

        int resA = 0;
        int resB = 0;

        int remp = (int) (Math.random() * (8 - 3 + 1)) + 3;

        System.out.println("Il y a " + remp + " litres à remplir.");

        while (resA < CAPA_RES_A) {
            remp--;
            resA++;
            System.out.println("Remplissage du réservoir A...");
            System.out.println("Le réservoir A : " + resA + ", le réservoir B : " + resB);
        }
        while (remp > 0) {
            remp--;
            resB++;
            System.out.println("Remplissage du réservoir B...");
            System.out.println("Le réservoir A : " + resA + ", le réservoir B : " + resB);
        }
        System.out.println("remplissage terminé!");

    }

}