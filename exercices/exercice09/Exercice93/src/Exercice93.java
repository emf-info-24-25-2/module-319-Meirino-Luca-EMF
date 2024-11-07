public class Exercice93 {
    public static void main(String[] args) throws Exception {
        int[] TbAléatoire = new int[10];
        for (int i = 0; i < TbAléatoire.length; i++) {
            TbAléatoire[i] = 1 + (int) (Math.random() * ((6 - 1) + 1));
            System.out.println(TbAléatoire[i]);
        }
        int total = 0;
        int moyenne;
        for (int i = 0; i < TbAléatoire.length; i++) {
            int Aide = TbAléatoire[i] + TbAléatoire[i - 1];
            total + Aide;
            }
            System.out.println(TbAléatoire[i]);

        }
        moyenne = total / TbAléatoire.length;
        System.out.println("La moyenne des notes de la classe est : " + moyenne);
    }
