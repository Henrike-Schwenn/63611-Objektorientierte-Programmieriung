public class WunderTest {
    public static void main(String[] args) {
        for (int j=1; j<=100; j++) {
            WunderTest.wunder(j);
        }
    }
    public static int wunder(int n) {
        int i = 0;
        while (n != 1) {
            if (n%2==0) {
                n = n/2;
            } else {
                n = n*3+1;
            }
            i++;
        }
        System.out.println("Ziel erreicht in " + i + " Schritten.");
        return i;
    }
}
