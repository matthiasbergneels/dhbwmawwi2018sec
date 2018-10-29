package kapitel5;

public class Car {

    private final int hp;
    private String color;
    private String type;
    private String brand;
    private boolean convertible;
    private double speed;
    private String licensePlate;

    private String[] allowedBrands = {
      "Mercedes",
      "BMW",
      "Ford",
      "Tesla",
      "Audi"
    };

    Car(String licensePlate, int hp, String type,
        String color, String brand, boolean convertible){

        this.licensePlate = licensePlate;
        this.hp = hp;
        this.type = type;
        //this.color = color;
        this.setColor(color);
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


    public int getHp(){
        return this.hp;
    }

    public String getColor(){
        return this.color;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
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

    private void setBrand(String brand) {

        for(String allowedBrand : allowedBrands){
            if(allowedBrand.equalsIgnoreCase(brand)){  // anstatt: allowedBrand == brand
                this.brand = brand;
                return;
            }
        }

        this.brand = allowedBrands[0];
    }
}
