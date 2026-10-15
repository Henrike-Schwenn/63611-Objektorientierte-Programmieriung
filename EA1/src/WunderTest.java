public class WunderTest {
    public static void main(String[] args) {
        int [][] wunderschritte = new int [100] [2]; //Eingabe- und Rückgabewerte von wunder() von 1 bis 100 in Array
        for (int j=0; j < wunderschritte.length; j++) {
            wunderschritte[j][0]=j+1;
            wunderschritte[j][1]=WunderTest.wunder(j+1);
        }
        for (int k=0; k < wunderschritte.length-1; k++) {
            for (int l=0; l < wunderschritte.length-1-k; l++) {
                if (wunderschritte[l][1] < wunderschritte[l+1][1]) {
                    int [] temp = wunderschritte[l];
                    wunderschritte[l] = wunderschritte[l+1];
                    wunderschritte[l+1] = temp;
                }
            }
        }
        System.out.println("Die Zahl " + wunderschritte[0][0] + " benötigt mit " + wunderschritte[0][1] + " Schritten die meisten Schritte.");
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
        return i;
    }
}
