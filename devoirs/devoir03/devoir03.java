
public class devoir03 {

    public static void main(String[] args) {
        int jour = 25;
        int mois = 9;
        int annee = 2024;
        int nbJour = 0;
        nbJour += jour;
        for (int i = 1; i < mois; i++) {
            if (mois == 2 && (annee % 4) == 0) {
                nbJour += 29;
            } else if (mois == 2 && (annee % 4) != 0) {
                nbJour += 28;
            } else if ((i % 2) == 0) {
                nbJour += 31;
            } else if ((i % 2) != 0) {
                nbJour += 30;
            }
        }
        System.out.println("nous sommes le jours : " + (nbJour));
    }
}
