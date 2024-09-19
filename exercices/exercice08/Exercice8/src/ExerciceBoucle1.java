public class ExerciceBoucle1 {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            System.out.println("i:" + i);
        }

        int i = 0;
        while (i < 5) {
            i++;
            System.out.println("i:" + i);
        }

        int l = 0;
        do {
            l++;
            System.out.println("i:" + l);
        } while (l < 5);

    }
}
