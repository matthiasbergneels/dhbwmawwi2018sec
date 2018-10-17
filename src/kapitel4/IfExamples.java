package kapitel4;

public class IfExamples {

    public static void main(String[] args) {
        boolean isTired = false;

        if(isTired){
            System.out.println("Nicht programmieren!!");
        } else {
            System.out.println("Gehe eine Vorlesung halten!");
        }


        System.out.println("Ende");



        int speed = 150;
        boolean isBlitzer = true;

        if(speed <= 50){
            System.out.println("Alles gut!");
            System.out.println("Könntest schnell fahren");
        }
        else if(isBlitzer && speed > 50 && speed <= 70){
            System.out.println("Zu schnell, aber günstig!");
        } else if(isBlitzer && speed > 70){
            System.out.println("Das wird teuer!");
        } else {
            System.out.println("Zu schnell!");
        }

    }

}
