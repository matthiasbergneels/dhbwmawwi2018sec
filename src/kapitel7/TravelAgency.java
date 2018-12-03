package kapitel7;

public class TravelAgency {

    public static void main(String[] args) {

        // Narrowing Cast
        Bookable[] bookables = {new Hotel(160),
                        new Airplane(12, 4),
                        new Hotel(300)};


        for(Bookable entity : bookables){
            System.out.println("Freie Plätze: " + entity.availableSpaces());
            entity.book(10);
            System.out.println("Freie Plätze: " + entity.availableSpaces());

            if(entity instanceof Airplane){
                // widening Cast
                Airplane myPlane = (Airplane) entity;
                System.out.println("Flugzeug mit " + myPlane.availableSpaces() + " freie Sitzen!");
            }

        }
        System.out.println("Freie Plätze: " + bookables[0].availableSpaces());
        bookables[0].book(10);
        System.out.println("Freie Plätze: " + bookables[0].availableSpaces());


    }
}
