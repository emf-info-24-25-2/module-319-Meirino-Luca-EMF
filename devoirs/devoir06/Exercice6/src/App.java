public class App {
    public static final int TAILLE_TABLEAU = 20;
    public static final int VALEUR_MIN = 0;
    public static final int VALEUR_MAX = 50;
    public static final int VALEUR_RECHERCHEE = 7;

    public static void main(String[] args) throws Exception {

    public static int[] genereTableau(){
        int random = ( int ) ( Math.random() * ( VALEUR_MAX - VALEUR_MIN + 1 ) ) + VALEUR_MIN; 
        int[] tableauGenere = new int[TAILLE_TABLEAU];
        for (int i = 0; i < tableauGenere.length; i++) {
        tableauGenere[i] = random;
        }
    }
    public static int[] rechercheMin(){

    }
    public static int[] rechercheMax(){
        
    }
    }
}
