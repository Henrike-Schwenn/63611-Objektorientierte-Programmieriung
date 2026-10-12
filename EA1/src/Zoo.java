public class Zoo {
    public static void main (String[] args) {
        String tier = args[0];
        int beine = 0;
        boolean flugfähig;
        boolean hatfedern;
        String gefährlich = "eventuell";
        if (tier.equals("Kellerassel")){
            beine = 6;
            flugfähig = false;
            hatfedern = false;
            gefährlich = "nein";
        } else if (tier.equals("Seekuh")) {
            beine = 0;
            flugfähig = false;
            hatfedern = false;
            gefährlich = "eventuell";
        } else if (tier.equals("Fledermaus")) {
            beine = 4;
            flugfähig = true;
            hatfedern = false;
            gefährlich = "eventuell";
        } else if (tier.equals("Dämonenbiene")) {
            beine = 6;
            flugfähig = true;
            hatfedern = false;
            gefährlich = "ja";
        } else if (tier.equals("Pinguin")) {
            beine = 2;
            flugfähig = false;
            hatfedern = true;
            gefährlich = "nein";
        } else if (tier.equals("Gorilla")) {
            beine = 2;
            flugfähig = false;
            hatfedern = false;
            gefährlich = "ja";
        } else if (tier.equals("Frosch")) {
            beine = 4;
            flugfähig = false;
            hatfedern = false;
            gefährlich = "eventuell";
        } else if (tier.equals("Papagei")) {
            beine = 2;
            flugfähig = true;
            hatfedern = true;
            gefährlich = "nein";
        } else if (tier.equals("Elch")) {
            beine = 4;
            flugfähig = false;
            hatfedern = false;
            gefährlich = "eventuell";
        } else if (tier.equals("Großes wütendes Huhn")) {
            beine = 2;
            flugfähig = true;
            hatfedern = true;
            gefährlich = "Schlimme Dinge: Schmerzhaftes Hacken. Verliere 1 Stufe.";
        }
        System.out.println(beine + " Beine");
        if (flugfähig) System.out.println("flugfähig: ja"); else System.out.println("flugfähig: nein");
        if (hatfedern) System.out.println("hat Federn: ja"); else System.out.println("hat Federn: nein");
        System.out.println("gefährlich für Menschen: " + gefährlich);
    }
}
