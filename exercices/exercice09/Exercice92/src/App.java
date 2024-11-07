public class App {
    public static void main(String[] args) throws Exception {
        int[] TbAléatoire = new int[10];
        for (int i = 0; i < TbAléatoire.length; i++) {
            TbAléatoire[i] = 1 + (int)(Math.random() * ((6 - 1) + 1));
            System.out.println(TbAléatoire[i]);
        }
    }
}
