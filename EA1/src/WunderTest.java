public class WunderTest {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
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
