public class App {
    public static final int TAILLE_TABLEAU = 10;
    public static final int MIN_NOMBRE = -8;
    public static final int MAX_NOMBRE = 8;
    public static final int VALEUR_RECHERCHEE = 7;

    public static void main(String[] args) {

    }

    public static int[] genererValeursAleatoires(int nbrGenerer, int nbrMinimum, int nbrMaximum) {

        int[] TableauAleatoire = new int[nbrGenerer];
        int NbrAleatoire;

        for (int i = 0; i < nbrGenerer; i++) {
            NbrAleatoire = (int) (Math.random() * (nbrMaximum - nbrMinimum + 1)) + nbrMinimum;
            TableauAleatoire[i] = NbrAleatoire;
        }
        return TableauAleatoire;
    }

    public static int positionValeur(int[] tableauEntier, int valeurATrouver) {
        int nonPresent;
        for (int o = 0; o < tableauEntier.length; o++) {
            if (tableauEntier[o] == valeurATrouver) {
                return o;
            } else {
                continue;
            }
            nonPresent = -1;
            return nonPresent;
        }
    }
}
