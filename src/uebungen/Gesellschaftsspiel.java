package uebungen;

public abstract class Gesellschaftsspiel {

    protected String name;
    protected int anzSpieler;

    public Gesellschaftsspiel(String name, int anzSpieler){
        this.anzSpieler = anzSpieler;
        this.name = name;
    }

    public abstract void spielen();
}
