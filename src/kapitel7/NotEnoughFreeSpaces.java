package kapitel7;

public class NotEnoughFreeSpaces extends Exception{

    private int freeSpaces;

    public NotEnoughFreeSpaces(int freeSpaces){
        super("Es sind nur noch " + freeSpaces + " Plätze verfügbar!");
    }

}
