package kapitel5;

public class CarTest {

    public static void main(String[] args) {


        Car myCar = new Car("HD-ZZ 5678", 235, "SUV",
                "pink", "Tesla", false);
        Car yourCar = new Car("MA-II 4263", 154, "sportscar",
                "blau", "Mercedes", true);

        //myCar.licensePlate = "MA-YY 789";
        //myCar.hp = 245;

        System.out.println("myCar Nummernschild: " + myCar.licensePlate);
        System.out.println("myCar Leistung (PS): " + myCar.hp);

        //yourCar.hp = 150;

        System.out.println("yourCar Nummernschild: " + yourCar.licensePlate);
        System.out.println("yourCar Leistung (PS): " + yourCar.hp);


        System.out.println("myCar aktuelle Geschwindigkeit: " + myCar.speed);

        myCar.accelerate(50);
        myCar.accelerate(20);

        System.out.println("myCar aktuelle Geschwindigkeit: " + myCar.speed);


        System.out.println("Geblitzt: " + myCar.caughtInSpeedTrap());
        System.out.println("Geblitzt: " + yourCar.caughtInSpeedTrap());
    }
}
