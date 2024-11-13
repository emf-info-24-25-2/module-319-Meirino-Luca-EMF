import java.util.Scanner;

public class Devoir05 {
    public static void main(String[] args) {
        // On crée un scanner pour lire sur la ligne de commande les touches pressées
        Scanner scanner = new Scanner(System.in);
        // Voici comment lire un entier depuis la console
        System.out.print("Entrez la valeur à trouver s'il vous plaît : ");
        int valeur = scanner.nextInt();
        // On continue à utiliser le scanner dans le programme…

        int nbcible = valeur;
        //RIF: vous pourriez aussi choisir aléatoirement le nombre cible
        System.out.println("ok!");

        //RIF: les deux lignes suivantes: vous demandez une valeur mais vous ne vérifiez pas si elle est bonne, vous en redemandez directement une dans la boucle!
         System.out.print("Entrez une valeur de votre choix svp : ");
         int valeur2 = scanner.nextInt();

        while (valeur2 != nbcible){
            System.out.println("entrer un nombre entre 1 et 100");
            valeur2 = scanner.nextInt();

            if (valeur2 < nbcible) {
                System.out.println("trop petit!");
            } else if (valeur2 > nbcible){
                System.out.println("trop grand!");
            }else {
                //RIF: pensez aussi à compter le nombre de tentatives
                System.out.println("Bien joué ! tu as trouvé la valeur!");
            }
        }
        scanner.close();
    }
}
