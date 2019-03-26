package uebungen.kapitel8.tests;

import org.junit.Assert;
import org.junit.Test;

import uebungen.kapitel8.AutoSitz;
import uebungen.kapitel8.FalscheParameter;

public class AutoSitzTest {

    @Test
    public void createSuccessFullCarSeat() throws FalscheParameter{
        AutoSitz seat = new AutoSitz(true, "weiss");

        Assert.assertEquals("weiss", seat.getFarbe());
        Assert.assertEquals(true, seat.isLedersitz());
    }

    @Test (expected = FalscheParameter.class)
    public void invalidSeatParameters() throws FalscheParameter{
        AutoSitz seat = new AutoSitz(true, "lila");
    }
}
