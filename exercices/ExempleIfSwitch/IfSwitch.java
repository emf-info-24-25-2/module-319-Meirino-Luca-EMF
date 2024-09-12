package exercices.ExempleIfSwitch;

public class IfSwitch {
    public static void main(String[] args) {
        int note = 6;

        if (note < 4) {
            System.out.println("ma note est insuffisante.");

        } else if (note < 6) {
            System.out.println("Ma note est suffisante mais peut être améliorer.");

        } else {
            System.out.println("Parfait!");
        }

        System.out.println("Ma note est : " + note);

        // Test avec switch
        switch (note) {
            case 1:
                System.out.println("J'ai triché c'est mal!");

                break;
            case 2:
                System.out.println("Y'a du boulot!");

                break;
            case 3:
                System.out.println("Encore un effort!");
            case 4:
                System.out.println("Juste juste!");

                break;
            case 5:
                System.out.println("Bien!");

                break;
            case 6:
                System.out.println("Continue comme sa!");
            default:

        }
    }
}
