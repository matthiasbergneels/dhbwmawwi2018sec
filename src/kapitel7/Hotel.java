package kapitel7;

public class Hotel implements Bookable{

    private int freeRoomsCount;
    private int bookedRoomsCount;

    public Hotel(int roomCount){
        this.freeRoomsCount = roomCount;
        this.bookedRoomsCount = 0;
    }

    @Override
    public int availableSpaces() {
        return freeRoomsCount - bookedRoomsCount;
    }

    @Override
    public boolean book(int count) {
        if(availableSpaces() > count){
            bookedRoomsCount = bookedRoomsCount + count;
            return true;
        }
        return false;
    }
}
