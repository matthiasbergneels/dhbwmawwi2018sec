package kapitel7.tests;

import kapitel7.Bookable;
import kapitel7.Hotel;
import kapitel7.NotEnoughFreeSpaces;
import org.junit.Test;

import static org.junit.Assert.*;

public class TravelAgencyTest {


    @Test
    public void testBookable(){
        Bookable agency = new Hotel(100);

        try {
            agency.book(10);
            assertEquals(90, agency.availableSpaces());


        }catch(NotEnoughFreeSpaces e) {

        }
    }

    @Test (expected = NotEnoughFreeSpaces.class)
    public void testNotEnoughSpacesException() throws NotEnoughFreeSpaces{
        Bookable agency = new Hotel(10);
        agency.book(100);
    }


}
