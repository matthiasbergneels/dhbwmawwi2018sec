package uebungen.kapitel8;

public class AutoSitz {

    private boolean ledersitz;
    private String farbe;

    public AutoSitz(boolean ledersitz, String farbe) throws FalscheParameter{

        if(ledersitz &&
                ((!farbe.toLowerCase().equals("schwarz")) && (!farbe.toLowerCase().equals("weiss")))){
            throw new FalscheParameter(ledersitz, farbe);
        }

        this.ledersitz = ledersitz;
        this.farbe = farbe;
    }

    public boolean isLedersitz() {
        return ledersitz;
    }

    public void setLedersitz(boolean ledersitz) {
        this.ledersitz = ledersitz;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
}
