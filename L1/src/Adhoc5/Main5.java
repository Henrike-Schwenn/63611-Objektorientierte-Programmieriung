package Adhoc5;

public class Main5 {
    public static void main (String[] args){
        // Array erzeugen:
        int [][] treppchen = new int [10][];
        for (int i = 0; i < treppchen.length; i++) {
                treppchen [i]= new int[i+1];
                for (int j = 0; j <= i; j++) {
                    treppchen[i][j]=j;
                }
        }
        // Array ausgeben:
        for (int i = 0; i < treppchen.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(treppchen[i][j] + " ");
            }
        }
    }
}
