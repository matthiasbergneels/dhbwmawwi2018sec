package kapitel5;

public class Students {

    private int matrikelNr;
    private String name;
    private float promille;


    public Students(String name, int matrikelNr){

        this.matrikelNr = matrikelNr;
        this.name = name;

        promille = 0.0f;
    }

    public void drink(float amount){
        // TODO: Implementiere Trinken im Körper
        System.out.println("Studierendes trinkt");
    }

    public void drink(float amount, float alcohol){
        drink(amount);
        // TODO: Implementiere betrunken werden

        promille += alcohol;
        System.out.println("... und wird betrunken!");
    }
}
