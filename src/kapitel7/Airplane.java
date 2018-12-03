package kapitel7;

public class Airplane implements Bookable{

    private boolean[][] seats;

    public Airplane(int rows, int seatsPerRow){

        seats = new boolean[rows][seatsPerRow];
    }

    @Override
    public int availableSpaces() {
        return 0;
    }

    @Override
    public boolean book(int count) {
        return false;
    }
}
