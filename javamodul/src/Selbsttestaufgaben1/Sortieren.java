package Selbsttestaufgaben1;

public class Sortieren {
    public static void main(String[] args) {
        try {
            double[] feld = new double[args.length];
            for(int i = 0; i < args.length; ++i) {
                feld[i] = Double.parseDouble(args[i]);
            }
            for(int i = 0; i < args.length - 1; ++i) {
                for(int j = 0; j < args.length - 1 - i; ++j) {
                    if (feld[j] < feld[j + 1]) {
                        double temp = feld[j];
                        feld[j] = feld[j + 1];
                        feld[j + 1] = temp;
                    }
                }
            }
            System.out.println("Das größte Element ist " + feld[0] + ".");
            for(int i = 0; i < args.length; ++i) {
                System.out.println(i + ". " + feld[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Bitte geben Sie nur Zahlen ein.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println ("Sie haben nichts eingegeben. Bitte geben Sie Zahlen ein.");
        }
    }
}