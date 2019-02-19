package uebungen;

public class Schaltjahr {

    public static void main(String[] args) {

        int jahr = Integer.parseInt(args[0]);
        int istSchaltjahr;

        istSchaltjahr = pruefeSchaltjahr(jahr);

        if (istSchaltjahr == 1) {
            System.out.println("Das Jahr " + jahr +
                    " ist ein Schaltjahr.");
        } else if (istSchaltjahr == 2) {
            System.out.println("Das Jahr " + jahr +
                    " ist kein Schaltjahr.");
        } else {
            System.out.println("Bitte geben Sie ein " +
                    "gültiges Jahr ein!");
        }
    }

    private static int pruefeSchaltjahr(int jahr) {















        return 0;

    }

}

