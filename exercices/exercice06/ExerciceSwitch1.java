package exercices.exercice06;

public class ExerciceSwitch1 {
    
    public static void main(String[] args) {
         int noteDuModule = 5;

         switch (noteDuModule) {
            case 1:
            System.out.println("Travail non rendu");
                
                break;
            case 2:
            System.out.println("Très insuffisant");
         
                break;
            case 3:
            System.out.println("insuffisant");

                break;
            case 4:
            System.out.println("suffisant");

                break;
            case 5:
            System.out.println("Bien!");

                break;
            case 6:
            System.err.println("Très bien!");

            default:
                break;
         }
    }
}
