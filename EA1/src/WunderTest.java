public class WunderTest {
    public static void main(String[] args) {
        WunderTest.wunder(Integer.parseInt(args[0]));
    }
    public static void wunder(int n) {
        int i = 0;
        while (n != 1) {
            if (n%2==0) {
                n = n/2;
            } else {
                n = n*3+1;
            }
            i++;
        }
        System.out.print("Ziel erreicht in " + i + " Schritten.");
    }
}
