public class exercice91 {
    public static void main(String[] args) throws Exception {
        int[] TbEntier = new int[10];
        int taille1 = TbEntier.length;
        for (int i = 0; i < taille1; i++) {
            System.out.println(TbEntier[i]);
        }
        String[] TbString = new String[10];
        int taille2 = TbString.length;
        for (int i = 0; i < taille2; i++) {
            System.out.println(TbString[i]);
        }
        //La console affiche 0 pour un tableau int mais affiche "null" pour un tableau String si la cellule afficher est vide
    }
}
