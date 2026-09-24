package Selbsttestaufgaben1;

public class HenrikeL1ST4 {
    public HenrikeL1ST4() {
    }

    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int x = a;
            int r;
            for(int y = b; y > 0; y = r) {
                r = x % y;
                x = y;
            }
            switch (x) {
                case 1 -> System.out.println("Der ggT ist 1.");
                case 2 -> System.out.println("Der ggT ist 2.");
                case 3 -> System.out.println("Der ggT ist 3.");
                case 4 -> System.out.println("Der ggT ist 4.");
                default -> System.out.println("Der ggT ist größer als 4.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Dies sind keine ganzen Zahlen");
        }
    }
}
