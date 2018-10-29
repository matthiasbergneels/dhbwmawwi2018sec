package kapitel5;

public class CallByExamples {

    public static void main(String[] args) {

        int numberA = 5;
        int numberB = 10;

        // Call by Value
        numberB = numberA;

        numberA = 100;



        // Call by Reference

        Person DozentBergNeels = new Person();

        // Call by Reference Zuweisung
        Person Papa = DozentBergNeels;
        Person SchnurzelPurzel = DozentBergNeels;
        Person Matthias = DozentBergNeels;


        Matthias.hauen();

        System.out.println("Dozent hat blaues Auge: " + DozentBergNeels.hasBlauesAuge());




    }
}
