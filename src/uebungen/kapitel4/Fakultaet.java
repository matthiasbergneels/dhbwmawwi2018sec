package uebungen.kapitel4;

public class Fakultaet {

    public static void main(String[] args) {
        int fakultaet = 5;
        int ergebnis = 1;

        for(int i = 1; i <= fakultaet; i++){
            ergebnis *= i;
        }

        System.out.println("For: Die Fakultät von " + fakultaet + " ist " + ergebnis);


        int whileFakultaet = fakultaet;
        ergebnis = 1;
        while(whileFakultaet > 1){
            ergebnis *= whileFakultaet--;
        }

        System.out.println("While: Die Fakultät von " + fakultaet + " ist " + ergebnis);

    }

}
