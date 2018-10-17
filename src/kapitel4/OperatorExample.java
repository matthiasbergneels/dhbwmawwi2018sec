package kapitel4;

public class OperatorExample {

    public static void main(String[] args) {

        int numberA = 5;
        int numberB = 10;

        int numberResult;


        // Ausdrücke
        // 1. ++numberA ==> 6
        // 2. ergebnis von 1 * numberB ==> 60
        // 3. ergebnis von 2 in numberResult zuweisen
        numberResult = ++numberA * numberB;


        System.out.println("Ergebnis: " + numberResult);
        System.out.println("numberA: " + numberA);
        System.out.println("numberB: " + numberB);

        numberA = 5;
        numberB = 10;

        // Ausdrücke
        // 1. numberA * numberB ==> 50
        // 2. ergebnis von 1 in numberResult zuweisen
        // 3. numberA++ ==> 6
        numberResult = numberA++ * numberB;


        System.out.println("Ergebnis: " + numberResult);
        System.out.println("numberA: " + numberA);
        System.out.println("numberB: " + numberB);


        // Kurzschreibweise für: numberA = numberA + numberB;
        numberA += numberB;

        // numberA = numberA * numberB;
        numberA *= numberB;

        boolean isTired = true;

        String output = isTired ? "müde" : "wach";

        System.out.println(output);


        String myText = "Ich bin";

        // Zeichenverkettung
        String resultText = ""+numberA + numberB + myText + " " + output + ". " + ( numberResult + numberB );

        System.out.println(resultText);

    }
}
