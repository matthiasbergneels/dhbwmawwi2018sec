package uebungen.kapitel8.autositze.tests;

import org.junit.Assert;
import org.junit.Test;
import uebungen.kapitel8.autositze.FalscheParameter;
import uebungen.kapitel8.autositze.AutoSitz;

public class AutoSitzeTest {



    @Test
    public void createSeatSuccessful() throws FalscheParameter{
        String color = "schwarz";
        boolean leather = false;

        AutoSitz mySeat = new AutoSitz(leather, color);

        Assert.assertEquals(color, mySeat.getFarbe());
        Assert.assertEquals(leather, mySeat.isLedersitze());
        // alternative
        // Assert.assertFalse(mySeat.isLedersitze());
    }

    @Test
    public void createSeatWithInvalidParameters(){
        String color = "lila";
        boolean leather = true;

        try {
            AutoSitz mySeat = new AutoSitz(leather, color);

            Assert.fail("Die Ausnahme wurde nicht geworfen");
        }catch(FalscheParameter e){
            Assert.assertEquals("Die Parameterkombination Ledersitz true und Farbe lila ist nicht erlaubt!",
                    e.getMessage());
        }

    }


}
