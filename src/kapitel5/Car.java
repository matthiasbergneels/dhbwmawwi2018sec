package kapitel5;

public class Car {

    private final int hp;
    private String color;
    private String type;
    private brands brand;
    private boolean convertible;
    private double speed;
    private String licensePlate;

    private static int carCounter = 0;

    public enum brands{
        MERCEDES,
        BMW,
        FORD,
        TESLA
    }

    /*
    public final static String[] ALLOWED_BRAND = {
      "Mercedes",
      "BMW",
      "Ford",
      "Tesla",
      "Audi"
    };
    */

    Car(String licensePlate, int hp, String type,
        String color, brands brand, boolean convertible){

        this.licensePlate = licensePlate;
        this.hp = hp;
        this.type = type;
        //this.color = color;
        this.setColor(color);
        //this.brand = brand;
        this.setBrand(brand);
        this.convertible = convertible;

        this.speed = 0;

        carCounter++;
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


    public int getHp(){
        return this.hp;
    }

    public String getColor(){
        return this.color;
    }

    public String getType() {
        return type;
    }

    public brands getBrand() {
        return brand;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public double getSpeed() {
        return speed;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setColor(String color){

        color = color.toLowerCase();

        switch(color){
            case "blau":
            case "rot":
            case "schwarz":
            case "silber":
                this.color = color;
                break;
            default:
                this.color = "silber";
        }

    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    private void setBrand(brands brand) {

        this.brand = brand;

        /*
        for(String allowedBrand : ALLOWED_BRAND){
            if(allowedBrand.equalsIgnoreCase(brand)){  // anstatt: allowedBrand == brand
                this.brand = brand;
                return;
            }
        }

        this.brand = ALLOWED_BRAND[0];
        */
    }


    public static int getCarCounter(){
        return carCounter;
    }
}
