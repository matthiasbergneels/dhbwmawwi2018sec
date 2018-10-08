package kapitel3;

public class Datatypes {

    public static void main(String[] args){

        // Deklaration der Variable numberA als Integer
        int numberA;

        // Initialisierung der Varibale numberA mit dem Wert 5
        numberA = 5;

        // Kombinierte Deklaration und Initialisierung
        byte numberC = 6;

        long longNumberB;

        boolean boolValue = true;


        // Deklaration und Initialisierung einer Kontsanten pi
        final double PI = 3.14f;

        // Fehler !!
        // PI = 5.3;


        // Literale

        // Oktalliteral

        numberA = 053; // ==> Dezimal 43

        System.out.println(numberA);

        // Hexadezimal

        numberA = 0xA7B; // ==> Dezimal 2683

        System.out.println(numberA);

        // Literal für Long Datentyp
        longNumberB = 62738271L;

        numberA = 62738271;

        // Gleitkommaliterale

        float numberD = 4.15f;


        // Char Literal

        char characterA = 'h';

        characterA = '\u2764';

        System.out.println(characterA);

        // Zeichenkettenliteral

        String myText = "This is my Text! \u2764";

        System.out.println(myText);


    }

}
