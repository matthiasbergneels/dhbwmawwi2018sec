package kapitel5;

import java.nio.file.FileSystemNotFoundException;

public class CarTest {

    public static void main(String[] args) {

        System.out.println("Aktuelle Anzahl Autos: " + Car.getCarCounter());


        Car myCar = new Car("HD-ZZ 5678", 235, "SUV",
                "pink", Car.brands.MERCEDES, false);
        System.out.println("Aktuelle Anzahl Autos: " + Car.getCarCounter());

        Car yourCar = new Car("MA-II 4263", 154, "sportscar",
                "blau", Car.brands.MERCEDES, true);
        System.out.println("Aktuelle Anzahl Autos: " + Car.getCarCounter());

        Car thirdCar = new Car("HD-ZZ 5678", 235, "SUV",
                "pink", Car.brands.TESLA, false);


        Car anotherCar = myCar;

        // Objektvergleich
        if(myCar == thirdCar){
            System.out.println("(==)Es handelt sich um das selbe Auto!");
        }else{
            System.out.println("(==)Es handelt sich um unterschiedliche Autos!");
        }

        if(myCar.equals(thirdCar)){
            System.out.println("(equals)Es handelt sich um das gleiche(?) Auto!");
        }else{
            System.out.println("(equals)Es handelt sich um unterschiedliche Autos!");
        }


        System.out.println("myCar Farbe: " + myCar.getColor());
        System.out.println("myCar Marke: " + myCar.getBrand());

        //myCar.licensePlate = "MA-YY 789";
        //myCar.hp = 245;

        System.out.println("myCar Nummernschild: " + myCar.getLicensePlate());
        System.out.println("myCar Leistung (PS): " + myCar.getHp());

        //yourCar.hp = 150;

        System.out.println("yourCar Nummernschild: " + yourCar.getLicensePlate());
        System.out.println("yourCar Leistung (PS): " + yourCar.getHp());


        System.out.println("myCar aktuelle Geschwindigkeit: " + myCar.getSpeed());

        myCar.accelerate(50);
        myCar.accelerate(20);

        System.out.println("myCar aktuelle Geschwindigkeit: " + myCar.getSpeed());


        //myCar.color = "lila";
        myCar.setColor("Blau");  // blau != Blau


        System.out.println("myCar Farbe: " + myCar.getColor());
        System.out.println("yourCar Farbe: " + yourCar.getColor());

        System.out.println("Geblitzt: " + myCar.caughtInSpeedTrap());
        System.out.println("Geblitzt: " + yourCar.caughtInSpeedTrap());

        System.out.println("Aktuelle Anzahl Autos: " + Car.getCarCounter());

        // "Verschrottung" ==> Referenzen löschen

        myCar = null;
        anotherCar = null;

        yourCar = null;

        thirdCar = null;

        // Garbage Collector räumt jetzt auf!
        System.gc();

        try {
            Thread.sleep(5000);
        }catch(Exception e){

        }

        System.out.println("Aktuelle Anzahl Autos: " + Car.getCarCounter());
    }
}
