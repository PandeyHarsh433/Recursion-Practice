public class towerOfHanio {

    public static void towerOHanoi(int n, String Src, String help, String Dest) {

        if (n == 1) {
            System.out.println("transfer disc " + n + " from " + Src + " to " + Dest);
            return;
        }

        towerOHanoi(n - 1, Src, Dest, help);
        System.out.println("transfer disc " + n + " from " + Src + " to " + Dest);
        towerOHanoi(n - 1, help, Src, Dest);

    }

    public static void main(String[] args) {
        int n = 3;
        towerOHanoi(n, "S", "H", "D");
    }
}
