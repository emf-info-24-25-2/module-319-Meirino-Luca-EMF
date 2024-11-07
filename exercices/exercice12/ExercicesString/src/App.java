public class App {
    public static void main(String[] args) throws Exception {
        String maChaineDeCaractere = "Voici du contenu stocké dans String.";
        int nombreDeCaractere = maChaineDeCaractere.length();

        System.out.println("Le nombre de caractères est : " + nombreDeCaractere);
        int positionDeContenu = maChaineDeCaractere.indexOf("contenu");
        System.out.println("Le mot \"contenu\" commence à la position : " + positionDeContenu);
        char CaractereRetourner = maChaineDeCaractere.charAt(10);
        System.out.println("La postion 10 contient : " + CaractereRetourner);

        String MonPrenom = "Luca";
        for (int i = 0; i < MonPrenom.length(); i++) {
            char caracterePrenom = MonPrenom.charAt(i);
            System.out.println("La lettre à la position " + i + " est : " + caracterePrenom);
        }

        String ChaineTest = "test";
        if (MonPrenom.contains(ChaineTest)) {
            System.out.println("La chaîne de caractere " + MonPrenom + " contient le texte " + ChaineTest + ".");
        } else {
            System.out.println("La chaîne de caractere " + MonPrenom + " ne contient pas le texte " + ChaineTest + ".");
        }
    }
}
