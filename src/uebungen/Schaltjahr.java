package uebungen;

public class Schaltjahr {

    public static void main(String[] args) {

        int jahr = 1999; // Integer.parseInt(args[0]);
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

        if(!(jahr > 1500 && jahr < 3000)){
            return 0;
        }

        if(jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0)){
            return 1;
        }else{
            return 2;
        }

        /*
        if(jahr % 4 == 0){
            if(jahr % 100 == 0){
                if(jahr % 400 == 0){
                    return 1;
                }else{
                    return 2;
                }
            }else{
                return 1;
            }
        }else{
            return 2;
        }
        */
    }
}

