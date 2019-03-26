package uebungen.kapitel8.autositze.tests;

import org.junit.Assert;
import org.junit.Test;
import uebungen.kapitel8.autositze.FalscheParameter;

public class FalscheParameterTests {

    @Test
    public void createWrongParameterException(){

        boolean leather = true;
        String color = "lila";

        FalscheParameter exception = new FalscheParameter(leather, color);

        Assert.assertEquals("Die Parameterkombination Ledersitz "+leather+" und Farbe "+color+" ist nicht erlaubt!", exception.getMessage());

    }
}
