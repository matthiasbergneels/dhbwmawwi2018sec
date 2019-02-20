package uebungen;

public class Kartenspiel extends Gesellschaftsspiel{

    private int anzKarten;

    public Kartenspiel(String name, int anzSpieler, int anzKarten){
        super(name, anzSpieler);
        this.anzKarten = anzKarten;
    }

    @Override
    public void spielen(){
        System.out.println("Die "+ this.anzKarten +" Karten werden gemischt und das Spiel beginnt.");
    }
}
