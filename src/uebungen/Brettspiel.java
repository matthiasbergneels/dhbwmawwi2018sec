package uebungen;

public class Brettspiel extends Gesellschaftsspiel{

    private int anzSpielsteine;

    public Brettspiel(String name, int anzSpieler, int anzSpielsteine){
        super(name, anzSpieler);
        this.anzSpielsteine = anzSpielsteine;
    }

    @Override
    public void spielen(){
        System.out.println("Die "+ this.anzSpielsteine +" sind aufgestellt und das Spiel beginnt.");
    }
}