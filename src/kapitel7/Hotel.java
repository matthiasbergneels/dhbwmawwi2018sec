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
    public void book(int count) throws NotEnoughFreeSpaces {
        if(availableSpaces() < count){
            // Ausnahmesituation

            throw new NotEnoughFreeSpaces(availableSpaces());


        }

        bookedRoomsCount = bookedRoomsCount + count;

    }
}
