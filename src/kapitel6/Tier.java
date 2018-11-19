package kapitel6;

public abstract class Tier{

    private float groesse;
    private float gewicht;
    private String bezeichnung;

    public Tier(float groesse, float gewicht, String bezeichnung){
        setBezeichnung(bezeichnung);
        setGewicht(gewicht);
        setGroesse(groesse);
    }


    public void fressen(){
        System.out.println("Das Tier frisst");
    }

    public final void bewegen(){
        System.out.println("Das Tier bewegen");
    }

    public abstract void atmen();

    @Override
    public String toString() {
        return "Tier: " + getBezeichnung() + "; Gewicht: " + getGewicht() + "; Groesse: " + getGroesse();
    }

    public float getGroesse() {
        return groesse;
    }

    public void setGroesse(float groesse) {
        this.groesse = groesse;
    }

    public float getGewicht() {
        return gewicht;
    }

    public void setGewicht(float gewicht) {
        this.gewicht = gewicht;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
}
