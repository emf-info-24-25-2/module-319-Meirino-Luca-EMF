public class App {
    public static final int PRIX_CATEGORIE_UN = 25;
    public static final int PRIX_CATEGORIE_DEUX = 18;
    public static final int PRIX_CATEGORIE_TROIS = 12;
    public static final int[] CATEGORIE_SALLE = new int[] { 3, 3, 2, 2, 1, 1, 2, 2, 3, 3 }; // Tableau de valeur constant

    public static void main(String[] args) throws Exception {
        boolean[] patate = new boolean[CATEGORIE_SALLE.length];
        afficherTarifs();
        afficherSalle(patate);

    }

    public static void afficherTarifs() { // Affiche les tarifs des catégories
        System.out.println("Categorie 1 : " + PRIX_CATEGORIE_UN);
        System.out.println("Categorie 2 : " + PRIX_CATEGORIE_DEUX);
        System.out.println("Categorie 3 : " + PRIX_CATEGORIE_TROIS);
        System.out.println("-------------------------------------------");
    }

    public static void afficherSalle(boolean[] occupationSalle) {
        System.out.println("Occupation de la salle ");
        for (int i = 0; i < CATEGORIE_SALLE.length; i++) {
            System.out.print(CATEGORIE_SALLE[i] + " ");  
        }
        System.out.println();
        for (int p = 0; p < occupationSalle.length; p++) {
            if (occupationSalle[p] == false) {
                System.out.print("x ");
            } else {
                System.out.print("o ");
            }
        }
        System.out.println();
        System.out.println("-------------------------------------------");
    }

    public static int trouverPlace(int categorie, boolean[] occupationSalle) {
        int place = -1;
        for (int l = 0; l < occupationSalle.length; l++) {
            if (occupationSalle[l] == false && CATEGORIE_SALLE[l] == categorie) {
                place = l;
                break;
            } 
        }
        return place;
    }
}
