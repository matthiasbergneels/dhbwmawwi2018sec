package kapitel4;

public class SwitchExample {

    public static void main(String[] args) {

        byte grade = 3;


        switch(grade){
            case 1:
                System.out.println("sehr gut");
                break;
            case 2:
                System.out.println("gut");
                break;
            case 3:
                System.out.println("befriedigend");
                break;
            case 4:
                System.out.println("ausreichend");
                break;
            case 5:
                System.out.println("ungenügend");
                break;
        }


        String ampel = "gelb";

        switch(ampel){
            case "grün":
                System.out.println("Fahren");
                break;
            case "gelb":
                System.out.println("Nach Ampelblitzer kucken!");
                break;
            case "rot":
                System.out.println("Stehen bleiben!");
                break;
            default:
                System.out.println("Ampel kaputt - vorsichtig los rasen");
                break;
        }

    }
}
