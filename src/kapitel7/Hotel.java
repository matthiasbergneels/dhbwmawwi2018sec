package kapitel7;

public class Hotel implements Bookable{

    private int roomCount;

    public Hotel(int roomCount){
        this.roomCount = roomCount;
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
