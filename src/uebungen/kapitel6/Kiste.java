package uebungen.kapitel6;

import uebungen.kapitel5.bahnhof.Fracht;

public class Kiste extends Fracht {

    private int breite;
    private int hoehe;
    private int tiefe;

    public Kiste(String bezeichnung, double menge, int breite, int hoehe, int tiefe){
        super(bezeichnung, menge, "Kiste");
        this.setBreite(breite);
        this.setHoehe(hoehe);
        this.setTiefe(tiefe);
        this.setVolumen();
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }
    public int getHoehe() {
        return hoehe;
    }
    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }
    public int getTiefe() {
        return tiefe;
    }
    public void setTiefe(int tiefe) {
        this.tiefe = tiefe;
    }

    public void setVolumen(){
        this.setVolumen(this.getHoehe() * this.getBreite() * this.getTiefe());
    }


}
