package exercices.exercice05;

public class exerciceCondition4 {
    public static void main(String[] args) {
        int temperature = 20;
        if (temperature < -10) {
            System.out.println("Il fait très froid!");
        } else if (-10 <= temperature && temperature < 0) {
            System.out.println("Il fait froid.");
        } else if (0 <= temperature && temperature < 25) {
            System.out.println("Il fait normal.");
        } else if (25 <= temperature && temperature <= 35) {
            System.out.println("Il fait chaud.");
        } else if (35 < temperature) {
            System.out.println("Il fait très chaud!");
        }
    }

}
