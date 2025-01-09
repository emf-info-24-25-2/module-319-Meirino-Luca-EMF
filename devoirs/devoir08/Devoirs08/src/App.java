public class App {
    public static final String[] CARACTERES = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
    public static final int NBRE_ESSAI = 5;
    public static final int TAILLE_MOT_DE_PASSE = 5;

    public static void main(String[] args) {

        int[] tab = new int[TAILLE_MOT_DE_PASSE];
        tab = genereMotDePasse(TAILLE_MOT_DE_PASSE);
        for (int index = 0; index < tab.length; index++) {
            System.out.println(tab[index]);
        }
        int[] tab1 = trouverlecode(NBRE_ESSAI, tab);
        for (int index = 0; index < tab1.length; index++) {
            System.out.println(tab1[index]);
        }

    }

    public static int[] genereMotDePasse(int tm) {
        int[] motdepasse = new int[tm];
        for (int index = 0; index < motdepasse.length; index++) {
            motdepasse[index] = (int) (Math.random() * (CARACTERES.length));
        }

        return motdepasse;
    }

    public static int[] trouverlecode(int m, int[] b) {
        int[] bm = new int[b.length];
        for (int index = 0; index < m; index++) {
            for (int i = 0; i < b.length; i++) { 
                if (CARACTERES[i].equals(b[index])) { 
                    bm[i] = b[index];
                }
            }

        }

        return bm;
    }
}