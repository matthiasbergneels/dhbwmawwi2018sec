package kapitel7;

public class TravelAgency {

    public static void main(String[] args) {

        // Narrowing Cast
        Bookable[] bookables = {new Hotel(160),
                        new Airplane(12, 4),
                        new Hotel(300)};


        for(Bookable entity : bookables){
            System.out.println("Freie Plätze: " + entity.availableSpaces());
            try {
                bookables[0].book(10);
            } catch (NotEnoughFreeSpaces notEnoughFreeSpaces) {
                System.out.println(notEnoughFreeSpaces.getMessage());
            }
            System.out.println("Freie Plätze: " + entity.availableSpaces());

            if(entity instanceof Airplane){
                // widening Cast
                Airplane myPlane = (Airplane) entity;
                System.out.println("Flugzeug mit " + myPlane.availableSpaces() + " freie Sitzen!");
            }

        }
        System.out.println("Freie Plätze: " + bookables[0].availableSpaces());
        try {
            bookables[0].book(10);
            bookables[10].book(1);
        } catch (NotEnoughFreeSpaces notEnoughFreeSpaces) {
            System.out.println(notEnoughFreeSpaces.getMessage());
        } catch(Exception e){
            System.out.println("irgendein Fehler - hat doch alles kein Sinn!");
            return;
        }finally{

            System.out.println("Niemand kann mich aufhalten!");

        }
        System.out.println("Freie Plätze: " + bookables[0].availableSpaces());


    }
}
