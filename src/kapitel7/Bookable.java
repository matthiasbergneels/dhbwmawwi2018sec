package kapitel7;

public interface Bookable {

    public int availableSpaces();
    public void book(int count) throws NotEnoughFreeSpaces ;
}
