package kapitel6;

public class Vogel extends Tier{

    private boolean fliegen;

    public Vogel(float groesse, float gewicht, String bezeichnung, boolean fliegen) {
        super(groesse, gewicht, bezeichnung);
        setFliegen(fliegen);
    }

    public boolean isFliegen() {
        return fliegen;
    }

    public void setFliegen(boolean fliegen) {
        this.fliegen = fliegen;
    }

    @Override
    public void atmen() {
        System.out.println("Der Vogel " + getBezeichnung() + " atmet!");
    }
}
