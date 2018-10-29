package kapitel5;

public class Car {

    final int hp;
    String color;
    String type;
    String brand;
    boolean convertible;
    double speed;
    String licensePlate;

    Car(String licensePlate, int hp, String type,
        String color, String brand, boolean convertible){

        this.licensePlate = licensePlate;
        this.hp = hp;
        this.type = type;
        this.color = color;
        this.brand = brand;
        this.convertible = convertible;

        this.speed = 0;
    }

    void accelerate(double speedAcceleration){
        speed += speedAcceleration;
    }

    void brake(double brakeAmount){

        if(speed > brakeAmount){
            speed -= brakeAmount;
        }else{
            speed = 0;
        }

    }

    String caughtInSpeedTrap(){
        return licensePlate;
    }
}
