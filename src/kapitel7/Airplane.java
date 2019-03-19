package kapitel7;

public class Airplane implements Bookable{

    private boolean[][] seats;

    public Airplane(int rows, int seatsPerRow){

        seats = new boolean[rows][seatsPerRow];
    }

    @Override
    public int availableSpaces() {
        int count = 0;
        for(boolean[] rows : seats){
            for(boolean seat : rows){
                if(!seat){
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public void book(int count) throws NotEnoughFreeSpaces{
        if(availableSpaces() < count){
            throw new NotEnoughFreeSpaces(availableSpaces());
        }else {
            for(int i = 0; i < seats.length; i++){
                for(int j = 0; j < seats[i].length; j++){
                    if(!seats[i][j] && count > 0){
                        seats[i][j] = true;
                        count--;
                    }
                }
            }
        }

    }
}
