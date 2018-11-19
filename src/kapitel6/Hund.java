package kapitel6;

public final class Hund extends Tier{

    private String rasse;

    public Hund(float groesse, float gewicht, String bezeichnung, String rasse){
        super(groesse, gewicht, bezeichnung);
        setRasse(rasse);
    }

    public void bellen(){
        System.out.println("Der Hund " + getBezeichnung() + " bellt - wuff!");
    }

    @Override
    public void fressen(){
        System.out.println("Der Hund " + getBezeichnung() + " frisst viel Fleisch! ");
    }

    /* final Methode
    @Override
    public void bewegen() {
        super.bewegen();
        System.out.println("wie ein Hund!");
    }
    */

    @Override
    public void atmen() {
        System.out.println("Der Hund " + getBezeichnung() + " atmet!");
    }

    @Override
    public String toString() {
        return super.toString() + "; Hunderasse: " + getRasse();
    }

    public String getRasse() {
        return rasse;
    }

    public void setRasse(String rasse) {
        this.rasse = rasse;
    }
}
