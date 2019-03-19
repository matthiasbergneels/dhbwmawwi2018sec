package uebungen.kapitel8.autositze;

public class FalscheParameter extends Exception{

    public FalscheParameter(boolean ledersitz, String farbe){
        super("Die Parameterkombination Ledersitz "+ledersitz+" und Farbe "+farbe+" ist nicht erlaubt!");

    }
}
