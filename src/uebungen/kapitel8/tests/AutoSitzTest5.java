package uebungen.kapitel8.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import uebungen.kapitel8.AutoSitz;
import uebungen.kapitel8.FalscheParameter;

@DisplayName("AutoSitz test cases")
public class AutoSitzTest5 {

    @BeforeEach
    public void beforeEach(){
        System.out.println("Before each test");
    }

    @Test
    @DisplayName("Invalid Parameter Test")
    public void invalidParameterTest(){
        Assertions.assertThrows(FalscheParameter.class, () -> {
            AutoSitz seat = new AutoSitz(true, "lila");
        });
    }

    @Test
    public void createSeat() throws FalscheParameter {
        AutoSitz seat = new AutoSitz(false, "lila");

        Assertions.assertEquals(false, seat.isLedersitz());
        Assertions.assertEquals("lila", seat.getFarbe());
    }

}
