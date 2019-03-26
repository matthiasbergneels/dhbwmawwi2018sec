package uebungen.kapitel8;

public class FalscheParameter extends Exception{

    public FalscheParameter(boolean ledersitz, String farbe){
        super("Die Konfiguration Ledersitze: " + ledersitz
                + " und Farbe: " + farbe + " ist nicht erlaubt!");

    }
}
