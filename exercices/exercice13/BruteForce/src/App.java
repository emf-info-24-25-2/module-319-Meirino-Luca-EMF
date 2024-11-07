public class App {
    public static final int Password = 2864;

    public static void main(String[] args) throws Exception {
        for (int BonPassword = 0; BonPassword < Password; BonPassword++) {
            if (BonPassword == Password) {
                System.out.println("Le bon mot de passe est : " + Password);
            }
        }
    }
}
